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

public class DUTreesGen extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		Biome biome = world.getBiomeForCoordsBody(position);
		WorldServer worldserver = (WorldServer) world;
		
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		
		Template oak= templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/oak_sapling"));
		
		Template birch=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/birch_sapling"));
		
		Template darkOak=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/dark_oak_sapling"));
		Template acacia=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/acacia_sapling"));
		Template jungle=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/jungle_tree"));
		
		Template spruce=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/spruce_tree"));
		
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/oak_sapling"));
		
		int treeSelect=rand.nextInt(3);
		//oak sapling
		if(biome == Biomes.FOREST || biome == Biomes.FOREST_HILLS||biome==Biomes.SWAMPLAND||biome==Biomes.MUTATED_SWAMPLAND) {			
			template = oak;
		}
		
		//acacia sapling
		if(biome == Biomes.SAVANNA||biome == Biomes.SAVANNA_PLATEAU||biome == Biomes.MUTATED_SAVANNA||biome == Biomes.MUTATED_SAVANNA_ROCK) {
			template = acacia;
		}
		
		//birch sapling
		if(biome == Biomes.BIRCH_FOREST_HILLS|| biome == Biomes.BIRCH_FOREST_HILLS) {
			template = birch;
		}
		
		//dark oak sapling
		if(biome == Biomes.ROOFED_FOREST) {
			template = darkOak;
		}
		
		//jungle sapling
		if(biome == Biomes.JUNGLE||biome == Biomes.JUNGLE_EDGE||biome == Biomes.JUNGLE_HILLS||biome == Biomes.MUTATED_JUNGLE||biome == Biomes.MUTATED_JUNGLE_EDGE) {
			template = jungle;
		}
		
		//spruce sapling
		if(biome == Biomes.TAIGA||biome == Biomes.TAIGA_HILLS||biome == Biomes.COLD_TAIGA||biome == Biomes.COLD_TAIGA_HILLS||biome == Biomes.MUTATED_REDWOOD_TAIGA||biome == Biomes.MUTATED_REDWOOD_TAIGA_HILLS||biome == Biomes.MUTATED_TAIGA||biome == Biomes.MUTATED_TAIGA_COLD||biome == Biomes.REDWOOD_TAIGA||biome == Biomes.REDWOOD_TAIGA_HILLS||biome==Biomes.EXTREME_HILLS_WITH_TREES||biome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES) {
			template = spruce;
		}
		IBlockState iblockstate = world.getBlockState(position);
		world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
		PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
				.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
				.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
		template.getDataBlocks(position, placementsettings);
		template.addBlocksToWorld(world, position.add(0, 0, 0), placementsettings);
		return true;
	}
	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		return posAboveGround.getY() > 31;
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
		int y = 75;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			//Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround =  (blockAt == Blocks.GRASS);// && blockAbove==Blocks.AIR);
		}
		return y;
	}
}