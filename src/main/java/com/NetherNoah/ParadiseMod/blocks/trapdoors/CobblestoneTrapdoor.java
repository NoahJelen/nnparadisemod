package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CobblestoneTrapdoor extends BlockTrapDoor {
	public CobblestoneTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("CobblestoneTrapdoor");
		setRegistryName("cobblestone_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}