package com.NetherNoah.ParadiseMod.world.worldgen.structures;

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

public class Ocean extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == 0) {
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			generate(world, rand, pos);
			//generateOverworld(world, rand, blockX + 8, blockZ + 8);
		}
	}
	/*/
	private void generateOverworld(World world, Random rand, int blockX, int blockZ)
	{
		int y = getGroundFromAbove(world, blockX, blockZ);
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		generate(world, rand, pos);
	}
	/*/
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.GRAVEL;
		}
		return y;
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = null;
		int rarity=ModConfig.worldgen.structures.ShipwreckChance;

		switch(rand.nextInt(2)) {
			case 0:
				if (ModConfig.worldgen.structures.OceanVillage==true) {
					rarity=ModConfig.worldgen.structures.OceanVillageChance;
					template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":ocean_village"));
				}
				break;
			case 1:
				if (ModConfig.worldgen.structures.Shipwreck==true)
					template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":ship"));
				break;
		}

		if(template == null)
			return false;
		
		Biome biome = world.getBiomeForCoordsBody(position);
		if(biome == Biomes.OCEAN||biome == Biomes.DEEP_OCEAN) {
			if(canSpawnHere(template, worldserver, position)) {
				if(rand.nextInt(rarity) == 0){
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
		}
		return false;
	}

	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		return posAboveGround.getY() > 31;
	}
}