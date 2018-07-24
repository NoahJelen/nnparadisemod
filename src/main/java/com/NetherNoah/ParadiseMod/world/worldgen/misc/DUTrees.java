package com.NetherNoah.ParadiseMod.world.worldgen.misc;

import java.util.Random;

import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class DUTrees extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension()==DimensionRegistry.DeepUnderground)
			generateDU(world, rand, blockX + 8, blockZ + 8);
	}
	private void generateDU(World world, Random rand, int blockX, int blockZ)
	{	
		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		WorldGenerator structure = new DUTreesGen();
		if (y>31)
			structure.generate(world, rand, pos);
	}
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 85;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.GRASS||blockAt==Blocks.SAND||blockAt==Blocks.SANDSTONE;
		}
		return y;
	}
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}
}

