package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.DiamondButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.EmeraldButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.IronButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.QuickButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.BedrockButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.CobblestoneButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.DiamondButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.DirtButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.EmeraldButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.EndButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.GlowingObsidianButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.GoldButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.GrassButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.IronButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.MossyButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.ObsidianButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.RubyButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.RustyButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.SilverButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.VoidButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.stoneVariants.AndesiteButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.stoneVariants.DioriteButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.stoneVariants.GraniteButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.AcaciaButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.BirchButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.CactusButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.DarkOakButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.JungleButton;
import com.NetherNoah.ParadiseMod.blocks.buttons.wood.SpruceButton;
import com.NetherNoah.ParadiseMod.blocks.chests.CactusChest;
import com.NetherNoah.ParadiseMod.blocks.chests.CactusChestTrapped;
import com.NetherNoah.ParadiseMod.blocks.chests.CompressedCactusChest;
import com.NetherNoah.ParadiseMod.blocks.chests.CompressedCactusChestTrapped;
import com.NetherNoah.ParadiseMod.blocks.crystals.diamondCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.emeraldCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.quartzCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.redstoneCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.rubyCrystal;
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
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchAcacia;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchBirch;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchCactus;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchDarkOak;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchJungle;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchSpruce;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Chests {
	//chests
	public static Block CactusChest;
	public static Block CactusChestTrapped;
	public static Block CompressedCactusChest;
	public static Block CompressedCactusChestTrapped;

	public static void initAndRegister() {
		
		//chests
		Utils.regBlock(CompressedCactusChest=new CompressedCactusChest());
		Utils.regBlock(CompressedCactusChestTrapped=new CompressedCactusChestTrapped());
		Utils.regBlock(CactusChest = new CactusChest());
		Utils.regBlock(CactusChestTrapped = new CactusChestTrapped());
		
	}
	public static void regRenders() {
		Utils.regRender(CompressedCactusChest);
		Utils.regRender(CompressedCactusChestTrapped);
		Utils.regRender(CactusChest);
		Utils.regRender(CactusChestTrapped);
		
	}
}
