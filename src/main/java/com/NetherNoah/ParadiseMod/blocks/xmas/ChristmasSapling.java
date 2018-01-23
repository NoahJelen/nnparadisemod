package com.NetherNoah.ParadiseMod.blocks.xmas;

import java.util.Random;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.CustomBlockCode.xmasTree;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChristmasSapling extends xmasTree {
	public ChristmasSapling() {
		setUnlocalizedName("ChristmasSapling");
		setRegistryName("christmas_sapling");
		setLightLevel(1F);
		setSoundType(blockSoundType.PLANT);
		setCreativeTab(ParadiseMod.xmas);
	}
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
				this.grow(worldIn, pos, state, rand);
			}
		}
	}
	@Override
	public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (state.getValue(STAGE).intValue() == 0) {
			worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
		}
		else {
			this.generateTree(worldIn, pos, state, rand);
		}
	}
}