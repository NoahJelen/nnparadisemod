package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.slabs.BedrockSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.CactusSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.EndSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.GlowingObsidianSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.ObsidianSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.VoidBrickSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.VoidSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.BedrockSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.CactusSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.EndSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.GlowingObsidianSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.ObsidianSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.VoidBrickSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.double_slabs.VoidSlabDouble;

import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Slabs {
	public static CactusSlab cactus_slab;
	public static CactusSlabDouble cactus_slab_double;
	
	public static BedrockSlab bedrock_slab;
	public static BedrockSlabDouble bedrock_slab_double;
	
	public static EndSlab end_slab;
	public static EndSlabDouble end_slab_double;
	
	public static GlowingObsidianSlab glowing_obsidian_slab;
	public static GlowingObsidianSlabDouble glowing_obsidian_slab_double;
	
	public static ObsidianSlab obsidian_slab;
	public static ObsidianSlabDouble obsidian_slab_double;
	
	public static VoidSlab void_slab;
	public static VoidSlabDouble void_slab_double;
	
	public static VoidBrickSlab void_bricks_slab;
	public static VoidBrickSlabDouble void_bricks_slab_double;
	
	public static void initAndRegister() {
		regSlab(bedrock_slab= new BedrockSlab("bedrock_slab"),bedrock_slab_double=new BedrockSlabDouble());
		regSlab(end_slab=new EndSlab("end_slab"), end_slab_double=new EndSlabDouble());
		regSlab(cactus_slab=new CactusSlab("cactus_slab"),cactus_slab_double=new CactusSlabDouble());
		regSlab(glowing_obsidian_slab=new GlowingObsidianSlab("glowing_obsidian_slab"),glowing_obsidian_slab_double=new GlowingObsidianSlabDouble());
		regSlab(obsidian_slab=new ObsidianSlab("obsidian_slab"),obsidian_slab_double=new ObsidianSlabDouble());
		regSlab(void_slab=new VoidSlab("void_slab"),void_slab_double=new VoidSlabDouble());
		regSlab(void_bricks_slab=new VoidBrickSlab("void_bricks_slab"),void_bricks_slab_double=new VoidBrickSlabDouble());
	}
	
	public static void regRenders() {
		Utils.regRender(end_slab);
		Utils.regRender(cactus_slab);
		Utils.regRender(glowing_obsidian_slab);
		Utils.regRender(bedrock_slab);
		Utils.regRender(obsidian_slab);
		Utils.regRender(void_slab);
		Utils.regRender(void_bricks_slab);
	}

	/**
	 *Registers a slab with its double and item
	 */
	public static void regSlab(BlockSlab slab,BlockSlab doubleSlab) {
		ForgeRegistries.BLOCKS.register(doubleSlab);
		ForgeRegistries.BLOCKS.register(slab);
		ItemBlock item = new ItemSlab(slab, slab, doubleSlab);
		item.setRegistryName(slab.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}
}
