package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RubyPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.BedrockPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.DiamondPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.EmeraldPlateCode;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.BedrockPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.CobblestonePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.DiamondPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.DirtPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.EmeraldPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.EndPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.GlowingObsidianPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.GrassPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.MossyPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.RubyPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.RustyPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.SilverPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.VoidPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.AndesitePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.DioritePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.GranitePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.AcaciaPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.BirchPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.CactusPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.DarkOakPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.JunglePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.SprucePlate;
import net.minecraft.block.BlockPressurePlate;

public class Plates {
	
	//pressure plates
	public static BlockPressurePlate VoidPlate;
	public static BlockPressurePlate DirtPlate;
	public static BlockPressurePlate GrassPlate;
	public static BedrockPlateCode GlowingObsidianPlate;
	public static DiamondPlateCode DiamondPlate;
	public static EmeraldPlateCode EmeraldPlate;
	public static RubyPlateCode SilverPlate;
	public static RubyPlateCode RubyPlate;
	public static BedrockPlateCode BedrockPlate;
	public static BlockPressurePlate CactusPlate;
	public static BlockPressurePlate CobblestonePlate;
	public static BlockPressurePlate MossyPlate;
	public static BlockPressurePlate AcaciaPlate;
	public static BlockPressurePlate BirchPlate;
	public static BlockPressurePlate DarkOakPlate;
	public static BlockPressurePlate JunglePlate;
	public static BlockPressurePlate SprucePlate;
	public static BlockPressurePlate AndesitePlate;
	public static BlockPressurePlate DioritePlate;
	public static BlockPressurePlate GranitePlate;
	public static BlockPressurePlate EndPlate;
	public static BlockPressurePlate RustyPlate;

	public static void initAndRegister() {
		
		//pressure plates
		Utils.regBlock(VoidPlate=new VoidPlate());
		Utils.regBlock(DirtPlate=new DirtPlate());
		Utils.regBlock(GrassPlate=new GrassPlate());
		Utils.regBlock(CactusPlate=new CactusPlate());
		Utils.regBlock(EndPlate=new EndPlate());
		Utils.regBlock(GlowingObsidianPlate=new GlowingObsidianPlate());
		Utils.regBlock(DiamondPlate = new DiamondPlate());
		Utils.regBlock(EmeraldPlate = new EmeraldPlate());
		Utils.regBlock(SilverPlate = new SilverPlate());
		Utils.regBlock(RubyPlate = new RubyPlate());
		Utils.regBlock(BedrockPlate = new BedrockPlate());
		Utils.regBlock(MossyPlate = new MossyPlate());
		Utils.regBlock(CobblestonePlate = new CobblestonePlate());
		Utils.regBlock(AndesitePlate = new AndesitePlate());
		Utils.regBlock(DioritePlate = new DioritePlate());
		Utils.regBlock(GranitePlate = new GranitePlate());
		Utils.regBlock(AcaciaPlate = new AcaciaPlate());
		Utils.regBlock(BirchPlate = new BirchPlate());
		Utils.regBlock(DarkOakPlate = new DarkOakPlate());
		Utils.regBlock(JunglePlate = new JunglePlate());
		Utils.regBlock(SprucePlate = new SprucePlate());
		Utils.regBlock(RustyPlate=new RustyPlate());

	}
	public static void regRenders() {		
		Utils.regRender(VoidPlate);
		Utils.regRender(DirtPlate);
		Utils.regRender(GrassPlate);
		Utils.regRender(RustyPlate);
		Utils.regRender(CactusPlate);
		Utils.regRender(GlowingObsidianPlate);
		Utils.regRender(EndPlate);
		Utils.regRender(SilverPlate);
		Utils.regRender(DiamondPlate);
		Utils.regRender(EmeraldPlate);
		Utils.regRender(RubyPlate);
		Utils.regRender(BedrockPlate);
		Utils.regRender(MossyPlate);
		Utils.regRender(CobblestonePlate);
		Utils.regRender(AndesitePlate);
		Utils.regRender(DioritePlate);
		Utils.regRender(GranitePlate);
		Utils.regRender(AcaciaPlate);
		Utils.regRender(BirchPlate);
		Utils.regRender(DarkOakPlate);
		Utils.regRender(JunglePlate);
		Utils.regRender(SprucePlate);
	}
}
