package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CaveGenHumid implements IWorldGenerator{
	protected static final IBlockState WATER = Blocks.WATER.getDefaultState();
	public static int height;

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		Chunk theChunk=world.getChunkFromChunkCoords(chunkX, chunkZ);

		// don't generate if the config says not to
		// generate cave features
		if (ModConfig.worldgen.caves.betterCaves == false)
			return;
		if (ModConfig.worldgen.caves.types.Wet == false)
			return;

		// the height is 256 if the features are being generated in a cave dimension,
		// else, it's 61
		height=255;
		if (world.provider.getDimension() == 0) {
			height = 61;
		}

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < height; y++) {

					// biome of current block
					Biome blockBiome = theChunk.getBiome(new BlockPos(x, y, z), world.getBiomeProvider());

					// the block to be replaced
					Block blockToReplace = theChunk.getBlockState(x, y, z).getBlock();

					// the block above it
					Block blockAbove = theChunk.getBlockState(x, y + 1, z).getBlock();

					// the block below it
					Block blockBelow = theChunk.getBlockState(x, y - 1, z).getBlock();

					// biome types
					boolean swamp = blockBiome == Biomes.SWAMPLAND|| blockBiome == Biomes.MUTATED_SWAMPLAND;
					boolean jungle = blockBiome == Biomes.JUNGLE || blockBiome == Biomes.JUNGLE_EDGE|| blockBiome == Biomes.JUNGLE_HILLS || blockBiome == Biomes.MUTATED_JUNGLE|| blockBiome == Biomes.MUTATED_JUNGLE_EDGE;
	
					//shorthands for checking for stone and air
					boolean stoneCheck=blockToReplace==Blocks.STONE||blockToReplace==Blocks.COBBLESTONE;

					// jungle and swamp features
					if (jungle || swamp) {

						// mossy cobblestone
						if (rand.nextInt(10) == 0&&stoneCheck)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.MOSSY_COBBLESTONE.getDefaultState());

						// shallow water pools
						if (blockToReplace==Blocks.AIR&& y < 20) {
							theChunk.setBlockState(new BlockPos(x, y, z), WATER);
							if (blockBelow == Blocks.LAVA) {
								theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
								if (rand.nextBoolean())
									theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.MAGMA.getDefaultState());
							}
						}

						// replace ground stone with grass
						if (stoneCheck&&blockAbove==Blocks.AIR && y >= 19)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.GRASS.getDefaultState());

						//mossy stone formations
						if (stoneCheck&&blockAbove==Blocks.AIR&&rand.nextInt(10)==0)
							theChunk.setBlockState(new BlockPos(x,y+1,z), Misc.mossyStoneFormation.getDefaultState());
						if (stoneCheck&&blockBelow==Blocks.AIR&&rand.nextInt(10)==0&&y>0)
							theChunk.setBlockState(new BlockPos(x,y-1,z), Misc.mossyStoneFormation.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.DOWN));

						//vines
						if (stoneCheck&&y>=19) {
							// east
							if (theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR&& rand.nextInt(10) == 0&&x!=15)
								theChunk.setBlockState(new BlockPos(x + 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.WEST, true));

							// west
							if (theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&x!=0)
								theChunk.setBlockState(new BlockPos(x - 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.EAST, true));

							// south
							if (theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&z!=15)
								theChunk.setBlockState(new BlockPos(x, y, z + 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.NORTH, true));

							// north
							if (theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&z!=0)
								theChunk.setBlockState(new BlockPos(x, y, z - 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.SOUTH, true));
						}
						blockToReplace = theChunk.getBlockState(x, y, z).getBlock();

					}

					// swamp only features
					if (swamp&&blockToReplace==Blocks.GRASS) {
							switch (rand.nextInt(5)) {
								//slime blocks
								case 1:
									theChunk.setBlockState(new BlockPos(x, y, z), Blocks.SLIME_BLOCK.getDefaultState());
									break;

								//tall grass
								case 4:
									theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS));
									break;
						}
					}
				}
			}
		}
	}
}