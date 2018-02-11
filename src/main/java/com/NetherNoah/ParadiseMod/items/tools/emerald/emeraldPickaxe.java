package com.NetherNoah.ParadiseMod.items.tools.emerald;

import com.NetherNoah.ParadiseMod.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class emeraldPickaxe extends ItemPickaxe {
	public emeraldPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}