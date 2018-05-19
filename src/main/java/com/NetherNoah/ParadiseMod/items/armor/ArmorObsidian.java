package com.NetherNoah.ParadiseMod.items.armor;

import java.util.Iterator;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArmorObsidian extends ItemArmor {
	public ArmorObsidian(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(CreativeTabs.COMBAT);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		int ArmorObsidianPieces=0;
		if(player.getArmorInventoryList() != null) {
			Iterator<ItemStack> iterator = player.getArmorInventoryList().iterator();
			while(iterator.hasNext()) {
				ItemStack stack = iterator.next();
				if(stack != null) {
					if(stack.getItem() instanceof ArmorObsidian) {
						ArmorObsidian item = (ArmorObsidian) stack.getItem();
						if(item.getArmorMaterial() == ModItems.obsidianMaterial) {
							ArmorObsidianPieces++;
							continue;
						}
					}
				}
			}
		}
		if(ArmorObsidianPieces == 4) {
		    player.addPotionEffect(new PotionEffect(Potion.getPotionById(12)));
		}
	}
}