package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemEndDoor extends ItemDoor {
	public ItemEndDoor() {
		super(ModBlocks.BlockEndDoor);
		setUnlocalizedName("ItemEndDoor");
		setRegistryName("end_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
