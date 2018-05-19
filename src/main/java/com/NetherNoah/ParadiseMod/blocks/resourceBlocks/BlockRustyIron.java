package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockRustyIron extends Block {
	public BlockRustyIron() {
		super(Material.IRON);
		setUnlocalizedName("BlockRustyIron");
		setRegistryName("rusty_iron_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 1);
	}
	@Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;
    }
}