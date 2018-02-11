package com.NetherNoah.ParadiseMod.items.armor;

import java.util.Iterator;
import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArmorEmerald extends ItemArmor {
	public ArmorEmerald(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(CreativeTabs.COMBAT);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		int ArmorEmeraldPieces=0;
		if(player.getArmorInventoryList() != null) {
			Iterator<ItemStack> iterator = player.getArmorInventoryList().iterator();
			while(iterator.hasNext()) {
				ItemStack stack = iterator.next();
				if(stack != null) {
					if(stack.getItem() instanceof ArmorEmerald) {
						ArmorEmerald item = (ArmorEmerald) stack.getItem();
						if(item.getArmorMaterial() == ModItems.emeraldMaterial) {
							ArmorEmeraldPieces++;
							continue;
						}
					}
				}
			}
		}
		if(ArmorEmeraldPieces == 4) {
			//give the player 10 xp at random times as long as 4 pieces are being worn
			//5% chance each tick
			Random rand = new Random();
			int giveXp = rand.nextInt(100) + 1;
			if (giveXp==2)
			{
				player.addExperience(25);
			}
		}
	}
}

