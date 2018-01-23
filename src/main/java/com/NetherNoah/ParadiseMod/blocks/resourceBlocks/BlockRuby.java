package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRuby extends Block {
	public BlockRuby() {
		super(Material.IRON);
		setUnlocalizedName("BlockRuby");
		setRegistryName("ruby_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}