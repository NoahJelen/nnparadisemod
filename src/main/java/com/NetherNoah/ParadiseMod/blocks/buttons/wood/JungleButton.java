package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.SoundType;

public class JungleButton extends BlockButtonWood {
	public JungleButton() {
		setUnlocalizedName("JungleButton");
		setRegistryName("jungle_button");
		setHardness(0.5F);
		setSoundType(SoundType.WOOD);
	}
}