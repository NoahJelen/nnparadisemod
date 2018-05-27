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

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Lamps {
	public static SaltLamp getSaltLamp()
	{
		return SaltLamp;
	}
	public static SaltLamp SaltLamp;
	//unlit lamps
	public static BlockRedstoneLight BlackRSLamp;
	public static BlockRedstoneLight BlueRSLamp;
	public static BlockRedstoneLight BrownRSLamp;
	public static BlockRedstoneLight CyanRSLamp;
	public static BlockRedstoneLight GrayRSLamp;
	public static BlockRedstoneLight GreenRSLamp;
	public static BlockRedstoneLight LightBlueRSLamp;
	public static BlockRedstoneLight LimeRSLamp;
	public static BlockRedstoneLight MagentaRSLamp;
	public static BlockRedstoneLight OrangeRSLamp;
	public static BlockRedstoneLight PinkRSLamp;
	public static BlockRedstoneLight PurpleRSLamp;
	public static BlockRedstoneLight RedRSLamp;
	public static BlockRedstoneLight SilverRSLamp;
	public static BlockRedstoneLight WhiteRSLamp;
	public static BlockRedstoneLight YellowRSLamp;
	
	//lit lamps
	public static BlockRedstoneLight LitBlackRSLamp;
	public static BlockRedstoneLight LitBlueRSLamp;
	public static BlockRedstoneLight LitBrownRSLamp;
	public static BlockRedstoneLight LitCyanRSLamp;
	public static BlockRedstoneLight LitGrayRSLamp;
	public static BlockRedstoneLight LitGreenRSLamp;
	public static BlockRedstoneLight LitLightBlueRSLamp;
	public static BlockRedstoneLight LitLimeRSLamp;
	public static BlockRedstoneLight LitMagentaRSLamp;
	public static BlockRedstoneLight LitOrangeRSLamp;
	public static BlockRedstoneLight LitPinkRSLamp;
	public static BlockRedstoneLight LitPurpleRSLamp;
	public static BlockRedstoneLight LitRedRSLamp;
	public static BlockRedstoneLight LitSilverRSLamp;
	public static BlockRedstoneLight LitWhiteRSLamp;
	public static BlockRedstoneLight LitYellowRSLamp;

	public static void initAndRegister() {
		
		Utils.regBlock(SaltLamp=new SaltLamp());
		//unlit lamps
		Utils.regBlock(BlackRSLamp = new BlackRSLamp());
		Utils.regBlock(BlueRSLamp = new BlueRSLamp());
		Utils.regBlock(BrownRSLamp = new BrownRSLamp());
		Utils.regBlock(CyanRSLamp = new CyanRSLamp());
		Utils.regBlock(GrayRSLamp = new GrayRSLamp());
		Utils.regBlock(GreenRSLamp = new GreenRSLamp());
		Utils.regBlock(LightBlueRSLamp = new LightBlueRSLamp());
		Utils.regBlock(LimeRSLamp = new LimeRSLamp());
		Utils.regBlock(MagentaRSLamp = new MagentaRSLamp());
		Utils.regBlock(OrangeRSLamp = new OrangeRSLamp());
		Utils.regBlock(PinkRSLamp = new PinkRSLamp());
		Utils.regBlock(PurpleRSLamp = new PurpleRSLamp());
		Utils.regBlock(RedRSLamp = new RedRSLamp());
		Utils.regBlock(SilverRSLamp = new SilverRSLamp());
		Utils.regBlock(WhiteRSLamp = new WhiteRSLamp());
		Utils.regBlock(YellowRSLamp = new YellowRSLamp());
		
		//lit lamps
		ForgeRegistries.BLOCKS.register(LitBlackRSLamp = new LitBlackRSLamp());
		ForgeRegistries.BLOCKS.register(LitBlueRSLamp = new LitBlueRSLamp());
		ForgeRegistries.BLOCKS.register(LitBrownRSLamp = new LitBrownRSLamp());
		ForgeRegistries.BLOCKS.register(LitCyanRSLamp = new LitCyanRSLamp());
		ForgeRegistries.BLOCKS.register(LitGrayRSLamp = new LitGrayRSLamp());
		ForgeRegistries.BLOCKS.register(LitGreenRSLamp = new LitGreenRSLamp());
		ForgeRegistries.BLOCKS.register(LitLightBlueRSLamp = new LitLightBlueRSLamp());
		ForgeRegistries.BLOCKS.register(LitLimeRSLamp = new LitLimeRSLamp());
		ForgeRegistries.BLOCKS.register(LitMagentaRSLamp = new LitMagentaRSLamp());
		ForgeRegistries.BLOCKS.register(LitOrangeRSLamp = new LitOrangeRSLamp());
		ForgeRegistries.BLOCKS.register(LitPinkRSLamp = new LitPinkRSLamp());
		ForgeRegistries.BLOCKS.register(LitPurpleRSLamp = new LitPurpleRSLamp());
		ForgeRegistries.BLOCKS.register(LitRedRSLamp = new LitRedRSLamp());
		ForgeRegistries.BLOCKS.register(LitSilverRSLamp = new LitSilverRSLamp());
		ForgeRegistries.BLOCKS.register(LitWhiteRSLamp = new LitWhiteRSLamp());
		ForgeRegistries.BLOCKS.register(LitYellowRSLamp = new LitYellowRSLamp());

	}
	public static void regRenders() {		
		Utils.regRender(SaltLamp);
		Utils.regRender(BlackRSLamp);
		Utils.regRender(BlueRSLamp);
		Utils.regRender(BrownRSLamp);
		Utils.regRender(CyanRSLamp);
		Utils.regRender(GrayRSLamp);
		Utils.regRender(GreenRSLamp);
		Utils.regRender(LightBlueRSLamp);
		Utils.regRender(LimeRSLamp);
		Utils.regRender(MagentaRSLamp);
		Utils.regRender(OrangeRSLamp);
		Utils.regRender(PinkRSLamp);
		Utils.regRender(PurpleRSLamp);
		Utils.regRender(RedRSLamp);
		Utils.regRender(SilverRSLamp);
		Utils.regRender(WhiteRSLamp);
		Utils.regRender(YellowRSLamp);
		
	}
}
