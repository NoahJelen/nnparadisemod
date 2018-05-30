package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class CactusFenceGate extends BlockFenceGate {
	public CactusFenceGate() {
		super(BlockPlanks.EnumType.JUNGLE);
		setUnlocalizedName("CactusFenceGate");
		setRegistryName("cactus_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(SoundType.WOOD);
	}
}