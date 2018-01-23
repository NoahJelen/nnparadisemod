package com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class DioritePlate extends BlockPressurePlate {
	public DioritePlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("DioritePlate");
		setRegistryName("diorite_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}