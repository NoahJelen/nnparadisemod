package com.NetherNoah.ParadiseMod.items.tools.redstone;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class redstoneHoe extends ItemHoe {
	public redstoneHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}