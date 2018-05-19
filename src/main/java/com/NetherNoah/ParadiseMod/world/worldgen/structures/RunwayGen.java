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

public class RunwayGen extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":runway"));
		if(template == null)
		{
<<<<<<< HEAD
=======
			System.out.println("Nether Noah's Paradise mod: Please don't screw with me!");
>>>>>>> e761e1797315884b007e3fa89750a8d6940a500d
			return false;
		}		
		Biome biome = world.getBiomeForCoordsBody(position);
		if(RunwayGen.canSpawnHere(template, worldserver, position)) {
<<<<<<< HEAD
			if(rand.nextInt(799) == 0){
=======
<<<<<<< HEAD
			if(rand.nextInt(599) == 0){
=======
<<<<<<< HEAD
			if(rand.nextInt(599) == 0){
=======
<<<<<<< HEAD
			if(rand.nextInt(599) == 0){
=======
			if(rand.nextInt(399) == 0){
>>>>>>> b4f1ba2701a07a150105d9b8107884ea381af4e7
>>>>>>> 2232dfc8ed202f64e08f79d5fc50cea9a6929969
>>>>>>> ff63528162a376128514ecfa30cc4fc1154076ab
>>>>>>> e761e1797315884b007e3fa89750a8d6940a500d
				IBlockState iblockstate = world.getBlockState(position);
				world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
				template.getDataBlocks(position, placementsettings);
<<<<<<< HEAD
				template.addBlocksToWorld(world, position.add(0, -5, 0), placementsettings);
=======
<<<<<<< HEAD
				template.addBlocksToWorld(world, position.add(0, -5, 0), placementsettings);
=======
<<<<<<< HEAD
				template.addBlocksToWorld(world, position.add(0, -5, 0), placementsettings);
=======
<<<<<<< HEAD
				template.addBlocksToWorld(world, position.add(0, -5, 0), placementsettings);
=======
				template.addBlocksToWorld(world, position.add(0, -6, 0), placementsettings);
>>>>>>> b4f1ba2701a07a150105d9b8107884ea381af4e7
>>>>>>> 2232dfc8ed202f64e08f79d5fc50cea9a6929969
>>>>>>> ff63528162a376128514ecfa30cc4fc1154076ab
>>>>>>> e761e1797315884b007e3fa89750a8d6940a500d
				return true;
			}
		}
		return false;
	}
	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		return posAboveGround.getY() > 10;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.GRASS|| blockAt == Blocks.DIRT || blockAt == Blocks.SAND || blockAt == Blocks.SNOW ||blockAt == Blocks.MYCELIUM||blockAt==Blocks.STONE||blockAt==Blocks.WATER;
		}
		return y;
	}
>>>>>>> ff63528162a376128514ecfa30cc4fc1154076ab
>>>>>>> e761e1797315884b007e3fa89750a8d6940a500d
}