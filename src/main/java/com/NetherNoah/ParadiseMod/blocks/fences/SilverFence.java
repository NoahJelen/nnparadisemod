package com.NetherNoah.ParadiseMod.blocks.fences;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SilverFence extends BlockFence {
	public SilverFence() {
		super(Material.IRON, MapColor.SILVER);
		setUnlocalizedName("SilverFence");
		setRegistryName("silver_fence");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
    public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos, EnumFacing facing)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, pos, facing);
        Block block = iblockstate.getBlock();
        boolean flag = blockfaceshape == BlockFaceShape.MIDDLE_POLE && (block instanceof BlockFence || block instanceof BlockFenceGate);
        return !isExcepBlockForAttachWithPiston(block) && blockfaceshape == BlockFaceShape.SOLID || flag;
    }
}