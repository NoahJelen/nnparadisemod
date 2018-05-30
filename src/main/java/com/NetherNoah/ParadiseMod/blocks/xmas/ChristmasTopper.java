package com.NetherNoah.ParadiseMod.blocks.xmas;

import java.util.Random;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChristmasTopper extends BlockGlass {
	public ChristmasTopper() {
		super(Material.PLANTS, false);
		setUnlocalizedName("ChristmasTopper");
		setRegistryName("tree_topper");
		setLightLevel(1F);
		setSoundType(SoundType.METAL);
		if (!ModConfig.HideXmasFeatures)
			setCreativeTab(ParadiseMod.xmas);
	}
	@Override
	protected boolean canSilkHarvest() {
		return false;
	}
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}
}