package com.NetherNoah.ParadiseMod.proxy;

import com.NetherNoah.ParadiseMod.init.ModBlocks;
import com.NetherNoah.ParadiseMod.init.ModItems;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCompressedCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.render.TileEntityCactusChestRender;
import com.NetherNoah.ParadiseMod.tileentity.render.TileEntityCompressedCactusChestRender;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements CommonProxy{
	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCactusChest.class, new TileEntityCactusChestRender());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCompressedCactusChest.class, new TileEntityCompressedCactusChestRender());
		System.out.println("NetherNoah777: Finally!!! I managed to register that freaking tile entity renderer!!!!");
	}
}