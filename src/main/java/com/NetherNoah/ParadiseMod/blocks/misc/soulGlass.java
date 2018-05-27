package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class soulGlass extends BlockBreakable {
	public soulGlass() {
		super(Material.GLASS, true);
		setUnlocalizedName("soulGlass");
		setRegistryName("soul_glass");
		setHardness(.5F);
		setResistance(1F);
		setLightLevel(1F);
		setSoundType(blockSoundType.GLASS);
		setDefaultSlipperiness(1F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,EnumFacing side) {
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
        
			if (this == Misc.soulGlass)
	        {
	            if (blockState != iblockstate)
	            {
	                return true;
	            }
	            if (block == this)
	            {
	                return false;
	            }
	        }
			return true;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}