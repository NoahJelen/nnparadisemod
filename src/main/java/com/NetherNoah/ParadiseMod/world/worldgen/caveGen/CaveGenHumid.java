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
		Chunk chunk=world.getChunkFromChunkCoords(chunkX, chunkZ);

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
					Biome blockBiome = chunk.getBiome(new BlockPos(x, y, z), world.getBiomeProvider());

					// the block to be replaced
					Block blockToReplace = chunk.getBlockState(x, y, z).getBlock();

					// the block above it
					Block blockAbove = chunk.getBlockState(x, y + 1, z).getBlock();

					// the block below it
					Block blockBelow = chunk.getBlockState(x, y - 1, z).getBlock();

					// biome types
					boolean swamp = blockBiome == Biomes.SWAMPLAND|| blockBiome == Biomes.MUTATED_SWAMPLAND;
					boolean jungle = blockBiome == Biomes.JUNGLE || blockBiome == Biomes.JUNGLE_EDGE|| blockBiome == Biomes.JUNGLE_HILLS || blockBiome == Biomes.MUTATED_JUNGLE|| blockBiome == Biomes.MUTATED_JUNGLE_EDGE;
	
					//shorthands for checking for stone and air
					boolean stoneCheck=blockToReplace==Blocks.STONE||blockToReplace==Blocks.COBBLESTONE;

					// jungle and swamp features
					if (jungle || swamp) {

						// mossy cobblestone
						if (rand.nextInt(10) == 0&&stoneCheck)
							chunk.setBlockState(new BlockPos(x, y, z), Blocks.MOSSY_COBBLESTONE.getDefaultState());

						// shallow water pools
						if (blockToReplace==Blocks.AIR&& y < 20) {
							chunk.setBlockState(new BlockPos(x, y, z), WATER);
							if (blockBelow == Blocks.LAVA) {
								chunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
								if (rand.nextBoolean())
									chunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.MAGMA.getDefaultState());
							}
						}

						// replace ground stone with grass
						if (stoneCheck&&blockAbove==Blocks.AIR && y >= 19)
							chunk.setBlockState(new BlockPos(x, y, z), Blocks.GRASS.getDefaultState());

						//mossy stone formations
						if (stoneCheck&&blockAbove==Blocks.AIR&&rand.nextInt(10)==0)
							chunk.setBlockState(new BlockPos(x,y+1,z), Misc.mossyStoneFormation.getDefaultState());
						if (stoneCheck&&blockBelow==Blocks.AIR&&rand.nextInt(10)==0&&y>0)
							chunk.setBlockState(new BlockPos(x,y-1,z), Misc.mossyStoneFormation.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.DOWN));

						//vines
						if (stoneCheck&&y>=19) {
							// east
							if (chunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR&& rand.nextInt(10) == 0&&x!=15)
								chunk.setBlockState(new BlockPos(x + 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.WEST, true));

							// west
							if (chunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&x!=0)
								chunk.setBlockState(new BlockPos(x - 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.EAST, true));

							// south
							if (chunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&z!=15)
								chunk.setBlockState(new BlockPos(x, y, z + 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.NORTH, true));

							// north
							if (chunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&z!=0)
								chunk.setBlockState(new BlockPos(x, y, z - 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.SOUTH, true));
						}
						blockToReplace = chunk.getBlockState(x, y, z).getBlock();

					}

					// swamp only features
					if (swamp&&blockToReplace==Blocks.GRASS) {
							switch (rand.nextInt(5)) {
								//slime blocks
								case 1:
									chunk.setBlockState(new BlockPos(x, y, z), Blocks.SLIME_BLOCK.getDefaultState());
									break;

								//tall grass
								case 4:
									chunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS));
									break;
						}
					}
				}
			}
		}
	}
}