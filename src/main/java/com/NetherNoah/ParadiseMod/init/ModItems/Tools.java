package com.NetherNoah.ParadiseMod.init.ModItems;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.Utils;
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

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
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
	
	//tool material
	private static final ToolMaterial rustyMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":rusty", 2, 125, 12.0F, 2F, 22);
	private static final ToolMaterial silverMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":silver", 2, 64, 12.0F, 2F, 22);
	private static final ToolMaterial emeraldMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":emerald", 4,1700, 9F, 4F, 30);
	private static final ToolMaterial rubyMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":ruby", 4, 1700, 9F,4F, 30);
	private static final ToolMaterial obsidianMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":obsidian", 5,3122, 10F, 5F, 30);
	private static final ToolMaterial redstoneMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":redstone", 6,16, 100F, 10F, 45);
	private static final ToolMaterial Cactus = EnumHelper.addToolMaterial(Reference.MOD_ID + ":cactus", 0, 59, 2F, 0F, 15);
	
	public static void initAndRegister() {
		Utils.regItem(emeraldPickaxe = new emeraldPickaxe(emeraldMaterial, "emerald_pickaxe"));
		Utils.regItem(emeraldAxe = new emeraldAxe(emeraldMaterial, "emerald_axe"));
		Utils.regItem(emeraldSpade = new emeraldSpade(emeraldMaterial, "emerald_spade"));
		Utils.regItem(emeraldHoe = new emeraldHoe(emeraldMaterial, "emerald_hoe"));
		Utils.regItem(emeraldSword = new emeraldSword(emeraldMaterial, "emerald_sword"));
		
		Utils.regItem(rubyPickaxe = new rubyPickaxe(rubyMaterial, "ruby_pickaxe"));
		Utils.regItem(rubyAxe = new rubyAxe(rubyMaterial, "ruby_axe"));
		Utils.regItem(rubySpade = new rubySpade(rubyMaterial, "ruby_spade"));
		Utils.regItem(rubyHoe = new rubyHoe(rubyMaterial, "ruby_hoe"));
		Utils.regItem(rubySword = new rubySword(rubyMaterial, "ruby_sword"));
		
		Utils.regItem(silverPickaxe = new silverPickaxe(silverMaterial, "silver_pickaxe"));
		Utils.regItem(silverAxe = new silverAxe(silverMaterial, "silver_axe"));
		Utils.regItem(silverSpade = new silverSpade(silverMaterial, "silver_spade"));
		Utils.regItem(silverHoe = new silverHoe(silverMaterial, "silver_hoe"));
		Utils.regItem(silverSword = new silverSword(silverMaterial, "silver_sword"));
		
		Utils.regItem(rustyPickaxe = new rustyPickaxe(rustyMaterial, "rusty_pickaxe"));
		Utils.regItem(rustyAxe = new rustyAxe(rustyMaterial, "rusty_axe"));
		Utils.regItem(rustySpade = new rustySpade(rustyMaterial, "rusty_spade"));
		Utils.regItem(rustyHoe = new rustyHoe(rustyMaterial, "rusty_hoe"));
		Utils.regItem(rustySword = new rustySword(rustyMaterial, "rusty_sword"));
		
		Utils.regItem(obsidianPickaxe = new obsidianPickaxe(obsidianMaterial, "obsidian_pickaxe"));
		Utils.regItem(obsidianAxe = new obsidianAxe(obsidianMaterial, "obsidian_axe"));
		Utils.regItem(obsidianSpade = new obsidianSpade(obsidianMaterial, "obsidian_spade"));
		Utils.regItem(obsidianHoe = new obsidianHoe(obsidianMaterial, "obsidian_hoe"));
		Utils.regItem(obsidianSword = new obsidianSword(obsidianMaterial, "obsidian_sword"));

		Utils.regItem(cactusPickaxe = new redstonePickaxe(Cactus, "cactus_pickaxe"));
		Utils.regItem(cactusAxe = new redstoneAxe(Cactus, "cactus_axe"));
		Utils.regItem(cactusSpade = new redstoneSpade(Cactus, "cactus_spade"));
		Utils.regItem(cactusHoe = new redstoneHoe(Cactus, "cactus_hoe"));
		Utils.regItem(cactusSword = new redstoneSword(Cactus, "cactus_sword"));
		
		Utils.regItem(redstonePickaxe = new redstonePickaxe(redstoneMaterial, "redstone_pickaxe"));
		Utils.regItem(redstoneAxe = new redstoneAxe(redstoneMaterial, "redstone_axe"));
		Utils.regItem(redstoneSpade = new redstoneSpade(redstoneMaterial, "redstone_spade"));
		Utils.regItem(redstoneHoe = new redstoneHoe(redstoneMaterial, "redstone_hoe"));
		Utils.regItem(redstoneSword = new redstoneSword(redstoneMaterial, "redstone_sword"));
	}
	
	public static void regRenders() {

		//cactus
		Utils.regRender(cactusPickaxe);
		Utils.regRender(cactusAxe);
		Utils.regRender(cactusSpade);
		Utils.regRender(cactusHoe);
		Utils.regRender(cactusSword);

		//emerald
		Utils.regRender(emeraldPickaxe);
		Utils.regRender(emeraldAxe);
		Utils.regRender(emeraldSpade);
		Utils.regRender(emeraldHoe);
		Utils.regRender(emeraldSword);

		//ruby
		Utils.regRender(rubyPickaxe);
		Utils.regRender(rubyAxe);
		Utils.regRender(rubySpade);
		Utils.regRender(rubyHoe);
		Utils.regRender(rubySword);

		//obsidian
		Utils.regRender(obsidianPickaxe);
		Utils.regRender(obsidianAxe);
		Utils.regRender(obsidianSpade);
		Utils.regRender(obsidianHoe);
		Utils.regRender(obsidianSword);

		//silver
		Utils.regRender(silverPickaxe);
		Utils.regRender(silverAxe);
		Utils.regRender(silverSpade);
		Utils.regRender(silverHoe);
		Utils.regRender(silverSword);
		
		//rusty iron
		Utils.regRender(rustyPickaxe);
		Utils.regRender(rustyAxe);
		Utils.regRender(rustySpade);
		Utils.regRender(rustyHoe);
		Utils.regRender(rustySword);

		//redstone
		Utils.regRender(redstonePickaxe);
		Utils.regRender(redstoneAxe);
		Utils.regRender(redstoneSpade);
		Utils.regRender(redstoneHoe);
		Utils.regRender(redstoneSword);
	}
}
