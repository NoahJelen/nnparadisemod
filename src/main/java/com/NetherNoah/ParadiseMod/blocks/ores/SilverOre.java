package com.NetherNoah.ParadiseMod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block {
	public SilverOre() {
		super(Material.ROCK);
		setUnlocalizedName("SilverOre");
		setRegistryName("silver_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 2);
	}
}