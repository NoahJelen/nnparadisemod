package com.NetherNoah.ParadiseMod.blocks.xmas;

import com.NetherNoah.ParadiseMod.ParadiseMod;

import net.minecraft.block.BlockPumpkin;

public class SantaHat extends BlockPumpkin {
	public SantaHat() {
		setUnlocalizedName("SantaHat");
		setRegistryName("santa_hat");
		setHardness(.01F);
		setResistance(.01F);
		setCreativeTab(ParadiseMod.xmas);
		setSoundType(blockSoundType.CLOTH);
	}
}