package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.CustomBlockCode.MossyFurnaceCode;

public class MossyFurnaceLit extends MossyFurnaceCode {
	public MossyFurnaceLit() {
		super(true);
		setUnlocalizedName("MossyFurnaceLit");
		setRegistryName("lit_mossy_furnace");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
	}
}