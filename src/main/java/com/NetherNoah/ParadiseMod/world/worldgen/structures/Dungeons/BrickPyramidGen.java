package com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;

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

public class BrickPyramidGen extends WorldGenerator {

	@Override
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
		if(rand.nextInt(ModConfig.worldgen.structures.BrickPyramidsChance) == 0){
			IBlockState iblockstate = world.getBlockState(position);
			world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			part1.getDataBlocks(position, placementsettings);
			part1.addBlocksToWorld(world, position.add(0, -2, 0), placementsettings);			
			part2.getDataBlocks(position, placementsettings);
			part2.addBlocksToWorld(world, position.add(26, -2, 0), placementsettings);			
			part3.getDataBlocks(position, placementsettings);
			part3.addBlocksToWorld(world, position.add(0, -2, 27), placementsettings);			
			part4.getDataBlocks(position, placementsettings);
			part4.addBlocksToWorld(world, position.add(26, -2, 27), placementsettings);
			return true;
		}
		return false;
	}
}