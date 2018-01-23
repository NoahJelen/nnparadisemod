package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GoldTrapdoor extends BlockTrapDoor {
	public GoldTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("GoldTrapdoor");
		setRegistryName("gold_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setSoundType(blockSoundType.METAL);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 2);
	}
}