package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DiamondTrapdoor extends BlockTrapDoor {
	public DiamondTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("DiamondTrapdoor");
		setRegistryName("diamond_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setSoundType(blockSoundType.METAL);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 2);
	}
}