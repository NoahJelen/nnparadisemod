package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverTrapdoor extends BlockTrapDoor {
	public SilverTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("SilverTrapdoor");
		setRegistryName("silver_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setSoundType(SoundType.METAL);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 2);
	}
}