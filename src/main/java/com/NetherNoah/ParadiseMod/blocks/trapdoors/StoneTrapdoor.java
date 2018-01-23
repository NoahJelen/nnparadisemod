package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StoneTrapdoor extends BlockTrapDoor {
	public StoneTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("StoneTrapdoor");
		setRegistryName("stone_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}