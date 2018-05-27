package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;
import com.NetherNoah.ParadiseMod.blocks.crystals.diamondCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.emeraldCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.quartzCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.redstoneCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.rubyCrystal;
import com.NetherNoah.ParadiseMod.blocks.fences.BedrockWall;
import com.NetherNoah.ParadiseMod.blocks.fences.EndWall;
import com.NetherNoah.ParadiseMod.blocks.fences.GlowingObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.ObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.VoidWall;
import com.NetherNoah.ParadiseMod.blocks.misc.BedrockStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.EndStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.GlowingObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.ObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.SaltLamp;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidBrickStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidStairs;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.BlackRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.BlueRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.BrownRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.CyanRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.GrayRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.GreenRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.LightBlueRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.LimeRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.MagentaRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.OrangeRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.PinkRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.PurpleRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.RedRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.SilverRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.WhiteRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.YellowRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitBlackRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitBlueRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitBrownRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitCyanRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitGrayRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitGreenRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitLightBlueRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitLimeRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitMagentaRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitOrangeRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitPinkRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitPurpleRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitRedRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitSilverRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitWhiteRSLamp;
import com.NetherNoah.ParadiseMod.blocks.redstone.lamps.lit.LitYellowRSLamp;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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
