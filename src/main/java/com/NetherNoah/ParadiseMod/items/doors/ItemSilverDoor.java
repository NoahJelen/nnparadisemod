package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemSilverDoor extends ItemDoor {
	public ItemSilverDoor() {
		super(ModBlocks.BlockSilverDoor);
		setUnlocalizedName("ItemSilverDoor");
		setRegistryName("silver_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
