package com.NetherNoah.ParadiseMod.world.worldgen.betterEnd;

import java.util.Random;

import com.NetherNoah.ParadiseMod.blocks.misc.EnderAcid;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
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
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraftforge.fml.common.IWorldGenerator;

public class EndLakes implements IWorldGenerator {
	public static int height;
	public static boolean webs = false;
	public static WorldGenLakes endlakes = new WorldGenLakes(EnderAcid.BlockEnderAcid.instance);

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		//if (world.provider.getDimension()!=1)
			//return;
		Chunk theChunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < height; y++) {
					// the block to be replaced
					Block blockToReplace = theChunk.getBlockState(x, y, z).getBlock();
					if (rand.nextInt(15)==0 && blockToReplace==Misc.OvergrownEndStone)
						endlakes.generate(world, rand, new BlockPos(x,y,z));
				}
			}
		}
	}
}