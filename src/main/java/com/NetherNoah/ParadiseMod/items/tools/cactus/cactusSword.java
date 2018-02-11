package com.NetherNoah.ParadiseMod.items.tools.cactus;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class cactusSword extends ItemSword {
	public cactusSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}