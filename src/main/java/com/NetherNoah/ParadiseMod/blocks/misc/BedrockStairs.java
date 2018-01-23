package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BedrockStairs extends BlockStairs {
	public BedrockStairs() {
		super(Blocks.BEDROCK.getDefaultState());
		setUnlocalizedName("BedrockStairs");
		setRegistryName("bedrock_stairs");
		setHardness(5F);
		setResistance(6000000F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 0);
		useNeighborBrightness = true;
	}
}