package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGraniteDoor extends ItemDoor {
	public ItemGraniteDoor() {
		super(ModBlocks.BlockGraniteDoor);
		setUnlocalizedName("ItemGraniteDoor");
		setRegistryName("granite_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
