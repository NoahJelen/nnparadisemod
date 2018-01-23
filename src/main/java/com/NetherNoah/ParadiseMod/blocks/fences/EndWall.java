package com.NetherNoah.ParadiseMod.blocks.fences;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class EndWall extends CustomWall {
	public EndWall() {
		super(Material.ROCK);
		setRegistryName("end_wall");
		setUnlocalizedName("EndWall");
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHardness(5F);
		setResistance(15F);
	}
}