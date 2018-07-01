package com.NetherNoah.ParadiseMod.blocks.stairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BedrockStairs extends BlockStairs {
	public BedrockStairs() {
		super(Blocks.BARRIER.getDefaultState());
		setUnlocalizedName("BedrockStairs");
		setRegistryName("bedrock_stairs");
		setHardness(-1F);
		setResistance(6000000F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		useNeighborBrightness = true;
	}
}