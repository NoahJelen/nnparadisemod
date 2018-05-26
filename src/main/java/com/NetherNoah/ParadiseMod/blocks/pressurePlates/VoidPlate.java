package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class VoidPlate extends BlockPressurePlate {
	public VoidPlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.MOBS);
		setUnlocalizedName("VoidPlate");
		setRegistryName("void_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}