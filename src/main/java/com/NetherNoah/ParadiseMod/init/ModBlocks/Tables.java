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
