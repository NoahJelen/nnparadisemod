package com.NetherNoah.ParadiseMod.blocks.buttons;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.block.BlockButtonStone;

public class BedrockButton  extends BlockButtonStone  {
	public BedrockButton() {
		setUnlocalizedName("BedrockButton");
		setRegistryName("bedrock_button");
		setHardness(-1F);
		setResistance(18000000F);
		setBlockUnbreakable();
	}
}