package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class MossyPlate extends BlockPressurePlate {
	public MossyPlate() {
		super(Material.ROCK, BlockPressurePlate.Sensitivity.MOBS);
		setUnlocalizedName("MossyPlate");
		setRegistryName("mossy_cobblestone_pressure_plate");
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 0);
	}
}