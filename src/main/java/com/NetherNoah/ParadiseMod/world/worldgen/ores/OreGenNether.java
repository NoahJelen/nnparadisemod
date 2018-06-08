package com.NetherNoah.ParadiseMod.world.worldgen.ores;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenNether implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == -1) {
			if (ModConfig.worldgen.GenerateNetherOres==true)
				generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int selectOreNether=random.nextInt(2);
		
		//silver ore (nether variant)
		IBlockState oreSelectionNether=Ores.SilverOreNether.getDefaultState();
		
		//gold ore (nether variant)
		if (selectOreNether==1)
			oreSelectionNether=Ores.GoldOreNether.getDefaultState();
		else
			oreSelectionNether=Ores.SilverOreNether.getDefaultState();
		
		generateOre(oreSelectionNether, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(15), 6);
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size,BlockMatcher.forBlock(Blocks.NETHERRACK));
			generator.generate(world, random, pos);
		}
	}
}