package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.AndesiteTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.BedrockTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.CactusTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.CobblestoneTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.DiamondTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.DioriteTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.EmeraldTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.EndTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.GlassTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.GlowingObsidianTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.GoldTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.GraniteTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.MossStoneTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.ObsidianTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.RedstoneTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.RubyTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.RustyTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.SilverTrapdoor;
import com.NetherNoah.ParadiseMod.blocks.trapdoors.StoneTrapdoor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Trapdoors {
	//trapdoors
	public static BlockTrapDoor BlockCactusTrapDoor;
	public static BlockTrapDoor BlockEndTrapDoor;
	public static BlockTrapDoor BlockSilverTrapDoor;
	public static BlockTrapDoor BlockGlassTrapDoor;
	public static BlockTrapDoor BlockGoldTrapdoor;
	public static BlockTrapDoor BlockDiamondTrapdoor;
	public static BlockTrapDoor BlockEmeraldTrapdoor;
	public static BlockTrapDoor BlockAndesiteTrapDoor;
	public static BlockTrapDoor BlockDioriteTrapdoor;
	public static BlockTrapDoor BlockGraniteTrapdoor;
	public static BlockTrapDoor BlockStoneTrapdoor;
	public static BlockTrapDoor BlockCobblestoneTrapdoor;
	public static BlockTrapDoor BlockMossStoneTrapdoor;
	public static BlockTrapDoor BlockGlowingObsidianTrapdoor;
	public static BlockTrapDoor BlockObsidianTrapdoor;
	public static BlockTrapDoor BlockBedrockTrapdoor;
	public static BlockTrapDoor BlockRubyTrapdoor;
	public static RSTrapdoor BlockRedstoneTrapdoor;
	public static BlockTrapDoor RustyTrapdoor;

	public static void initAndRegister() {

		//trapdoors
		Utils.regBlock(BlockCactusTrapDoor=new CactusTrapdoor());
		Utils.regBlock(BlockGlowingObsidianTrapdoor=new GlowingObsidianTrapdoor());
		Utils.regBlock(BlockEndTrapDoor=new EndTrapdoor());
		Utils.regBlock(BlockSilverTrapDoor = new SilverTrapdoor());
		Utils.regBlock(BlockGlassTrapDoor = new GlassTrapdoor());
		Utils.regBlock(BlockGoldTrapdoor = new GoldTrapdoor());
		Utils.regBlock(BlockDiamondTrapdoor = new DiamondTrapdoor());
		Utils.regBlock(BlockEmeraldTrapdoor = new EmeraldTrapdoor());
		Utils.regBlock(BlockAndesiteTrapDoor = new AndesiteTrapdoor());
		Utils.regBlock(BlockDioriteTrapdoor = new DioriteTrapdoor());
		Utils.regBlock(BlockGraniteTrapdoor = new GraniteTrapdoor());
		Utils.regBlock(BlockStoneTrapdoor = new StoneTrapdoor());
		Utils.regBlock(BlockCobblestoneTrapdoor = new CobblestoneTrapdoor());
		Utils.regBlock(BlockMossStoneTrapdoor = new MossStoneTrapdoor());
		Utils.regBlock(BlockObsidianTrapdoor = new ObsidianTrapdoor());
		Utils.regBlock(BlockBedrockTrapdoor = new BedrockTrapdoor());
		Utils.regBlock(BlockRubyTrapdoor = new RubyTrapdoor());
		Utils.regBlock(BlockRedstoneTrapdoor = new RedstoneTrapdoor());
		Utils.regBlock(RustyTrapdoor=new RustyTrapdoor());
	}
	public static void regRenders() {
		Utils.regRender(RustyTrapdoor);
		Utils.regRender(BlockCactusTrapDoor);
		Utils.regRender(BlockGlowingObsidianTrapdoor);
		Utils.regRender(BlockEndTrapDoor);
		Utils.regRender(BlockSilverTrapDoor);
		Utils.regRender(BlockGlassTrapDoor);
		Utils.regRender(BlockGoldTrapdoor);
		Utils.regRender(BlockDiamondTrapdoor);
		Utils.regRender(BlockEmeraldTrapdoor);
		Utils.regRender(BlockAndesiteTrapDoor);
		Utils.regRender(BlockDioriteTrapdoor);
		Utils.regRender(BlockGraniteTrapdoor);
		Utils.regRender(BlockStoneTrapdoor);
		Utils.regRender(BlockCobblestoneTrapdoor);
		Utils.regRender(BlockMossStoneTrapdoor);
		Utils.regRender(BlockObsidianTrapdoor);
		Utils.regRender(BlockBedrockTrapdoor);
		Utils.regRender(BlockRubyTrapdoor);
		Utils.regRender(BlockRedstoneTrapdoor);
	}
}
