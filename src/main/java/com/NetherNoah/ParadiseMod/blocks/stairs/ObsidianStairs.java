package com.NetherNoah.ParadiseMod.blocks.stairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ObsidianStairs extends BlockStairs {
	public ObsidianStairs() {
		super(Blocks.OBSIDIAN.getDefaultState());
		setUnlocalizedName("ObsidianStairs");
		setRegistryName("obsidian_stairs");
		setHardness(51F);
		setResistance(2000F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 3);
		useNeighborBrightness=true;
	}
}