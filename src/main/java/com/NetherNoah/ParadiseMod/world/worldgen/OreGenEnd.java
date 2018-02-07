package com.NetherNoah.ParadiseMod.world.worldgen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenEnd implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 1) {
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int selectOreEnd=random.nextInt(2);
		
		IBlockState oreSelectionEnd=ModBlocks.EndRubyOre.getDefaultState();
		
		if (selectOreEnd==1) {
			oreSelectionEnd=ModBlocks.EndRubyOre.getDefaultState();
		}
		else
			oreSelectionEnd=ModBlocks.EnderPearlOre.getDefaultState();
		
		generateOre(oreSelectionEnd, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(15), 6);
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size,BlockMatcher.forBlock(Blocks.END_STONE));
			generator.generate(world, random, pos);
		}
	}
}