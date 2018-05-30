package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
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
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockButtonStone;

public class Buttons {
	
	//buttons
	public static BlockButtonStone VoidButton;
	public static BlockButtonStone DirtButton;
	public static BlockButtonStone GrassButton;
	public static BlockButton GlowingObsidianButton;
	public static BlockButton EndButton;
	public static BlockButton CactusButton;
	public static BlockButton BedrockButton;
	public static BlockButton ObsidianButton;
	public static BlockButton MossyButton;
	public static BlockButton CobblestoneButton;
	public static BlockButton AcaciaButton;
	public static BlockButton BirchButton;
	public static BlockButton DarkOakButton;
	public static BlockButton JungleButton;
	public static BlockButton SpruceButton;
	public static BlockButton AndesiteButton;
	public static BlockButton DioriteButton;
	public static BlockButton GraniteButton;
	public static DiamondButtonTicks DiamondButton;
	public static EmeraldButtonTicks EmeraldButton;
	public static QuickButton RubyButton;
	public static QuickButton SilverButton;
	public static QuickButton GoldButton;
	public static IronButtonTicks IronButton;
	public static IronButtonTicks RustyButton;

	public static void initAndRegister() {
		//buttons
		Utils.regBlock(VoidButton=new VoidButton());
		Utils.regBlock(DirtButton=new DirtButton());
		Utils.regBlock(GrassButton=new GrassButton());
		Utils.regBlock(RustyButton=new RustyButton());
		Utils.regBlock(EndButton=new EndButton());
		Utils.regBlock(CactusButton=new CactusButton());
		Utils.regBlock(GlowingObsidianButton=new GlowingObsidianButton());
		Utils.regBlock(DiamondButton = new DiamondButton());
		Utils.regBlock(EmeraldButton = new EmeraldButton());
		Utils.regBlock(GoldButton = new GoldButton());
		Utils.regBlock(IronButton = new IronButton());
		Utils.regBlock(SilverButton = new SilverButton());
		Utils.regBlock(RubyButton = new RubyButton());
		Utils.regBlock(ObsidianButton = new ObsidianButton());
		Utils.regBlock(BedrockButton = new BedrockButton());
		Utils.regBlock(MossyButton = new MossyButton());
		Utils.regBlock(CobblestoneButton = new CobblestoneButton());
		Utils.regBlock(AndesiteButton = new AndesiteButton());
		Utils.regBlock(DioriteButton = new DioriteButton());
		Utils.regBlock(GraniteButton = new GraniteButton());
		Utils.regBlock(AcaciaButton = new AcaciaButton());
		Utils.regBlock(BirchButton = new BirchButton());
		Utils.regBlock(DarkOakButton = new DarkOakButton());
		Utils.regBlock(JungleButton = new JungleButton());
		Utils.regBlock(SpruceButton = new SpruceButton());
		
	}
	public static void regRenders() {
		Utils.regRender(VoidButton);
		Utils.regRender(DirtButton);
		Utils.regRender(GrassButton);
		Utils.regRender(RustyButton);
		Utils.regRender(CactusButton);
		Utils.regRender(GlowingObsidianButton);
		Utils.regRender(EndButton);
		Utils.regRender(SilverButton);
		Utils.regRender(DiamondButton);
		Utils.regRender(EmeraldButton);
		Utils.regRender(GoldButton);
		Utils.regRender(IronButton);
		Utils.regRender(RubyButton);
		Utils.regRender(BedrockButton);
		Utils.regRender(ObsidianButton);
		Utils.regRender(CobblestoneButton);
		Utils.regRender(MossyButton);
		Utils.regRender(AndesiteButton);
		Utils.regRender(DioriteButton);
		Utils.regRender(GraniteButton);
		Utils.regRender(AcaciaButton);
		Utils.regRender(BirchButton);
		Utils.regRender(DarkOakButton);
		Utils.regRender(JungleButton);
		Utils.regRender(SpruceButton);
	}
}
