package com.NetherNoah.ParadiseMod.world.dimension;
import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	public static void MainRegistry() {
		registerDimensions();
	}
	public static final int DeepUnderground = ModConfig.dimensions.DeepUndergroundDim;
	public static final int DeepVoid=ModConfig.dimensions.DeepVoidDim;
	public static final DimensionType DV = DimensionType.register("deep_void", "_dv", DeepVoid, DVWorldProvider.class, false);
	public static final DimensionType DU = DimensionType.register("deep_underground", "_du", DeepUnderground, DUWorldProvider.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(DeepUnderground, DU);
		DimensionManager.registerDimension(DeepVoid, DV);
	}
}