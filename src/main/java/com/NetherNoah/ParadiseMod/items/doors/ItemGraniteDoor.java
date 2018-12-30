package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGraniteDoor extends ItemDoor {
	public ItemGraniteDoor() {
		super(Doors.GraniteDoor);
		setUnlocalizedName("ItemGraniteDoor");
		setRegistryName("granite_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
