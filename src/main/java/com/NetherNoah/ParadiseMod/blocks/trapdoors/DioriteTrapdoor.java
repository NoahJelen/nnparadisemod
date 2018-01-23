package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DioriteTrapdoor extends BlockTrapDoor {
	public DioriteTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("DioriteTrapdoor");
		setRegistryName("diorite_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setSoundType(blockSoundType.STONE);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 0);
	}
}