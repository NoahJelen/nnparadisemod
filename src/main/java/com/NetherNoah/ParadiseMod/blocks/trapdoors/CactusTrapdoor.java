package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CactusTrapdoor extends BlockTrapDoor {
	public CactusTrapdoor() {
		super(Material.WOOD);
		setUnlocalizedName("CactusTrapdoor");
		setRegistryName("cactus_trapdoor");
		setHardness(2F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(SoundType.WOOD);
	}
}