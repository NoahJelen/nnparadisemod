package com.NetherNoah.ParadiseMod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IronOreVoid extends Block {
	public IronOreVoid() {
		super(Material.ROCK);
		setUnlocalizedName("VoidIronOre");
		setRegistryName("void_iron_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 1);
	}
}