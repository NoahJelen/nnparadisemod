package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemEndDoor extends ItemDoor {
	public ItemEndDoor() {
		super(Doors.EndDoor);
		setUnlocalizedName("ItemEndDoor");
		setRegistryName("end_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
