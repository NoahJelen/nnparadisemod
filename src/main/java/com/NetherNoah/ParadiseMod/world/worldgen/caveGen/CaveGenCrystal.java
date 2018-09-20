package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CaveGenCrystal implements IWorldGenerator {
	public static Block[] crystals= {Crystals.diamondCrystal,Crystals.emeraldCrystal,Crystals.quartzCrystal,Crystals.redstoneCrystal,Crystals.rubyCrystal};
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
			if (rand.nextInt(ModConfig.worldgen.caves.CrystalChance)==0){
				for (int i=0;i<256;i++) {
					int blockX = (chunkX * 16)+rand.nextInt(32);
					int blockZ = (chunkZ * 16)+rand.nextInt(32);
					int y = getGroundFromAbove(world, blockX, blockZ);
					BlockPos pos = new BlockPos(blockX, y+1, blockZ);
					if (y>9) {
						switch (rand.nextInt(5)) {
						case 0:
							world.setBlockState(pos, Crystals.diamondCrystal.getDefaultState(),1);
							break;

						case 1:
							world.setBlockState(pos, Crystals.emeraldCrystal.getDefaultState(),1);
							break;
					
						case 2:
							world.setBlockState(pos, Crystals.quartzCrystal.getDefaultState(),1);
							break;

						case 3:
							world.setBlockState(pos, Crystals.redstoneCrystal.getDefaultState(),1);
							break;

						case 4:
							world.setBlockState(pos, Crystals.rubyCrystal.getDefaultState(),1);
							break;
					}	
				}	
			}
		}
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 40;
		boolean foundGround = false;
		while(!foundGround&&y--!=10)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround=((blockAt==Blocks.GRASS||blockAt==Blocks.STONE) && blockAbove==Blocks.AIR);
		}
		return y;
	}

}
