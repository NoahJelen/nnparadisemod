package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;

public class RustyFenceGate extends BlockFenceGate {
	public RustyFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("RustyFenceGate");
		setRegistryName("rusty_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 1);
	}
}