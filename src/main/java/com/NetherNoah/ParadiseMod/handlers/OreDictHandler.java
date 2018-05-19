package com.NetherNoah.ParadiseMod.handlers;

import com.NetherNoah.ParadiseMod.init.ModBlocks;
import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	public static void registerOreDict() {
		OreDictionary.registerOre("oreRuby", ModBlocks.RubyOre);
		OreDictionary.registerOre("blockRuby", ModBlocks.RubyBlock);
		OreDictionary.registerOre("gemRuby", ModItems.Ruby);
		OreDictionary.registerOre("saplingChristmas", ModBlocks.ChristmasSapling);
		OreDictionary.registerOre("leavesChristmas", ModBlocks.ChristmasLeaves);
		OreDictionary.registerOre("oreSilver", ModBlocks.SilverOre);
		OreDictionary.registerOre("oreSilver", ModBlocks.SilverOreNether);
		OreDictionary.registerOre("blockSilver", ModBlocks.SilverBlock);
		OreDictionary.registerOre("ingotSilver", ModItems.SilverIngot);
		OreDictionary.registerOre("nuggetSilver", ModItems.SilverNugget);
		OreDictionary.registerOre("stickWood", ModItems.CactusStick);
		OreDictionary.registerOre("plankWood",ModBlocks.CompressedCactus);
		OreDictionary.registerOre("dustSalt", ModItems.salt);
		OreDictionary.registerOre("oreSalt", ModBlocks.SaltOre);
		OreDictionary.registerOre("blockSalt", ModBlocks.SaltBlock);
		OreDictionary.registerOre("lampSalt", ModBlocks.SaltLamp);
		OreDictionary.registerOre("oreGold", ModBlocks.GoldOreNether);
		OreDictionary.registerOre("ingotRustyIron", ModItems.RustyIngot);
		OreDictionary.registerOre("blockRustyIron", ModBlocks.RustyIronBlock);
		OreDictionary.registerOre("nuggetRustyIron", ModItems.RustyNugget);
	}
}