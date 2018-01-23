package com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class AcaciaPlate extends BlockPressurePlate {
	public AcaciaPlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("AcaciaPlate");
		setRegistryName("acacia_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}