package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class DarkOakButton extends BlockButtonWood {
	public DarkOakButton() {
		setUnlocalizedName("DarkOakButton");
		setRegistryName("dark_oak_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}
}