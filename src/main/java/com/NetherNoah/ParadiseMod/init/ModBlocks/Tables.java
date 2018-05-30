package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchAcacia;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchBirch;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchCactus;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchDarkOak;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchJungle;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchSpruce;

public class Tables {
	//crafting tables
	public static CustomWorkBench CustomWorkbenchCactus;
	public static CustomWorkBench CustomWorkbenchAcacia;
	public static CustomWorkBench CustomWorkbenchBirch;
	public static CustomWorkBench CustomWorkbenchDarkOak;
	public static CustomWorkBench CustomWorkbenchJungle;
	public static CustomWorkBench CustomWorkbenchSpruce;

	public static void initAndRegister() {
		
		//crafting tables
		Utils.regBlock(CustomWorkbenchCactus=new CustomWorkbenchCactus());
		Utils.regBlock(CustomWorkbenchAcacia = new CustomWorkbenchAcacia());
		Utils.regBlock(CustomWorkbenchBirch = new CustomWorkbenchBirch());
		Utils.regBlock(CustomWorkbenchDarkOak = new CustomWorkbenchDarkOak());
		Utils.regBlock(CustomWorkbenchJungle = new CustomWorkbenchJungle());
		Utils.regBlock(CustomWorkbenchSpruce = new CustomWorkbenchSpruce());
	}
	public static void regRenders() {
		Utils.regRender(CustomWorkbenchCactus);
		Utils.regRender(CustomWorkbenchAcacia);
		Utils.regRender(CustomWorkbenchBirch);
		Utils.regRender(CustomWorkbenchDarkOak);
		Utils.regRender(CustomWorkbenchJungle);
		Utils.regRender(CustomWorkbenchSpruce);
		Utils.regRender(CustomWorkbenchAcacia);
	}
}
