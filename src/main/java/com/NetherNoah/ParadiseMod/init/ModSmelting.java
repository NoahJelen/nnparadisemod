package com.NetherNoah.ParadiseMod.init;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModSmelting {
	//smelting recipes
	public static void register() {
		//rubies and silver ingots can obtained by smelting their ores
		GameRegistry.addSmelting(ModBlocks.RubyOre, new ItemStack(ModItems.Ruby), 5F);
		GameRegistry.addSmelting(ModBlocks.SilverOre, new ItemStack(ModItems.SilverIngot), 5F);
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f3bb25d5ded4e2d0a84481ae1aae25c354a4f3ee
>>>>>>> b4f1ba2701a07a150105d9b8107884ea381af4e7
>>>>>>> 2232dfc8ed202f64e08f79d5fc50cea9a6929969
		//smelting recipes for end ores
		GameRegistry.addSmelting(ModBlocks.EndRubyOre, new ItemStack(ModItems.Ruby), 5F);
		GameRegistry.addSmelting(ModBlocks.EnderPearlOre, new ItemStack(Items.ENDER_PEARL), 5F);
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> fe4e7c11df6ac2d36c62263cef3f6404ef024eec
>>>>>>> f3bb25d5ded4e2d0a84481ae1aae25c354a4f3ee
>>>>>>> b4f1ba2701a07a150105d9b8107884ea381af4e7
>>>>>>> 2232dfc8ed202f64e08f79d5fc50cea9a6929969
		//smelting recipes for nether ores
		GameRegistry.addSmelting(ModBlocks.SilverOreNether, new ItemStack(ModItems.SilverIngot), 5F);
		GameRegistry.addSmelting(ModBlocks.GoldOreNether, new ItemStack(Items.GOLD_INGOT), 5F);
		
		//silver nuggets can be obtained by smelting stuff made of silver
		GameRegistry.addSmelting(ModItems.silverHelmet, new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverChestplate,new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverLeggings,new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverBoots,new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverAxe, new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverSpade, new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverPickaxe, new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverHoe, new ItemStack(ModItems.SilverNugget),5F);
		GameRegistry.addSmelting(ModItems.silverSword, new ItemStack(ModItems.SilverNugget),5F);
		
		//golden hopper can be smelted for a gold nugget just like other gold items in vanilla minecraft
		GameRegistry.addSmelting(ModBlocks.GoldHopper, new ItemStack(Items.GOLD_NUGGET), .01F);
		
		//same with golden doors, trapdoors, and fences
		GameRegistry.addSmelting(ModItems.ItemGoldDoor, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(ModBlocks.BlockGoldTrapdoor, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(ModBlocks.BlockGoldFence, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(ModBlocks.BlockGoldFenceGate, new ItemStack(Items.GOLD_NUGGET), .01F);
		
		//soul glass
		GameRegistry.addSmelting(Blocks.SOUL_SAND, new ItemStack(ModBlocks.soulGlass), .01F);
	}
}