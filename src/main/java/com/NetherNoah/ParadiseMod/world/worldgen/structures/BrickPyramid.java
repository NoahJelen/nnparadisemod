package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BrickPyramid extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == 0) {
			generateOverworld(world, rand, blockX + 8, blockZ + 8);
		}
	}
	private void generateOverworld(World world, Random rand, int blockX, int blockZ)
	{	
		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		WorldGenerator structure = new BrickPyramidGen();
		structure.generate(world, rand, pos);
	}
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.GRAVEL||blockAt == Blocks.GRASS||blockAt == Blocks.SAND||blockAt == Blocks.DIRT||blockAt == Blocks.STONE;
		}
		return y;
	}
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}
}