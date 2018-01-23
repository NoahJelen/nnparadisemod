package com.NetherNoah.ParadiseMod.blocks.workbenches;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;

import net.minecraft.creativetab.CreativeTabs;

public class CustomWorkbenchJungle extends CustomWorkBench {
	public CustomWorkbenchJungle() {
		setUnlocalizedName("CustomWorkbenchJungle");
		setRegistryName("jungle_crafting_table");
		setHardness(2.5F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.WOOD);
	}
}