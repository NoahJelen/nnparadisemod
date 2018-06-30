package com.NetherNoah.ParadiseMod.items;

import net.minecraft.item.ItemFood;

public class CookedEgg extends ItemFood{

	public CookedEgg() {
		super(12, true);
		setUnlocalizedName("EggCooked");
		setRegistryName("cooked_egg");
	}
}