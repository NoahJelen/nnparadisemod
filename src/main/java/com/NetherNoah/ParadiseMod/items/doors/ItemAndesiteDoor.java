package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemAndesiteDoor extends ItemDoor {
	public ItemAndesiteDoor() {
		super(ModBlocks.BlockAndesiteDoor);
		setUnlocalizedName("ItemAndesiteDoor");
		setRegistryName("andesite_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}