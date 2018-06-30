package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.slabs.CactusSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.CactusSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.EndSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.EndSlabDouble;
import com.NetherNoah.ParadiseMod.blocks.slabs.GlowingObsidianSlab;
import com.NetherNoah.ParadiseMod.blocks.slabs.GlowingObsidianSlabDouble;

import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Slabs {
	public static CactusSlab cactus_slab;
	public static CactusSlabDouble cactus_slab_double;
	public static EndSlab end_slab;
	public static EndSlabDouble end_slab_double;
	public static GlowingObsidianSlab glowing_obsidian_slab;
	public static GlowingObsidianSlabDouble glowing_obsidian_slab_double;
	public static void initAndRegister() {
		regSlab(end_slab=new EndSlab("end_slab"), end_slab_double=new EndSlabDouble());
		regSlab(cactus_slab=new CactusSlab("cactus_slab"),cactus_slab_double=new CactusSlabDouble());
		regSlab(glowing_obsidian_slab=new GlowingObsidianSlab("glowing_obsidian_slab"),glowing_obsidian_slab_double=new GlowingObsidianSlabDouble());
	}
	
	public static void regRenders() {
		Utils.regRender(end_slab);
		Utils.regRender(cactus_slab);
		Utils.regRender(glowing_obsidian_slab);
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
