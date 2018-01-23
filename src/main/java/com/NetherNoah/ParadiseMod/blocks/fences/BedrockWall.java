package com.NetherNoah.ParadiseMod.blocks.fences;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BedrockWall extends CustomWall {
	public BedrockWall() {
		super(Material.BARRIER);
		setUnlocalizedName("BedrockWall");
		setRegistryName("bedrock_wall");
		setHardness(-1F);
		setResistance(6000000F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setBlockUnbreakable();
	}
}