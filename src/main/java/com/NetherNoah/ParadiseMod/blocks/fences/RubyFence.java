package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyFence extends BlockFence {
	public RubyFence() {
		super(Material.IRON, MapColor.MAGENTA);
		setUnlocalizedName("RubyFence");
		setRegistryName("ruby_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}