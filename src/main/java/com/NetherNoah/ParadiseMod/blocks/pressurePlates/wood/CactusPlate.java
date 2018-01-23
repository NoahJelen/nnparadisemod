package com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class CactusPlate extends BlockPressurePlate {
	public CactusPlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("CactusPlate");
		setRegistryName("cactus_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}