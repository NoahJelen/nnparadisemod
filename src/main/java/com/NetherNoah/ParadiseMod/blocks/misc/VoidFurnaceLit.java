package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.CustomBlockCode.VoidFurnaceCode;

public class VoidFurnaceLit extends VoidFurnaceCode {
	public VoidFurnaceLit() {
		super(true);
		setUnlocalizedName("VoidFurnaceLit");
		setRegistryName("lit_void_furnace");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
	}
}