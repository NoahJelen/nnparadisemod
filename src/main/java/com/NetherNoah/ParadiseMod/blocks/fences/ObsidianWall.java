package com.NetherNoah.ParadiseMod.blocks.fences;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ObsidianWall extends CustomWall {
	public ObsidianWall() {
		super(Material.BARRIER);
		setRegistryName("obsidian_wall");
		setUnlocalizedName("ObsidianWall");
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHardness(51F);
		setResistance(2000F);
	}
}