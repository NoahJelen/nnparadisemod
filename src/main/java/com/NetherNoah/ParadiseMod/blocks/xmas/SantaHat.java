package com.NetherNoah.ParadiseMod.blocks.xmas;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.SoundType;

public class SantaHat extends BlockPumpkin {
	public SantaHat() {
		setUnlocalizedName("SantaHat");
		setRegistryName("santa_hat");
		setHardness(.01F);
		setResistance(.01F);
		if (!ModConfig.HideXmasFeatures)
			setCreativeTab(ParadiseMod.xmas);
		setSoundType(SoundType.CLOTH);
	}
}