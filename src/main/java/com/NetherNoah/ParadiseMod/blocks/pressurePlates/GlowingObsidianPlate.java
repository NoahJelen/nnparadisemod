package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.BedrockPlateCode;

import net.minecraft.block.material.Material;

public class GlowingObsidianPlate extends BedrockPlateCode {
	public GlowingObsidianPlate() {
		super(Material.ROCK, BedrockPlateCode.Sensitivity.PLAYER);
		setUnlocalizedName("GlowingObsidianPlate");
		setRegistryName("glowing_obsidian_pressure_plate");
		setHardness(51F);
		setResistance(2000F);
		setLightLevel(.46666667F);
		setLightLevel(.46666667F);
	}
}