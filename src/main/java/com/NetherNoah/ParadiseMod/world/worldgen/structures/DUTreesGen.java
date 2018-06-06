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
		int x=0;
		int z=0;
		
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		
		Template oak= templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/sapling"));
		
		Template birch=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/birch_tree_1"));
		
		Template darkOak=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/dark_oak_tree_1"));
		int[] darkOakZ= {-5,-3,-6};
		
		Template[] acacia= {templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/acacia_tree_1")),templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/acacia_tree_2")),templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/acacia_tree_3"))};
		int[] acaciaX= {-3,-5,-2};
		int[] acaciaZ= {-2,-3,-3};
		Template jungle=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/jungle_tree"));
		
		Template spruce=templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":trees/spruce_tree"));
		
		Template template = null;
		
		int treeSelect=rand.nextInt(3);
		//oak forest home
		if(biome == Biomes.FOREST || biome == Biomes.FOREST_HILLS||biome==Biomes.SWAMPLAND||biome==Biomes.MUTATED_SWAMPLAND) {
			x=oakX[treeSelect];
			z=oakZ[treeSelect];			
			template = oak[treeSelect];
		}
		
		//savanna home
		if(biome == Biomes.SAVANNA||biome == Biomes.SAVANNA_PLATEAU||biome == Biomes.MUTATED_SAVANNA||biome == Biomes.MUTATED_SAVANNA_ROCK) {
			x=acaciaX[treeSelect];
			z=acaciaZ[treeSelect];
			template = acacia[treeSelect];
		}
		
		//birch forest home
		if(biome == Biomes.BIRCH_FOREST_HILLS|| biome == Biomes.BIRCH_FOREST_HILLS) {
			x=-2;
			z=-2;
			template = birch[treeSelect];
		}
		
		//roofed forest home
		if(biome == Biomes.ROOFED_FOREST) {
			x=-3;
			z=darkOakZ[treeSelect];
			template = darkOak[treeSelect];
		}
		
		//jungle home
		if(biome == Biomes.JUNGLE||biome == Biomes.JUNGLE_EDGE||biome == Biomes.JUNGLE_HILLS||biome == Biomes.MUTATED_JUNGLE||biome == Biomes.MUTATED_JUNGLE_EDGE) {
			x=-2;
			z=-2;
			template = jungle;
		}
		
		//spruce home
		if(biome == Biomes.TAIGA||biome == Biomes.TAIGA_HILLS||biome == Biomes.COLD_TAIGA||biome == Biomes.COLD_TAIGA_HILLS||biome == Biomes.MUTATED_REDWOOD_TAIGA||biome == Biomes.MUTATED_REDWOOD_TAIGA_HILLS||biome == Biomes.MUTATED_TAIGA||biome == Biomes.MUTATED_TAIGA_COLD||biome == Biomes.REDWOOD_TAIGA||biome == Biomes.REDWOOD_TAIGA_HILLS||biome==Biomes.EXTREME_HILLS_WITH_TREES||biome==Biomes.MUTATED_EXTREME_HILLS_WITH_TREES) {
			x=-3;
			z=-3;
			template = spruce;
		}
		//if(DUTreesGen.canSpawnHere(template, worldserver, position.add(x, 1, z))) {
		if (template!=null) {
			IBlockState iblockstate = world.getBlockState(position.add(x, 1, z));
			world.notifyBlockUpdate(position.add(x, 1, z), iblockstate, iblockstate, 3);
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			template.getDataBlocks(position.add(x, 1, z), placementsettings);
			template.addBlocksToWorld(world, position.add(x, 1, z), placementsettings);
			return true;
		}
		return false;
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
		int y = 120;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround =  (blockAt == Blocks.GRASS|| blockAt == Blocks.DIRT || blockAt == Blocks.SAND || blockAt == Blocks.SNOW ||blockAt == Blocks.MYCELIUM||blockAt==Blocks.STONE && blockAbove==Blocks.AIR);
		}
		return y;
	}
}