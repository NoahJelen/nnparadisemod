package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GoldBars extends BlockPane {
	public GoldBars() {
		super(Material.IRON, true);
		setUnlocalizedName("GoldBars");
		setRegistryName("gold_bars");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}