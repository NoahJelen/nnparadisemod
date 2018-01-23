package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemRedstoneDoor extends ItemDoor {
	public ItemRedstoneDoor() {
		super(ModBlocks.BlockRedstoneDoor);
		setUnlocalizedName("ItemRedstoneDoor");
		setRegistryName("redstone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}