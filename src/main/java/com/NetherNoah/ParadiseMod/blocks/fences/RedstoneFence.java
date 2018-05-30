package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RedstoneFence extends BlockFence {
	public RedstoneFence() {
		super(Material.IRON, MapColor.MAGENTA);
		setUnlocalizedName("RedstoneFence");
		setRegistryName("redstone_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
	// this fence post is a rs power block!
	@Override
	public int getWeakPower(IBlockState state, IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
		return 15;
	}
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;

	}
}