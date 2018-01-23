package com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class GranitePlate extends BlockPressurePlate {
	public GranitePlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("GranitePlate");
		setRegistryName("granite_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}