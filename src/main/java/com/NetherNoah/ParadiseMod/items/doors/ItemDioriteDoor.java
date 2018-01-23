package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemDioriteDoor extends ItemDoor {
	public ItemDioriteDoor() {
		super(ModBlocks.BlockDioriteDoor);
		setUnlocalizedName("ItemDioriteDoor");
		setRegistryName("diorite_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
