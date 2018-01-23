package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GoldFence extends BlockFence {
	public GoldFence() {
		super(Material.ROCK, MapColor.GOLD);
		setUnlocalizedName("GoldFence");
		setRegistryName("gold_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}