package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemEmeraldDoor extends ItemDoor {
	public ItemEmeraldDoor() {
		super(ModBlocks.BlockEmeraldDoor);
		setUnlocalizedName("ItemEmeraldDoor");
		setRegistryName("emerald_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
