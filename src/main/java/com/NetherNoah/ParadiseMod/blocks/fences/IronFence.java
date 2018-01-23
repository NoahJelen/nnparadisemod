package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IronFence extends BlockFence {
	public IronFence() {
		super(Material.IRON, MapColor.IRON);
		setUnlocalizedName("IronFence");
		setRegistryName("iron_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 1);
	}
}