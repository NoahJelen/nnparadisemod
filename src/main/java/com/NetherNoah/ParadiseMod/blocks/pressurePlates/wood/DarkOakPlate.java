package com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class DarkOakPlate extends BlockPressurePlate {
	public DarkOakPlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("DarkOakPlate");
		setRegistryName("dark_oak_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}