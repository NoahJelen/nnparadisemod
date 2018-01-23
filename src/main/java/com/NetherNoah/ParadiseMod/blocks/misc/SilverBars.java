package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverBars extends BlockPane {
	public SilverBars() {
		super(Material.IRON, true);
		setUnlocalizedName("SilverBars");
		setRegistryName("silver_bars");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}