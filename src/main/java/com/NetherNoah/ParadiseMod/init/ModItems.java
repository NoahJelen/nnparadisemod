package com.NetherNoah.ParadiseMod.init;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.items.CactusStick;
import com.NetherNoah.ParadiseMod.items.ItemRuby;
import com.NetherNoah.ParadiseMod.items.Salt;
import com.NetherNoah.ParadiseMod.items.SilverIngot;
import com.NetherNoah.ParadiseMod.items.SilverNugget;
import com.NetherNoah.ParadiseMod.items.armor.ArmorEmerald;
import com.NetherNoah.ParadiseMod.items.armor.ArmorObsidian;
import com.NetherNoah.ParadiseMod.items.armor.ArmorRedstone;
import com.NetherNoah.ParadiseMod.items.armor.ArmorRuby;
import com.NetherNoah.ParadiseMod.items.armor.ArmorSilver;
import com.NetherNoah.ParadiseMod.items.armor.SantaSuit;
import com.NetherNoah.ParadiseMod.items.doors.ItemAndesiteDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemBedrockDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemCactusDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemCobblestoneDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemDiamondDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemDioriteDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemEmeraldDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemEndDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemGlassDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemGlowingObsidianDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemGoldDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemGraniteDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemMossStoneDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemObsidianDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemRedstoneDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemRubyDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemSilverDoor;
import com.NetherNoah.ParadiseMod.items.doors.ItemStoneDoor;
import com.NetherNoah.ParadiseMod.items.tools.emerald.emeraldAxe;
import com.NetherNoah.ParadiseMod.items.tools.emerald.emeraldHoe;
import com.NetherNoah.ParadiseMod.items.tools.emerald.emeraldPickaxe;
import com.NetherNoah.ParadiseMod.items.tools.emerald.emeraldSpade;
import com.NetherNoah.ParadiseMod.items.tools.emerald.emeraldSword;
import com.NetherNoah.ParadiseMod.items.tools.obsidian.obsidianAxe;
import com.NetherNoah.ParadiseMod.items.tools.obsidian.obsidianHoe;
import com.NetherNoah.ParadiseMod.items.tools.obsidian.obsidianPickaxe;
import com.NetherNoah.ParadiseMod.items.tools.obsidian.obsidianSpade;
import com.NetherNoah.ParadiseMod.items.tools.obsidian.obsidianSword;
import com.NetherNoah.ParadiseMod.items.tools.redstone.redstoneAxe;
import com.NetherNoah.ParadiseMod.items.tools.redstone.redstoneHoe;
import com.NetherNoah.ParadiseMod.items.tools.redstone.redstonePickaxe;
import com.NetherNoah.ParadiseMod.items.tools.redstone.redstoneSpade;
import com.NetherNoah.ParadiseMod.items.tools.redstone.redstoneSword;
import com.NetherNoah.ParadiseMod.items.tools.ruby.rubyAxe;
import com.NetherNoah.ParadiseMod.items.tools.ruby.rubyHoe;
import com.NetherNoah.ParadiseMod.items.tools.ruby.rubyPickaxe;
import com.NetherNoah.ParadiseMod.items.tools.ruby.rubySpade;
import com.NetherNoah.ParadiseMod.items.tools.ruby.rubySword;
import com.NetherNoah.ParadiseMod.items.tools.silver.silverAxe;
import com.NetherNoah.ParadiseMod.items.tools.silver.silverHoe;
import com.NetherNoah.ParadiseMod.items.tools.silver.silverPickaxe;
import com.NetherNoah.ParadiseMod.items.tools.silver.silverSpade;
import com.NetherNoah.ParadiseMod.items.tools.silver.silverSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

//item list
public class ModItems {
	public static Item salt;
	public static Item CactusStick;
	public static ItemArmor santaJacket;
	public static ItemArmor santaPants;
	public static ItemArmor santaBoots;
	// tools
	//cactus
	public static ItemSword cactusSword;
	public static ItemTool cactusAxe;
	public static ItemTool cactusPickaxe;
	public static ItemHoe cactusHoe;
	public static ItemTool cactusSpade;
	// emerald
	public static ItemSword emeraldSword;
	public static ItemTool emeraldAxe;
	public static ItemTool emeraldPickaxe;
	public static ItemHoe emeraldHoe;
	public static ItemTool emeraldSpade;
	// ruby
	public static ItemSword rubySword;
	public static ItemTool rubyAxe;
	public static ItemTool rubyPickaxe;
	public static ItemHoe rubyHoe;
	public static ItemTool rubySpade;
	// obsidian
	public static ItemSword obsidianSword;
	public static ItemTool obsidianAxe;
	public static ItemTool obsidianPickaxe;
	public static ItemHoe obsidianHoe;
	public static ItemTool obsidianSpade;
	// redstone
	public static ItemSword redstoneSword;
	public static ItemTool redstoneAxe;
	public static ItemTool redstonePickaxe;
	public static ItemHoe redstoneHoe;
	public static ItemTool redstoneSpade;
	//silver
	public static ItemSword silverSword;
	public static ItemTool silverAxe;
	public static ItemTool silverPickaxe;
	public static ItemHoe silverHoe;
	public static ItemTool silverSpade;
	// armor
	//silver
	public static ItemArmor silverHelmet;
	public static ItemArmor silverChestplate;
	public static ItemArmor silverLeggings;
	public static ItemArmor silverBoots;
	// emerald
	public static ItemArmor emeraldHelmet;
	public static ItemArmor emeraldChestplate;
	public static ItemArmor emeraldLeggings;
	public static ItemArmor emeraldBoots;
	// ruby
	public static ItemArmor rubyHelmet;
	public static ItemArmor rubyChestplate;
	public static ItemArmor rubyLeggings;
	public static ItemArmor rubyBoots;
	// redstone
	public static ItemArmor redstoneHelmet;
	public static ItemArmor redstoneChestplate;
	public static ItemArmor redstoneLeggings;
	public static ItemArmor redstoneBoots;
	// obsidian
	public static ItemArmor obsidianHelmet;
	public static ItemArmor obsidianChestplate;
	public static ItemArmor obsidianLeggings;
	public static ItemArmor obsidianBoots;
	// miscellany
	public static ItemBlock ObsidianWall;
	public static Item SilverNugget;
	public static Item Ruby;
	public static Item SilverIngot;
	// doors
	public static ItemDoor ItemCactusDoor;
	public static ItemDoor ItemEndDoor;
	public static ItemDoor ItemSilverDoor;
	public static ItemDoor ItemGlassDoor;
	public static ItemDoor ItemGoldDoor;
	public static ItemDoor ItemDiamondDoor;
	public static ItemDoor ItemEmeraldDoor;
	public static ItemDoor ItemAndesiteDoor;
	public static ItemDoor ItemDioriteDoor;
	public static ItemDoor ItemGraniteDoor;
	public static ItemDoor ItemStoneDoor;
	public static ItemDoor ItemCobblestoneDoor;
	public static ItemDoor ItemMossStoneDoor;
	public static ItemDoor ItemGlowingObsidianDoor;
	public static ItemDoor ItemObsidianDoor;
	public static ItemDoor ItemBedrockDoor;
	public static ItemDoor ItemRubyDoor;
	public static ItemDoor ItemRedstoneDoor;
	
	//tools
	public static final ToolMaterial silverMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":silver", 2, 64, 12.0F, 2F, 22);
	public static final ToolMaterial emeraldMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":emerald", 4,1700, 9F, 4F, 30);
	public static final ToolMaterial rubyMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":ruby", 4, 1700, 9F,4F, 30);
	public static final ToolMaterial obsidianMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":obsidian", 5,3122, 10F, 5F, 30);
	public static final ToolMaterial redstoneMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":redstone", 6,16, 100F, 10F, 45);
	public static final ToolMaterial Cactus = EnumHelper.addToolMaterial(Reference.MOD_ID + ":cactus", 0, 59, 2F, 0F, 15);
	
	//armor
	public static ArmorMaterial santaSuit = EnumHelper.addArmorMaterial("santa", Reference.MOD_ID + ":santa", -1,new int[] { 0, 0, 0, 0 },0,SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0F);
	public static ArmorMaterial emeraldMaterial = EnumHelper.addArmorMaterial("emerald", Reference.MOD_ID + ":emerald",35, new int[] { 4, 6, 8, 4 }, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static ArmorMaterial rubyMaterial = EnumHelper.addArmorMaterial("ruby", Reference.MOD_ID + ":ruby", 35,new int[] { 4, 6, 8, 4 }, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static ArmorMaterial obsidianMaterial = EnumHelper.addArmorMaterial("obsidian",Reference.MOD_ID + ":obsidian",40,new int[] {5,7,9,4},35,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0F);
	public static ArmorMaterial redstoneMaterial = EnumHelper.addArmorMaterial("redstone",Reference.MOD_ID + ":redstone",3,new int[]{8,10,12,7},40,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,5.0F);
	public static ArmorMaterial silverMaterial = EnumHelper.addArmorMaterial("silver",Reference.MOD_ID + ":silver", 7, new int[] {2,5,6,2},25,SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);

	public static void initAndRegister() {
		// item registry list
		ForgeRegistries.ITEMS.register(salt=new Salt());
		ForgeRegistries.ITEMS.register(CactusStick=new CactusStick());
		ForgeRegistries.ITEMS.register(SilverNugget=new SilverNugget());
		ForgeRegistries.ITEMS.register(santaJacket = new SantaSuit(santaSuit, 1, EntityEquipmentSlot.CHEST, "santa_jacket"));
		ForgeRegistries.ITEMS.register(santaPants = new SantaSuit(santaSuit, 2, EntityEquipmentSlot.LEGS, "santa_pants"));
		ForgeRegistries.ITEMS.register(santaBoots = new SantaSuit(santaSuit, 1, EntityEquipmentSlot.FEET, "santa_boots"));
		
		ForgeRegistries.ITEMS.register(emeraldPickaxe = new emeraldPickaxe(emeraldMaterialT, "emerald_pickaxe"));
		ForgeRegistries.ITEMS.register(emeraldAxe = new emeraldAxe(emeraldMaterialT, "emerald_axe"));
		ForgeRegistries.ITEMS.register(emeraldSpade = new emeraldSpade(emeraldMaterialT, "emerald_spade"));
		ForgeRegistries.ITEMS.register(emeraldHoe = new emeraldHoe(emeraldMaterialT, "emerald_hoe"));
		ForgeRegistries.ITEMS.register(emeraldSword = new emeraldSword(emeraldMaterialT, "emerald_sword"));
		
		ForgeRegistries.ITEMS.register(rubyPickaxe = new rubyPickaxe(rubyMaterialT, "ruby_pickaxe"));
		ForgeRegistries.ITEMS.register(rubyAxe = new rubyAxe(rubyMaterialT, "ruby_axe"));
		ForgeRegistries.ITEMS.register(rubySpade = new rubySpade(rubyMaterialT, "ruby_spade"));
		ForgeRegistries.ITEMS.register(rubyHoe = new rubyHoe(rubyMaterialT, "ruby_hoe"));
		ForgeRegistries.ITEMS.register(rubySword = new rubySword(rubyMaterialT, "ruby_sword"));
		
		ForgeRegistries.ITEMS.register(silverPickaxe = new silverPickaxe(silverMaterialT, "silver_pickaxe"));
		ForgeRegistries.ITEMS.register(silverAxe = new silverAxe(silverMaterialT, "silver_axe"));
		ForgeRegistries.ITEMS.register(silverSpade = new silverSpade(silverMaterialT, "silver_spade"));
		ForgeRegistries.ITEMS.register(silverHoe = new silverHoe(silverMaterialT, "silver_hoe"));
		ForgeRegistries.ITEMS.register(silverSword = new silverSword(silverMaterialT, "silver_sword"));
		
		ForgeRegistries.ITEMS.register(obsidianPickaxe = new obsidianPickaxe(obsidianMaterialT, "obsidian_pickaxe"));
		ForgeRegistries.ITEMS.register(obsidianAxe = new obsidianAxe(obsidianMaterialT, "obsidian_axe"));
		ForgeRegistries.ITEMS.register(obsidianSpade = new obsidianSpade(obsidianMaterialT, "obsidian_spade"));
		ForgeRegistries.ITEMS.register(obsidianHoe = new obsidianHoe(obsidianMaterialT, "obsidian_hoe"));
		ForgeRegistries.ITEMS.register(obsidianSword = new obsidianSword(obsidianMaterialT, "obsidian_sword"));

		ForgeRegistries.ITEMS.register(cactusPickaxe = new redstonePickaxe(Cactus, "cactus_pickaxe"));
		ForgeRegistries.ITEMS.register(cactusAxe = new redstoneAxe(Cactus, "cactus_axe"));
		ForgeRegistries.ITEMS.register(cactusSpade = new redstoneSpade(Cactus, "cactus_spade"));
		ForgeRegistries.ITEMS.register(cactusHoe = new redstoneHoe(Cactus, "cactus_hoe"));
		ForgeRegistries.ITEMS.register(cactusSword = new redstoneSword(Cactus, "cactus_sword"));
		
		ForgeRegistries.ITEMS.register(redstonePickaxe = new redstonePickaxe(redstoneMaterialT, "redstone_pickaxe"));
		ForgeRegistries.ITEMS.register(redstoneAxe = new redstoneAxe(redstoneMaterialT, "redstone_axe"));
		ForgeRegistries.ITEMS.register(redstoneSpade = new redstoneSpade(redstoneMaterialT, "redstone_spade"));
		ForgeRegistries.ITEMS.register(redstoneHoe = new redstoneHoe(redstoneMaterialT, "redstone_hoe"));
		ForgeRegistries.ITEMS.register(redstoneSword = new redstoneSword(redstoneMaterialT, "redstone_sword"));
		
		ForgeRegistries.ITEMS.register(emeraldHelmet = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.HEAD, "emerald_helmet"));
		ForgeRegistries.ITEMS.register(emeraldChestplate = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.CHEST,"emerald_chestplate"));
		ForgeRegistries.ITEMS.register(emeraldLeggings = new ArmorEmerald(emeraldMaterial, 2, EntityEquipmentSlot.LEGS, "emerald_leggings"));
		ForgeRegistries.ITEMS.register(emeraldBoots = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.FEET, "emerald_boots"));
		
		ForgeRegistries.ITEMS.register(silverHelmet = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.HEAD, "silver_helmet"));
		ForgeRegistries.ITEMS.register(silverChestplate = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.CHEST,"silver_chestplate"));
		ForgeRegistries.ITEMS.register(silverLeggings = new ArmorSilver(silverMaterial, 2, EntityEquipmentSlot.LEGS, "silver_leggings"));
		ForgeRegistries.ITEMS.register(silverBoots = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.FEET, "silver_boots"));
		
		ForgeRegistries.ITEMS.register(rubyHelmet = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.HEAD, "ruby_helmet"));
		ForgeRegistries.ITEMS.register(rubyChestplate = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.CHEST, "ruby_chestplate"));
		ForgeRegistries.ITEMS.register(rubyLeggings = new ArmorRuby(rubyMaterial, 2, EntityEquipmentSlot.LEGS, "ruby_leggings"));
		ForgeRegistries.ITEMS.register(rubyBoots = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.FEET, "ruby_boots"));
		
		ForgeRegistries.ITEMS.register(redstoneHelmet = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.HEAD, "redstone_helmet"));
		ForgeRegistries.ITEMS.register(redstoneChestplate = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.CHEST,"redstone_chestplate"));
		ForgeRegistries.ITEMS.register(redstoneLeggings = new ArmorRedstone(redstoneMaterial, 2, EntityEquipmentSlot.LEGS,"redstone_leggings"));
		ForgeRegistries.ITEMS.register(redstoneBoots = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.FEET, "redstone_boots"));

		ForgeRegistries.ITEMS.register(obsidianHelmet = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.HEAD, "obsidian_helmet"));
		ForgeRegistries.ITEMS.register(obsidianChestplate = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.CHEST,"obsidian_chestplate"));
		ForgeRegistries.ITEMS.register(obsidianLeggings = new ArmorObsidian(obsidianMaterial, 2, EntityEquipmentSlot.LEGS,"obsidian_leggings"));
		ForgeRegistries.ITEMS.register(obsidianBoots = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.FEET, "obsidian_boots"));
		
		ForgeRegistries.ITEMS.register(Ruby = new ItemRuby());
		ForgeRegistries.ITEMS.register(SilverIngot=new SilverIngot());
		
		ForgeRegistries.ITEMS.register(ItemCactusDoor=new ItemCactusDoor());
		ForgeRegistries.ITEMS.register(ItemGlowingObsidianDoor=new ItemGlowingObsidianDoor());
		ForgeRegistries.ITEMS.register(ItemEndDoor=new ItemEndDoor());
		ForgeRegistries.ITEMS.register(ItemSilverDoor=new ItemSilverDoor());
		ForgeRegistries.ITEMS.register(ItemGlassDoor = new ItemGlassDoor());
		ForgeRegistries.ITEMS.register(ItemGoldDoor = new ItemGoldDoor());
		ForgeRegistries.ITEMS.register(ItemDiamondDoor = new ItemDiamondDoor());
		ForgeRegistries.ITEMS.register(ItemEmeraldDoor = new ItemEmeraldDoor());
		ForgeRegistries.ITEMS.register(ItemAndesiteDoor = new ItemAndesiteDoor());
		ForgeRegistries.ITEMS.register(ItemDioriteDoor = new ItemDioriteDoor());
		ForgeRegistries.ITEMS.register(ItemGraniteDoor = new ItemGraniteDoor());
		ForgeRegistries.ITEMS.register(ItemStoneDoor = new ItemStoneDoor());
		ForgeRegistries.ITEMS.register(ItemCobblestoneDoor = new ItemCobblestoneDoor());
		ForgeRegistries.ITEMS.register(ItemMossStoneDoor = new ItemMossStoneDoor());
		ForgeRegistries.ITEMS.register(ItemObsidianDoor = new ItemObsidianDoor());
		ForgeRegistries.ITEMS.register(ItemBedrockDoor = new ItemBedrockDoor());
		ForgeRegistries.ITEMS.register(ItemRubyDoor = new ItemRubyDoor());
		ForgeRegistries.ITEMS.register(ItemRedstoneDoor = new ItemRedstoneDoor());
	}
	public static void registerRenders() {
		// item render registry list
		regRender(salt);
		regRender(CactusStick);
		regRender(SilverNugget);
		regRender(santaJacket);
		regRender(santaPants);
		regRender(santaBoots);

		//tools
		//cactus
		regRender(cactusPickaxe);
		regRender(cactusAxe);
		regRender(cactusSpade);
		regRender(cactusHoe);
		regRender(cactusSword);

		//emerald
		regRender(emeraldPickaxe);
		regRender(emeraldAxe);
		regRender(emeraldSpade);
		regRender(emeraldHoe);
		regRender(emeraldSword);

		//ruby
		regRender(rubyPickaxe);
		regRender(rubyAxe);
		regRender(rubySpade);
		regRender(rubyHoe);
		regRender(rubySword);

		//obsidian
		regRender(obsidianPickaxe);
		regRender(obsidianAxe);
		regRender(obsidianSpade);
		regRender(obsidianHoe);
		regRender(obsidianSword);

		//silver
		regRender(silverPickaxe);
		regRender(silverAxe);
		regRender(silverSpade);
		regRender(silverHoe);
		regRender(silverSword);

		//redstone
		regRender(redstonePickaxe);
		regRender(redstoneAxe);
		regRender(redstoneSpade);
		regRender(redstoneHoe);

		//armor
		//emerald
		regRender(emeraldHelmet);
		regRender(emeraldChestplate);
		regRender(emeraldLeggings);
		regRender(emeraldBoots);

		//ruby
		regRender(rubyHelmet);
		regRender(rubyChestplate);
		regRender(rubyLeggings);
		regRender(rubyBoots);

		//redstone
		regRender(redstoneHelmet);
		regRender(redstoneChestplate);
		regRender(redstoneLeggings);
		regRender(redstoneBoots);
		regRender(redstoneSword);

		//obsidian
		regRender(obsidianHelmet);
		regRender(obsidianChestplate);
		regRender(obsidianLeggings);
		regRender(obsidianBoots);

		//silver
		regRender(silverHelmet);
		regRender(silverChestplate);
		regRender(silverLeggings);
		regRender(silverBoots);
		
		//Others
		regRender(ItemGlowingObsidianDoor);
		regRender(ItemEndDoor);
		regRender(ItemCactusDoor);
		regRender(ItemSilverDoor);
		regRender(SilverIngot);
		regRender(Ruby);
		regRender(ItemGlassDoor);
		regRender(ItemGoldDoor);
		regRender(ItemDiamondDoor);
		regRender(ItemEmeraldDoor);
		regRender(ItemAndesiteDoor);
		regRender(ItemDioriteDoor);
		regRender(ItemGraniteDoor);
		regRender(ItemStoneDoor);
		regRender(ItemCobblestoneDoor);
		regRender(ItemMossStoneDoor);
		regRender(ItemObsidianDoor);
		regRender(ItemBedrockDoor);
		regRender(ItemRubyDoor);
		regRender(ItemRedstoneDoor);
	}
	private static void regRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}