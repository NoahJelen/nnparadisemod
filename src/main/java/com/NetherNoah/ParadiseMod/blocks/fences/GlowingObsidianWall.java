package com.NetherNoah.ParadiseMod.blocks.fences;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlowingObsidianWall extends CustomWall {
	public GlowingObsidianWall() {
		super(Material.BARRIER);
		setRegistryName("glowing_obsidian_wall");
		setUnlocalizedName("GlowingObsidianWall");
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHardness(51F);
		setResistance(2000F);
		setLightLevel(.46666667F);
	}
}