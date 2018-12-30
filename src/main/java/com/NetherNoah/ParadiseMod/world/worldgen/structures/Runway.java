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

public class Runway extends WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		if (world.provider.getDimension() == 0 && rand.nextInt(ModConfig.worldgen.structures.RunwayChance) == 0){	
			int y = getHighestBlock(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			generate(world, rand, pos);
		}
	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.GRASS||blockAt == Blocks.SAND||blockAt == Blocks.SNOW||blockAt == Blocks.MYCELIUM||blockAt==Blocks.WATER;
		}
		return y;
	}
	
	public static Block getGroundBlock(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
		while(!foundGround && y-- >= 31)
		{
			blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.GRASS||blockAt == Blocks.SAND||blockAt == Blocks.SNOW||blockAt == Blocks.MYCELIUM||blockAt==Blocks.WATER;
		}
		return blockAt;
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":runway"));
		if(template == null||ModConfig.worldgen.structures.Runway==false)
			return false;
		
		if(isAreaValid(world, position)) {
			IBlockState iblockstate = world.getBlockState(position);
			world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			template.getDataBlocks(position, placementsettings);
			template.addBlocksToWorld(world, position.add(0, -4, 0), placementsettings);
			
			//generate supports if needed
			int x=position.getX();
			int y=position.getY();
			int z=position.getZ();
			Block blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+31)).getBlock();

			//(0,32)
			world.setBlockState(new BlockPos(x,y,z+31), Blocks.COBBLESTONE.getDefaultState());
			while ((blockToReplace==Blocks.WATER
				  ||blockToReplace==Blocks.COBBLESTONE
				  ||blockToReplace==Blocks.FLOWING_WATER
				  ||blockToReplace instanceof BlockAir
				  ||blockToReplace instanceof BlockBush
				  ||blockToReplace instanceof BlockSnow
				  ||blockToReplace instanceof BlockFluidClassic
				  ||blockToReplace instanceof BlockLeaves)
				  &&y>0) {
				world.setBlockState(new BlockPos(x,y,z+31), Blocks.COBBLESTONE.getDefaultState());
				blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+31)).getBlock();
				y--;
			}
			y=position.getY();

			//(0,27)
			blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+26)).getBlock();
			world.setBlockState(new BlockPos(x,y,z+26), Blocks.COBBLESTONE.getDefaultState());
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x,y,z+26), Blocks.COBBLESTONE.getDefaultState());
				blockToReplace = world.getBlockState(new BlockPos(x,y-1,z+26)).getBlock();
				y--;
			}
			y=position.getY();

			//(14,0)
			blockToReplace = world.getBlockState(new BlockPos(x+13,y-1,z)).getBlock();
			world.setBlockState(new BlockPos(x+13,y,z), Blocks.COBBLESTONE.getDefaultState());
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x+13,y,z), Blocks.COBBLESTONE.getDefaultState());
				blockToReplace = world.getBlockState(new BlockPos(x+13,y-1,z)).getBlock();
				y--;
			}
			y=position.getY();

			//(6,0)
			blockToReplace = world.getBlockState(new BlockPos(x+5,y-1,z)).getBlock();
			world.setBlockState(new BlockPos(x+5,y,z), Blocks.COBBLESTONE.getDefaultState());
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x+5,y,z), Blocks.COBBLESTONE.getDefaultState());
				blockToReplace = world.getBlockState(new BlockPos(x+5,y-1,z)).getBlock();
				y--;
			}
			y=position.getY();

			//(14,32)
			blockToReplace = world.getBlockState(new BlockPos(x+13,y-1,z+31)).getBlock();
			world.setBlockState(new BlockPos(x+13,y,z+31), Blocks.COBBLESTONE.getDefaultState());
			while ((blockToReplace==Blocks.WATER
					  ||blockToReplace==Blocks.COBBLESTONE
					  ||blockToReplace==Blocks.FLOWING_WATER
					  ||blockToReplace instanceof BlockAir
					  ||blockToReplace instanceof BlockBush
					  ||blockToReplace instanceof BlockSnow
					  ||blockToReplace instanceof BlockFluidClassic
					  ||blockToReplace instanceof BlockLeaves)
					  &&y>0) {
				world.setBlockState(new BlockPos(x+13,y,z+31), Blocks.COBBLESTONE.getDefaultState());
				blockToReplace = world.getBlockState(new BlockPos(x+13,y-1,z+31)).getBlock();
				y--;
			}
			return true;

		}
		return false;
	}

	//check to see if the area is valid for spawning the structure
	public static boolean isAreaValid(World world, BlockPos postion)
	{
		int x = postion.getX();
		int y = postion.getY();
		int z =  postion.getZ();
		return postion.getY() > 31 
		&& ((getGroundBlock(world, x,z)==Blocks.GRASS
		&& getGroundBlock(world,x+14,z)==Blocks.GRASS
		&& getGroundBlock(world,x,z+32)==Blocks.GRASS
		&& getGroundBlock(world,x+14,z+32)==Blocks.GRASS)

		|| (getGroundBlock(world,x,z)==Blocks.SAND
		&& getGroundBlock(world,x+14,z)==Blocks.SAND
		&& getGroundBlock(world,x,z+32)==Blocks.GRASS
		&& getGroundBlock(world,x+14,z+32)==Blocks.GRASS)

		|| (getGroundBlock(world,x,z)==Blocks.SNOW
		&& getGroundBlock(world,x+14,z)==Blocks.SNOW
		&& getGroundBlock(world,x,z+32)==Blocks.SNOW
		&& getGroundBlock(world,x+14,z+32)==Blocks.SNOW)

		|| (getGroundBlock(world,x,z)==Blocks.MYCELIUM
		&& getGroundBlock(world,x+14,z)==Blocks.MYCELIUM
		&& getGroundBlock(world,x,z+32)==Blocks.MYCELIUM
		&& getGroundBlock(world,x+14,z+32)==Blocks.MYCELIUM)

		|| (getGroundBlock(world,x,z)==Blocks.WATER
		&& getGroundBlock(world,x+14,z)==Blocks.WATER
		&& getGroundBlock(world,x,z+32)==Blocks.WATER
		&& getGroundBlock(world,x+14,z+32)==Blocks.WATER));
		
	}

	//get the highest block in the area
	public static int getHighestBlock(World world, int blockX,int blockZ) {
		int[] heights = new int[92];
		int index = 0;
		for (int i=0;i<=13;i++) {
			heights[index]=getGroundFromAbove(world, blockX, blockZ);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+i+1, blockZ+32);
			index++;
		}

		for (int i=0;i<=31;i++) {
			heights[index]=getGroundFromAbove(world, blockX, blockZ+i+1);
			index++;
			heights[index]=getGroundFromAbove(world, blockX+14, blockZ+i+1);
			index++;
		}
		
		return Utils.getMaxValue(heights);
	}
}