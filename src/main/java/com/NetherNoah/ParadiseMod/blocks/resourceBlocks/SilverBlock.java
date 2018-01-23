package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverBlock extends Block {
	public SilverBlock() {
		super(Material.IRON);
		setUnlocalizedName("SilverBlock");
		setRegistryName("silver_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}