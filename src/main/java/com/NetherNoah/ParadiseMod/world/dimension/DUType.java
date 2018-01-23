package com.NetherNoah.ParadiseMod.world.dimension;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DUType extends WorldProvider{
	@Override
	public void init() {
		biomeProvider = new BiomeProviderSingle(Biomes.FOREST);
		doesWaterVaporize = false;
		hasNoSky = true;
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.DU;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float par1, float par2) {
		return new Vec3d(0.6D, 0.0D, 0.79D);
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return (IChunkGenerator) new DUChunkProvider(world, doesWaterVaporize, DimensionRegistry.DeepUnderground);
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
}