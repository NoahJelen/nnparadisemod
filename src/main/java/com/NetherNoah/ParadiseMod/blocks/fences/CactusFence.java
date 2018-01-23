package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CactusFence extends BlockFence {
	public CactusFence() {
		super(Material.WOOD, MapColor.GREEN);
		setUnlocalizedName("CactusFence");
		setRegistryName("cactus_fence");
		setHardness(2F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.WOOD);
	}
}