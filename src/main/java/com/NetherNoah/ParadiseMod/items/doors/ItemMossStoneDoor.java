package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemMossStoneDoor extends ItemDoor {
	public ItemMossStoneDoor() {
		super(Doors.BlockMossStoneDoor);
		setUnlocalizedName("ItemMossStoneDoor");
		setRegistryName("moss_stone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}