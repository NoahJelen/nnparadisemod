// based off of the source code from the Portable Craft Bench mod by RenEvo
// https://github.com/renevo/pcb
package com.NetherNoah.ParadiseMod.GUI;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
//based off of the source code from the Portable Craft Bench mod by RenEvo
//https://github.com/renevo/pcb
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class CustomCraftBenchGui extends GuiContainer {

	private static final ResourceLocation backgroundResourceLocation = new ResourceLocation(
			"textures/gui/container/crafting_table.png");

	public CustomCraftBenchGui(InventoryPlayer playerInventory, World world, BlockPos pos) {
		super(new ContainerCustomCraftBench(playerInventory, world, pos));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		fontRendererObj.drawString(I18n.translateToLocal("container.crafting"), 28, 6, 4210752);
		fontRendererObj.drawString(I18n.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float arg0, int arg1, int arg2) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(backgroundResourceLocation);

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
	}

}