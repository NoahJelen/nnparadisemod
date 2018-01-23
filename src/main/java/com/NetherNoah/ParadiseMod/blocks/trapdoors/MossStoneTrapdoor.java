package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MossStoneTrapdoor extends BlockTrapDoor {
	public MossStoneTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("MossStoneTrapdoor");
		setRegistryName("moss_stone_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}