package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class EndStairs extends BlockStairs {
	public EndStairs() {
		super(Blocks.END_STONE.getDefaultState());
		setUnlocalizedName("EndStairs");
		setRegistryName("end_stairs");
		setHardness(5F);
		setResistance(15F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 0);
		useNeighborBrightness=true;
	}
}