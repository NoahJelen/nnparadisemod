package com.NetherNoah.ParadiseMod.items.tools.rusty;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class rustySpade extends ItemSpade {
	public rustySpade(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
	//targeted entity gets afflicted with lots of bad effects!
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(2, attacker);
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(20),1600,255));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(2),1600,4));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(4),1600));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(9),1600));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(15),1600));
        return true;
    }
}