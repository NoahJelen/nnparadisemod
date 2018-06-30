//this class is based off of CJMinecraft's example mod
//https://github.com/CJMinecraft01/BitOfEverything
package com.NetherNoah.ParadiseMod.blocks.slabs;

import java.util.Random;

import com.NetherNoah.ParadiseMod.DummyProperty;
import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Slabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EndSlab extends BlockSlab {

	public static final DummyProperty DUMMY_VARIANT = DummyProperty.create("dummy");

	public EndSlab(String name) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3);
		setResistance(15);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		IBlockState state = this.blockState.getBaseState();
		if (!this.isDouble())
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		setDefaultState(state);
		this.useNeighborBrightness = true; // Makes it so that you don't get dark patches on the block
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return DUMMY_VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return false;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		if (!this.isDouble())
			return this.getDefaultState().withProperty(HALF,
					EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
		return this.getDefaultState();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		if (this.isDouble())
			return 0;
		return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Slabs.end_slab);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF, DUMMY_VARIANT });
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}
	
	//@Override
	//public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    //{
       // return false;
    //}
}