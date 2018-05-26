package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class VoidStairs extends BlockStairs {
	public VoidStairs() {
		super(Blocks.STONE.getDefaultState());
		setUnlocalizedName("VoidStairs");
		setRegistryName("void_stairs");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		useNeighborBrightness=true;
	}
}