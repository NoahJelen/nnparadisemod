package com.NetherNoah.ParadiseMod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOreVoid extends Block {
	public SilverOreVoid() {
		super(Material.ROCK);
		setUnlocalizedName("VoidSilverOre");
		setRegistryName("void_silver_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 2);
	}
}