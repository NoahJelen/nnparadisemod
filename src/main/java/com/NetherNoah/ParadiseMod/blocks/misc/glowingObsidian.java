package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class glowingObsidian extends Block {
	public glowingObsidian() {
		super(Material.BARRIER);
		setUnlocalizedName("glowingObsidian");
		setRegistryName("glowing_obsidian");
		setHardness(51F);
		setResistance(2000F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe",3);
		setLightLevel(.46666667F);
	}
	@Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;
    }
}