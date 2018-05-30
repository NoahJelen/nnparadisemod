package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class GoldFenceGate extends BlockFenceGate {
	public GoldFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("GoldFenceGate");
		setRegistryName("gold_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}