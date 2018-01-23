package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverFence extends BlockFence {
	public SilverFence() {
		super(Material.IRON, MapColor.SILVER);
		setUnlocalizedName("SilverFence");
		setRegistryName("silver_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}