package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.BrickFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.CactusFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.DiamondFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.EmeraldFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.GoldFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.IronFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RedstoneFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RubyFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RustyFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.SilverFenceGate;

import net.minecraft.block.BlockFenceGate;

public class Gates {
	
	//fence gates
	public static BlockFenceGate RustyFenceGate;
	public static BlockFenceGate BlockCactusFenceGate;
	public static BlockFenceGate BlockSilverFenceGate;
	public static BlockFenceGate BlockBrickFenceGate;
	public static BlockFenceGate BlockDiamondFenceGate;
	public static BlockFenceGate BlockEmeraldFenceGate;
	public static BlockFenceGate BlockGoldFenceGate;
	public static BlockFenceGate BlockIronFenceGate;
	public static BlockFenceGate BlockRubyFenceGate;
	public static RSFenceGate BlockRedstoneFenceGate;

	public static void initAndRegister() {
		
		//fence gates
		Utils.regBlock(RustyFenceGate=new RustyFenceGate());
		Utils.regBlock(BlockCactusFenceGate=new CactusFenceGate());
		Utils.regBlock(BlockSilverFenceGate=new SilverFenceGate());
		Utils.regBlock(BlockBrickFenceGate = new BrickFenceGate());
		Utils.regBlock(BlockDiamondFenceGate = new DiamondFenceGate());
		Utils.regBlock(BlockEmeraldFenceGate = new EmeraldFenceGate());
		Utils.regBlock(BlockGoldFenceGate = new GoldFenceGate());
		Utils.regBlock(BlockIronFenceGate = new IronFenceGate());
		Utils.regBlock(BlockRubyFenceGate = new RubyFenceGate());
		Utils.regBlock(BlockRedstoneFenceGate = new RedstoneFenceGate());

	}
	public static void regRenders() {		
		Utils.regRender(RustyFenceGate);
		Utils.regRender(BlockCactusFenceGate);
		Utils.regRender(BlockBrickFenceGate);
		Utils.regRender(BlockDiamondFenceGate);
		Utils.regRender(BlockEmeraldFenceGate);
		Utils.regRender(BlockSilverFenceGate);
		Utils.regRender(BlockGoldFenceGate);
		Utils.regRender(BlockIronFenceGate);
		Utils.regRender(BlockRubyFenceGate);
		Utils.regRender(BlockRedstoneFenceGate);
		
	}
}
