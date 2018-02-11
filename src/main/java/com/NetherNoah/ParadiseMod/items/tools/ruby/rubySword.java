package com.NetherNoah.ParadiseMod.items.tools.ruby;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class rubySword extends ItemSword {
	public rubySword(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}