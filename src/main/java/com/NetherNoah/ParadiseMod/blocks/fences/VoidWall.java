package com.NetherNoah.ParadiseMod.blocks.fences;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VoidWall extends CustomWall {
	public VoidWall() {
		super(Material.ROCK);
		setUnlocalizedName("VoidWall");
		setRegistryName("void_wall");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
	}
}