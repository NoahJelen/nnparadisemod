package com.NetherNoah.ParadiseMod.proxy;

import javax.annotation.Nullable;

import com.NetherNoah.ParadiseMod.init.ModItems;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Buttons;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Chests;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Fences;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Gates;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Plates;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Stairs;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Tables;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Trapdoors;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Walls;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCompressedCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.render.TileEntityCactusChestRender;
import com.NetherNoah.ParadiseMod.tileentity.render.TileEntityCompressedCactusChestRender;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements CommonProxy{
	@Override
	public void init() {
		//block groups
		ModItems.registerRenders();
		Lamps.regRenders();
		Ores.regRenders();
		Misc.regRenders();
		Crystals.regRenders();
		Walls.regRenders();
		Stairs.regRenders();
		Buttons.regRenders();
		Plates.regRenders();
		Tables.regRenders();
		Chests.regRenders();
		Trapdoors.regRenders();
		Fences.regRenders();
		Gates.regRenders();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCactusChest.class, new TileEntityCactusChestRender());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCompressedCactusChest.class, new TileEntityCompressedCactusChestRender());
		System.out.println("NetherNoah777: Finally!!! I managed to register that freaking tile entity renderer!!!!");
		
		Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new IBlockColor()
        {
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
            {
                return worldIn != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(worldIn, pos) : ColorizerGrass.getGrassColor(0.5D, 1.0D);
            }
        }, Plates.GrassPlate);		
		Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new IBlockColor()
        {
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
            {
                return worldIn != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(worldIn, pos) : ColorizerGrass.getGrassColor(0.5D, 1.0D);
            }
        }, Buttons.GrassButton);
	}
}