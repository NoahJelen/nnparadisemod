package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class SaltBlock extends Block{
	public SaltBlock() {
		super(Material.IRON);
		setUnlocalizedName("SaltBlock");
		setRegistryName("salt_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 0);
	}
}