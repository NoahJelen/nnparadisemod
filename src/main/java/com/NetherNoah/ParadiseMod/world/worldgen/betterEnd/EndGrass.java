package com.NetherNoah.ParadiseMod.world.worldgen.betterEnd;

import java.util.Random;

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
import net.minecraftforge.fml.common.IWorldGenerator;

public class EndGrass implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (world.provider.getDimension()!=1)
			return;
		Chunk chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
		Block[] plants= {Misc.EnderRose,Misc.EndGrass,Misc.TallEndGrass};

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < 80; y++) {

					// the block to be replaced
					Block blockToReplace = chunk.getBlockState(x, y, z).getBlock();

					// the block above it
					Block blockAbove = chunk.getBlockState(x, y + 1, z).getBlock();

					// replace exposed end stone
					if ((blockToReplace == Blocks.END_STONE||blockToReplace == Ores.EnderPearlOre||blockToReplace == Ores.EndRubyOre||blockToReplace == Ores.VoidPearlOre) && blockAbove==Blocks.AIR)
						chunk.setBlockState(new BlockPos(x, y, z), Misc.OvergrownEndStone.getDefaultState());
					
					// ender roses and grass
					if (rand.nextInt(15)==0 && (blockToReplace == Blocks.END_STONE||blockToReplace==Misc.OvergrownEndStone) && blockAbove==Blocks.AIR)
						chunk.setBlockState(new BlockPos(x, y+1, z), plants[rand.nextInt(3)].getDefaultState());
				}
			}
		}
	}
}