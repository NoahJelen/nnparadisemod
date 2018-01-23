package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;

public class RubyFenceGate extends BlockFenceGate {
	public RubyFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("RubyFenceGate");
		setRegistryName("ruby_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}