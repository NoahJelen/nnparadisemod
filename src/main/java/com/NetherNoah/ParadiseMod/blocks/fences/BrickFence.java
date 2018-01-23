package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BrickFence extends BlockFence {
	public BrickFence() {
		super(Material.ROCK, MapColor.ADOBE);
		setUnlocalizedName("BrickFence");
		setRegistryName("brick_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHarvestLevel("pickaxe", 0);
	}
}