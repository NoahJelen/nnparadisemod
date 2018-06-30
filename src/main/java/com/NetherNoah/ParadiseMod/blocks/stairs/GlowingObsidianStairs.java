package com.NetherNoah.ParadiseMod.blocks.stairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class GlowingObsidianStairs extends BlockStairs {
	public GlowingObsidianStairs() {
		super(Blocks.OBSIDIAN.getDefaultState());
		setUnlocalizedName("GlowingObsidianStairs");
		setRegistryName("glowing_obsidian_stairs");
		setHardness(51F);
		setResistance(2000F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 3);
		useNeighborBrightness=true;
	}
}