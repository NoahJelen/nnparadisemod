package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.block.Block;
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
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class HomeGen extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		Biome biome = world.getBiomeForCoordsBody(position);
		WorldServer worldserver = (WorldServer) world;
		
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = null;
		
		//oak forest home
		if(biome == Biomes.FOREST || biome == Biomes.FOREST_HILLS||biome==Biomes.SWAMPLAND||biome==Biomes.MUTATED_SWAMPLAND||biome==Biomes.PLAINS||biome==Biomes.MUTATED_PLAINS||biome==Biomes.ICE_PLAINS) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house"));
		}
		
		//savanna home
		if(biome == Biomes.SAVANNA||biome == Biomes.SAVANNA_PLATEAU||biome == Biomes.MUTATED_SAVANNA||biome == Biomes.MUTATED_SAVANNA_ROCK) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_acacia"));
		}
		
		//birch forest home
		if(biome == Biomes.BIRCH_FOREST_HILLS|| biome == Biomes.BIRCH_FOREST_HILLS) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_birch"));
		}
		
		//roofed forest home
		if(biome == Biomes.ROOFED_FOREST) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_dark_oak"));
		}
		
		//desert home
		if(biome == Biomes.DESERT||biome == Biomes.DESERT_HILLS||biome == Biomes.MUTATED_DESERT) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_desert"));
		}
		
		//jungle home
		if(biome == Biomes.JUNGLE||biome == Biomes.JUNGLE_EDGE||biome == Biomes.JUNGLE_HILLS||biome == Biomes.MUTATED_JUNGLE||biome == Biomes.MUTATED_JUNGLE_EDGE) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_jungle"));
		}
		
		//spruce home
		if(biome == Biomes.TAIGA||biome == Biomes.TAIGA_HILLS||biome == Biomes.COLD_TAIGA||biome == Biomes.COLD_TAIGA_HILLS||biome == Biomes.MUTATED_REDWOOD_TAIGA||biome == Biomes.MUTATED_REDWOOD_TAIGA_HILLS||biome == Biomes.MUTATED_TAIGA||biome == Biomes.MUTATED_TAIGA_COLD||biome == Biomes.REDWOOD_TAIGA||biome == Biomes.REDWOOD_TAIGA_HILLS||biome==Biomes.EXTREME_HILLS_WITH_TREES||biome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES) {
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":starter_house_spruce"));
		}

		if(template == null)
		{
			return false;
		}

		if(HomeGen.canSpawnHere(template, worldserver, position)) {
			if(rand.nextInt(60) == 0){
				IBlockState iblockstate = world.getBlockState(position);
				world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
				template.getDataBlocks(position, placementsettings);
				template.addBlocksToWorld(world, position.add(0, 0, 0), placementsettings);
				return true;
			}
		}
		return false;
	}
	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		boolean corner1 = isCornerValid(world, posAboveGround);
		boolean corner2 = isCornerValid(world, posAboveGround.add(xwidth, 0, zwidth));
		return posAboveGround.getY() > 31 && corner1 && corner2;
	}
	public static boolean isCornerValid(World world, BlockPos pos)
	{
		int variation = 3;
		int highestBlock = getGroundFromAbove(world, pos.getX(), pos.getZ());
		if (highestBlock > pos.getY() - variation && highestBlock < pos.getY() + variation)
			return true;
		return false;
	}
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.GRASS|| blockAt == Blocks.DIRT || blockAt == Blocks.SAND || blockAt == Blocks.SNOW ||blockAt == Blocks.MYCELIUM||blockAt==Blocks.STONE;
		}
		return y;
	}
}