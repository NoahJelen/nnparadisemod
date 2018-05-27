package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSFenceGate;
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
import com.NetherNoah.ParadiseMod.blocks.fenceGates.BrickFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.CactusFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.DiamondFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.EmeraldFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.GoldFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.IronFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RedstoneFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RubyFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.RustyFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fenceGates.SilverFenceGate;
import com.NetherNoah.ParadiseMod.blocks.fences.BrickFence;
import com.NetherNoah.ParadiseMod.blocks.fences.CactusFence;
import com.NetherNoah.ParadiseMod.blocks.fences.DiamondFence;
import com.NetherNoah.ParadiseMod.blocks.fences.EmeraldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.GoldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.IronFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RedstoneFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RubyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RustyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.SilverFence;
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
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Fences {
	
	//fences
	public static BlockFence RustyFence;
	public static BlockFence BlockCactusFence;
	public static BlockFence BlockSilverFence;
	public static BlockFence BlockBrickFence;
	public static BlockFence BlockDiamondFence;
	public static BlockFence BlockEmeraldFence;
	public static BlockFence BlockGoldFence;
	public static BlockFence BlockIronFence;
	public static BlockFence BlockRubyFence;
	public static BlockFence BlockRedstoneFence;

	public static void initAndRegister() {
		//fences
		Utils.regBlock(RustyFence=new RustyFence());
		Utils.regBlock(BlockCactusFence=new CactusFence());
		Utils.regBlock(BlockSilverFence=new SilverFence());
		Utils.regBlock(BlockBrickFence = new BrickFence());
		Utils.regBlock(BlockDiamondFence = new DiamondFence());
		Utils.regBlock(BlockEmeraldFence = new EmeraldFence());
		Utils.regBlock(BlockGoldFence = new GoldFence());
		Utils.regBlock(BlockIronFence = new IronFence());
		Utils.regBlock(BlockRubyFence = new RubyFence());
		Utils.regBlock(BlockRedstoneFence = new RedstoneFence());

		
	}
	public static void regRenders() {
		Utils.regRender(RustyFence);
		Utils.regRender(BlockCactusFence);
		Utils.regRender(BlockSilverFence);
		Utils.regRender(BlockBrickFence);
		Utils.regRender(BlockDiamondFence);
		Utils.regRender(BlockEmeraldFence);
		Utils.regRender(BlockGoldFence);
		Utils.regRender(BlockIronFence);
		Utils.regRender(BlockRubyFence);
		Utils.regRender(BlockRedstoneFence);
		
	}
}
