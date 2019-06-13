package com.NetherNoah.ParadiseMod.blocks.base;

import java.util.Random;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomPane extends BlockPane {
	private final boolean metal;
	private final Material blockMaterial;
	public CustomPane(Material material, boolean isMetal,SoundType sound) {
		super(material, isMetal);
		blockMaterial=material;
		metal=isMetal;
		setSoundType(sound);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		if (blockMaterial!=Material.GLASS)
			return BlockRenderLayer.SOLID;
		else
			return BlockRenderLayer.TRANSLUCENT;
	}
}