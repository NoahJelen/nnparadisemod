package com.NetherNoah.ParadiseMod;

import java.util.Random;

import com.NetherNoah.ParadiseMod.blocks.base.CustomSlab;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneBrick.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Utils {

	/**
	 *Returns a random Stone brick block state object
	 */
	public static IBlockState getRandomBrick() {
		Random rand = new Random();
		IBlockState[] bricks = {
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.DEFAULT),
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.CRACKED),
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.MOSSY)
		};
		return bricks[rand.nextInt(3)];
	}

	/**
	 *Returns a random Stone brick block state object
	 */
	public static IBlockState getRandomBrick(Boolean isVoid) {
		if (isVoid)
			return Misc.VoidBricks.getDefaultState();
		Random rand = new Random();
		IBlockState[] bricks = {
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.DEFAULT),
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.CRACKED),
			Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.MOSSY)
		};
		return bricks[rand.nextInt(3)];
	}


	/**
	 *Registers a block with associated item
	 */
	public static void regBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	/**
	 *Registers a slab with its double and item
	 */
	public static void regSlab(CustomSlab slab,CustomSlab doubleSlab) {
		ForgeRegistries.BLOCKS.register(doubleSlab);
		ForgeRegistries.BLOCKS.register(slab);
		doubleSlab.setSingleSlab(slab);
		ItemBlock item = new ItemSlab(slab, slab, doubleSlab);
		ForgeRegistries.ITEMS.register(item.setRegistryName(slab.getRegistryName()));
	}

	/**
	 *Registers an item
	 */
	public static void regItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}


	/**
	 *Registers a block model
	 */
	public static void regRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

	/**
	 *Registers an item model
	 */
	public static void regRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	
	/**
	 *Gets the maximum value of an integer array
	 */
	public static int getMaxValue(int[] numbers){
		int maxValue = numbers[0];
		for(int i=1;i < numbers.length;i++){
			if(numbers[i] > maxValue && numbers[i]!=0){
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	
	/**
	 *Gets the minimum value of an integer array
	 */
	public static int getMinValue(int[] numbers){
		int minValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] < minValue && numbers[i]!=0){
				minValue = numbers[i];
			}
		}
		return minValue;
	}
}