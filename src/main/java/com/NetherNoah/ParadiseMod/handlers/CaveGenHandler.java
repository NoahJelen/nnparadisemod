package com.NetherNoah.ParadiseMod.handlers;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockStainedHardenedClay;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CaveGenHandler{
	protected static final IBlockState TERRACOTTA = Blocks.HARDENED_CLAY.getDefaultState();
	protected static final IBlockState ORANGE_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.ORANGE);
	protected static final IBlockState WHITE_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.WHITE);
	protected static final IBlockState BROWN_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.BROWN);
	protected static final IBlockState YELLOW_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.YELLOW);
	protected static final IBlockState RED_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.RED);
	protected static final IBlockState COMPICE = Blocks.PACKED_ICE.getDefaultState();
	protected static final IBlockState SANDSTONE = Blocks.SANDSTONE.getDefaultState();

	protected static final IBlockState WATER = Blocks.WATER.getDefaultState();
	protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
	protected static Block[] crystals = { Crystals.diamondCrystal, Crystals.emeraldCrystal, Crystals.quartzCrystal,Crystals.redstoneCrystal, Crystals.rubyCrystal };

	@SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
	public static void onEvent(ChunkEvent.Load event) {
		Chunk theChunk = event.getChunk();
		World world = theChunk.getWorld();
		Random rand = world.rand;

		// ignore chunks that have already been generated or if the config says not to
		// generate cave features
		if (theChunk.isPopulated() || theChunk.isTerrainPopulated() || ModConfig.worldgen.caves.betterCaves == false)
			return;

		// the height is 256 if the features are being generated in a cave dimension,
		// else, it's 56
		int height = 255;
		boolean webs = false;
		if (world.provider.getDimension() == 0) {
			height = 56;
			webs = true;
		} 
			

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < height; y++) {

					// biome of current block
					Biome blockBiome = theChunk.getBiome(new BlockPos(x, y, z), world.getBiomeProvider());

					// the block to be replaced
					Block blockToReplace = theChunk.getBlockState(x, y, z).getBlock();

					// the block above it
					Block blockAbove = theChunk.getBlockState(x, y + 1, z).getBlock();

					// the block below it
					Block blockBelow = theChunk.getBlockState(x, y - 1, z).getBlock();

					// biome types
					boolean swamp = (blockBiome == Biomes.SWAMPLAND|| blockBiome == Biomes.MUTATED_SWAMPLAND) && ModConfig.worldgen.caves.types.Wet == true;
					boolean icy = (blockBiome == Biomes.ICE_MOUNTAINS || blockBiome == Biomes.ICE_PLAINS|| blockBiome == Biomes.MUTATED_ICE_FLATS || blockBiome == Biomes.FROZEN_RIVER|| blockBiome == Biomes.COLD_TAIGA || blockBiome == Biomes.COLD_TAIGA_HILLS|| blockBiome == Biomes.COLD_BEACH) && ModConfig.worldgen.caves.types.Icy == true;
					boolean desert = (blockBiome == Biomes.DESERT || blockBiome == Biomes.DESERT_HILLS|| blockBiome == Biomes.MUTATED_DESERT) && ModConfig.worldgen.caves.types.Dry == true;
					boolean oceanic = (blockBiome == Biomes.OCEAN|| blockBiome == Biomes.DEEP_OCEAN) && ModConfig.worldgen.caves.types.Ocean == true;
					boolean mushroom =(blockBiome == Biomes.MUSHROOM_ISLAND|| blockBiome == Biomes.MUSHROOM_ISLAND_SHORE)&& ModConfig.worldgen.caves.types.Mushroom == true;
					boolean mesa = (blockBiome == Biomes.MESA || blockBiome == Biomes.MESA_CLEAR_ROCK|| blockBiome == Biomes.MESA_ROCK || blockBiome == Biomes.MUTATED_MESA|| blockBiome == Biomes.MUTATED_MESA_CLEAR_ROCK|| blockBiome == Biomes.MUTATED_MESA_ROCK )&& ModConfig.worldgen.caves.types.Mesa == true;
					boolean jungle = (blockBiome == Biomes.JUNGLE || blockBiome == Biomes.JUNGLE_EDGE|| blockBiome == Biomes.JUNGLE_HILLS || blockBiome == Biomes.MUTATED_JUNGLE|| blockBiome == Biomes.MUTATED_JUNGLE_EDGE )&& ModConfig.worldgen.caves.types.Wet == true;

					//scattered crystals
					if(blockToReplace==Blocks.STONE&&rand.nextInt(ModConfig.worldgen.caves.CrystalChance)==0&&blockAbove==Blocks.AIR&&(y<(height-1)))
						theChunk.setBlockState(new BlockPos(x, y+1, z), crystals[rand.nextInt(5)].getDefaultState());

					// replace exposed stone
					// base cave generation
					if (blockToReplace == Blocks.STONE) {
						if (theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.AIR	|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.AIR|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR
								|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.WATER|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.WATER|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.WATER|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.WATER|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.WATER|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.WATER
								|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA) {

							// random cobblestone
							if (rand.nextInt(10) == 0)
								theChunk.setBlockState(new BlockPos(x, y, z), Blocks.COBBLESTONE.getDefaultState());

							// ice cave generation
							if (icy) {

								// packed ice
								if (rand.nextInt(2) == 0)
									theChunk.setBlockState(new BlockPos(x, y, z), COMPICE);

								// snow
								if (blockAbove == Blocks.AIR && rand.nextInt(5) == 0)
									theChunk.setBlockState(new BlockPos(x, y + 1, z),Blocks.SNOW_LAYER.getDefaultState());

							}

							// desert cave generation
							if (desert) {

								// lava
								if (rand.nextInt(20) == 0 && blockAbove == Blocks.AIR)
									theChunk.setBlockState(new BlockPos(x, y, z), Blocks.LAVA.getDefaultState());

								// sandstone
								if (rand.nextInt(2) == 0)
									theChunk.setBlockState(new BlockPos(x, y, z), SANDSTONE);
							}

							// mesa cave generation
							if (mesa) {

								// hardened clay (terracotta)
								theChunk.setBlockState(new BlockPos(x, y, z), TERRACOTTA);
								if (y == 74 || y == 45)
									theChunk.setBlockState(new BlockPos(x, y, z), ORANGE_TERRACOTTA);
								if (y == 79 || y == 50)
								theChunk.setBlockState(new BlockPos(x, y, z), WHITE_TERRACOTTA);
								if (y == 83 || y == 55)
									theChunk.setBlockState(new BlockPos(x, y, z), BROWN_TERRACOTTA);
								if (y == 85 || y == 64)
									theChunk.setBlockState(new BlockPos(x, y, z), YELLOW_TERRACOTTA);
								if (y == 40 || y == 56)
									theChunk.setBlockState(new BlockPos(x, y, z), RED_TERRACOTTA);
							}
						}

						// mossy cobblestone in wet biomes (jungles and swamps)
						if ((jungle || swamp) && rand.nextInt(10) == 0)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.MOSSY_COBBLESTONE.getDefaultState());
					}

					// generate magma around lava pools
					if (blockToReplace == Blocks.STONE || blockToReplace == Blocks.SANDSTONE|| blockToReplace == Blocks.PACKED_ICE || blockToReplace == Blocks.HARDENED_CLAY|| blockToReplace == Blocks.STAINED_HARDENED_CLAY) {
						if (theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.MAGMA.getDefaultState());
					}

					// randomly generate spider webs
					if (blockToReplace == Blocks.AIR && y < height && rand.nextInt(1000) == 0 && webs)
						theChunk.setBlockState(new BlockPos(x, y, z), Blocks.WEB.getDefaultState());

					// water filled caves in oceans in the overworld
					if (blockToReplace == Blocks.AIR && y < 63 && oceanic && world.provider.getDimension() == 0) {
						theChunk.setBlockState(new BlockPos(x, y, z), WATER);
						if (blockBelow == Blocks.LAVA)
							theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
					}

					// jungle and swamp features
					if (jungle || swamp) {

						// shallow water pools
						if (blockToReplace == Blocks.AIR && y < 20) {
							theChunk.setBlockState(new BlockPos(x, y, z), WATER);
							if (blockBelow == Blocks.LAVA)
								theChunk.setBlockState(new BlockPos(x, y - 1, z), Blocks.OBSIDIAN.getDefaultState());
						}

						// replace ground stone with grass
						if (blockToReplace == Blocks.STONE && blockAbove == Blocks.AIR && y >= 19)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.GRASS.getDefaultState());

						// vines
						if (blockToReplace == Blocks.STONE&&y>=19) {
							// east
							if (theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR&& rand.nextInt(10) == 0&&x!=15)
								theChunk.setBlockState(new BlockPos(x + 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.WEST, true));

							// west
							if (theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&x!=0)
								theChunk.setBlockState(new BlockPos(x - 1, y, z),Blocks.VINE.getDefaultState().withProperty(BlockVine.EAST, true));

							// south
							if (theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR && rand.nextInt(10) == 0&&z!=15)
								theChunk.setBlockState(new BlockPos(x, y, z + 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.NORTH, true));

							// north
							if (theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR	&& rand.nextInt(10) == 0&&z!=0)
								theChunk.setBlockState(new BlockPos(x, y, z - 1),Blocks.VINE.getDefaultState().withProperty(BlockVine.SOUTH, true));
						}

					}

					// swamp only features
					if (swamp) {

						// replace some of the grass with slime
						if (blockToReplace == Blocks.GRASS && (rand.nextInt(10) == 0) && y < height)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.SLIME_BLOCK.getDefaultState());

						// tall grass
						if (blockToReplace == Blocks.GRASS && rand.nextInt(2) == 0 && y < height)
							theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS));

					}

					// mushroom island only features
					if (mushroom) {

						// replace ground stone with mycelium
						if (blockToReplace == Blocks.STONE && blockAbove == Blocks.AIR)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.MYCELIUM.getDefaultState());

						// little mushrooms
						// red
						if (blockToReplace == Blocks.MYCELIUM && y < height && rand.nextInt(4) == 0) 
							theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.RED_MUSHROOM.getDefaultState());

						// brown
						if (blockToReplace == Blocks.MYCELIUM && y < height && rand.nextInt(2) == 0) 
							theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.BROWN_MUSHROOM.getDefaultState());

						// the cave is a giant mushroom!
						if (blockToReplace == Blocks.STONE && blockBelow == Blocks.AIR) {
							int a = 1;
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, BlockHugeMushroom.EnumType.CENTER));
							if (rand.nextInt(20) == 0) {
								Block blockToReplace2 = theChunk.getBlockState(x, y - 1, z).getBlock();
								while (blockToReplace2 == Blocks.AIR || blockToReplace2 == Blocks.WATER|| blockToReplace2 == Blocks.FLOWING_LAVA|| blockToReplace2 == Blocks.FLOWING_WATER || blockToReplace2 == Blocks.LAVA) {
									theChunk.setBlockState(new BlockPos(x, y - a, z),Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, BlockHugeMushroom.EnumType.STEM));
									a++;
									blockToReplace2 = theChunk.getBlockState(x, y - a, z).getBlock();
								}
							}
						}
					}

					// shrubs in mesa and desert biomes
					if ((mesa || desert)&& (blockToReplace == Blocks.HARDENED_CLAY || blockToReplace == Blocks.STAINED_HARDENED_CLAY|| blockToReplace == Blocks.SANDSTONE)	&& blockAbove == Blocks.AIR && rand.nextInt(5) == 0 && y < 56) {
						theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.DEADBUSH.getDefaultState());
						if (desert)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.SAND.getDefaultState());
					}
				}
			}
		}
		theChunk.markDirty();
	}
}