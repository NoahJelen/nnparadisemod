package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGlassDoor extends ItemDoor {
	public ItemGlassDoor() {
		super(ModBlocks.BlockGlassDoor);
		setUnlocalizedName("ItemGlassDoor");
		setRegistryName("glass_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
