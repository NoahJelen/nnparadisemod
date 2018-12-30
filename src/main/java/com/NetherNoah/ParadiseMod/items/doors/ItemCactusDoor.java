package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemCactusDoor extends ItemDoor {
	public ItemCactusDoor() {
		super(Doors.CactusDoor);
		setUnlocalizedName("ItemCactusDoor");
		setRegistryName("cactus_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}