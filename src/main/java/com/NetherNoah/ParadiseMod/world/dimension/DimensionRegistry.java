package com.NetherNoah.ParadiseMod.world.dimension;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	public static void MainRegistry() {
		registerDimensions();
	}
	public static final int DeepUnderground = -2;
	public static final int DeepVoid=-3;
	public static final DimensionType DV = DimensionType.register("deep_void", "_dv", DeepVoid, DVType.class, false);
	public static final DimensionType DU = DimensionType.register("deep_underground", "_du", DeepUnderground, DUType.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(DeepUnderground, DU);
		DimensionManager.registerDimension(DeepVoid, DV);
	}
}