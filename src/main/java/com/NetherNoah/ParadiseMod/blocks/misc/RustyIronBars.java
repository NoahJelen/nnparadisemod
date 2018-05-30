package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RustyIronBars extends BlockPane {
	public RustyIronBars() {
		super(Material.IRON, true);
		setUnlocalizedName("RustyIronBars");
		setRegistryName("rusty_iron_bars");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 1);
	}
}