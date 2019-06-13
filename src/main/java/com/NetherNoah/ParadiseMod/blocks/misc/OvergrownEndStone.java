package com.NetherNoah.ParadiseMod.blocks.misc;
import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class OvergrownEndStone extends Block implements IGrowable{
	public OvergrownEndStone() {
		super(Material.WOOD);
		setUnlocalizedName("OverGrownEndStone");
		setRegistryName("overgrown_end_stone");
		setHardness(5F);
		setResistance(15F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.STONE);
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Blocks.END_STONE.getItemDropped(Blocks.END_STONE.getDefaultState(), rand, fortune);
    }

	@Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
	}
}