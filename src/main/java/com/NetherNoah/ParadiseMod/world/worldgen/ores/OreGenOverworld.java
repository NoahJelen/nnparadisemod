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

public class OreGenOverworld implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if ((world.provider.getDimension()==0)&&ModConfig.worldgen.GenerateOverworldOres==true){
			IBlockState[] ores= {Ores.SaltOre.getDefaultState(),Ores.RubyOre.getDefaultState(),Ores.SilverOre.getDefaultState()};
			generateOre(ores[random.nextInt(3)], world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
		}
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
			int rarity = 16;
			if (ore==Ores.RubyOre.getDefaultState())
				rarity=8;
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(rarity), minY + random.nextInt(deltaY), z + random.nextInt(8));
			WorldGenMinable generator = new WorldGenMinable(ore, size,BlockMatcher.forBlock(Blocks.STONE));
			generator.generate(world, random, pos);
		}
	}
}