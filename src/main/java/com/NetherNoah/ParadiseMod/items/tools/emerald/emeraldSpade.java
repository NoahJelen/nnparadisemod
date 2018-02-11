package com.NetherNoah.ParadiseMod.items.tools.emerald;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class emeraldSpade extends ItemSpade {
	public emeraldSpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}