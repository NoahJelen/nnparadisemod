package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
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

public class CaveGenBase implements IWorldGenerator {
	public static int height;
	public static boolean webs = false;

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		Chunk chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
		// don't generate if the config says not to
		// generate cave features
		if (ModConfig.worldgen.caves.betterCaves == false)
			return;

		// the height is 256 if the features are being generated in a cave dimension,
		// else, it's 61
		height=255;
		if (world.provider.getDimension() == 0) {
			height = 61;
			webs = true;
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


					// base cave generation
					// replace exposed stone
					if (blockToReplace == Blocks.STONE && 
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
						// random cobblestone
						if (rand.nextInt(10) == 0)
							chunk.setBlockState(new BlockPos(x, y, z), Blocks.COBBLESTONE.getDefaultState());
						
						//stone cave formations
						if (blockAbove==Blocks.AIR&&rand.nextInt(10)==0&&!(blockBiome == Biomes.OCEAN || blockBiome == Biomes.DEEP_OCEAN))
							chunk.setBlockState(new BlockPos(x,y+1,z), Misc.stoneFormation.getDefaultState());
						if (blockBelow==Blocks.AIR&&rand.nextInt(10)==0&&y>0&& !(blockBiome == Biomes.OCEAN || blockBiome == Biomes.DEEP_OCEAN))
							chunk.setBlockState(new BlockPos(x,y-1,z), Misc.stoneFormation.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.DOWN));
						
						// magma around lava pools
						if (world.provider.getDimension()!=DimensionRegistry.DeepUnderground&&(
								chunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA
								|| chunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA
								|| chunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA
								|| chunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA))
							chunk.setBlockState(new BlockPos(x, y, z), Blocks.MAGMA.getDefaultState());
					}

					//random spider webs
					if (blockToReplace==Blocks.AIR && rand.nextInt(1000)==0&&webs==true&&world.provider.getDimension()==0&&(blockBiome!=Biomes.OCEAN||blockBiome!=Biomes.DEEP_OCEAN))
						chunk.setBlockState(new BlockPos(x,y,z), Blocks.WEB.getDefaultState());
					
					//netherrack formations
					if (blockToReplace==Blocks.NETHERRACK&&blockBelow==Blocks.AIR&&rand.nextInt(20)==0&&y>0)
						chunk.setBlockState(new BlockPos(x,y-1,z), Misc.netherrackFormation.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.DOWN));
					if (blockToReplace==Blocks.NETHERRACK&&blockAbove==Blocks.AIR&&rand.nextInt(20)==0)
						chunk.setBlockState(new BlockPos(x,y+1,z), Misc.netherrackFormation.getDefaultState());
				}
			}
		}
	}
}