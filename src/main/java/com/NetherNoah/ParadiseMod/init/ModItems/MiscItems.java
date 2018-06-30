package com.NetherNoah.ParadiseMod.init.ModItems;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.items.CactusStick;
import com.NetherNoah.ParadiseMod.items.CookedEgg;
import com.NetherNoah.ParadiseMod.items.DyeBlack;
import com.NetherNoah.ParadiseMod.items.DyeBlue;
import com.NetherNoah.ParadiseMod.items.DyeBrown;
import com.NetherNoah.ParadiseMod.items.ItemRuby;
import com.NetherNoah.ParadiseMod.items.RustyIngot;
import com.NetherNoah.ParadiseMod.items.RustyNugget;
import com.NetherNoah.ParadiseMod.items.Salt;
import com.NetherNoah.ParadiseMod.items.SilverIngot;
import com.NetherNoah.ParadiseMod.items.SilverNugget;
import com.NetherNoah.ParadiseMod.items.VoidPearl;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;

public class MiscItems {
	public static Item DyeBlue;
	public static Item DyeBlack;
	public static Item DyeBrown;
	public static Item salt;
	public static Item CactusStick;
	public static ItemBlock ObsidianWall;
	public static Item SilverNugget;
	public static Item Ruby;
	public static Item SilverIngot;
	public static Item RustyIngot;
	public static Item RustyNugget;
	public static Item VoidPearl;
	public static ItemFood CookedEgg;
	
	public static void initAndRegister() {
		Utils.regItem(CookedEgg=new CookedEgg());
		Utils.regItem(VoidPearl=new VoidPearl());
		Utils.regItem(DyeBrown=new DyeBrown());
		Utils.regItem(DyeBlack=new DyeBlack());
		Utils.regItem(DyeBlue=new DyeBlue());
		Utils.regItem(RustyNugget=new RustyNugget());
		Utils.regItem(RustyIngot=new RustyIngot());
		Utils.regItem(salt=new Salt());
		Utils.regItem(CactusStick=new CactusStick());
		Utils.regItem(SilverNugget=new SilverNugget());
		Utils.regItem(Ruby = new ItemRuby());
		Utils.regItem(SilverIngot=new SilverIngot());
	}
	
	public static void regRenders() {
		Utils.regRender(CookedEgg);
		Utils.regRender(VoidPearl);
		Utils.regRender(DyeBrown);
		Utils.regRender(DyeBlack);
		Utils.regRender(DyeBlue);
		Utils.regRender(salt);
		Utils.regRender(RustyIngot);
		Utils.regRender(CactusStick);
		Utils.regRender(SilverNugget);
		Utils.regRender(Ruby);
		Utils.regRender(RustyNugget);
		Utils.regRender(SilverIngot);
	}
}
