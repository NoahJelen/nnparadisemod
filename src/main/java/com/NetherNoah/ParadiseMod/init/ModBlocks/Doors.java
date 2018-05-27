package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.CustomBlockCode.RSDoor;
import com.NetherNoah.ParadiseMod.blocks.crystals.diamondCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.emeraldCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.quartzCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.redstoneCrystal;
import com.NetherNoah.ParadiseMod.blocks.crystals.rubyCrystal;
import com.NetherNoah.ParadiseMod.blocks.doors.AndesiteDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.BedrockDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.CactusDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.CobblestoneDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.DiamondDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.DioriteDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.EmeraldDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.EndDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.GlassDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.GlowingObsidianDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.GoldDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.GraniteDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.MossStoneDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.ObsidianDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.RedstoneDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.RubyDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.RustyDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.SilverDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.StoneDoor;
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
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Doors {
	//doors
	public static BlockDoor BlockCactusDoor;
	public static BlockDoor BlockEndDoor;
	public static BlockDoor BlockSilverDoor;
	public static BlockDoor BlockGlassDoor;
	public static BlockDoor BlockGoldDoor;
	public static BlockDoor BlockDiamondDoor;
	public static BlockDoor BlockEmeraldDoor;
	public static BlockDoor BlockAndesiteDoor;
	public static BlockDoor BlockDioriteDoor;
	public static BlockDoor BlockGraniteDoor;
	public static BlockDoor BlockStoneDoor;
	public static BlockDoor BlockCobblestoneDoor;
	public static BlockDoor BlockMossStoneDoor;
	public static BlockDoor BlockGlowingObsidianDoor;
	public static BlockDoor BlockObsidianDoor;
	public static BlockDoor BlockBedrockDoor;
	public static BlockDoor BlockRubyDoor;
	public static RSDoor BlockRedstoneDoor;
	public static BlockDoor RustyDoor;;

	public static void initAndRegister() {
		
		// door blocks
		// they don't need their own items
		ForgeRegistries.BLOCKS.register(RustyDoor=new RustyDoor());
		ForgeRegistries.BLOCKS.register(BlockCactusDoor=new CactusDoor());
		ForgeRegistries.BLOCKS.register(BlockGlowingObsidianDoor=new GlowingObsidianDoor());
		ForgeRegistries.BLOCKS.register(BlockEndDoor=new EndDoor());
		ForgeRegistries.BLOCKS.register(BlockSilverDoor=new SilverDoor());
		ForgeRegistries.BLOCKS.register(BlockGlassDoor = new GlassDoor());
		ForgeRegistries.BLOCKS.register(BlockGoldDoor = new GoldDoor());
		ForgeRegistries.BLOCKS.register(BlockDiamondDoor = new DiamondDoor());
		ForgeRegistries.BLOCKS.register(BlockEmeraldDoor = new EmeraldDoor());
		ForgeRegistries.BLOCKS.register(BlockAndesiteDoor = new AndesiteDoor());
		ForgeRegistries.BLOCKS.register(BlockDioriteDoor = new DioriteDoor());
		ForgeRegistries.BLOCKS.register(BlockGraniteDoor = new GraniteDoor());
		ForgeRegistries.BLOCKS.register(BlockStoneDoor = new StoneDoor());
		ForgeRegistries.BLOCKS.register(BlockCobblestoneDoor = new CobblestoneDoor());
		ForgeRegistries.BLOCKS.register(BlockMossStoneDoor = new MossStoneDoor());
		ForgeRegistries.BLOCKS.register(BlockObsidianDoor = new ObsidianDoor());
		ForgeRegistries.BLOCKS.register(BlockBedrockDoor = new BedrockDoor());
		ForgeRegistries.BLOCKS.register(BlockRubyDoor = new RubyDoor());
		ForgeRegistries.BLOCKS.register(BlockRedstoneDoor = new RedstoneDoor());
	}
}
