package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemObsidianDoor extends ItemDoor {
	public ItemObsidianDoor() {
		super(ModBlocks.BlockObsidianDoor);
		setUnlocalizedName("ItemObsidianDoor");
		setRegistryName("obsidian_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}