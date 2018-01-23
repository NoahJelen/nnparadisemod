package com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class AndesitePlate extends BlockPressurePlate {
	public AndesitePlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("AndesitePlate");
		setRegistryName("andesite_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}