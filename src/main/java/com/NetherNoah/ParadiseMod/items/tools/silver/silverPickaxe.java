package com.NetherNoah.ParadiseMod.items.tools.silver;

import com.NetherNoah.ParadiseMod.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class silverPickaxe extends ItemPickaxe {
	public silverPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}