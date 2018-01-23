package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemStoneDoor extends ItemDoor {
	public ItemStoneDoor() {
		super(ModBlocks.BlockStoneDoor);
		setUnlocalizedName("ItemStoneDoor");
		setRegistryName("stone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}