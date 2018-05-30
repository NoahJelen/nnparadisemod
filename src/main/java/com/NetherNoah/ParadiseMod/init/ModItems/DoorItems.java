package com.NetherNoah.ParadiseMod.init.ModItems;

import com.NetherNoah.ParadiseMod.Utils;
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
import net.minecraft.item.ItemDoor;

public class DoorItems {
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
	
	public static void initAndRegister() {
		Utils.regItem(ItemRustyDoor=new ItemRustyDoor());
		Utils.regItem(ItemCactusDoor=new ItemCactusDoor());
		Utils.regItem(ItemGlowingObsidianDoor=new ItemGlowingObsidianDoor());
		Utils.regItem(ItemEndDoor=new ItemEndDoor());
		Utils.regItem(ItemSilverDoor=new ItemSilverDoor());
		Utils.regItem(ItemGlassDoor = new ItemGlassDoor());
		Utils.regItem(ItemGoldDoor = new ItemGoldDoor());
		Utils.regItem(ItemDiamondDoor = new ItemDiamondDoor());
		Utils.regItem(ItemEmeraldDoor = new ItemEmeraldDoor());
		Utils.regItem(ItemAndesiteDoor = new ItemAndesiteDoor());
		Utils.regItem(ItemDioriteDoor = new ItemDioriteDoor());
		Utils.regItem(ItemGraniteDoor = new ItemGraniteDoor());
		Utils.regItem(ItemStoneDoor = new ItemStoneDoor());
		Utils.regItem(ItemCobblestoneDoor = new ItemCobblestoneDoor());
		Utils.regItem(ItemMossStoneDoor = new ItemMossStoneDoor());
		Utils.regItem(ItemObsidianDoor = new ItemObsidianDoor());
		Utils.regItem(ItemBedrockDoor = new ItemBedrockDoor());
		Utils.regItem(ItemRubyDoor = new ItemRubyDoor());
		Utils.regItem(ItemRedstoneDoor = new ItemRedstoneDoor());
	}
	
	public static void regRenders() {
		Utils.regRender(ItemRustyDoor);
		Utils.regRender(ItemGlowingObsidianDoor);
		Utils.regRender(ItemEndDoor);
		Utils.regRender(ItemCactusDoor);
		Utils.regRender(ItemSilverDoor);
		Utils.regRender(ItemGlassDoor);
		Utils.regRender(ItemGoldDoor);
		Utils.regRender(ItemDiamondDoor);
		Utils.regRender(ItemEmeraldDoor);
		Utils.regRender(ItemAndesiteDoor);
		Utils.regRender(ItemDioriteDoor);
		Utils.regRender(ItemGraniteDoor);
		Utils.regRender(ItemStoneDoor);
		Utils.regRender(ItemCobblestoneDoor);
		Utils.regRender(ItemMossStoneDoor);
		Utils.regRender(ItemObsidianDoor);
		Utils.regRender(ItemBedrockDoor);
		Utils.regRender(ItemRubyDoor);
		Utils.regRender(ItemRedstoneDoor);
	}
}
