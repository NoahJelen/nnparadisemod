package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.DiamondPlateCode;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class RustyPlate extends BlockPressurePlate {
	public RustyPlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("RustyPlate");
		setRegistryName("rusty_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.METAL);
	}
}