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
		Chunk chunk=world.getChunkFromChunkCoords(chunkX, chunkZ);

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
					Biome blockBiome = chunk.getBiome(new BlockPos(x, y, z), world.getBiomeProvider());

					// the block to be replaced
					Block blockToReplace = chunk.getBlockState(x, y, z).getBlock();

					// the block above it
					Block blockAbove = chunk.getBlockState(x, y + 1, z).getBlock();

					// the block below it
					Block blockBelow = chunk.getBlockState(x, y - 1, z).getBlock();

					if (blockToReplace==Blocks.AIR&& (blockBiome == Biomes.OCEAN|| blockBiome == Biomes.DEEP_OCEAN)&& world.provider.getDimension() == 0) {
						chunk.setBlockState(new BlockPos(x, y, z), WATER);
						if (blockBelow == Blocks.LAVA) {
							chunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
							if (rand.nextBoolean())
								chunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.MAGMA.getDefaultState());
						}
					}

					if ((blockBiome == Biomes.OCEAN|| blockBiome == Biomes.DEEP_OCEAN)&&(blockToReplace == Blocks.STONE||blockToReplace == Blocks.PRISMARINE) && 
							(chunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x, y + 1, z).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x, y - 1, z).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR
							|| chunk.getBlockState(x + 1, y, z).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x, y + 1, z).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x, y, z + 1).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x - 1, y, z).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x, y - 1, z).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x, y, z - 1).getBlock() == Blocks.WATER
							|| chunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA
							|| chunk.getBlockState(x, y + 1, z).getBlock() == Blocks.LAVA
							|| chunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA
							|| chunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA
							|| chunk.getBlockState(x, y - 1, z).getBlock() == Blocks.LAVA
							|| chunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA)) {
						if (rand.nextInt(5)==0)
							chunk.setBlockState(new BlockPos(x,y,z), Blocks.PRISMARINE.getDefaultState());
						if (rand.nextInt(ModConfig.worldgen.caves.CrystalChance)==0)
							chunk.setBlockState(new BlockPos(x,y,z), Misc.prismarineCrystalBlock.getDefaultState());
					}
				}
			}
		}	
	}
}