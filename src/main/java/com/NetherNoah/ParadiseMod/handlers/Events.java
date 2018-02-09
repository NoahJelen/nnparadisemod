
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
    	ResourceLocation woodenButton = new ResourceLocation("minecraft:wooden_button");
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        modRegistry.remove(woodenPressurePlate);
        modRegistry.remove(woodenButton);
    }
	
}