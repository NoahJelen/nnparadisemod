package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemStoneDoor extends ItemDoor {
	public ItemStoneDoor() {
		super(Doors.StoneDoor);
		setUnlocalizedName("ItemStoneDoor");
		setRegistryName("stone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}