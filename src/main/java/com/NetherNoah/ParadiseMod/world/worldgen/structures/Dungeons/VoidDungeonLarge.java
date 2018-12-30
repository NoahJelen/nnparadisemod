package com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import java.util.Collections;
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
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class VoidDungeonLarge extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == DimensionRegistry.DeepVoid && rand.nextInt(ModConfig.worldgen.structures.VoidDungeonLargeChance) == 0) {
			int y = getHighestBlock(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			generate(world, rand, pos);
		}
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template part1 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/void_dungeon_large_piece_1"));
		Template part2 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/void_dungeon_large_piece_2"));
		Template part3 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/void_dungeon_large_piece_3"));
		Template part4 = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/void_dungeon_large_piece_4"));
		if (ModConfig.worldgen.structures.VoidDungeonLarge==false)
			return false;
		if(part1 == null)
			return false;
		if(isAreaValid(worldserver, position)) {
			IBlockState iblockstate = world.getBlockState(position);
			world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			part1.getDataBlocks(position, placementsettings);
			part1.addBlocksToWorld(world, position.add(0, -10, 0), placementsettings);			
			part2.getDataBlocks(position, placementsettings);
			part2.addBlocksToWorld(world, position.add(0, -10, 32), placementsettings);			
			part3.getDataBlocks(position, placementsettings);
			part3.addBlocksToWorld(world, position.add(32, -10, 0), placementsettings);			
			part4.getDataBlocks(position, placementsettings);
			part4.addBlocksToWorld(world, position.add(32, -10, 32), placementsettings);
			return true;
		}
		return false;
	}
	//get the highest block in the area
	public static int getHighestBlock(World world, int blockX,int blockZ) {
		int[] heights = new int[264];
		int index = 0;
		for (int i=0;i<=65;i++) {
			heights[index]=getGroundFromAbove(world, blockX, blockZ);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ+i+1);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ+i+1);
			index++;
		}
		
		return Utils.getMaxValue(heights);
	}

	//check to see if the area is valid for spawning the structure
	public static boolean isAreaValid(World world, BlockPos postion)
	{
		int x = postion.getX();
		int y = postion.getY();
		int z =  postion.getZ();
		return postion.getY() > 31 
		&& world.getBlockState(new BlockPos(x,y-11,z)).getBlock()==Misc.VoidStone
		&& world.getBlockState(new BlockPos(x+64,y-11,z)).getBlock()==Misc.VoidStone
		&& world.getBlockState(new BlockPos(x,y-11,z+64)).getBlock()==Misc.VoidStone
		&& world.getBlockState(new BlockPos(x+64,y-11,z+64)).getBlock()==Misc.VoidStone;
		
	}
	
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 120;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround = (blockAt == Misc.VoidStone && blockAbove == Blocks.AIR);
		}
		return y;
	}
}