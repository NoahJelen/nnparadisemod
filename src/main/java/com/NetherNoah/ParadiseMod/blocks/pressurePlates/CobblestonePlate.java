package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class CobblestonePlate extends BlockPressurePlate {
	public CobblestonePlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("CobblestonePlate");
		setRegistryName("cobblestone_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}