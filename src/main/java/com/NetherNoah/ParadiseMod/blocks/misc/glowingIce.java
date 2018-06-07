package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class glowingIce extends Block {
	public glowingIce() {
		super(Material.ICE);
		setUnlocalizedName("glowingIce");
		setRegistryName("glowing_ice");
		setHardness(.2F);
		setResistance(2F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe",0);
		setLightLevel(.46666667F);
		setSoundType(SoundType.GLASS);
		setDefaultSlipperiness(1F);
	}
}