package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.CustomBlockCode.VoidFurnaceCode;

import net.minecraft.creativetab.CreativeTabs;

public class VoidFurnace extends VoidFurnaceCode {
	public VoidFurnace() {
		super(false);
		setUnlocalizedName("VoidFurnace");
		setRegistryName("void_furnace");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHarvestLevel("pickaxe", 0);
	}
}