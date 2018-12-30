package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSnow;
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
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Home extends WorldGenerator implements IWorldGenerator{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		generate(world, rand, pos);
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround =  (blockAt == Blocks.GRASS|| blockAt == Blocks.DIRT || blockAt == Blocks.SAND || blockAt == Blocks.SNOW ||blockAt == Blocks.MYCELIUM||blockAt==Blocks.STONE||blockAt==Blocks.WATER)&&(blockAbove==Blocks.AIR||blockAbove==Blocks.SNOW_LAYER);
		}
		return y;
	}

	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		return posAboveGround.getY() > 31;
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		Biome biome = world.getBiomeForCoordsBody(position);
		WorldServer worldserver = (WorldServer) world;
		
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house"));
		IBlockState supportType = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		
		//savanna home
		if(biome == Biomes.SAVANNA||biome == Biomes.SAVANNA_PLATEAU||biome == Biomes.MUTATED_SAVANNA||biome == Biomes.MUTATED_SAVANNA_ROCK) {
			supportType = Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.ACACIA);
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_acacia"));
		}

		//birch forest home
		if(biome == Biomes.BIRCH_FOREST_HILLS|| biome == Biomes.BIRCH_FOREST_HILLS) {
			supportType = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.BIRCH);
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_birch"));		
		}

		//roofed forest home
		if(biome == Biomes.ROOFED_FOREST) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_dark_oak"));
			supportType = Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK);
		}

		//desert home
		if(biome == Biomes.DESERT||biome == Biomes.DESERT_HILLS||biome == Biomes.MUTATED_DESERT) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_desert"));		
			supportType = Misc.CompressedCactus.getDefaultState();
		}

		//jungle home
		if(biome == Biomes.JUNGLE||biome == Biomes.JUNGLE_EDGE||biome == Biomes.JUNGLE_HILLS||biome == Biomes.MUTATED_JUNGLE||biome == Biomes.MUTATED_JUNGLE_EDGE) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_jungle"));
			supportType = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		}

		//spruce home
		if(biome == Biomes.TAIGA||biome == Biomes.TAIGA_HILLS||biome == Biomes.COLD_TAIGA||biome == Biomes.COLD_TAIGA_HILLS||biome == Biomes.MUTATED_REDWOOD_TAIGA||biome == Biomes.MUTATED_REDWOOD_TAIGA_HILLS||biome == Biomes.MUTATED_TAIGA||biome == Biomes.MUTATED_TAIGA_COLD||biome == Biomes.REDWOOD_TAIGA||biome == Biomes.REDWOOD_TAIGA_HILLS||biome==Biomes.EXTREME_HILLS_WITH_TREES||biome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":homes/starter_house_spruce"));
			supportType = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
		}

		if(ModConfig.worldgen.structures.Homes==false)
			return false;
		if(canSpawnHere(template, worldserver, position)) {
			if(rand.nextInt(ModConfig.worldgen.structures.HomesChance) == 0){
				IBlockState iblockstate = world.getBlockState(position);
				world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
				template.getDataBlocks(position, placementsettings);
				template.addBlocksToWorld(world, position.add(0, 0, 0), placementsettings);		
				
				//generate supports if needed
				int x=position.getX();
				int y=position.getY();
				int z=position.getZ();
				Block blockToReplace = world.getBlockState(new BlockPos(x,y-2,z+1)).getBlock();
				world.setBlockState(new BlockPos(x,y-1,z+1), supportType);
				world.setBlockState(new BlockPos(x+5,y-1,z+1), supportType);
				world.setBlockState(new BlockPos(x,y-1,z+7), supportType);
				world.setBlockState(new BlockPos(x+5,y-1,z+7), supportType);

				//(0,0)
				while ((blockToReplace==Blocks.WATER
						  ||blockToReplace==Blocks.COBBLESTONE
						  ||blockToReplace==Blocks.FLOWING_WATER
						  ||blockToReplace instanceof BlockAir
						  ||blockToReplace instanceof BlockBush
						  ||blockToReplace instanceof BlockSnow
						  ||blockToReplace instanceof BlockFluidClassic
						  ||blockToReplace instanceof BlockLeaves)
						  &&y>0) {
					world.setBlockState(new BlockPos(x,y-1,z+1), supportType);
					blockToReplace = world.getBlockState(new BlockPos(x,y-2,z)).getBlock();
					y--;
				}
				y=position.getY();

				//(6,0)
				blockToReplace = world.getBlockState(new BlockPos(x+5,y-2,z+1)).getBlock();
				while ((blockToReplace==Blocks.WATER
						  ||blockToReplace==Blocks.COBBLESTONE
						  ||blockToReplace==Blocks.FLOWING_WATER
						  ||blockToReplace instanceof BlockAir
						  ||blockToReplace instanceof BlockBush
						  ||blockToReplace instanceof BlockSnow
						  ||blockToReplace instanceof BlockFluidClassic
						  ||blockToReplace instanceof BlockLeaves)
						  &&y>0) {
					world.setBlockState(new BlockPos(x+5,y-1,z+1), supportType);
					blockToReplace = world.getBlockState(new BlockPos(x+5,y-2,z+1)).getBlock();
					y--;
				}
				y=position.getY();

				//(0,7)
				blockToReplace = world.getBlockState(new BlockPos(x,y-2,z+7)).getBlock();
				while ((blockToReplace==Blocks.WATER
						  ||blockToReplace==Blocks.COBBLESTONE
						  ||blockToReplace==Blocks.FLOWING_WATER
						  ||blockToReplace instanceof BlockAir
						  ||blockToReplace instanceof BlockBush
						  ||blockToReplace instanceof BlockSnow
						  ||blockToReplace instanceof BlockFluidClassic
						  ||blockToReplace instanceof BlockLeaves)
						  &&y>0) {
					world.setBlockState(new BlockPos(x,y-1,z+7), supportType);
					blockToReplace = world.getBlockState(new BlockPos(x,y-2,z+7)).getBlock();
					y--;
				}
				y=position.getY();

				//(6,7)
				blockToReplace = world.getBlockState(new BlockPos(x+5,y-2,z+7)).getBlock();
				while ((blockToReplace==Blocks.WATER
						  ||blockToReplace==Blocks.COBBLESTONE
						  ||blockToReplace==Blocks.FLOWING_WATER
						  ||blockToReplace instanceof BlockAir
						  ||blockToReplace instanceof BlockBush
						  ||blockToReplace instanceof BlockSnow
						  ||blockToReplace instanceof BlockFluidClassic
						  ||blockToReplace instanceof BlockLeaves)
						  &&y>0) {
					world.setBlockState(new BlockPos(x+5,y-1,z+7), supportType);
					blockToReplace = world.getBlockState(new BlockPos(x+5,y-2,z+7)).getBlock();
					y--;
				}
				return true;
			}
		}
		return false;
	}
}