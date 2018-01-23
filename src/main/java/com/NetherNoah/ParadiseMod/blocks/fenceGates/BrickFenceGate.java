package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;

public class BrickFenceGate extends BlockFenceGate {
	public BrickFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("BrickFenceGate");
		setRegistryName("brick_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}