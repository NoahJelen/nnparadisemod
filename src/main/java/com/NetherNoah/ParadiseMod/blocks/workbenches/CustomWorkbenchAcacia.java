package com.NetherNoah.ParadiseMod.blocks.workbenches;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;

import net.minecraft.creativetab.CreativeTabs;

public class CustomWorkbenchAcacia extends CustomWorkBench {
	public CustomWorkbenchAcacia() {
		setUnlocalizedName("CustomWorkbenchAcacia");
		setRegistryName("acacia_crafting_table");
		setHardness(2.5F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.WOOD);
	}
}