package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class AcaciaButton  extends BlockButtonWood  {
	public AcaciaButton() {
		setUnlocalizedName("AcaciaButton");
		setRegistryName("acacia_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}
}