package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;
import com.NetherNoah.ParadiseMod.blocks.fences.BedrockWall;
import com.NetherNoah.ParadiseMod.blocks.fences.EndWall;
import com.NetherNoah.ParadiseMod.blocks.fences.GlowingObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.ObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.VoidWall;

public class Walls {
	//walls
	public static CustomWall BedrockWall;
	public static CustomWall GlowingObsidianWall;
	public static CustomWall ObsidianWall;
	public static CustomWall EndWall;
	public static CustomWall VoidWall;

	public static void initAndRegister() {
		
		//walls
		Utils.regBlock(VoidWall=new VoidWall());
		Utils.regBlock(GlowingObsidianWall=new GlowingObsidianWall());
		Utils.regBlock(BedrockWall = new BedrockWall());
		Utils.regBlock(ObsidianWall = new ObsidianWall());
		Utils.regBlock(EndWall=new EndWall());
	}
	public static void regRenders() {
		Utils.regRender(VoidWall);
		Utils.regRender(GlowingObsidianWall);
		Utils.regRender(EndWall);
		Utils.regRender(BedrockWall);
		Utils.regRender(ObsidianWall);
	}
}
