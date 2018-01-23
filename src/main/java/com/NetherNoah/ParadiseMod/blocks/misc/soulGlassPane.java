package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class soulGlassPane extends BlockPane {
	public soulGlassPane() {
		super(Material.GLASS, false);
		setUnlocalizedName("soulGlassPane");
		setRegistryName("soul_glass_pane");
		setHardness(.5F);
		setResistance(1F);
		setLightLevel(1F);
		setSoundType(blockSoundType.GLASS);
		setDefaultSlipperiness(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
}