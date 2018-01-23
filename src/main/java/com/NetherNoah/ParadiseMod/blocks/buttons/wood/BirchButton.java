package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.block.BlockButtonWood;

public class BirchButton  extends BlockButtonWood {
	public BirchButton() {
		setUnlocalizedName("BirchButton");
		setRegistryName("birch_button");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}