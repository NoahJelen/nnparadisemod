package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.chests.CactusChest;
import com.NetherNoah.ParadiseMod.blocks.chests.CactusChestTrapped;
import com.NetherNoah.ParadiseMod.blocks.chests.CompressedCactusChest;
import com.NetherNoah.ParadiseMod.blocks.chests.CompressedCactusChestTrapped;
import net.minecraft.block.Block;

public class Chests {
	//chests
	public static Block CactusChest;
	public static Block CactusChestTrapped;
	public static Block CompressedCactusChest;
	public static Block CompressedCactusChestTrapped;

	public static void initAndRegister() {
		//chests
		Utils.regBlock(CactusChest = new CactusChest());
		Utils.regBlock(CactusChestTrapped = new CactusChestTrapped());
		Utils.regBlock(CompressedCactusChest=new CompressedCactusChest());
		Utils.regBlock(CompressedCactusChestTrapped=new CompressedCactusChestTrapped());
	}
	public static void regRenders() {
		Utils.regRender(CactusChest);
		Utils.regRender(CactusChestTrapped);
		Utils.regRender(CompressedCactusChest);
		Utils.regRender(CompressedCactusChestTrapped);
	}
}
