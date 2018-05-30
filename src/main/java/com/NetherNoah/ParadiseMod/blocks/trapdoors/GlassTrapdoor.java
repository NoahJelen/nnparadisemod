package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlassTrapdoor extends BlockTrapDoor {
	public GlassTrapdoor() {
		super(Material.GLASS);
		setUnlocalizedName("GlassTrapdoor");
		setRegistryName("glass_trapdoor");
		setHardness(.5F);
		setResistance(1F);
		setSoundType(SoundType.GLASS);
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}