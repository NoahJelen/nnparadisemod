package com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

public class JunglePlate extends BlockPressurePlate {
	public JunglePlate() {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
		setUnlocalizedName("JunglePlate");
		setRegistryName("jungle_pressure_plate");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}