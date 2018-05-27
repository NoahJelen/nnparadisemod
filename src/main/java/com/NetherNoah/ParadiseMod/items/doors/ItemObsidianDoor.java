package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemObsidianDoor extends ItemDoor {
	public ItemObsidianDoor() {
		super(Doors.BlockObsidianDoor);
		setUnlocalizedName("ItemObsidianDoor");
		setRegistryName("obsidian_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}