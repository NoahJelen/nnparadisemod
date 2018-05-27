package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemRubyDoor extends ItemDoor {
	public ItemRubyDoor() {
		super(Doors.BlockRubyDoor);
		setUnlocalizedName("ItemRubyDoor");
		setRegistryName("ruby_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}