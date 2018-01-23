package com.NetherNoah.ParadiseMod.blocks.redstone.lamps;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;;

public class GrayRSLamp extends BlockRedstoneLight {
	public GrayRSLamp() {
		super(false);
		setUnlocalizedName("GrayRSLamp");
		setRegistryName("gray_redstone_lamp");
		setSoundType(blockSoundType.GLASS);
		setCreativeTab(CreativeTabs.REDSTONE);
	}
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            if (worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.LitGrayRSLamp.getDefaultState(), 2);
            }
        }
    }
    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
            if (worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.LitGrayRSLamp.getDefaultState(), 2);
            }
        }
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.GrayRSLamp);
    }
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.GrayRSLamp);
    }
}