package com.NetherNoah.ParadiseMod.items.tools.ruby;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class rubySpade extends ItemSpade {
	public rubySpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}