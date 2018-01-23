package com.NetherNoah.ParadiseMod.world.dimension;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	public static void MainRegistry() {
		registerDimension();
	}
	public static final int DeepUnderground = -2;
	public static final DimensionType DU = DimensionType.register("Deep Underground", "_du", DeepUnderground, DUType.class, false);
	public static void registerDimension() {
		DimensionManager.registerDimension(DeepUnderground, DU);
	}
}