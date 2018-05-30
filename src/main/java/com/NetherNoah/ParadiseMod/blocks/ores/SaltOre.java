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

public class SaltOre extends Block {
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	public SaltOre() {
		super(Material.ROCK);
		setUnlocalizedName("SaltOre");
		setRegistryName("salt_ore");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("pickaxe", 0);
	}
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Ores.SaltOre);
    }
	// get item to drop
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return MiscItems.salt;
	}
	// get amount of items to drop
	@Override
	public int quantityDropped(Random random) {
		return 4 + random.nextInt(2);
	}
	// is the pick enchanted with fortune?
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return this.quantityDropped(random)+random.nextInt(fortune+1);
	}
	// spawn the item in the world
	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}
	// spawn xp orbs
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
	// spawn the actual item
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(MiscItems.salt);
	}
}