package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.ores.CoalOreVoid;
import com.NetherNoah.ParadiseMod.blocks.ores.EnderPearlOre;
import com.NetherNoah.ParadiseMod.blocks.ores.GoldOreNether;
import com.NetherNoah.ParadiseMod.blocks.ores.GoldOreVoid;
import com.NetherNoah.ParadiseMod.blocks.ores.IronOreVoid;
import com.NetherNoah.ParadiseMod.blocks.ores.RubyOre;
import com.NetherNoah.ParadiseMod.blocks.ores.RubyOreEnd;
import com.NetherNoah.ParadiseMod.blocks.ores.SaltOre;
import com.NetherNoah.ParadiseMod.blocks.ores.SilverOre;
import com.NetherNoah.ParadiseMod.blocks.ores.SilverOreNether;
import com.NetherNoah.ParadiseMod.blocks.ores.SilverOreVoid;
import com.NetherNoah.ParadiseMod.blocks.ores.VoidPearlOre;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.BlockRuby;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.BlockRustyIron;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.SaltBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.SilverBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.blazeBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.endPearlBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.sugarBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.voidPearlBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;

public class Ores {
	//resource blocks
	public static Block RustyIronBlock;
	public static Block blazeBlock;
	public static BlockFalling sugarBlock;
	public static Block RubyBlock;
	public static Block SilverBlock;
	public static Block SaltBlock;
	public static Block endPearlBlock;
	public static Block voidPearlBlock;
	
	//ores
	public static Block SilverOreVoid;
	public static Block CoalOreVoid;
	public static Block GoldOreVoid;
	public static Block IronOreVoid;
	public static Block EnderPearlOre;
	public static Block SilverOreNether;
	public static Block GoldOreNether;
	public static Block RubyOre;
	public static Block EndRubyOre;
	public static Block SilverOre;
	public static Block SaltOre;
	public static Block VoidPearlOre;

	public static void initAndRegister() {
		
		//ores
		Utils.regBlock(VoidPearlOre=new VoidPearlOre());
		Utils.regBlock(CoalOreVoid=new CoalOreVoid());
		Utils.regBlock(GoldOreVoid=new GoldOreVoid());
		Utils.regBlock(IronOreVoid=new IronOreVoid());
		Utils.regBlock(SilverOreVoid=new SilverOreVoid());
		Utils.regBlock(EnderPearlOre=new EnderPearlOre());
		Utils.regBlock(EndRubyOre = new RubyOreEnd());
		Utils.regBlock(SilverOreNether=new SilverOreNether());
		Utils.regBlock(GoldOreNether=new GoldOreNether());
		Utils.regBlock(RubyOre = new RubyOre());
		Utils.regBlock(SilverOre=new SilverOre());
		Utils.regBlock(SaltOre=new SaltOre());
		
		//resource blocks
		Utils.regBlock(voidPearlBlock=new voidPearlBlock());
		Utils.regBlock(blazeBlock=new blazeBlock());
		Utils.regBlock(sugarBlock=new sugarBlock());
		Utils.regBlock(RubyBlock = new BlockRuby());
		Utils.regBlock(SilverBlock=new SilverBlock());
		Utils.regBlock(SaltBlock=new SaltBlock());
		Utils.regBlock(endPearlBlock=new endPearlBlock());
		Utils.regBlock(RustyIronBlock=new BlockRustyIron());
	}
	public static void regRenders() {
		Utils.regRender(voidPearlBlock);
		Utils.regRender(VoidPearlOre);
		Utils.regRender(SilverOreVoid);
		Utils.regRender(CoalOreVoid);
		Utils.regRender(GoldOreVoid);
		Utils.regRender(IronOreVoid);
		Utils.regRender(EnderPearlOre);
		Utils.regRender(EndRubyOre);
		Utils.regRender(SilverOreNether);
		Utils.regRender(GoldOreNether);
		Utils.regRender(SaltOre);
		Utils.regRender(SilverOre);
		Utils.regRender(RubyOre);
		Utils.regRender(sugarBlock);
		Utils.regRender(blazeBlock);
		Utils.regRender(SilverBlock);
		Utils.regRender(RubyBlock);
		Utils.regRender(SaltBlock);
		Utils.regRender(RustyIronBlock);
		Utils.regRender(endPearlBlock);
		
	}
}
