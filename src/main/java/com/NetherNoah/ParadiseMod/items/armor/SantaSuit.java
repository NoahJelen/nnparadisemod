package com.NetherNoah.ParadiseMod.items.armor;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class SantaSuit extends ItemArmor {
	public SantaSuit(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(ParadiseMod.xmas);
	}
}

