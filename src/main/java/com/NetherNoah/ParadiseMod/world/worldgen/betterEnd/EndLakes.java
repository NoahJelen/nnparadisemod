package com.NetherNoah.ParadiseMod.world.worldgen.betterEnd;

import java.util.Random;

import com.NetherNoah.ParadiseMod.blocks.misc.EnderAcid;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class EndLakes implements IWorldGenerator
{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		BlockPos position = new BlockPos(chunkX*16 + rand.nextInt(16),rand.nextInt(66),chunkZ*16 + rand.nextInt(16));
        
		if (world.provider.getDimension()!=1)
        	return;

        if (world.getBlockState(position).getBlock()==Blocks.AIR)
           return;

        for (position = position.add(-8, 0, -8); position.getY() > 5 && world.isAirBlock(position); position = position.down())
            ;

        if (position.getY() <= 4)
            return;
        else {
            position = position.down(4);
            boolean[] aboolean = new boolean[2048];
            int i = rand.nextInt(4) + 4;

            for (int j = 0; j < i; ++j) {
                double d0 = rand.nextDouble() * 6.0D + 3.0D;
                double d1 = rand.nextDouble() * 4.0D + 2.0D;
                double d2 = rand.nextDouble() * 6.0D + 3.0D;
                double d3 = rand.nextDouble() * (16.0D - d0 - 2.0D) + 1.0D + d0 / 2.0D;
                double d4 = rand.nextDouble() * (8.0D - d1 - 4.0D) + 2.0D + d1 / 2.0D;
                double d5 = rand.nextDouble() * (16.0D - d2 - 2.0D) + 1.0D + d2 / 2.0D;

                for (int l = 1; l < 15; ++l) {
                    for (int i1 = 1; i1 < 15; ++i1) {
                        for (int j1 = 1; j1 < 7; ++j1) {
                            double d6 = ((double)l - d3) / (d0 / 2.0D);
                            double d7 = ((double)j1 - d4) / (d1 / 2.0D);
                            double d8 = ((double)i1 - d5) / (d2 / 2.0D);
                            double d9 = d6 * d6 + d7 * d7 + d8 * d8;

                            if (d9 < 1.0D)
                                aboolean[(l * 16 + i1) * 8 + j1] = true;
                        }
                    }
                }
            }

            for (int l1 = 0; l1 < 16; ++l1) {
                for (int i3 = 0; i3 < 16; ++i3) {
                    for (int i4 = 0; i4 < 8; ++i4) {
                        if (aboolean[(l1 * 16 + i3) * 8 + i4]) {
                            if (position.getY()>=38)
                            	world.setBlockState(position.add(l1, i4, i3), i4 >= 4 ? Blocks.AIR.getDefaultState() : EnderAcid.BlockEnderAcid.instance.getDefaultState(), 2);     
                        }
                    }
                }
            }
            return;
        }
    }
}