package com.NetherNoah.ParadiseMod.blocks.pressurePlates;

import com.NetherNoah.ParadiseMod.CustomBlockCode.RubyPlateCode;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyPlate extends RubyPlateCode {
	public RubyPlate() {
		super(Material.WOOD, RubyPlateCode.Sensitivity.EVERYTHING);
		setUnlocalizedName("RubyPlate");
		setRegistryName("ruby_pressure_plate");
		setHardness(0.5F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}