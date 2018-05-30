package com.NetherNoah.ParadiseMod.handlers;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.init.ModItems.MiscItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	public static void registerOreDict() {
		OreDictionary.registerOre("oreRuby", Ores.RubyOre);
		OreDictionary.registerOre("blockRuby", Ores.RubyBlock);
		OreDictionary.registerOre("gemRuby", MiscItems.Ruby);
		OreDictionary.registerOre("saplingChristmas", Misc.ChristmasSapling);
		OreDictionary.registerOre("leavesChristmas", Misc.ChristmasLeaves);
		OreDictionary.registerOre("oreSilver", Ores.SilverOre);
		OreDictionary.registerOre("oreSilver", Ores.SilverOreNether);
		OreDictionary.registerOre("blockSilver", Ores.SilverBlock);
		OreDictionary.registerOre("ingotSilver", MiscItems.SilverIngot);
		OreDictionary.registerOre("nuggetSilver", MiscItems.SilverNugget);
		OreDictionary.registerOre("stickWood", MiscItems.CactusStick);
		OreDictionary.registerOre("plankWood",Misc.CompressedCactus);
		OreDictionary.registerOre("dustSalt", MiscItems.salt);
		OreDictionary.registerOre("oreSalt", Ores.SaltOre);
		OreDictionary.registerOre("blockSalt", Ores.SaltBlock);
		OreDictionary.registerOre("lampSalt", Lamps.SaltLamp);
		OreDictionary.registerOre("oreGold", Ores.GoldOreNether);
		OreDictionary.registerOre("ingotRustyIron", MiscItems.RustyIngot);
		OreDictionary.registerOre("blockRustyIron", Ores.RustyIronBlock);
		OreDictionary.registerOre("nuggetRustyIron", MiscItems.RustyNugget);
		OreDictionary.registerOre("dyeBlack", MiscItems.DyeBlack);
		OreDictionary.registerOre("dyeBrown", MiscItems.DyeBrown);
		OreDictionary.registerOre("dyeBlue", MiscItems.DyeBlue);
		OreDictionary.registerOre("cobblestone", Misc.VoidStone);
	}
}