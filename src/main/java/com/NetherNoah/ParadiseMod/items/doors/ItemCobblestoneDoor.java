package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemCobblestoneDoor extends ItemDoor {
	public ItemCobblestoneDoor() {
		super(ModBlocks.BlockCobblestoneDoor);
		setUnlocalizedName("ItemCobblestoneDoor");
		setRegistryName("cobblestone_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}