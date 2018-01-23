package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlowingObsidianTrapdoor extends BlockTrapDoor {
	public GlowingObsidianTrapdoor() {
		super(Material.IRON);
		setUnlocalizedName("GlowingObsidianTrapdoor");
		setRegistryName("glowing_obsidian_trapdoor");
		setHardness(51F);
		setResistance(2000F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(.46666667F);
	}
}