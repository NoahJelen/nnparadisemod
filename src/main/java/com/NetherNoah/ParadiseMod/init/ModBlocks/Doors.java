package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.blocks.RedstoneDoor;
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
import com.NetherNoah.ParadiseMod.blocks.doors.RubyDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.RustyDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.SilverDoor;
import com.NetherNoah.ParadiseMod.blocks.doors.StoneDoor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Doors {
	//doors
	public static BlockDoor CactusDoor;
	public static BlockDoor EndDoor;
	public static BlockDoor SilverDoor;
	public static BlockDoor GlassDoor;
	public static BlockDoor GoldDoor;
	public static BlockDoor DiamondDoor;
	public static BlockDoor EmeraldDoor;
	public static BlockDoor AndesiteDoor;
	public static BlockDoor DioriteDoor;
	public static BlockDoor GraniteDoor;
	public static BlockDoor StoneDoor;
	public static BlockDoor CobblestoneDoor;
	public static BlockDoor MossStoneDoor;
	public static BlockDoor GlowingObsidianDoor;
	public static BlockDoor ObsidianDoor;
	public static BlockDoor BedrockDoor;
	public static BlockDoor RubyDoor;
	public static Block RedstoneDoor;
	public static BlockDoor RustyDoor;

	public static void initAndRegister() {
		
		// door blocks
		// they don't need their own items
		ForgeRegistries.BLOCKS.register(RustyDoor=new RustyDoor());
		ForgeRegistries.BLOCKS.register(CactusDoor=new CactusDoor());
		ForgeRegistries.BLOCKS.register(GlowingObsidianDoor=new GlowingObsidianDoor());
		ForgeRegistries.BLOCKS.register(EndDoor=new EndDoor());
		ForgeRegistries.BLOCKS.register(SilverDoor=new SilverDoor());
		ForgeRegistries.BLOCKS.register(GlassDoor = new GlassDoor());
		ForgeRegistries.BLOCKS.register(GoldDoor = new GoldDoor());
		ForgeRegistries.BLOCKS.register(DiamondDoor = new DiamondDoor());
		ForgeRegistries.BLOCKS.register(EmeraldDoor = new EmeraldDoor());
		ForgeRegistries.BLOCKS.register(AndesiteDoor = new AndesiteDoor());
		ForgeRegistries.BLOCKS.register(DioriteDoor = new DioriteDoor());
		ForgeRegistries.BLOCKS.register(GraniteDoor = new GraniteDoor());
		ForgeRegistries.BLOCKS.register(StoneDoor = new StoneDoor());
		ForgeRegistries.BLOCKS.register(CobblestoneDoor = new CobblestoneDoor());
		ForgeRegistries.BLOCKS.register(MossStoneDoor = new MossStoneDoor());
		ForgeRegistries.BLOCKS.register(ObsidianDoor = new ObsidianDoor());
		ForgeRegistries.BLOCKS.register(BedrockDoor = new BedrockDoor());
		ForgeRegistries.BLOCKS.register(RubyDoor = new RubyDoor());
		ForgeRegistries.BLOCKS.register(RedstoneDoor = new RedstoneDoor());
	}
}
