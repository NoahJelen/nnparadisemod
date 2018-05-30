package com.NetherNoah.ParadiseMod.blocks.workbenches;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class CustomWorkbenchBirch extends CustomWorkBench {
	public CustomWorkbenchBirch() {
		setUnlocalizedName("CustomWorkbenchBirch");
		setRegistryName("birch_crafting_table");
		setHardness(2.5F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.WOOD);
	}
}