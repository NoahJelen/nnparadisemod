package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class EmeraldFenceGate extends BlockFenceGate {
	public EmeraldFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("EmeraldFenceGate");
		setRegistryName("emerald_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}