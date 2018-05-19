package com.NetherNoah.ParadiseMod.init;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.items.CactusStick;
import com.NetherNoah.ParadiseMod.items.ItemRuby;
import com.NetherNoah.ParadiseMod.items.RustyIngot;
import com.NetherNoah.ParadiseMod.items.RustyNugget;
import com.NetherNoah.ParadiseMod.items.Salt;
import com.NetherNoah.ParadiseMod.items.SilverIngot;
import com.NetherNoah.ParadiseMod.items.SilverNugget;
import com.NetherNoah.ParadiseMod.items.armor.ArmorEmerald;
import com.NetherNoah.ParadiseMod.items.armor.ArmorObsidian;
import com.NetherNoah.ParadiseMod.items.armor.ArmorRedstone;
import com.NetherNoah.ParadiseMod.items.armor.ArmorRuby;
import com.NetherNoah.ParadiseMod.items.armor.ArmorRusty;
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
import com.NetherNoah.ParadiseMod.items.doors.ItemRustyDoor;
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
import com.NetherNoah.ParadiseMod.items.tools.rusty.rustyAxe;
import com.NetherNoah.ParadiseMod.items.tools.rusty.rustyHoe;
import com.NetherNoah.ParadiseMod.items.tools.rusty.rustyPickaxe;
import com.NetherNoah.ParadiseMod.items.tools.rusty.rustySpade;
import com.NetherNoah.ParadiseMod.items.tools.rusty.rustySword;
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
	//rusty iron
	public static rustySword rustySword;
	public static rustyAxe rustyAxe;
	public static rustyPickaxe rustyPickaxe;
	public static rustyHoe rustyHoe;
	public static rustySpade rustySpade;
	// armor
	//silver
	public static ItemArmor silverHelmet;
	public static ItemArmor silverChestplate;
	public static ItemArmor silverLeggings;
	public static ItemArmor silverBoots;
	//rusty iron
	public static ItemArmor rustyHelmet;
	public static ItemArmor rustyChestplate;
	public static ItemArmor rustyLeggings;
	public static ItemArmor rustyBoots;
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
	public static Item RustyIngot;
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
	public static ItemDoor ItemRustyDoor;
	public static Item RustyNugget;
	
	//tools
	public static final ToolMaterial rustyMaterialT = EnumHelper.addToolMaterial(Reference.MOD_ID + ":rusty", 2, 125, 12.0F, 2F, 22);
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
	public static ArmorMaterial rustyMaterial = EnumHelper.addArmorMaterial("rusty",Reference.MOD_ID + ":rusty", 7, new int[] {2,5,6,2},25,SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static ArmorMaterial silverMaterial = EnumHelper.addArmorMaterial("silver",Reference.MOD_ID + ":silver", 7, new int[] {2,5,6,2},25,SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);

	public static void initAndRegister() {
		//item registry list
		regItem(RustyNugget=new RustyNugget());
		regItem(RustyIngot=new RustyIngot());
		regItem(salt=new Salt());
		regItem(CactusStick=new CactusStick());
		regItem(SilverNugget=new SilverNugget());
		regItem(santaJacket = new SantaSuit(santaSuit, 1, EntityEquipmentSlot.CHEST, "santa_jacket"));
		regItem(santaPants = new SantaSuit(santaSuit, 2, EntityEquipmentSlot.LEGS, "santa_pants"));
		regItem(santaBoots = new SantaSuit(santaSuit, 1, EntityEquipmentSlot.FEET, "santa_boots"));
		
		regItem(emeraldPickaxe = new emeraldPickaxe(emeraldMaterialT, "emerald_pickaxe"));
		regItem(emeraldAxe = new emeraldAxe(emeraldMaterialT, "emerald_axe"));
		regItem(emeraldSpade = new emeraldSpade(emeraldMaterialT, "emerald_spade"));
		regItem(emeraldHoe = new emeraldHoe(emeraldMaterialT, "emerald_hoe"));
		regItem(emeraldSword = new emeraldSword(emeraldMaterialT, "emerald_sword"));
		
		regItem(rubyPickaxe = new rubyPickaxe(rubyMaterialT, "ruby_pickaxe"));
		regItem(rubyAxe = new rubyAxe(rubyMaterialT, "ruby_axe"));
		regItem(rubySpade = new rubySpade(rubyMaterialT, "ruby_spade"));
		regItem(rubyHoe = new rubyHoe(rubyMaterialT, "ruby_hoe"));
		regItem(rubySword = new rubySword(rubyMaterialT, "ruby_sword"));
		
		regItem(silverPickaxe = new silverPickaxe(silverMaterialT, "silver_pickaxe"));
		regItem(silverAxe = new silverAxe(silverMaterialT, "silver_axe"));
		regItem(silverSpade = new silverSpade(silverMaterialT, "silver_spade"));
		regItem(silverHoe = new silverHoe(silverMaterialT, "silver_hoe"));
		regItem(silverSword = new silverSword(silverMaterialT, "silver_sword"));
		
		regItem(rustyPickaxe = new rustyPickaxe(rustyMaterialT, "rusty_pickaxe"));
		regItem(rustyAxe = new rustyAxe(rustyMaterialT, "rusty_axe"));
		regItem(rustySpade = new rustySpade(rustyMaterialT, "rusty_spade"));
		regItem(rustyHoe = new rustyHoe(rustyMaterialT, "rusty_hoe"));
		regItem(rustySword = new rustySword(rustyMaterialT, "rusty_sword"));
		
		regItem(obsidianPickaxe = new obsidianPickaxe(obsidianMaterialT, "obsidian_pickaxe"));
		regItem(obsidianAxe = new obsidianAxe(obsidianMaterialT, "obsidian_axe"));
		regItem(obsidianSpade = new obsidianSpade(obsidianMaterialT, "obsidian_spade"));
		regItem(obsidianHoe = new obsidianHoe(obsidianMaterialT, "obsidian_hoe"));
		regItem(obsidianSword = new obsidianSword(obsidianMaterialT, "obsidian_sword"));

		regItem(cactusPickaxe = new redstonePickaxe(Cactus, "cactus_pickaxe"));
		regItem(cactusAxe = new redstoneAxe(Cactus, "cactus_axe"));
		regItem(cactusSpade = new redstoneSpade(Cactus, "cactus_spade"));
		regItem(cactusHoe = new redstoneHoe(Cactus, "cactus_hoe"));
		regItem(cactusSword = new redstoneSword(Cactus, "cactus_sword"));
		
		regItem(redstonePickaxe = new redstonePickaxe(redstoneMaterialT, "redstone_pickaxe"));
		regItem(redstoneAxe = new redstoneAxe(redstoneMaterialT, "redstone_axe"));
		regItem(redstoneSpade = new redstoneSpade(redstoneMaterialT, "redstone_spade"));
		regItem(redstoneHoe = new redstoneHoe(redstoneMaterialT, "redstone_hoe"));
		regItem(redstoneSword = new redstoneSword(redstoneMaterialT, "redstone_sword"));
		
		regItem(emeraldHelmet = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.HEAD, "emerald_helmet"));
		regItem(emeraldChestplate = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.CHEST,"emerald_chestplate"));
		regItem(emeraldLeggings = new ArmorEmerald(emeraldMaterial, 2, EntityEquipmentSlot.LEGS, "emerald_leggings"));
		regItem(emeraldBoots = new ArmorEmerald(emeraldMaterial, 1, EntityEquipmentSlot.FEET, "emerald_boots"));
		
		regItem(silverHelmet = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.HEAD, "silver_helmet"));
		regItem(silverChestplate = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.CHEST,"silver_chestplate"));
		regItem(silverLeggings = new ArmorSilver(silverMaterial, 2, EntityEquipmentSlot.LEGS, "silver_leggings"));
		regItem(silverBoots = new ArmorSilver(silverMaterial, 1, EntityEquipmentSlot.FEET, "silver_boots"));
		
		regItem(rustyHelmet = new ArmorRusty(rustyMaterial, 1, EntityEquipmentSlot.HEAD, "rusty_helmet"));
		regItem(rustyChestplate = new ArmorRusty(rustyMaterial, 1, EntityEquipmentSlot.CHEST,"rusty_chestplate"));
		regItem(rustyLeggings = new ArmorRusty(rustyMaterial, 2, EntityEquipmentSlot.LEGS, "rusty_leggings"));
		regItem(rustyBoots = new ArmorRusty(rustyMaterial, 1, EntityEquipmentSlot.FEET, "rusty_boots"));
		
		regItem(rubyHelmet = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.HEAD, "ruby_helmet"));
		regItem(rubyChestplate = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.CHEST, "ruby_chestplate"));
		regItem(rubyLeggings = new ArmorRuby(rubyMaterial, 2, EntityEquipmentSlot.LEGS, "ruby_leggings"));
		regItem(rubyBoots = new ArmorRuby(rubyMaterial, 1, EntityEquipmentSlot.FEET, "ruby_boots"));
		
		regItem(redstoneHelmet = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.HEAD, "redstone_helmet"));
		regItem(redstoneChestplate = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.CHEST,"redstone_chestplate"));
		regItem(redstoneLeggings = new ArmorRedstone(redstoneMaterial, 2, EntityEquipmentSlot.LEGS,"redstone_leggings"));
		regItem(redstoneBoots = new ArmorRedstone(redstoneMaterial, 1, EntityEquipmentSlot.FEET, "redstone_boots"));

		regItem(obsidianHelmet = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.HEAD, "obsidian_helmet"));
		regItem(obsidianChestplate = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.CHEST,"obsidian_chestplate"));
		regItem(obsidianLeggings = new ArmorObsidian(obsidianMaterial, 2, EntityEquipmentSlot.LEGS,"obsidian_leggings"));
		regItem(obsidianBoots = new ArmorObsidian(obsidianMaterial, 1, EntityEquipmentSlot.FEET, "obsidian_boots"));
		
		regItem(Ruby = new ItemRuby());
		regItem(SilverIngot=new SilverIngot());
		
		regItem(ItemRustyDoor=new ItemRustyDoor());
		regItem(ItemCactusDoor=new ItemCactusDoor());
		regItem(ItemGlowingObsidianDoor=new ItemGlowingObsidianDoor());
		regItem(ItemEndDoor=new ItemEndDoor());
		regItem(ItemSilverDoor=new ItemSilverDoor());
		regItem(ItemGlassDoor = new ItemGlassDoor());
		regItem(ItemGoldDoor = new ItemGoldDoor());
		regItem(ItemDiamondDoor = new ItemDiamondDoor());
		regItem(ItemEmeraldDoor = new ItemEmeraldDoor());
		regItem(ItemAndesiteDoor = new ItemAndesiteDoor());
		regItem(ItemDioriteDoor = new ItemDioriteDoor());
		regItem(ItemGraniteDoor = new ItemGraniteDoor());
		regItem(ItemStoneDoor = new ItemStoneDoor());
		regItem(ItemCobblestoneDoor = new ItemCobblestoneDoor());
		regItem(ItemMossStoneDoor = new ItemMossStoneDoor());
		regItem(ItemObsidianDoor = new ItemObsidianDoor());
		regItem(ItemBedrockDoor = new ItemBedrockDoor());
		regItem(ItemRubyDoor = new ItemRubyDoor());
		regItem(ItemRedstoneDoor = new ItemRedstoneDoor());
	}
	public static void registerRenders() {
		//item render registry list
		regRender(salt);
		regRender(CactusStick);
		regRender(SilverNugget);
		regRender(santaJacket);
		regRender(santaPants);
		regRender(santaBoots);
		regRender(RustyIngot);

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
		
		//rusty iron
		regRender(rustyPickaxe);
		regRender(rustyAxe);
		regRender(rustySpade);
		regRender(rustyHoe);
		regRender(rustySword);


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
		
		//rusty iron
		regRender(rustyHelmet);
		regRender(rustyChestplate);
		regRender(rustyLeggings);
		regRender(rustyBoots);
		
		//Others
		regRender(ItemRustyDoor);
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
		regRender(RustyNugget);
	}
	private static void regItem(Item value) {
		ForgeRegistries.ITEMS.register(value);
	}
	private static void regRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}