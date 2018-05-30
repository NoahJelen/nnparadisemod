package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.fences.BrickFence;
import com.NetherNoah.ParadiseMod.blocks.fences.CactusFence;
import com.NetherNoah.ParadiseMod.blocks.fences.DiamondFence;
import com.NetherNoah.ParadiseMod.blocks.fences.EmeraldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.GoldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.IronFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RedstoneFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RubyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RustyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.SilverFence;
import net.minecraft.block.BlockFence;

public class Fences {
	
	//fences
	public static BlockFence RustyFence;
	public static BlockFence BlockCactusFence;
	public static BlockFence BlockSilverFence;
	public static BlockFence BlockBrickFence;
	public static BlockFence BlockDiamondFence;
	public static BlockFence BlockEmeraldFence;
	public static BlockFence BlockGoldFence;
	public static BlockFence BlockIronFence;
	public static BlockFence BlockRubyFence;
	public static BlockFence BlockRedstoneFence;

	public static void initAndRegister() {
		//fences
		Utils.regBlock(RustyFence=new RustyFence());
		Utils.regBlock(BlockCactusFence=new CactusFence());
		Utils.regBlock(BlockSilverFence=new SilverFence());
		Utils.regBlock(BlockBrickFence = new BrickFence());
		Utils.regBlock(BlockDiamondFence = new DiamondFence());
		Utils.regBlock(BlockEmeraldFence = new EmeraldFence());
		Utils.regBlock(BlockGoldFence = new GoldFence());
		Utils.regBlock(BlockIronFence = new IronFence());
		Utils.regBlock(BlockRubyFence = new RubyFence());
		Utils.regBlock(BlockRedstoneFence = new RedstoneFence());

		
	}
	public static void regRenders() {
		Utils.regRender(RustyFence);
		Utils.regRender(BlockCactusFence);
		Utils.regRender(BlockSilverFence);
		Utils.regRender(BlockBrickFence);
		Utils.regRender(BlockDiamondFence);
		Utils.regRender(BlockEmeraldFence);
		Utils.regRender(BlockGoldFence);
		Utils.regRender(BlockIronFence);
		Utils.regRender(BlockRubyFence);
		Utils.regRender(BlockRedstoneFence);
		
	}
}
