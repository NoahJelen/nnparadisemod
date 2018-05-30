package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.RubyPlateCode;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverPlate extends RubyPlateCode {
	public SilverPlate() {
		super(Material.WOOD, RubyPlateCode.Sensitivity.EVERYTHING);
		setUnlocalizedName("SilverPlate");
		setRegistryName("silver_pressure_plate");
		setHardness(0.5F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}