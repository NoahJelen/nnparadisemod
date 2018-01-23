package com.NetherNoah.ParadiseMod.items.doors;

import com.NetherNoah.ParadiseMod.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ItemGlowingObsidianDoor extends ItemDoor {
	public ItemGlowingObsidianDoor() {
		super(ModBlocks.BlockGlowingObsidianDoor);
		setUnlocalizedName("ItemGlowingObsidianDoor");
		setRegistryName("glowing_obsidian_door");
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}