package com.NetherNoah.ParadiseMod.blocks.ores;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.init.ModItems.MiscItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class VoidPearlOre extends Block {
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	public VoidPearlOre() {
		super(Material.ROCK);
		setUnlocalizedName("VoidPearlOre");
		setRegistryName("void_pearl_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 2);
	}
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Ores.VoidPearlOre);
    }
	// get item to drop
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return MiscItems.VoidPearl;
	}
	// get amount of items to drop
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}
	// is the pick enchanted with fortune?
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != this
				.getItemDropped(this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}
			return this.quantityDropped(random) * (i + 1);
		} else {
			return this.quantityDropped(random);
		}
	}
	//spawn the item in the world
	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}
	//spawn xp orbs
	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
			int i = 0;
			i = MathHelper.getInt(rand, 0, 5);
			return i;
		}
		return 0;
	}
	//spawn the actual item
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(MiscItems.VoidPearl);
	}
}