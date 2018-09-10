package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
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

public class PlayerTempleGen extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = null;
		switch (rand.nextInt(2)) {
			case 0:
				template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":player_temples/nn777_temple"));
				break;
			case 1:
				template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":player_temples/attiecat_temple"));
				break;
		}
		/*/
		if (rand.nextInt(2)==0)
			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":player_temples/attiecat_temple"));
		/*/
		if(ModConfig.worldgen.structures.PlayerTemples==false)
			return false;
		Biome biome = world.getBiomeForCoordsBody(position);
		if (biome==Biomes.DESERT||biome==Biomes.SAVANNA||biome==Biomes.TAIGA||biome==Biomes.PLAINS) {
			if(rand.nextInt(ModConfig.worldgen.structures.PlayerTemplesChance) == 0){
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
		return posAboveGround.getY() > 10;
	}
}