package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class SpruceButton extends BlockButtonWood {
	public SpruceButton() {
		setUnlocalizedName("SpruceButton");
		setRegistryName("spruce_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}		
}