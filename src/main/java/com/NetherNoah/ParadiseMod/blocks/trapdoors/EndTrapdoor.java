package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EndTrapdoor extends BlockTrapDoor {
	public EndTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("EndTrapdoor");
		setRegistryName("end_trapdoor");
		setHardness(5F);
		setResistance(15F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}