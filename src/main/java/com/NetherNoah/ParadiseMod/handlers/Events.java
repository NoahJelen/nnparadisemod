
package com.NetherNoah.ParadiseMod.handlers;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class Events {
	@SubscribeEvent
    public static void deleteRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	ResourceLocation woodenPressurePlate = new ResourceLocation("minecraft:wooden_pressure_plate");
    	ResourceLocation oakTable = new ResourceLocation("minecraft:crafting_table");
    	ResourceLocation woodenButton = new ResourceLocation("minecraft:wooden_button");
    	ResourceLocation furnace= new ResourceLocation("minecraft:furnace");
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        modRegistry.remove(woodenPressurePlate);
        modRegistry.remove(woodenButton);
        modRegistry.remove(oakTable);
        modRegistry.remove(furnace);
    }
	
	//unlocks all recipes if Quark is not present
	@SubscribeEvent 
	public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
		if(event.player instanceof EntityPlayerMP) {
			ArrayList<IRecipe> recipes = Lists.newArrayList(CraftingManager.REGISTRY);
			((EntityPlayerMP) event.player).unlockRecipes(recipes);
		}
	}
	
}