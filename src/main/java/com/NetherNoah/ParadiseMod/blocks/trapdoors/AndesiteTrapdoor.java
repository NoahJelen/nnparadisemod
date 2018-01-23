package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AndesiteTrapdoor extends BlockTrapDoor {
	public AndesiteTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("AndesiteTrapdoor");
		setRegistryName("andesite_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}