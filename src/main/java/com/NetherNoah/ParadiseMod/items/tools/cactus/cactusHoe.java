package com.NetherNoah.ParadiseMod.items.tools.cactus;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class cactusHoe extends ItemHoe {
	public cactusHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}