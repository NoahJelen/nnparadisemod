package com.NetherNoah.ParadiseMod.blocks.fenceGates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.RSFenceGate;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RedstoneFenceGate extends RSFenceGate {
	public RedstoneFenceGate() {
		super(BlockPlanks.EnumType.DARK_OAK);
		setUnlocalizedName("RedstoneFenceGate");
		setRegistryName("redstone_fence_gate");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(blockSoundType.METAL);
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