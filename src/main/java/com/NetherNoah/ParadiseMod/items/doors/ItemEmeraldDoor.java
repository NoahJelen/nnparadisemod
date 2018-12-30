package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemEmeraldDoor extends ItemDoor {
	public ItemEmeraldDoor() {
		super(Doors.EmeraldDoor);
		setUnlocalizedName("ItemEmeraldDoor");
		setRegistryName("emerald_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
