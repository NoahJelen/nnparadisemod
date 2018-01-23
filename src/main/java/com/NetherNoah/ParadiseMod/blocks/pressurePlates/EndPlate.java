package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class EndPlate extends BlockPressurePlate {
	public EndPlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("EndPlate");
		setRegistryName("end_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}