package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
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
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class VoidDungeonGen extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		Biome biome = world.getBiomeForCoordsBody(position);
		WorldServer worldserver = (WorldServer) world;
		
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = null;
		Template[] dungeons= {
				templatemanager.getTemplate(minecraftserver,new ResourceLocation(Reference.MOD_ID+":void_dungeon_small_zombie")),
				templatemanager.getTemplate(minecraftserver,new ResourceLocation(Reference.MOD_ID+":void_dungeon_small_skeleton")),
				templatemanager.getTemplate(minecraftserver,new ResourceLocation(Reference.MOD_ID+":void_dungeon_small_spider")),
				templatemanager.getTemplate(minecraftserver,new ResourceLocation(Reference.MOD_ID+":dungeon_medium"))
		};
		template=dungeons[rand.nextInt(4)];

		if(VoidDungeonGen.canSpawnHere(template, worldserver, position)) {
			if(rand.nextInt(60) == 0){
				IBlockState iblockstate = world.getBlockState(position);
				world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
				template.getDataBlocks(position, placementsettings);
				template.addBlocksToWorld(world, position.add(0, -17, 0), placementsettings);
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
			foundGround =  (blockAt == Misc.VoidStone);
		}
		return y;
	}
}