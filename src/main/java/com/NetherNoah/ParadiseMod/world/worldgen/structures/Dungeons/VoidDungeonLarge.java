package com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
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

public class VoidDungeonLarge extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == -3) {
			//generateOverworld(world, rand, blockX + 8, blockZ + 8);	
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			//WorldGenerator structure = new VoidDungeonLargeGen();
			generate(world, rand, pos);
		}
	}
	/*/
	private void generateOverworld(World world, Random rand, int blockX, int blockZ)
	{	
		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		WorldGenerator structure = new VoidDungeonLargeGen();
		structure.generate(world, rand, pos);
	}
	/*/

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
		Biome biome = world.getBiomeForCoordsBody(position);
		if(canSpawnHere(part1, worldserver, position)) {
			if(rand.nextInt(ModConfig.worldgen.structures.VoidDungeonLargeChance) == 0){
				IBlockState iblockstate = world.getBlockState(position);
				world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
				part1.getDataBlocks(position, placementsettings);
				part1.addBlocksToWorld(world, position.add(0, -11, 0), placementsettings);			
				part2.getDataBlocks(position, placementsettings);
				part2.addBlocksToWorld(world, position.add(0, -11, 32), placementsettings);			
				part3.getDataBlocks(position, placementsettings);
				part3.addBlocksToWorld(world, position.add(32, -11, 0), placementsettings);			
				part4.getDataBlocks(position, placementsettings);
				part4.addBlocksToWorld(world, position.add(32, -11, 32), placementsettings);
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
		int y = 120;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			Block blockAbove = world.getBlockState(new BlockPos(x,y+1,z)).getBlock();
			foundGround =  blockAt == Misc.VoidStone;
		}
		return y;
	}
}