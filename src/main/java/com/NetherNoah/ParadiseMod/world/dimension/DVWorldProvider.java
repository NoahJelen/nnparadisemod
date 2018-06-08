package com.NetherNoah.ParadiseMod.world.dimension;
import javax.annotation.Nullable;

import net.minecraft.init.Biomes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DVWorldProvider extends WorldProvider{
	@Override
	public void init() {
		biomeProvider=new BiomeProviderSingle(Biomes.VOID);
		doesWaterVaporize=false;
		hasSkyLight=false;
		nether=true;
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.DV;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float par1, float par2) {
		return new Vec3d(0.0D, 0.0D, 0.0D);
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new DVChunkGenerator(world, doesWaterVaporize, DimensionRegistry.DeepVoid);
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
	
	@Override
	public boolean canCoordinateBeSpawn(int par1, int par2) {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean doesXZShowFog(int par1, int par2) {
		return true;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean isSkyColored()
    {
        return true;
    }
	@Override
    public float getSunBrightnessFactor(float par1)
    {
        return 0.0f;
    }

	@Override
    @Nullable
    @SideOnly(Side.CLIENT)
    public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks)
    {
    	return null;
    }
}