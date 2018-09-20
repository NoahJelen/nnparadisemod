package com.NetherNoah.ParadiseMod.world.worldgen.caveGen;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockStainedHardenedClay;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CaveGenMushroomIsland implements IWorldGenerator{
	public static int height;

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		Chunk theChunk=world.getChunkFromChunkCoords(chunkX, chunkZ);
		// don't generate if the config says not to
		// generate cave features
		if (ModConfig.worldgen.caves.betterCaves == false)
			return;
		if (ModConfig.worldgen.caves.types.Mushroom == false)
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

					if (blockBiome == Biomes.MUSHROOM_ISLAND|| blockBiome == Biomes.MUSHROOM_ISLAND_SHORE) {
						// replace ground stone with mycelium
						if ((blockToReplace==Blocks.STONE||blockToReplace==Blocks.COBBLESTONE)&& blockAbove == Blocks.AIR)
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.MYCELIUM.getDefaultState());

						// little mushrooms
						if(theChunk.getBlockState(x, y, z).getBlock() == Blocks.MYCELIUM){
							switch (rand.nextInt(10)) {
								//red
								case 1:
									theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.RED_MUSHROOM.getDefaultState());
									break;
								//brown
								case 9:
									theChunk.setBlockState(new BlockPos(x, y + 1, z), Blocks.BROWN_MUSHROOM.getDefaultState());
									break;
							}
						}

						// the cave is a giant mushroom!
						if ((blockToReplace==Blocks.STONE||blockToReplace==Blocks.COBBLESTONE) && blockBelow == Blocks.AIR) {
							int a = 1;
							theChunk.setBlockState(new BlockPos(x, y, z), Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, BlockHugeMushroom.EnumType.CENTER));
							if (rand.nextInt(30) == 0) {
								Block blockToReplace2 = theChunk.getBlockState(x, y - 1, z).getBlock();
								while (blockToReplace2 == Blocks.AIR
										|| blockToReplace2 == Blocks.WATER
										|| blockToReplace2 == Blocks.LAVA
										|| blockToReplace2 == Blocks.FLOWING_LAVA
										|| blockToReplace2 == Blocks.FLOWING_WATER) {
									theChunk.setBlockState(new BlockPos(x, y - a, z),Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, BlockHugeMushroom.EnumType.STEM));
									a++;
									blockToReplace2 = theChunk.getBlockState(x, y - a, z).getBlock();
								}
							}
						}
					}
				}
			}
		}
	}
}