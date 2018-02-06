package com.NetherNoah.ParadiseMod.GUI;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class CustomCraftBenchGui extends GuiCrafting {
	public CustomCraftBenchGui(InventoryPlayer playerInv, World worldIn) {
		super(playerInv, worldIn);
	}

}