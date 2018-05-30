package com.NetherNoah.ParadiseMod.blocks.misc;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Rose extends BlockBush implements IGrowable{
	public Rose() {
		setUnlocalizedName("Rose");
		setRegistryName("rose");
		setSoundType(SoundType.PLANT);
	}
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
		return state.getBlock()==Blocks.GRASS|state.getBlock()==Blocks.DIRT;
    }
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Misc.Rose);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	@Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return true;
    }
    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        spawnAsEntity(worldIn, pos, new ItemStack(this));
    }
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}
}