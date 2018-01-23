package com.NetherNoah.ParadiseMod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GoldOreNether extends Block {
	public GoldOreNether() {
		super(Material.ROCK);
		setUnlocalizedName("NetherGoldOre");
		setRegistryName("nether_gold_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 2);
	}
}