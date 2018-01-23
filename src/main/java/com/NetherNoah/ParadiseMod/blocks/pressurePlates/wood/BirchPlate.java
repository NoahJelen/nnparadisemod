package com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class BirchPlate extends BlockPressurePlate {
	public BirchPlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("BirchPlate");
		setRegistryName("birch_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}