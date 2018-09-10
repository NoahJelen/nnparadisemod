package com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.config.ModConfig;

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
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MesaTemple extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;

		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		generate(world, rand, pos);
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround =  blockAt == Blocks.STAINED_HARDENED_CLAY||blockAt==Blocks.RED_SANDSTONE;
		}
		return y;
	}
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":dungeons/mesa_temple"));
		if(ModConfig.worldgen.structures.MesaTemple==false)
			return false;
		if(template == null)
		{
			System.out.println("Nether Noah's Paradise mod: Please don't screw with me!");
			return false;
		}		
		Biome biome = world.getBiomeForCoordsBody(position);
		if(biome == Biomes.MESA||biome == Biomes.MESA_CLEAR_ROCK||biome == Biomes.MESA_ROCK||biome == Biomes.MUTATED_MESA||biome == Biomes.MUTATED_MESA_CLEAR_ROCK||biome == Biomes.MUTATED_MESA_ROCK) {
			if(canSpawnHere(template, worldserver, position)) {
				if(rand.nextInt(ModConfig.worldgen.structures.MesaTempleChance) == 0){
					IBlockState iblockstate = world.getBlockState(position);
					world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
					PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
							.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
							.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
					template.getDataBlocks(position, placementsettings);
					template.addBlocksToWorld(world, position.add(0, -16, 0), placementsettings);
					return true;
				}
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