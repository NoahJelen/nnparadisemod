package com.NetherNoah.ParadiseMod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GoldOreVoid extends Block {
	public GoldOreVoid() {
		super(Material.ROCK);
		setUnlocalizedName("VoidGoldOre");
		setRegistryName("void_gold_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 2);
	}
}