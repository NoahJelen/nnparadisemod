package com.NetherNoah.ParadiseMod.creativeTabs;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ChristmasTab extends CreativeTabs {

public ChristmasTab() {
		super("christmas_stuff");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Misc.ChristmasSapling);
	}
}