package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.EmeraldPlateCode;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EmeraldPlate extends EmeraldPlateCode {
	public EmeraldPlate() {
		super(Material.WOOD, EmeraldPlateCode.Sensitivity.EVERYTHING);
		setUnlocalizedName("EmeraldPlate");
		setRegistryName("emerald_pressure_plate");
		setHardness(0.5F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}