package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemCobblestoneDoor extends ItemDoor {
	public ItemCobblestoneDoor() {
		super(Doors.BlockCobblestoneDoor);
		setUnlocalizedName("ItemCobblestoneDoor");
		setRegistryName("cobblestone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}