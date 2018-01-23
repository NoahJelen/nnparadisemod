package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GraniteTrapdoor extends BlockTrapDoor {
	public GraniteTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("GraniteTrapdoor");
		setRegistryName("granite_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}