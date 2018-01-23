package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.CustomBlockCode.MossyFurnaceCode;

import net.minecraft.creativetab.CreativeTabs;

public class MossyFurnace extends MossyFurnaceCode {
	public MossyFurnace() {
		super(false);
		setUnlocalizedName("MossyFurnace");
		setRegistryName("mossy_furnace");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHarvestLevel("pickaxe", 0);
	}
}