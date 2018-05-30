package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class VoidBrickStairs extends BlockStairs {
	public VoidBrickStairs() {
		super(Blocks.STONE.getDefaultState());
		setUnlocalizedName("VoidBrickStairs");
		setRegistryName("void_brick_stairs");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		useNeighborBrightness=true;
	}
}