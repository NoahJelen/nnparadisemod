package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGoldDoor extends ItemDoor {
	public ItemGoldDoor() {
		super(ModBlocks.BlockGoldDoor);
		setUnlocalizedName("ItemGoldDoor");
		setRegistryName("gold_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
