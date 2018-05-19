package com.NetherNoah.ParadiseMod.world.worldgen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenOverworld implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension()==0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int selectOreOverworld=random.nextInt(3);
		
		//salt ore
		IBlockState oreSelectionOverworld=ModBlocks.SaltOre.getDefaultState();
		
		//ruby ore
		if (selectOreOverworld==0)
		{
			oreSelectionOverworld=ModBlocks.RubyOre.getDefaultState();
		}
		
		//silver ore
		else if (selectOreOverworld==1)
		{
			oreSelectionOverworld=ModBlocks.SilverOre.getDefaultState();	
		}
		else
			oreSelectionOverworld=ModBlocks.SaltOre.getDefaultState();
		
		generateOre(oreSelectionOverworld, world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
			int rarity = 16;
			if (ore==ModBlocks.RubyOre.getDefaultState()) {
				rarity=8;
			}
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(rarity), minY + random.nextInt(deltaY), z + random.nextInt(8));
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}