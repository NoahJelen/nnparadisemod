package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.DiamondPlateCode;

import net.minecraft.block.material.Material;

public class DiamondPlate extends DiamondPlateCode {
	public DiamondPlate() {
		super(Material.WOOD, DiamondPlateCode.Sensitivity.EVERYTHING);
		setUnlocalizedName("DiamondPlate");
		setRegistryName("diamond_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.METAL);
	}
}