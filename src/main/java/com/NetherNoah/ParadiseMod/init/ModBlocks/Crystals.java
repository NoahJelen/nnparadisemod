package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.crystals.diamondCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.emeraldCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.quartzCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.redstoneCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.rubyCrystal;
import net.minecraft.block.BlockBush;

public class Crystals {
	//crystals
	public static BlockBush diamondCrystal;
	public static BlockBush emeraldCrystal;
	public static BlockBush quartzCrystal;
	public static BlockBush redstoneCrystal;
	public static BlockBush rubyCrystal;

	public static void initAndRegister() {
		
		//crystals
		Utils.regBlock(diamondCrystal = new diamondCrystal());
		Utils.regBlock(emeraldCrystal = new emeraldCrystal());
		Utils.regBlock(quartzCrystal = new quartzCrystal());
		Utils.regBlock(redstoneCrystal = new redstoneCrystal());
		Utils.regBlock(rubyCrystal = new rubyCrystal());

	}
	public static void regRenders() {
		Utils.regRender(diamondCrystal);
		Utils.regRender(emeraldCrystal);
		Utils.regRender(quartzCrystal);
		Utils.regRender(redstoneCrystal);
		Utils.regRender(rubyCrystal);
		
	}
}
