package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.BedrockPlateCode;

import net.minecraft.block.material.Material;

public class BedrockPlate extends BedrockPlateCode {
	public BedrockPlate() {
		super(Material.ROCK, BedrockPlateCode.Sensitivity.PLAYER);
		setUnlocalizedName("BedrockPlate");
		setRegistryName("bedrock_pressure_plate");
		setHardness(-1F);
		setResistance(6000000F);
		setBlockUnbreakable();
	}
}