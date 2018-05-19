package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemRustyDoor extends ItemDoor {
	public ItemRustyDoor() {
		super(ModBlocks.RustyDoor);
		setUnlocalizedName("ItemRustyDoor");
		setRegistryName("rusty_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
