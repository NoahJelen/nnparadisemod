package com.NetherNoah.ParadiseMod.items.tools.redstone;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class redstoneSpade extends ItemSpade {
	public redstoneSpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}