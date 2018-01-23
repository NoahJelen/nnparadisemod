package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
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
}