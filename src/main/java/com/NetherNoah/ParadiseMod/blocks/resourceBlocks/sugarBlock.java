package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class sugarBlock extends BlockFalling{
	public sugarBlock() {
		super(Material.SAND);
		setUnlocalizedName("sugarBlock");
		setRegistryName("sugar_block");
		setHardness(.5F);
		setResistance(2.5F);
		setSoundType(blockSoundType.SAND);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}