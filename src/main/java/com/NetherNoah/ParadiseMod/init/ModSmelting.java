package com.NetherNoah.ParadiseMod.init;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Fences;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Gates;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Trapdoors;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
	//smelting recipes
	public static void register() {
		//rubies and silver ingots can obtained by smelting their ores
		GameRegistry.addSmelting(Ores.RubyOre, new ItemStack(ModItems.Ruby), 5F);
		GameRegistry.addSmelting(Ores.SilverOre, new ItemStack(ModItems.SilverIngot), 5F);
		
		//smelting recipes for end ores
		GameRegistry.addSmelting(Ores.EndRubyOre, new ItemStack(ModItems.Ruby), 5F);
		GameRegistry.addSmelting(Ores.EnderPearlOre, new ItemStack(Items.ENDER_PEARL), 5F);
		
		//smelting recipes for nether ores
		GameRegistry.addSmelting(Ores.SilverOreNether, new ItemStack(ModItems.SilverIngot), 5F);
		GameRegistry.addSmelting(Ores.GoldOreNether, new ItemStack(Items.GOLD_INGOT), 5F);
		
		//smelting recipes for void ores
		GameRegistry.addSmelting(Ores.GoldOreVoid, new ItemStack(Items.GOLD_INGOT), 5F);
		GameRegistry.addSmelting(Ores.IronOreVoid, new ItemStack(Items.IRON_INGOT), 5F);
		GameRegistry.addSmelting(Ores.CoalOreVoid, new ItemStack(Items.COAL), 5F);
		GameRegistry.addSmelting(Ores.SilverOreVoid, new ItemStack(ModItems.SilverIngot), 5F);
		
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
		GameRegistry.addSmelting(Misc.GoldHopper, new ItemStack(Items.GOLD_NUGGET), .01F);
		
		//same with golden doors, trapdoors, and fences
		GameRegistry.addSmelting(ModItems.ItemGoldDoor, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(Trapdoors.BlockGoldTrapdoor, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(Fences.BlockGoldFence, new ItemStack(Items.GOLD_NUGGET), .01F);
		GameRegistry.addSmelting(Gates.BlockGoldFenceGate, new ItemStack(Items.GOLD_NUGGET), .01F);
		
		//soul glass
		GameRegistry.addSmelting(Blocks.SOUL_SAND, new ItemStack(Misc.soulGlass), .01F);
	}
}