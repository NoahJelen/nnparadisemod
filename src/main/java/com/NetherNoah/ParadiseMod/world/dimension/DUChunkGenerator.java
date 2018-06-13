package com.NetherNoah.ParadiseMod.world.dimension;

import java.util.List;
import java.util.Random;

import com.NetherNoah.ParadiseMod.init.LiquidRedstone;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.world.mapgen.MapGenDUCaves;
import com.NetherNoah.ParadiseMod.world.mapgen.MapGenDURavines;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.Event;

public class DUChunkGenerator implements IChunkGenerator {
	protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
	protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
	protected static final IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
	protected static final IBlockState WATER = Blocks.WATER.getDefaultState();
	protected static final IBlockState GRASS = Blocks.GRASS.getDefaultState();
	protected static final IBlockState DIRT = Blocks.DIRT.getDefaultState();
	protected static final IBlockState COMPICE = Blocks.PACKED_ICE.getDefaultState();
	protected static final IBlockState ICE=Blocks.ICE.getDefaultState();
	protected static final IBlockState SAND = Blocks.SAND.getDefaultState();
	protected static final IBlockState SANDSTONE = Blocks.SANDSTONE.getDefaultState();
	protected static final IBlockState PRISMARINE=Blocks.PRISMARINE.getDefaultState();
	protected static final IBlockState COBBLESTONE = Blocks.COBBLESTONE.getDefaultState();
	protected static final IBlockState MYCELIUM=Blocks.MYCELIUM.getDefaultState();
	protected static final IBlockState LIQUID_REDSTONE=LiquidRedstone.BlockLiquidRedstone.instance.getDefaultState();
	protected static final IBlockState GLOWING_ICE=Misc.glowingIce.getDefaultState();
	

	private final World world;
	private final boolean generateStructures;
	private final Random rand;
	private double[] depthBuffer = new double[256];
	private double[] buffer;
	private NoiseGeneratorOctaves lperlinNoise1;
	private NoiseGeneratorOctaves lperlinNoise2;
	private NoiseGeneratorOctaves perlinNoise1;
	public NoiseGeneratorOctaves scaleNoise;
	public NoiseGeneratorOctaves depthNoise;

	//light it up!
	private final WorldGenMinable lightsGen = new WorldGenMinable(Blocks.GLOWSTONE.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.STONE));
	private final WorldGenMinable lightsGen2 = new WorldGenMinable(Blocks.GLOWSTONE.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.GRASS));
	
	//desert
	private final WorldGenMinable lightsGenDesert= new WorldGenMinable(Blocks.GLOWSTONE.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.SANDSTONE));
	private final WorldGenMinable lightsGenDesert2= new WorldGenMinable(Blocks.GLOWSTONE.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.SAND));

	//oceanic
	private final WorldGenMinable Lantern= new WorldGenMinable(Blocks.SEA_LANTERN.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.PRISMARINE));

	//volcanic
	private final WorldGenMinable Magma= new WorldGenMinable(Blocks.MAGMA.getDefaultState(), 33,BlockMatcher.forBlock(Blocks.COBBLESTONE));
	
	//icy
	private final WorldGenMinable glowingIce= new WorldGenMinable(GLOWING_ICE, 33,BlockMatcher.forBlock(Blocks.PACKED_ICE));
	
	//crystals
	private final WorldGenBush quartzGen = new WorldGenBush(Crystals.quartzCrystal);
	private final WorldGenBush diamondGen = new WorldGenBush(Crystals.diamondCrystal);
	private final WorldGenBush emeraldGen = new WorldGenBush(Crystals.emeraldCrystal);
	private final WorldGenBush redstoneGen = new WorldGenBush(Crystals.redstoneCrystal);
	private final WorldGenBush rubyGen = new WorldGenBush(Crystals.rubyCrystal);

	//stone
	private final WorldGenMinable Granite = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE),33,BlockMatcher.forBlock(Blocks.STONE));
	private final WorldGenMinable Andesite = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), 33,BlockMatcher.forBlock(Blocks.STONE));
	private final WorldGenMinable Diorite = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), 33,BlockMatcher.forBlock(Blocks.STONE));

	//ores
	private final WorldGenerator coalGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 28,BlockMatcher.forBlock(Blocks.STONE));
	private final WorldGenerator ironGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 14,BlockMatcher.forBlock(Blocks.STONE));
	private final WorldGenerator goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 7,BlockMatcher.forBlock(Blocks.STONE));
	
	//decoration
	private final WorldGenBush brownMushroomFeature = new WorldGenBush(Blocks.BROWN_MUSHROOM);
	private final WorldGenBush redMushroomFeature = new WorldGenBush(Blocks.RED_MUSHROOM);

	//natural structures
	private MapGenBase genDUCaves = new MapGenDUCaves();
	private MapGenBase genDURavines = new MapGenDURavines();
	private MapGenBase genDUMineshafts=new MapGenMineshaft();
	
	double[] pnr;
	double[] ar;
	double[] br;
	double[] noiseData4;
	double[] dr;

	public DUChunkGenerator(World worldIn, boolean p_i45637_2_, long seed) {
		world = worldIn;
		generateStructures = false;
		rand = new Random(seed);
		lperlinNoise1 = new NoiseGeneratorOctaves(rand, 16);
		lperlinNoise2 = new NoiseGeneratorOctaves(rand, 16);
		perlinNoise1 = new NoiseGeneratorOctaves(rand, 16);
		scaleNoise = new NoiseGeneratorOctaves(rand, 10);
		depthNoise = new NoiseGeneratorOctaves(rand, 16);
		worldIn.setSeaLevel(63);
		genDUCaves=TerrainGen.getModdedMapGen(genDUCaves, InitMapGenEvent.EventType.CAVE);
		genDURavines=TerrainGen.getModdedMapGen(genDURavines, InitMapGenEvent.EventType.RAVINE);
		genDUMineshafts=TerrainGen.getModdedMapGen(genDUMineshafts,InitMapGenEvent.EventType.MINESHAFT);
	}

	public void prepareHeights(int p_185936_1_, int p_185936_2_, ChunkPrimer primer) {
		int i = 4;
		int j = world.getSeaLevel() / 2 + 1;
		int k = 5;
		int l = 17;
		int i1 = 5;
		buffer = getHeights(buffer, p_185936_1_ * 4, 0, p_185936_2_ * 4, 5, 17, 5);
		for (int j1 = 0; j1 < 4; ++j1) {
			for (int k1 = 0; k1 < 4; ++k1) {
				for (int l1 = 0; l1 < 16; ++l1) {
					double d0 = 0.125D;
					double d1 = buffer[((j1 + 0) * 5 + k1 + 0) * 17 + l1 + 0];
					double d2 = buffer[((j1 + 0) * 5 + k1 + 1) * 17 + l1 + 0];
					double d3 = buffer[((j1 + 1) * 5 + k1 + 0) * 17 + l1 + 0];
					double d4 = buffer[((j1 + 1) * 5 + k1 + 1) * 17 + l1 + 0];
					double d5 = (buffer[((j1 + 0) * 5 + k1 + 0) * 17 + l1 + 1] - d1) * 0.125D;
					double d6 = (buffer[((j1 + 0) * 5 + k1 + 1) * 17 + l1 + 1] - d2) * 0.125D;
					double d7 = (buffer[((j1 + 1) * 5 + k1 + 0) * 17 + l1 + 1] - d3) * 0.125D;
					double d8 = (buffer[((j1 + 1) * 5 + k1 + 1) * 17 + l1 + 1] - d4) * 0.125D;
					for (int i2 = 0; i2 < 8; ++i2) {
						double d9 = 0.25D;
						double d10 = d1;
						double d11 = d2;
						double d12 = (d3 - d1) * 0.25D;
						double d13 = (d4 - d2) * 0.25D;
						for (int j2 = 0; j2 < 4; ++j2) {
							double d14 = 0.25D;
							double d15 = d10;
							double d16 = (d11 - d10) * 0.25D;
							for (int k2 = 0; k2 < 4; ++k2) {
								IBlockState iblockstate = null;
								if (l1 * 8 + i2 < j)
									iblockstate = WATER;
								if (d15 > 0.0D) 
									iblockstate = STONE;
								int l2 = j2 + j1 * 4;
								int i3 = i2 + l1 * 8;
								int j3 = k2 + k1 * 4;
								primer.setBlockState(l2, i3, j3, iblockstate);
								d15 += d16;
							}
							d10 += d12;
							d11 += d13;
						}
						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
	}

	public void buildSurfaces(int p_185937_1_, int p_185937_2_, ChunkPrimer primer, int blockType) {
		IBlockState[] blocks = { DIRT, COMPICE, SAND };
		if (!ForgeEventFactory.onReplaceBiomeBlocks(this, p_185937_1_, p_185937_2_, primer, world))
			return;
		int i = world.getSeaLevel() + 1;
		double d0 = 0.03125D;
		for (int j = 0; j < 16; ++j) {
			for (int k = 0; k < 16; ++k) {
				int l = (int) (depthBuffer[j + k * 16] / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
				int i1 = -1;
				IBlockState iblockstate = STONE;
				IBlockState iblockstate1 = blocks[blockType];
				for (int j1 = 127; j1 >= 0; --j1) {
					if (j1 < 127 - rand.nextInt(5) && j1 > rand.nextInt(5)) {
						IBlockState iblockstate2 = primer.getBlockState(k, j1, j);
						if (iblockstate2.getBlock() != null && iblockstate2.getMaterial() != Material.AIR) {
							if (iblockstate2.getBlock() == Blocks.STONE) {
								if (i1 == -1) {
									if (l <= 0) {
										iblockstate = AIR;
										iblockstate1 = STONE;
									} else if (j1 >= i - 4 && j1 <= i + 1) {
										iblockstate = STONE;
										iblockstate1 = STONE;
									}

									if (j1 < i && (iblockstate == null || iblockstate.getMaterial() == Material.AIR)) {
										iblockstate = WATER;
										iblockstate1 = STONE;
									}
									i1 = l;
									if (j1 >= i - 1)
										primer.setBlockState(k, j1, j, iblockstate);
									else {
										primer.setBlockState(k, j1, j, iblockstate1);
										if (primer.getBlockState(k, j1 + 1, j) == AIR && blocks[blockType] == DIRT)
											primer.setBlockState(k, j1, j, GRASS);

									}
								}
								else if (i1 > 0) {
									--i1;
									primer.setBlockState(k, j1, j, iblockstate1);
								}
							}
						}
						else
							i1 = -1;
					}
					else
						primer.setBlockState(k, j1, j, BEDROCK);
				}
			}
		}
	}

	@Override
	public Chunk generateChunk(int x, int z) {
		rand.setSeed(x * 341873128712L + z * 132897987541L);
		ChunkPrimer chunkprimer = new ChunkPrimer();
		prepareHeights(x, z, chunkprimer);
		buildSurfaces(x, z, chunkprimer, 0);
		genDURavines.generate(world, x, z, chunkprimer);
		genDUMineshafts.generate(world, x, z, chunkprimer);
		genDUCaves.generate(world, x, z, chunkprimer);
		Chunk chunk = new Chunk(world, chunkprimer, x, z);
		Biome[] abiome = world.getBiomeProvider().getBiomes((Biome[]) null, x * 16, z * 16, 16, 16);
		byte[] abyte = chunk.getBiomeArray();
		for (int i = 0; i < abyte.length; ++i)
			abyte[i] = (byte) Biome.getIdForBiome(abiome[i]);
			
		//biome dependent worldgen
		for (int cx = 0; cx < 16; ++cx) {
			for (int cz = 0; cz < 16; ++cz) {
				for (int cy = 0; cy < 129; cy++) {
					
					//biome of the block
					Biome blockBiome=chunk.getBiome(new BlockPos(cx, cy, cz),world.getBiomeProvider());
					
					//biome types
					boolean icy=blockBiome==Biomes.ICE_MOUNTAINS||blockBiome==Biomes.ICE_PLAINS||blockBiome==Biomes.MUTATED_ICE_FLATS||blockBiome==Biomes.FROZEN_RIVER||blockBiome==Biomes.COLD_TAIGA||blockBiome==Biomes.COLD_TAIGA_HILLS||blockBiome==Biomes.COLD_BEACH;
					boolean cold=blockBiome==Biomes.TAIGA||blockBiome==Biomes.TAIGA_HILLS||blockBiome==Biomes.MUTATED_REDWOOD_TAIGA||blockBiome==Biomes.MUTATED_REDWOOD_TAIGA_HILLS||blockBiome==Biomes.STONE_BEACH;
					boolean desert=blockBiome==Biomes.DESERT||blockBiome==Biomes.DESERT_HILLS||blockBiome==Biomes.MUTATED_DESERT;
					boolean volcanic=blockBiome==Biomes.EXTREME_HILLS||blockBiome==Biomes.EXTREME_HILLS_EDGE||blockBiome==Biomes.EXTREME_HILLS_WITH_TREES||blockBiome==Biomes.MUTATED_EXTREME_HILLS||blockBiome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES;
					boolean oceanic=blockBiome==Biomes.OCEAN||blockBiome==Biomes.DEEP_OCEAN;
					boolean mushroom=blockBiome==Biomes.MUSHROOM_ISLAND||blockBiome==Biomes.MUSHROOM_ISLAND_SHORE;
					
					//block to replace
					Block blockToReplace=chunk.getBlockState(cx, cy, cz).getBlock();
					
					//the block above it
					Block blockAbove=chunk.getBlockState(cx, cy+1, cz).getBlock();
					
					//for performance reasons
					if (blockToReplace==Blocks.GRAVEL)
						chunk.setBlockState(new BlockPos(cx,cy,cz), STONE);
					
					if (cy<=9&&blockToReplace==Blocks.WATER)
						chunk.setBlockState(new BlockPos(cx,cy,cz), LIQUID_REDSTONE);
					
					if (cy==10&&blockToReplace==Blocks.WATER)
						chunk.setBlockState(new BlockPos(cx,cy,cz), Misc.glowingObsidian.getDefaultState());
					
					//replace grass and dirt
					if (blockToReplace==Blocks.GRASS||blockToReplace==Blocks.DIRT) {
						if (mushroom)
							chunk.setBlockState(new BlockPos(cx,cy,cz), MYCELIUM);
						
						if (icy)
							chunk.setBlockState(new BlockPos(cx, cy, cz),COMPICE);
						
						if (cold&&blockAbove==Blocks.AIR)
							chunk.setBlockState(new BlockPos(cx, cy+1, cz),Blocks.SNOW_LAYER.getDefaultState());
						
						if (desert)
							chunk.setBlockState(new BlockPos(cx, cy, cz),SAND);
						
						if (volcanic)
							chunk.setBlockState(new BlockPos(cx,cy,cz), COBBLESTONE);
					}
					
					//in cold biomes, replace the water with ice
					if (blockToReplace==Blocks.WATER&&blockAbove==Blocks.AIR&&(icy||cold))
						chunk.setBlockState(new BlockPos(cx, cy, cz),Blocks.ICE.getDefaultState());
					
					//replace exposed stone
					if (blockToReplace==Blocks.STONE) {
						if (chunk.getBlockState(cx+1,cy, cz).getBlock()==Blocks.AIR||chunk.getBlockState(cx,cy+1, cz).getBlock()==Blocks.AIR||chunk.getBlockState(cx,cy, cz+1).getBlock()==Blocks.AIR||chunk.getBlockState(cx-1,cy, cz).getBlock()==Blocks.AIR||chunk.getBlockState(cx,cy-1, cz).getBlock()==Blocks.AIR|| chunk.getBlockState(cx,cy, cz-1).getBlock()==Blocks.AIR||chunk.getBlockState(cx+1,cy, cz).getBlock()==Blocks.WATER||chunk.getBlockState(cx,cy+1, cz).getBlock()==Blocks.WATER||chunk.getBlockState(cx,cy, cz+1).getBlock()==Blocks.WATER||chunk.getBlockState(cx-1,cy, cz).getBlock()==Blocks.WATER||chunk.getBlockState(cx,cy-1, cz).getBlock()==Blocks.WATER|| chunk.getBlockState(cx,cy, cz-1).getBlock()==Blocks.WATER) {
							
							if (icy)
								chunk.setBlockState(new BlockPos(cx, cy, cz), COMPICE);
							
							if (desert)
								chunk.setBlockState(new BlockPos(cx, cy, cz), SANDSTONE);
							
							if (volcanic) 
								chunk.setBlockState(new BlockPos(cx,cy,cz), COBBLESTONE);
							
							if (oceanic) 
								chunk.setBlockState(new BlockPos(cx,cy,cz), PRISMARINE);
						}
					}
				}
			}
		}
		return chunk;
	}

	private double[] getHeights(double[] p_185938_1_, int p_185938_2_, int p_185938_3_, int p_185938_4_,
			int p_185938_5_, int p_185938_6_, int p_185938_7_) {
		if (p_185938_1_ == null)
			p_185938_1_ = new double[p_185938_5_ * p_185938_6_ * p_185938_7_];
		ChunkGeneratorEvent.InitNoiseField event = new ChunkGeneratorEvent.InitNoiseField(this, p_185938_1_,p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_, p_185938_7_);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.getResult() == Event.Result.DENY)
			return event.getNoisefield();
		double d0 = 684.412D;
		double d1 = 2053.236D;
		noiseData4 = scaleNoise.generateNoiseOctaves(noiseData4, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, 1,p_185938_7_, 1.0D, 0.0D, 1.0D);
		dr = depthNoise.generateNoiseOctaves(dr, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, 1, p_185938_7_,100.0D, 0.0D, 100.0D);
		pnr = perlinNoise1.generateNoiseOctaves(pnr, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_,p_185938_7_, 8.555150000000001D, 34.2206D, 8.555150000000001D);
		ar = lperlinNoise1.generateNoiseOctaves(ar, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_,p_185938_7_, 684.412D, 2053.236D, 684.412D);
		br = lperlinNoise2.generateNoiseOctaves(br, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_,p_185938_7_, 684.412D, 2053.236D, 684.412D);
		int i = 0;
		double[] adouble = new double[p_185938_6_];
		for (int j = 0; j < p_185938_6_; ++j) {
			adouble[j] = Math.cos(j * Math.PI * 6.0D / p_185938_6_) * 2.0D;
			double d2 = j;
			if (j > p_185938_6_ / 2)
				d2 = p_185938_6_ - 1 - j;
			if (d2 < 4.0D) {
				d2 = 4.0D - d2;
				adouble[j] -= d2 * d2 * d2 * 10.0D;
			}
		}
		for (int l = 0; l < p_185938_5_; ++l) {
			for (int i1 = 0; i1 < p_185938_7_; ++i1) {
				double d3 = 0.0D;
				for (int k = 0; k < p_185938_6_; ++k) {
					double d4 = adouble[k];
					double d5 = ar[i] / 512.0D;
					double d6 = br[i] / 512.0D;
					double d7 = (pnr[i] / 10.0D + 1.0D) / 2.0D;
					double d8;
					if (d7 < 0.0D)
						d8 = d5;
					else if (d7 > 1.0D)
						d8 = d6;
					else
						d8 = d5 + (d6 - d5) * d7;
					d8 = d8 - d4;
					if (k > p_185938_6_ - 4) {
						double d9 = (k - (p_185938_6_ - 4)) / 3.0F;
						d8 = d8 * (1.0D - d9) + -10.0D * d9;
					}
					if (k < 0.0D) {
						double d10 = (0.0D - k) / 4.0D;
						d10 = MathHelper.clamp(d10, 0.0D, 1.0D);
						d8 = d8 * (1.0D - d10) + -10.0D * d10;
					}
					p_185938_1_[i] = d8;
					++i;
				}
			}
		}
		return p_185938_1_;
	}

	@Override
	public void populate(int x, int z) {
		ForgeEventFactory.onChunkPopulate(true, this, world, rand, x, z, false);
		int i = x * 16;
		int j = z * 16;
		BlockPos blockpos = new BlockPos(i, 0, j);
		Chunk chunkToDecorate = world.getChunkFromBlockCoords(blockpos);
		Biome biome = world.getBiome(blockpos.add(16, 0, 16));
		ChunkPos chunkpos = new ChunkPos(x, z);
		ForgeEventFactory.onChunkPopulate(false, this, world, rand, x, z, false);
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(world, rand, blockpos));

		//stone
		if (TerrainGen.generateOre(world, rand, Andesite, blockpos, OreGenEvent.GenerateMinable.EventType.ANDESITE)) {
			Andesite.generate(world, rand, blockpos.add(rand.nextInt(16) + 8, rand.nextInt(128), rand.nextInt(16) + 8));
			Diorite.generate(world, rand, blockpos.add(rand.nextInt(16) + 8, rand.nextInt(128), rand.nextInt(16) + 8));
			Granite.generate(world, rand, blockpos.add(rand.nextInt(16) + 8, rand.nextInt(128), rand.nextInt(16) + 8));
		}
		
		if (TerrainGen.decorate(world, rand, blockpos, DecorateBiomeEvent.Decorate.EventType.SHROOM)) {
			//crystals
			if (rand.nextBoolean()) {
				quartzGen.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
				diamondGen.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
				emeraldGen.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
				redstoneGen.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
				rubyGen.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
			}
			
			//mushrooms
			if (rand.nextBoolean()) {
				brownMushroomFeature.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
				redMushroomFeature.generate(world, rand,blockpos.add(rand.nextInt(16) + 8, rand.nextInt(256), rand.nextInt(16) + 8));
			}
		}
		
		//ores
		if (TerrainGen.generateOre(world, rand, coalGen, blockpos, OreGenEvent.GenerateMinable.EventType.QUARTZ)) {
			for (int l1 = 0; l1 < 32; ++l1) {
				coalGen.generate(world, rand, blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				ironGen.generate(world, rand, blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				goldGen.generate(world, rand, blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
			}
		}
		
		//lights
		if (TerrainGen.generateOre(world, rand, lightsGen, blockpos, OreGenEvent.GenerateMinable.EventType.QUARTZ))
			for (int l1=0;l1<32;l1++) {
				//general
				lightsGen.generate(world, rand,blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				lightsGen2.generate(world, rand,blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				
				//desert
				lightsGenDesert.generate(world, rand,blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				lightsGenDesert2.generate(world, rand,blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				
				//volcanic
				Magma.generate(world, rand,blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				
				//oceanic
				Lantern.generate(world, rand, blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
				
				//icy
				glowingIce.generate(world, rand, blockpos.add(rand.nextInt(16), rand.nextInt(216) + 20, rand.nextInt(16)));
			}
		biome.decorate(world, rand, new BlockPos(i, 0, j));
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(world, rand, blockpos));
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		return false;
	}

	@Override
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		Biome biome = world.getBiome(pos);
		return biome.getSpawnableList(creatureType);
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean p_180513_4_) {
		return null;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
	}

	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		return false;
	}
}