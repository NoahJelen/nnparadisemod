package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EmeraldFence extends BlockFence {
	public EmeraldFence() {
		super(Material.ROCK, MapColor.EMERALD);
		setUnlocalizedName("EmeraldFence");
		setRegistryName("emerald_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}