package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GrassPlate extends BlockPressurePlate {
	public GrassPlate() {
		super(Material.GRASS, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("GrassPlate");
		setRegistryName("grass_pressure_plate");
		setSoundType(SoundType.PLANT);
	}
}