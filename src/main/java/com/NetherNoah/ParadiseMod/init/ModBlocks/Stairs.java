package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.misc.BedrockStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.EndStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.GlowingObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.ObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidBrickStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidStairs;
import net.minecraft.block.BlockStairs;

public class Stairs {
	//stairs
	public static BlockStairs BedrockStairs;
	public static BlockStairs EndStairs;
	public static BlockStairs ObsidianStairs;
	public static BlockStairs GlowingObsidianStairs;
	public static BlockStairs CactusStairs;
	public static BlockStairs VoidStairs;
	public static BlockStairs VoidBrickStairs;

	public static void initAndRegister() {
		//stairs
		Utils.regBlock(CactusStairs=new CactusStairs());
		Utils.regBlock(EndStairs=new EndStairs());
		Utils.regBlock(BedrockStairs=new BedrockStairs());
		Utils.regBlock(ObsidianStairs=new ObsidianStairs());
		Utils.regBlock(GlowingObsidianStairs=new GlowingObsidianStairs());
		Utils.regBlock(VoidStairs=new VoidStairs());
		Utils.regBlock(VoidBrickStairs=new VoidBrickStairs());
	}
	public static void regRenders() {
		Utils.regRender(VoidStairs);
		Utils.regRender(CactusStairs);
		Utils.regRender(EndStairs);
		Utils.regRender(ObsidianStairs);
		Utils.regRender(GlowingObsidianStairs);
		Utils.regRender(BedrockStairs);
		Utils.regRender(VoidBrickStairs);
	}
}
