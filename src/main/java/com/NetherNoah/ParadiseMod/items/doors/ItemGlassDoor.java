package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGlassDoor extends ItemDoor {
	public ItemGlassDoor() {
		super(Doors.GlassDoor);
		setUnlocalizedName("ItemGlassDoor");
		setRegistryName("glass_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
