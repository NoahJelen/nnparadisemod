package com.NetherNoah.ParadiseMod.items.tools.cactus;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class cactusSpade extends ItemSpade {
	public cactusSpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}