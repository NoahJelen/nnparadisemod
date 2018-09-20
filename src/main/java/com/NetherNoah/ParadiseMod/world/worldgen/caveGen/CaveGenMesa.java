package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStainedHardenedClay;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CaveGenMesa implements IWorldGenerator {
	protected static final IBlockState TERRACOTTA = Blocks.HARDENED_CLAY.getDefaultState();
	protected static final IBlockState ORANGE_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState()
			.withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.ORANGE);
	protected static final IBlockState WHITE_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState()
			.withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.WHITE);
	protected static final IBlockState BROWN_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState()
			.withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.BROWN);
	protected static final IBlockState YELLOW_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState()
			.withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.YELLOW);
	protected static final IBlockState RED_TERRACOTTA = Blocks.STAINED_HARDENED_CLAY.getDefaultState()
			.withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.RED);
	public static int height;

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		Chunk theChunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
		// don't generate if the config says not to
		// generate cave features
		if (ModConfig.worldgen.caves.betterCaves == false)
			return;
		if (ModConfig.worldgen.caves.types.Mesa == false)
			return;

		// the height is 256 if the features are being generated in a cave dimension,
		// else, it's 61
		height=255;
		if (world.provider.getDimension() == 0) {
			height = 61;
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

					boolean mesa = blockBiome == Biomes.MESA || blockBiome == Biomes.MESA_CLEAR_ROCK
							|| blockBiome == Biomes.MESA_ROCK || blockBiome == Biomes.MUTATED_MESA
							|| blockBiome == Biomes.MUTATED_MESA_CLEAR_ROCK || blockBiome == Biomes.MUTATED_MESA_ROCK;

					// replace exposed stone
					if (mesa&&(blockToReplace == Blocks.STONE || blockToReplace == Blocks.COBBLESTONE)
							&& (theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.AIR
									|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.WATER
									|| theChunk.getBlockState(x + 1, y, z).getBlock() == Blocks.LAVA
									|| theChunk.getBlockState(x, y + 1, z).getBlock() == Blocks.LAVA
									|| theChunk.getBlockState(x, y, z + 1).getBlock() == Blocks.LAVA
									|| theChunk.getBlockState(x - 1, y, z).getBlock() == Blocks.LAVA
									|| theChunk.getBlockState(x, y - 1, z).getBlock() == Blocks.LAVA
									|| theChunk.getBlockState(x, y, z - 1).getBlock() == Blocks.LAVA)) {

							// hardened clay (terracotta)
							switch (y) {
							case 74:
							case 45:
								theChunk.setBlockState(new BlockPos(x, y, z), ORANGE_TERRACOTTA);
								break;

							case 79:
							case 50:
								theChunk.setBlockState(new BlockPos(x, y, z), WHITE_TERRACOTTA);
								break;

							case 83:
							case 55:
								theChunk.setBlockState(new BlockPos(x, y, z), BROWN_TERRACOTTA);
								break;

							case 85:
							case 64:
								theChunk.setBlockState(new BlockPos(x, y, z), YELLOW_TERRACOTTA);
								break;

							case 40:
							case 56:
								theChunk.setBlockState(new BlockPos(x, y, z), RED_TERRACOTTA);
								break;

							default:
								theChunk.setBlockState(new BlockPos(x, y, z), TERRACOTTA);

							}
						}

						// shrubs
						if (mesa && (blockToReplace == Blocks.HARDENED_CLAY || blockToReplace == Blocks.STAINED_HARDENED_CLAY
								|| blockToReplace == Blocks.SANDSTONE) && blockAbove == Blocks.AIR && rand.nextInt(5) == 0) {
							theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.DEADBUSH.getDefaultState());

					}
				}
			}
		}
	}
}