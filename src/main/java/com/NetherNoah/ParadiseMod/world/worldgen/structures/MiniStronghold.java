package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MiniStronghold extends WorldGenerator implements IWorldGenerator{
	
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
		BlockPos pos = new BlockPos(blockX, 16, blockZ);
		WorldGenerator structure = new MiniStrongholdGen();
		structure.generate(world, rand, pos);
	}
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}
}