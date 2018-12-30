package com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;;

public class LitPurpleRSLamp extends BlockRedstoneLight {
	public LitPurpleRSLamp() {
		super(true);
		setUnlocalizedName("PurpleRSLamp");
		setRegistryName("lit_purple_redstone_lamp");
		setSoundType(blockSoundType.GLASS);
		setLightLevel(1F);
	}
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (!worldIn.isBlockPowered(pos)) {
				worldIn.setBlockState(pos, Lamps.PurpleLamp.getDefaultState(), 2);
			}
		}
	}
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
        	if (!worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, Lamps.PurpleLamp.getDefaultState(), 2);
            }
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
            if (!worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, Lamps.PurpleLamp.getDefaultState(), 2);
            }
        }
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(Lamps.PurpleLamp);
    }
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Lamps.PurpleLamp);
    }
}