package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class CactusButton  extends BlockButtonWood  {
	public CactusButton() {
		setUnlocalizedName("CactusButton");
		setRegistryName("cactus_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}
}