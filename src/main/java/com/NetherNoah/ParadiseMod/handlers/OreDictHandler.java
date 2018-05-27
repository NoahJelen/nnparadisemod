package com.NetherNoah.ParadiseMod.handlers;

import com.NetherNoah.ParadiseMod.init.ModItems;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	public static void registerOreDict() {
		OreDictionary.registerOre("oreRuby", Ores.RubyOre);
		OreDictionary.registerOre("blockRuby", Ores.RubyBlock);
		OreDictionary.registerOre("gemRuby", ModItems.Ruby);
		OreDictionary.registerOre("saplingChristmas", Misc.ChristmasSapling);
		OreDictionary.registerOre("leavesChristmas", Misc.ChristmasLeaves);
		OreDictionary.registerOre("oreSilver", Ores.SilverOre);
		OreDictionary.registerOre("oreSilver", Ores.SilverOreNether);
		OreDictionary.registerOre("blockSilver", Ores.SilverBlock);
		OreDictionary.registerOre("ingotSilver", ModItems.SilverIngot);
		OreDictionary.registerOre("nuggetSilver", ModItems.SilverNugget);
		OreDictionary.registerOre("stickWood", ModItems.CactusStick);
		OreDictionary.registerOre("plankWood",Misc.CompressedCactus);
		OreDictionary.registerOre("dustSalt", ModItems.salt);
		OreDictionary.registerOre("oreSalt", Ores.SaltOre);
		OreDictionary.registerOre("blockSalt", Ores.SaltBlock);
		OreDictionary.registerOre("lampSalt", Lamps.SaltLamp);
		OreDictionary.registerOre("oreGold", Ores.GoldOreNether);
		OreDictionary.registerOre("ingotRustyIron", ModItems.RustyIngot);
		OreDictionary.registerOre("blockRustyIron", Ores.RustyIronBlock);
		OreDictionary.registerOre("nuggetRustyIron", ModItems.RustyNugget);
		OreDictionary.registerOre("dyeBlack", ModItems.DyeBlack);
		OreDictionary.registerOre("dyeBrown", ModItems.DyeBrown);
		OreDictionary.registerOre("dyeBlue", ModItems.DyeBlue);
		OreDictionary.registerOre("cobblestone", Misc.VoidStone);
	}
}