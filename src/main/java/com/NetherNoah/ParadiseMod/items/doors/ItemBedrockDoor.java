package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemBedrockDoor extends ItemDoor {
	public ItemBedrockDoor() {
		super(Doors.BedrockDoor);
		setUnlocalizedName("ItemBedrockDoor");
		setRegistryName("bedrock_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}