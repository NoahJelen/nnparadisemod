package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ObsidianTrapdoor extends BlockTrapDoor {
	public ObsidianTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("ObsidianTrapdoor");
		setRegistryName("obsidian_trapdoor");
		setHardness(51F);
		setResistance(2000F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 3);
	}
}