package com.NetherNoah.ParadiseMod.items.tools.emerald;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class emeraldSword extends ItemSword {
	public emeraldSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}