package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class CactusStairs extends BlockStairs {
	public CactusStairs() {
		super(Blocks.PLANKS.getDefaultState());
		setUnlocalizedName("CactusStairs");
		setRegistryName("cactus_stairs");
		setHardness(2F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		useNeighborBrightness=true;
	}
}