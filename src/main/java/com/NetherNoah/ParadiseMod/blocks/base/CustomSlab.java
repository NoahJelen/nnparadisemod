//this class is based off of CJMinecraft's example mod
//https://github.com/CJMinecraft01/BitOfEverything
package com.NetherNoah.ParadiseMod.blocks.base;

import java.util.Random;

import com.NetherNoah.ParadiseMod.DummyProperty;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CustomSlab extends BlockSlab {

	public static final DummyProperty DUMMY_VARIANT = DummyProperty.create("dummy");
	private Block itemBlock;
	private boolean Double;
	public Block pickBlock;
	
	public CustomSlab(Material material, boolean isDouble) {
		super(material);
		Double=isDouble;
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		if (material==Material.WOOD)
			setSoundType(SoundType.WOOD);

		IBlockState state = this.blockState.getBaseState();
		if (!this.isDouble())
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		setDefaultState(state);
		this.useNeighborBrightness = true;
	}
	public Block setItem(Block block) {
		pickBlock=block;
		return block;
	}
	
	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(pickBlock);
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
		return Item.getItemFromBlock(pickBlock);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF, DUMMY_VARIANT });
	}
	
	@Override
	public boolean isDouble() {
		return Double;
	}
}