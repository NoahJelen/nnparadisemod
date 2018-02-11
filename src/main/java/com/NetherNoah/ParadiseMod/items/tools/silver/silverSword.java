package com.NetherNoah.ParadiseMod.items.tools.silver;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class silverSword extends ItemSword {
	public silverSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}