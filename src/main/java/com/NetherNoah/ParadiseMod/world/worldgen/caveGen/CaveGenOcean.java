package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

// water filled caves in oceans in the overworld
public class CaveGenOcean implements IWorldGenerator{
	protected static final IBlockState WATER = Blocks.WATER.getDefaultState();
	public static int height;
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		Chunk theChunk=world.getChunkFromChunkCoords(chunkX, chunkZ);

		// don't generate if the config says not to
		// generate cave features
		if (ModConfig.worldgen.caves.betterCaves == false)
			return;
		if (ModConfig.worldgen.caves.types.Ocean== false)
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

					if (blockToReplace==Blocks.AIR&& (blockBiome == Biomes.OCEAN|| blockBiome == Biomes.DEEP_OCEAN)&& world.provider.getDimension() == 0) {
						theChunk.setBlockState(new BlockPos(x, y, z), WATER);
						if (blockBelow == Blocks.LAVA) {
							theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
							if (rand.nextBoolean())
								theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.MAGMA.getDefaultState());
						}
					}

					if ((blockBiome == Biomes.OCEAN|| blockBiome == Biomes.DEEP_OCEAN)&&(blockToReplace == Blocks.STONE||blockToReplace == Blocks.PRISMARINE) && 
							(theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR
							|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.WATER
							|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA
							|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.LAVA
							|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA
							|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA
							|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.LAVA
							|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA)) {
						if (rand.nextInt(5)==0)
							theChunk.setBlockState(new BlockPos(x,y,z), Blocks.PRISMARINE.getDefaultState());
						if (rand.nextInt(ModConfig.worldgen.caves.CrystalChance)==0)
							theChunk.setBlockState(new BlockPos(x,y,z), Misc.prismarineCrystalBlock.getDefaultState());
					}
				}
			}
		}	
	}
}