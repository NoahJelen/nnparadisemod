package com.NetherNoah.ParadiseMod.world.worldgen.structures;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneBrick.EnumType;
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
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.IWorldGenerator;

public class EasterEgg extends WorldGenerator implements IWorldGenerator{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;	
		int y = getGroundFromAbove(world, blockX, blockZ);
		boolean isUnderground=rand.nextBoolean();
		BlockPos pos = new BlockPos(blockX, y, blockZ);
		if (isUnderground==true)
			pos = new BlockPos(blockX, 30, blockZ);
		if (world.provider.getDimension()==0)
			generate(world, rand, pos,isUnderground);
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 63)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.GRASS||blockAt == Blocks.DIRT||blockAt == Blocks.STONE||blockAt == Blocks.WATER;
		}
		return y;
	}

	public boolean generate(World world, Random rand, BlockPos position, Boolean isUnderground) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":easter_egg_1"));
		if (isUnderground==true) {

			template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":easter_egg_2"));
		}
		if(ModConfig.worldgen.structures.EasterEgg==false)
			return false;
		Biome biome = world.getBiomeForCoordsBody(position);
		if(rand.nextInt(ModConfig.worldgen.structures.EasterEggChance) == 0){
			IBlockState iblockstate = world.getBlockState(position);
			world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			template.getDataBlocks(position, placementsettings);
			template.addBlocksToWorld(world, position.add(0, 0, 0), placementsettings);
			
			if (isUnderground)
				return true;
			
			//generate supports if needed
			int x=position.getX();
			int y=position.getY();
			int z=position.getZ();
			Block blockToReplace = world.getBlockState(new BlockPos(x,y-1,z)).getBlock();

			//(0,0)
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x,y,z), Utils.getRandomBrick());
				blockToReplace = world.getBlockState(new BlockPos(x,y-1,z)).getBlock();
				y--;
			}
			y=position.getY();

			//(7,0)
			blockToReplace = world.getBlockState(new BlockPos(x+6,y-1,z)).getBlock();
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x+6,y,z), Utils.getRandomBrick());
				blockToReplace = world.getBlockState(new BlockPos(x+6,y-1,z)).getBlock();
				y--;
			}
			y=position.getY();

			//(0,17)
			blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+16)).getBlock();
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x,y,z+16), Utils.getRandomBrick());
				blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+16)).getBlock();
				y--;
			}
			y=position.getY();

			//(7,17)
			blockToReplace = world.getBlockState(new BlockPos(x+6,y-1,z+16)).getBlock();
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x+6,y,z+16), Utils.getRandomBrick());
				blockToReplace = world.getBlockState(new BlockPos(x+6,y-1,z+16)).getBlock();
				y--;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return false;
	}

}