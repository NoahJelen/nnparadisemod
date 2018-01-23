package com.NetherNoah.ParadiseMod.init;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import java.util.List;

public class ModCrafting {
	//crafting and smelting recipes
	public static void register() {
		//the rs sword comes pre-enchanted with Fire Aspect II
		ItemStack RSSword = new ItemStack(ModItems.redstoneSword);
		RSSword.addEnchantment(Enchantment.getEnchantmentByID(20), 2);
		
		//colored RS Lamps
		List<Block> lamps = Arrays.asList(ModBlocks.BlackRSLamp,ModBlocks.RedRSLamp,ModBlocks.GreenRSLamp,ModBlocks.BrownRSLamp,ModBlocks.BlueRSLamp,ModBlocks.PurpleRSLamp,ModBlocks.CyanRSLamp,ModBlocks.SilverRSLamp,ModBlocks.GrayRSLamp,ModBlocks.PinkRSLamp,ModBlocks.LimeRSLamp,ModBlocks.YellowRSLamp,ModBlocks.LightBlueRSLamp,ModBlocks.MagentaRSLamp,ModBlocks.OrangeRSLamp,ModBlocks.WhiteRSLamp);
		List<String> dyes = Arrays.asList("dyeBlack","dyeRed","dyeGreen","dyeBrown","dyeBlue","dyePurple","dyeCyan","dyeLightGray","dyeGray","dyePink","dyeLime","dyeYellow","dyeLightBlue","dyeMagenta","dyeOrange","dyeWhite");
		for (int i=0;i<16;i++) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(lamps.get(i),8), new Object[] {"xxx","xyx","xxx",'x',Blocks.REDSTONE_LAMP,'y',dyes.get(i)}));
		}
		
		//miscellaneous blocks and items
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SaltLamp), "xxx","xyx","xxx",'x',ModItems.salt,'y',Items.BLAZE_POWDER);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.CactusStick,4), "x","x",'x',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedCactus,4),"CC","CC",'C',Blocks.CACTUS);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchCactus),"CC","CC",'C',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemCactusDoor,3),"CC","CC","CC",'C',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockCactusTrapDoor,6),"CCC","CCC",'C',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CactusBookshelf,6),"CCC","BBB","CCC",'B',Items.BOOK,'C',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mossyLever), "axa","aya",'x',Items.STICK,'y',Blocks.MOSSY_COBBLESTONE,'a',Blocks.AIR);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldRail,16), "eae","ese","eae",'e',Items.EMERALD,'a',Blocks.AIR,'s',Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldRailPowered), "eae","ese","ere",'r',Items.REDSTONE,'e',Items.GOLD_INGOT,'a',Blocks.AIR,'s',ModBlocks.emeraldRail);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DUPortal,6), "xxx","xyx","xxx",'x',Items.BLAZE_POWDER,'y',Items.ENDER_PEARL);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sugarBlock), "xxx","xxx","xxx",'x',Items.SUGAR);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.SUGAR,9), ModBlocks.sugarBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blazeBlock), "xxx","xxx","xxx",'x',Items.BLAZE_POWDER);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.BLAZE_POWDER,9), ModBlocks.blazeBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.soulGlassPane,16), "xxx","xxx",'x',ModBlocks.soulGlass);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SantaHat),"aya","axa","xxx",'y',new ItemStack(Blocks.WOOL,1,0),'x',new ItemStack(Blocks.WOOL,1,14),'a',Blocks.AIR);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.santaJacket),"xax","xyx","xyx",'y',new ItemStack(Blocks.WOOL,1,0),'x',new ItemStack(Blocks.WOOL,1,14),'a',Blocks.AIR);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.santaPants),"xxx","xax","xax",'x',new ItemStack(Blocks.WOOL,1,14),'a',Blocks.AIR);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.santaBoots),"lal","xax",'l',Items.LEATHER,'x',new ItemStack(Blocks.WOOL,1,14),'a',Blocks.AIR);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ChristmasSapling), new ItemStack(Blocks.STAINED_GLASS_PANE,1,13), new ItemStack(Blocks.STAINED_GLASS_PANE,1,14),new ItemStack(Blocks.SAPLING,1,1),Blocks.GLOWSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ChristmasTopper,2), "axa","xxx","axa",'x',Items.GOLD_INGOT,'a',Blocks.AIR);
		
		//stairs
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CactusStairs,8),"E  ","EE ","EEE",'E',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.EndStairs,8),"E  ","EE ","EEE",'E',Blocks.END_STONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ObsidianStairs,8),"E  ","EE ","EEE",'E',Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.GlowingObsidianStairs,8),"E  ","EE ","EEE",'E',ModBlocks.glowingObsidian);
		
		//walls
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ObsidianWall,6), "OOO","OOO",'O',Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.GlowingObsidianWall,6), "OOO","OOO",'O',ModBlocks.glowingObsidian);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.EndWall,6), "OOO","OOO",'O',Blocks.END_STONE);
		
		//tools
		//cactus
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cactusSword), new Object[] {"x","x","y",'x',ModBlocks.CompressedCactus,'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cactusAxe), new Object[] {"xx","xy","ay",'a',Blocks.AIR,'x',ModBlocks.CompressedCactus,'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cactusSpade), new Object[] {"x","y","y",'x',ModBlocks.CompressedCactus,'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cactusPickaxe),new Object[] {"xxx","aya","aya",'a',Blocks.AIR,'x',ModBlocks.CompressedCactus,'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cactusHoe),new Object[] {"xx","ay","ay",'a',Blocks.AIR,'x',ModBlocks.CompressedCactus,'y',"stickWood"}));//oredict definition
		
		//emerald
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldSword),"x","x","y",'x',Items.EMERALD,'y',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldAxe),"xx","xy","ay",'a',Blocks.AIR,'x',Items.EMERALD,'y',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldSpade),"x","y","y",'x',Items.EMERALD,'y',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldPickaxe),"xxx","aya","aya",'a',Blocks.AIR,'x',Items.EMERALD,'y',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHoe),"xx","ay","ay",'a',Blocks.AIR,'x',Items.EMERALD,'y',Items.IRON_INGOT);
		
		//ruby
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubySword), new Object[] {"x","x","y",'x',"gemRuby",'y',Items.IRON_INGOT}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyAxe), new Object[] {"xx","xy","ay",'a',Blocks.AIR,'x',"gemRuby",'y',Items.IRON_INGOT}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubySpade), new Object[] {"x","y","y",'x',"gemRuby",'y',Items.IRON_INGOT}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyPickaxe),new Object[] {"xxx","aya","aya",'a',Blocks.AIR,'x',"gemRuby",'y',Items.IRON_INGOT}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyHoe),new Object[] {"xx","ay","ay",'a',Blocks.AIR,'x',"gemRuby",'y',Items.IRON_INGOT}));//oredict definition
		
		//silver
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverSword), new Object[] {"x","x","y",'x',"ingotSilver",'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverAxe), new Object[] {"xx","xy","ay",'a',Blocks.AIR,'x',"ingotSilver",'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverSpade), new Object[] {"x","y","y",'x',"ingotSilver",'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverPickaxe),new Object[] {"xxx","aya","aya",'a',Blocks.AIR,'x',"ingotSilver",'y',"stickWood"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverHoe),new Object[] {"xx","ay","ay",'a',Blocks.AIR,'x',"ingotSilver",'y',"stickWood"}));//oredict definition
		
		//obsidian
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword),"x","x","y",'x',Blocks.OBSIDIAN,'y',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe),"xx","xy","ay",'a',Blocks.AIR,'x',Blocks.OBSIDIAN,'y',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSpade),"x","y","y",'x',Blocks.OBSIDIAN,'y',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe),"xxx","aya","aya",'a',Blocks.AIR,'x',Blocks.OBSIDIAN,'y',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHoe),"xx","ay","ay",'a',Blocks.AIR,'x',Blocks.OBSIDIAN,'y',Items.DIAMOND);
		
		//redstone
		GameRegistry.addShapedRecipe(RSSword,"x","x","y",'x',Items.REDSTONE,'y',Blocks.REDSTONE_TORCH);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneAxe),"xx","xy","ay",'a',Blocks.AIR,'x',Items.REDSTONE,'y',Blocks.REDSTONE_TORCH);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneSpade),"x","y","y",'x',Items.REDSTONE,'y',Blocks.REDSTONE_TORCH);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstonePickaxe),"xxx","aya","aya",'a',Blocks.AIR,'x',Items.REDSTONE,'y',Blocks.REDSTONE_TORCH);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneHoe),"xx","ay","ay",'a',Blocks.AIR,'x',Items.REDSTONE,'y',Blocks.REDSTONE_TORCH);
		
		//armor
		//emerald
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHelmet), "GGG","GAG",'A',Blocks.AIR,'G',Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldChestplate), "GAG","GGG","GGG",'A',Blocks.AIR,'G',Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldLeggings),"GGG","GAG","GAG",'A',Blocks.AIR,'G',Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldBoots), "GAG","GAG",'A',Blocks.AIR,'G',Items.EMERALD);
		
		//ruby
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyHelmet), new Object[] {"GGG","GAG",'A',Blocks.AIR,'G',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyChestplate), new Object[] {"GAG","GGG","GGG",'A',Blocks.AIR,'G',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyLeggings), new Object[] {"GGG","GAG","GAG",'A',Blocks.AIR,'G',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyBoots), new Object[] {"GAG","GAG",'A',Blocks.AIR,'G',"gemRuby"}));//oredict definition
		
		//silver
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverHelmet), new Object[] {"GGG","GAG",'A',Blocks.AIR,'G',"ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverChestplate), new Object[] {"GAG","GGG","GGG",'A',Blocks.AIR,'G',"ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverLeggings), new Object[] {"GGG","GAG","GAG",'A',Blocks.AIR,'G',"ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.silverBoots), new Object[] {"GAG","GAG",'A',Blocks.AIR,'G',"ingotSilver"}));
		
		//obsidian
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), "GGG","GAG",'A',Blocks.AIR,'G',Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChestplate), "GAG","GGG","GGG",'A',Blocks.AIR,'G',Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianLeggings),"GGG","GAG","GAG",'A',Blocks.AIR,'G',Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianBoots), "GAG","GAG",'A',Blocks.AIR,'G',Blocks.OBSIDIAN);
		
		//redstone
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneHelmet), "GGG","GAG",'A',Blocks.AIR,'G',Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneChestplate),"GAG","GGG","GGG",'A',Blocks.AIR,'G',Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneLeggings), "GGG","GAG","GAG",'A',Blocks.AIR,'G',Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.redstoneBoots), "GAG","GAG",'A',Blocks.AIR,'G',Items.REDSTONE);
		
		//misc
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.GoldBars,16), "GGG","GGG",'G',Items.GOLD_INGOT);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverBars,16), new Object[] {"GGG","GGG",'G',"ingotSilver"}));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.MossyFurnace), "MMM","M M","MMM",'M',Blocks.MOSSY_COBBLESTONE);
		
		//pressure plates
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CactusPlate), "SS",'S',ModBlocks.CompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DiamondPlate), "SS",'S',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.EmeraldPlate), "SS",'S',Items.EMERALD);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.RubyPlate), new Object[] {"SS",'S',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverPlate), new Object[] {"SS",'S',"ingotSilver"}));//oredict definition
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CobblestonePlate), "SS",'S',Blocks.COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.MossyPlate),"SS",'S',Blocks.MOSSY_COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.EndPlate),"SS",'S',Blocks.END_STONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.AndesitePlate),"SS",'S',new ItemStack(Blocks.STONE,1,5));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DioritePlate),"SS",'S',new ItemStack(Blocks.STONE,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.GranitePlate),"SS",'S',new ItemStack(Blocks.STONE,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SprucePlate), "SS",'S',new ItemStack(Blocks.PLANKS,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BirchPlate),"SS",'S',new ItemStack(Blocks.PLANKS,1,2));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.JunglePlate),"SS",'S',new ItemStack(Blocks.PLANKS,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.AcaciaPlate),"SS",'S',new ItemStack(Blocks.PLANKS,1,4));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DarkOakPlate),"SS",'S',new ItemStack(Blocks.PLANKS,1,5));
		
		//buttons
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CactusButton), ModBlocks.CompressedCactus);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.EndButton), Blocks.END_STONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ObsidianButton), Blocks.OBSIDIAN);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiamondButton), Items.DIAMOND);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.EmeraldButton), Items.EMERALD);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GoldButton,2), Items.GOLD_INGOT,Items.GOLD_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.IronButton,2), Items.IRON_INGOT,Items.IRON_INGOT);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.RubyButton), new Object[] {"gemRuby"}));//oredict definiton
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.SilverButton), new Object[] {"ingotSilver","ingotSilver"}));//oredict definiton
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CobblestoneButton), Blocks.COBBLESTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.MossyButton), Blocks.MOSSY_COBBLESTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.AndesiteButton), new ItemStack(Blocks.STONE,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DioriteButton), new ItemStack(Blocks.STONE,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GraniteButton), new ItemStack(Blocks.STONE,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.AcaciaButton,2),new ItemStack(Blocks.PLANKS,1,4),new ItemStack(Blocks.PLANKS,1,4));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BirchButton,2),new ItemStack(Blocks.PLANKS,1,2),new ItemStack(Blocks.PLANKS,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DarkOakButton,2),new ItemStack(Blocks.PLANKS,1,5),new ItemStack(Blocks.PLANKS,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.JungleButton,2),new ItemStack(Blocks.PLANKS,1,3),new ItemStack(Blocks.PLANKS,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SpruceButton,2),new ItemStack(Blocks.PLANKS,1,1),new ItemStack(Blocks.PLANKS,1,1));
		
		//the workbenches
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchSpruce), "SS","SS",'S',new ItemStack(Blocks.PLANKS,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchBirch), "SS","SS",'S',new ItemStack(Blocks.PLANKS,1,2));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchJungle), "SS","SS",'S',new ItemStack(Blocks.PLANKS,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchAcacia), "SS","SS",'S',new ItemStack(Blocks.PLANKS,1,4));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CustomWorkbenchDarkOak), "SS","SS",'S',new ItemStack(Blocks.PLANKS,1,5));
		
		//the doors
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemEndDoor,3),"GG","GG","GG",'G',Blocks.END_STONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemGlassDoor,3),"GG","GG","GG",'G',Blocks.GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemDiamondDoor,3),"DD","DD","DD",'D',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemGoldDoor,3),"GG","GG","GG",'G',Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemEmeraldDoor,3),"EE","EE","EE",'E',Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemAndesiteDoor,3),"aa","aa","aa",'a',new ItemStack(Blocks.STONE,1,5));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemDioriteDoor,3),"DD","DD","DD",'D',new ItemStack(Blocks.STONE,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemGraniteDoor,3),"GG","GG","GG",'G',new ItemStack(Blocks.STONE,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemStoneDoor,3),"SS","SS","SS",'S',new ItemStack(Blocks.STONE,1,0));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemMossStoneDoor,3),"MM","MM","MM",'M',Blocks.MOSSY_COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemCobblestoneDoor,3),"CC","CC","CC",'C',Blocks.COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemGlowingObsidianDoor,3),"OO","OO","OO",'O',ModBlocks.glowingObsidian);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemObsidianDoor,3),"OO","OO","OO",'O',Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ItemRubyDoor,3), new Object[] {"RR","RR","RR",'R',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ItemSilverDoor,3), new Object[] {"RR","RR","RR",'R',"ingotSilver"}));//oredict definition
		
		//redstone door
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemRedstoneDoor),"RR","RR","RR",'R',Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemRedstoneDoor,9),"RR","RR","RR",'R',Blocks.REDSTONE_BLOCK);
		
		//the trapdoors
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockEndTrapDoor,5)," G ","GGG"," G ",'G',Blocks.END_STONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockGlassTrapDoor,6),"GGG","GGG",'G',Blocks.GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockGoldTrapdoor,4),"GG","GG",'G',Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockDiamondTrapdoor,6),"DDD","DDD",'D',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockEmeraldTrapdoor,6),"EEE","EEE",'E',Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockAndesiteTrapDoor,4),"aa","aa",'a',new ItemStack(Blocks.STONE,1,5));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockDioriteTrapdoor,4),"DD","DD",'D',new ItemStack(Blocks.STONE,1,3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockGraniteTrapdoor,4),"GG","GG",'G',new ItemStack(Blocks.STONE,1,1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockStoneTrapdoor,5)," O ","OOO"," O ",'O',new ItemStack(Blocks.STONE,1,0));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockMossStoneTrapdoor,4),"MM","MM",'M',Blocks.MOSSY_COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockCobblestoneTrapdoor,4),"CC","CC",'C',Blocks.COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockObsidianTrapdoor,5)," O ","OOO"," O ",'O',Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockRubyTrapdoor,6),new Object[] {"RRR","RRR",'R',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockSilverTrapDoor,4),new Object[] {"RR","RR",'R',"ingotSilver"}));//oredict definition
		
		//redstone trapdoor
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockRedstoneTrapdoor),"RRR","RRR",'R',Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockRedstoneTrapdoor,9),"RRR","RRR",'R',Blocks.REDSTONE_BLOCK);
		
		//fences
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockCactusFence,3),new Object[] {"CsC","CsC",'C',ModBlocks.CompressedCactus,'s',"stickWood"}));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockEmeraldFence,9),"EeE","EeE",'E',Blocks.EMERALD_BLOCK,'e',Items.EMERALD);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockRubyFence,9),new Object[] {"RrR","RrR",'R',"blockRuby",'r',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockSilverFence,9),new Object[] {"RrR","RrR",'R',"blockSilver",'r',"ingotSilver"}));//oredict definition
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockIronFence,9),"IiI","IiI",'I',Blocks.IRON_BLOCK,'i',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockDiamondFence,9),"DdD","DdD",'D',Blocks.DIAMOND_BLOCK,'d',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockGoldFence,9),"GgG","GgG",'G',Blocks.GOLD_BLOCK,'g',Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockBrickFence,4),"BbB","BbB",'B',Blocks.BRICK_BLOCK,'b',Items.BRICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockRedstoneFence,9), "RRR","RRR",'R',Blocks.REDSTONE_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockRedstoneFence), "RRR","RRR",'R',Items.REDSTONE);
		
		//fence gates
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockCactusFenceGate),new Object[] {"sCs","sCs",'C',ModBlocks.CompressedCactus,'s',"stickWood"}));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockEmeraldFenceGate,3),"eEe","eEe",'E',Blocks.EMERALD_BLOCK,'e',Items.EMERALD);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockRubyFenceGate,3),new Object[] {"rRr","rRr",'R',"blockRuby",'r',"gemRuby"}));//oredict definition
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockSilverFenceGate,3),new Object[] {"rRr","rRr",'R',"blockSilver",'r',"ingotSilver"}));//oredict definition
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockIronFenceGate,3),"iIi","iIi",'I',Blocks.IRON_BLOCK,'i',Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockDiamondFenceGate,3),"dDd","dDd",'D',Blocks.DIAMOND_BLOCK,'d',Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockGoldFenceGate,3),"gGg","gGg",'G',Blocks.GOLD_BLOCK,'g',Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockBrickFenceGate,2),"bBb","bBb",'b',Items.BRICK,'B',Blocks.BRICK_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockRedstoneFenceGate,3),"rRr","rRr",'R',Blocks.REDSTONE_BLOCK,'r',Items.REDSTONE);
		
		//salt block
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SaltBlock), new Object[] { "RRR", "RRR",  "RRR", 'R', "dustSalt"}));//oredict definition
		
		//turn it back into salt
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.salt, 9), new Object[] {"blockSalt"}));
		
		//ruby block
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.RubyBlock), new Object[] { "RRR", "RRR",  "RRR", 'R', "gemRuby"}));//oredict definition
		
		//Revert it back to rubies
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.Ruby, 9), new Object[] {"blockRuby"}));
		
		//silver block
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverBlock), new Object[] { "RRR", "RRR",  "RRR", 'R', "ingotSilver"}));//oredict definition
		
		//revert it back to silver ingots
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SilverIngot, 9), new Object[] {"blockSilver"}));
		
		//silver nugget
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SilverNugget, 9), new Object[] {"ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.SilverIngot), new Object[] { "RRR", "RRR",  "RRR", 'R', "nuggetSilver"}));
		
		//why can't quartz and nether wart blocks be reverted back to quartz and nether wart just like the other resource blocks can?
		GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_WART,9), Blocks.NETHER_WART_BLOCK);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 4), Blocks.QUARTZ_BLOCK);
		
		//what the hell, mojang?!
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE,1,1), "GGG","GAG","GGG",'G',Blocks.GOLD_BLOCK,'A',Items.APPLE);
		
		//cactus chest
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CactusChest),"CCC","C C","CCC",'C',Blocks.CACTUS);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedCactusChest),"CCC","C C","CCC",'C',ModBlocks.CompressedCactus);
		
		//cactus trapped chest
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CactusChestTrapped), ModBlocks.CactusChest, Blocks.TRIPWIRE_HOOK);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedCactusChestTrapped), ModBlocks.CompressedCactusChest, Blocks.TRIPWIRE_HOOK);
		
		//golden hopper
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.GoldHopper), "GAG","GCG","AGA",'A',Blocks.AIR,'G',Items.GOLD_INGOT,'C',Blocks.CHEST);
		
		//silver hopper
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SilverHopper), new Object[] {"GAG","GCG","AGA",'A',Blocks.AIR,'G',"ingotSilver",'C',Blocks.CHEST}));
		
		//rubies and silver ingots can obtained by smelting their ores
		GameRegistry.addSmelting(ModBlocks.RubyOre, new ItemStack(ModItems.Ruby), 5F);
		GameRegistry.addSmelting(ModBlocks.SilverOre, new ItemStack(ModItems.SilverIngot), 5F);
		
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