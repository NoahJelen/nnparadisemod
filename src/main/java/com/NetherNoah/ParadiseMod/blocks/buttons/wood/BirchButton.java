package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class BirchButton  extends BlockButtonWood {
	public BirchButton() {
		setUnlocalizedName("BirchButton");
		setRegistryName("birch_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}
}