package com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
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

public class BrickPyramid extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == 0 && rand.nextInt(ModConfig.worldgen.structures.BrickPyramidsChance) == 0) {	
			int y = getLowestBlock(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			generate(world, rand, pos);
		}
	}

	//get the lowest block in the area
	public static int getLowestBlock(World world, int blockX,int blockZ) {
		int[] heights = new int[220];
		int index = 0;
		for (int i=0;i<=54;i++) {
			heights[index]=getGroundFromAbove(world, blockX, blockZ);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ+i+1);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ+i+1);
			index++;
		}
		
		return Utils.getMinValue(heights);
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.GRAVEL||blockAt == Blocks.GRASS||blockAt == Blocks.SAND||blockAt == Blocks.DIRT;
		}
		return y;
	}

	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template part1 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/brick_pyramid_1"));
		Template part2 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/brick_pyramid_2"));
		Template part3 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/brick_pyramid_3"));
		Template part4 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/brick_pyramid_4"));
		if(ModConfig.worldgen.structures.BrickPyramids==false)
			return false;
		Biome biome = world.getBiomeForCoordsBody(position);
		IBlockState iblockstate = world.getBlockState(position);
		world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
		PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
				.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
				.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
		part1.getDataBlocks(position, placementsettings);
		part1.addBlocksToWorld(world, position.add(0, 0, 0), placementsettings);			
		part2.getDataBlocks(position, placementsettings);
		part2.addBlocksToWorld(world, position.add(26, 0, 0), placementsettings);			
		part3.getDataBlocks(position, placementsettings);
		part3.addBlocksToWorld(world, position.add(0, 0, 27), placementsettings);			
		part4.getDataBlocks(position, placementsettings);
		part4.addBlocksToWorld(world, position.add(26, 0, 27), placementsettings);
		
		//remove foliage from the area
		int x=position.getX();
		int y=position.getY();
		int z=position.getZ();
		for (int i=0;i<=53;i++) {
			for (int j=0;j<=53;j++) {
				for (int k=0;k<=53;k++) {
					if (world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.LEAVES||world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.LEAVES2||world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.LOG||world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.LOG2||world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.BROWN_MUSHROOM_BLOCK||world.getBlockState(new BlockPos(x+i,y+j,z+k)).getBlock()==Blocks.RED_MUSHROOM_BLOCK) {
						world.setBlockState(new BlockPos(x+i,y+j,z+k), Blocks.AIR.getDefaultState());
					}
				}
			}		
		}
		return true;
	}
}