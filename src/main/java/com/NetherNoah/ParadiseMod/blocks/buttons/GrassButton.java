package com.NetherNoah.ParadiseMod.blocks.buttons;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.SoundType;

public class GrassButton  extends BlockButtonStone  {
	public GrassButton() {
		setUnlocalizedName("GrassButton");
		setRegistryName("grass_button");
		setSoundType(SoundType.PLANT);
	}
}