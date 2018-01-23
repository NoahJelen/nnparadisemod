package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BedrockTrapdoor extends BlockTrapDoor {
	public BedrockTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("BedrockTrapdoor");
		setRegistryName("bedrock_trapdoor");
		setHardness(-1F);
		setResistance(6000000F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setBlockUnbreakable();
	}
}