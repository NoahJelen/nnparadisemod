package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.misc.SaltLamp;
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

import net.minecraft.block.BlockRedstoneLight;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Lamps {
	public static SaltLamp getSaltLamp()
	{
		return SaltLamp;
	}
	public static SaltLamp SaltLamp;

	//lit lamps
	public static BlockRedstoneLight LitBlackLamp;
	public static BlockRedstoneLight LitBlueLamp;
	public static BlockRedstoneLight LitBrownLamp;
	public static BlockRedstoneLight LitCyanLamp;
	public static BlockRedstoneLight LitGrayLamp;
	public static BlockRedstoneLight LitGreenLamp;
	public static BlockRedstoneLight LitLightBlueLamp;
	public static BlockRedstoneLight LitLimeLamp;
	public static BlockRedstoneLight LitMagentaLamp;
	public static BlockRedstoneLight LitOrangeLamp;
	public static BlockRedstoneLight LitPinkLamp;
	public static BlockRedstoneLight LitPurpleLamp;
	public static BlockRedstoneLight LitRedLamp;
	public static BlockRedstoneLight LitSilverLamp;
	public static BlockRedstoneLight LitWhiteLamp;
	public static BlockRedstoneLight LitYellowLamp;

	//unlit lamps
	public static BlockRedstoneLight BlackLamp;
	public static BlockRedstoneLight BlueLamp;
	public static BlockRedstoneLight BrownLamp;
	public static BlockRedstoneLight CyanLamp;
	public static BlockRedstoneLight GrayLamp;
	public static BlockRedstoneLight GreenLamp;
	public static BlockRedstoneLight LightBlueLamp;
	public static BlockRedstoneLight LimeLamp;
	public static BlockRedstoneLight MagentaLamp;
	public static BlockRedstoneLight OrangeLamp;
	public static BlockRedstoneLight PinkLamp;
	public static BlockRedstoneLight PurpleLamp;
	public static BlockRedstoneLight RedLamp;
	public static BlockRedstoneLight SilverLamp;
	public static BlockRedstoneLight WhiteLamp;
	public static BlockRedstoneLight YellowLamp;


	public static void initAndRegister() {
		Utils.regBlock(SaltLamp=new SaltLamp());

		//lit lamps
		ForgeRegistries.BLOCKS.register(LitBlackLamp = new LitBlackRSLamp());
		ForgeRegistries.BLOCKS.register(LitBlueLamp = new LitBlueRSLamp());
		ForgeRegistries.BLOCKS.register(LitBrownLamp = new LitBrownRSLamp());
		ForgeRegistries.BLOCKS.register(LitCyanLamp = new LitCyanRSLamp());
		ForgeRegistries.BLOCKS.register(LitGrayLamp = new LitGrayRSLamp());
		ForgeRegistries.BLOCKS.register(LitGreenLamp = new LitGreenRSLamp());
		ForgeRegistries.BLOCKS.register(LitLightBlueLamp = new LitLightBlueRSLamp());
		ForgeRegistries.BLOCKS.register(LitLimeLamp = new LitLimeRSLamp());
		ForgeRegistries.BLOCKS.register(LitMagentaLamp = new LitMagentaRSLamp());
		ForgeRegistries.BLOCKS.register(LitOrangeLamp = new LitOrangeRSLamp());
		ForgeRegistries.BLOCKS.register(LitPinkLamp = new LitPinkRSLamp());
		ForgeRegistries.BLOCKS.register(LitPurpleLamp = new LitPurpleRSLamp());
		ForgeRegistries.BLOCKS.register(LitRedLamp = new LitRedRSLamp());
		ForgeRegistries.BLOCKS.register(LitSilverLamp = new LitSilverRSLamp());
		ForgeRegistries.BLOCKS.register(LitWhiteLamp = new LitWhiteRSLamp());
		ForgeRegistries.BLOCKS.register(LitYellowLamp = new LitYellowRSLamp());

		//unlit lamps
		Utils.regBlock(BlackLamp = new BlackRSLamp());
		Utils.regBlock(BlueLamp = new BlueRSLamp());
		Utils.regBlock(BrownLamp = new BrownRSLamp());
		Utils.regBlock(CyanLamp = new CyanRSLamp());
		Utils.regBlock(GrayLamp = new GrayRSLamp());
		Utils.regBlock(GreenLamp = new GreenRSLamp());
		Utils.regBlock(LightBlueLamp = new LightBlueRSLamp());
		Utils.regBlock(LimeLamp = new LimeRSLamp());
		Utils.regBlock(MagentaLamp = new MagentaRSLamp());
		Utils.regBlock(OrangeLamp = new OrangeRSLamp());
		Utils.regBlock(PinkLamp = new PinkRSLamp());
		Utils.regBlock(PurpleLamp = new PurpleRSLamp());
		Utils.regBlock(RedLamp = new RedRSLamp());
		Utils.regBlock(SilverLamp = new SilverRSLamp());
		Utils.regBlock(WhiteLamp = new WhiteRSLamp());
		Utils.regBlock(YellowLamp = new YellowRSLamp());
	}

	public static void regRenders() {
		Utils.regRender(BlackLamp);
		Utils.regRender(BlueLamp);
		Utils.regRender(BrownLamp);
		Utils.regRender(CyanLamp);
		Utils.regRender(GrayLamp);
		Utils.regRender(GreenLamp);
		Utils.regRender(LightBlueLamp);
		Utils.regRender(LimeLamp);
		Utils.regRender(MagentaLamp);
		Utils.regRender(OrangeLamp);
		Utils.regRender(PinkLamp);
		Utils.regRender(PurpleLamp);
		Utils.regRender(RedLamp);
		Utils.regRender(SaltLamp);
		Utils.regRender(SilverLamp);
		Utils.regRender(WhiteLamp);
		Utils.regRender(YellowLamp);
	}
}