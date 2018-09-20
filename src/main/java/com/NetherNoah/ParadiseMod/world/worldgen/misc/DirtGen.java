package com.NetherNoah.ParadiseMod.world.worldgen.misc;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class DirtGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			IBlockState[] earth= {Blocks.DIRT.getDefaultState(),Blocks.SAND.getDefaultState(),Blocks.CLAY.getDefaultState()};
			generateOre(earth[random.nextInt(3)], world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(55), 6);
		}
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(8), minY + random.nextInt(deltaY), z + random.nextInt(8));
			WorldGenMinable generator = new WorldGenMinable(ore, 66,BlockMatcher.forBlock(Blocks.GRAVEL));
			generator.generate(world, random, pos);
		}
	}
}