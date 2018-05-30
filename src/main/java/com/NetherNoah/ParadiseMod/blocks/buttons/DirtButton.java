package com.NetherNoah.ParadiseMod.blocks.buttons;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.SoundType;

public class DirtButton  extends BlockButtonStone  {
	public DirtButton() {
		setUnlocalizedName("DirtButton");
		setRegistryName("dirt_button");
		setSoundType(SoundType.GROUND);
	}
}