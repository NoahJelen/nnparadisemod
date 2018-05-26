
package com.NetherNoah.ParadiseMod.handlers;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class Events {
	@SubscribeEvent
    public static void deleteRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	ResourceLocation woodenPressurePlate = new ResourceLocation("minecraft:wooden_pressure_plate");
    	ResourceLocation oakTable = new ResourceLocation("minecraft:crafting_table");
    	ResourceLocation woodenButton = new ResourceLocation("minecraft:wooden_button");
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        modRegistry.remove(woodenPressurePlate);
        modRegistry.remove(woodenButton);
        modRegistry.remove(oakTable);
    }
	
	
	//I hope this fixes the dimension teleport bug
	@SubscribeEvent
	public static void onJoinWorld(EntityJoinWorldEvent event) throws InterruptedException {
		 
	}
	
}