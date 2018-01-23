package com.NetherNoah.ParadiseMod.blocks.xmas;

import com.NetherNoah.ParadiseMod.ParadiseMod;

import net.minecraft.block.BlockOldLeaf;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChristmasLeaves extends BlockOldLeaf {
	public ChristmasLeaves() {
		// these leaf blocks emit light
		setLightLevel(1F);
		setUnlocalizedName("ChristmasLeaves");
		setRegistryName("christmas_leaves");
		setCreativeTab(ParadiseMod.xmas);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
}