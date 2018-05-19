package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class DirtPlate extends BlockPressurePlate {
	public DirtPlate() {
		super(Material.GROUND, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("DirtPlate");
		setRegistryName("dirt_pressure_plate");
		setSoundType(blockSoundType.GROUND);
	}
}