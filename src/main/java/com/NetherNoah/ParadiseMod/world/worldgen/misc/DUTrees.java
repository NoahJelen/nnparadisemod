package com.NetherNoah.ParadiseMod.world.worldgen.misc;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class DUTrees implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		for (int i=0;i<5;i++) {
			int blockX = (chunkX * 16)+rand.nextInt(16);
			int blockZ = (chunkZ * 16)+rand.nextInt(16);
			if (world.provider.getDimension()==DimensionRegistry.DeepUnderground) {
				int y = getGroundFromAbove(world, blockX, blockZ);
				BlockPos position = new BlockPos(blockX, y+1, blockZ);
				if (y>31) {
					Biome biome = world.getBiomeForCoordsBody(position);

					//oak sapling
					IBlockState block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.STAGE, 1);

					//acacia sapling
					if(biome == Biomes.SAVANNA||biome == Biomes.SAVANNA_PLATEAU||biome == Biomes.MUTATED_SAVANNA||biome == Biomes.MUTATED_SAVANNA_ROCK)
						block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.ACACIA).withProperty(BlockSapling.STAGE, 1);
					
					//birch sapling
					if(biome == Biomes.BIRCH_FOREST_HILLS|| biome == Biomes.BIRCH_FOREST_HILLS)
						block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.BIRCH).withProperty(BlockSapling.STAGE, 1);
					
					//dark oak sapling
					if(biome == Biomes.ROOFED_FOREST)
						block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.DARK_OAK).withProperty(BlockSapling.STAGE, 1);
					
					//jungle sapling
					if(biome == Biomes.JUNGLE||biome == Biomes.JUNGLE_EDGE||biome == Biomes.JUNGLE_HILLS||biome == Biomes.MUTATED_JUNGLE||biome == Biomes.MUTATED_JUNGLE_EDGE)
						block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.JUNGLE).withProperty(BlockSapling.STAGE, 1);
					
					//spruce sapling
					if(biome == Biomes.TAIGA||biome == Biomes.TAIGA_HILLS||biome == Biomes.COLD_TAIGA||biome == Biomes.COLD_TAIGA_HILLS||biome == Biomes.MUTATED_REDWOOD_TAIGA||biome == Biomes.MUTATED_REDWOOD_TAIGA_HILLS||biome == Biomes.MUTATED_TAIGA||biome == Biomes.MUTATED_TAIGA_COLD||biome == Biomes.REDWOOD_TAIGA||biome == Biomes.REDWOOD_TAIGA_HILLS||biome==Biomes.EXTREME_HILLS_WITH_TREES||biome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES)
						block=Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.SPRUCE).withProperty(BlockSapling.STAGE, 1);
					
					if(biome==Biomes.DESERT||biome==Biomes.DESERT_HILLS||biome==Biomes.MUTATED_DESERT)
						block=Blocks.CACTUS.getDefaultState();

					world.setBlockState(position, block);
					if (block==Blocks.CACTUS.getDefaultState()) {
						world.setBlockState(new BlockPos(position.getX(),position.getY()-1,position.getZ()),Blocks.SAND.getDefaultState());
						for (int j=0;j<rand.nextInt(3);j++) {
							world.setBlockState(new BlockPos(position.getX(),position.getY()+j,position.getZ()),block );
						}
					}
					if (block==Blocks.SAPLING.getDefaultState().withProperty(BlockSapling.TYPE, EnumType.DARK_OAK).withProperty(BlockSapling.STAGE, 1)) {
						world.setBlockState(new BlockPos(position.getX()+1,position.getY()-1,position.getZ()),Blocks.GRASS.getDefaultState());
						world.setBlockState(new BlockPos(position.getX(),position.getY()-1,position.getZ()+1),Blocks.GRASS.getDefaultState());
						world.setBlockState(new BlockPos(position.getX()+1,position.getY()-1,position.getZ()+1),Blocks.GRASS.getDefaultState());
						world.setBlockState(new BlockPos(position.getX()+1,position.getY(),position.getZ()),block);
						world.setBlockState(new BlockPos(position.getX(),position.getY(),position.getZ()+1),block);
						world.setBlockState(new BlockPos(position.getX()+1,position.getY(),position.getZ()+1),block);
					}
					
				}
			}
		}
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 85;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround =  (blockAt == Blocks.GRASS||blockAt==Blocks.SAND||blockAt==Blocks.SANDSTONE)&&blockAbove==Blocks.AIR;
		}
		return y;
	}
}

