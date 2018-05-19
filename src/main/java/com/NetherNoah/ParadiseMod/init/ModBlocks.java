package com.NetherNoah.ParadiseMod.init;

import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWall;
import com.NetherNoah.ParadiseMod.CustomBlockCode.CustomWorkBench;
import com.NetherNoah.ParadiseMod.CustomBlockCode.MossyFurnaceCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSDoor;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSFenceGate;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSTrapdoor;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RubyPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.xmasTree;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.DiamondButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.EmeraldButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.IronButtonTicks;
import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.QuickButton;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.BedrockPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.DiamondPlateCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates.EmeraldPlateCode;
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
import com.NetherNoah.ParadiseMod.blocks.fences.BedrockWall;
import com.NetherNoah.ParadiseMod.blocks.fences.BrickFence;
import com.NetherNoah.ParadiseMod.blocks.fences.CactusFence;
import com.NetherNoah.ParadiseMod.blocks.fences.DiamondFence;
import com.NetherNoah.ParadiseMod.blocks.fences.EmeraldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.EndWall;
import com.NetherNoah.ParadiseMod.blocks.fences.GlowingObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.GoldFence;
import com.NetherNoah.ParadiseMod.blocks.fences.IronFence;
import com.NetherNoah.ParadiseMod.blocks.fences.ObsidianWall;
import com.NetherNoah.ParadiseMod.blocks.fences.RedstoneFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RubyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.RustyFence;
import com.NetherNoah.ParadiseMod.blocks.fences.SilverFence;
import com.NetherNoah.ParadiseMod.blocks.misc.BedrockStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusBookshelf;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.CompressedCactus;
import com.NetherNoah.ParadiseMod.blocks.misc.DUPortal;
import com.NetherNoah.ParadiseMod.blocks.misc.EndStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.GlowingObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.GoldBars;
import com.NetherNoah.ParadiseMod.blocks.misc.MossyFurnace;
import com.NetherNoah.ParadiseMod.blocks.misc.MossyFurnaceLit;
import com.NetherNoah.ParadiseMod.blocks.misc.ObsidianStairs;
import com.NetherNoah.ParadiseMod.blocks.misc.RustyIronBars;
import com.NetherNoah.ParadiseMod.blocks.misc.SaltLamp;
import com.NetherNoah.ParadiseMod.blocks.misc.SilverBars;
import com.NetherNoah.ParadiseMod.blocks.misc.emeraldRail;
import com.NetherNoah.ParadiseMod.blocks.misc.glowingObsidian;
import com.NetherNoah.ParadiseMod.blocks.misc.soulGlass;
import com.NetherNoah.ParadiseMod.blocks.misc.soulGlassPane;
import com.NetherNoah.ParadiseMod.blocks.ores.EnderPearlOre;
import com.NetherNoah.ParadiseMod.blocks.ores.GoldOreNether;
import com.NetherNoah.ParadiseMod.blocks.ores.RubyOre;
import com.NetherNoah.ParadiseMod.blocks.ores.RubyOreEnd;
import com.NetherNoah.ParadiseMod.blocks.ores.SaltOre;
import com.NetherNoah.ParadiseMod.blocks.ores.SilverOre;
import com.NetherNoah.ParadiseMod.blocks.ores.SilverOreNether;
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
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.AndesitePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.DioritePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.stoneVariants.GranitePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.AcaciaPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.BirchPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.CactusPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.DarkOakPlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.JunglePlate;
import com.NetherNoah.ParadiseMod.blocks.pressurePlates.wood.SprucePlate;
import com.NetherNoah.ParadiseMod.blocks.redstone.GoldHopper;
import com.NetherNoah.ParadiseMod.blocks.redstone.SilverHopper;
import com.NetherNoah.ParadiseMod.blocks.redstone.emeraldRailPowered;
import com.NetherNoah.ParadiseMod.blocks.redstone.mossyLever;
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
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.BlockRuby;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.BlockRustyIron;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.SaltBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.SilverBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.blazeBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.endPearlBlock;
import com.NetherNoah.ParadiseMod.blocks.resourceBlocks.sugarBlock;
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
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchAcacia;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchBirch;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchCactus;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchDarkOak;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchJungle;
import com.NetherNoah.ParadiseMod.blocks.workbenches.CustomWorkbenchSpruce;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasLeaves;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasSapling;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasTopper;
import com.NetherNoah.ParadiseMod.blocks.xmas.Present;
import com.NetherNoah.ParadiseMod.blocks.xmas.SantaHat;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {
	public static SaltLamp getSaltLamp()
	{
		return SaltLamp;
	}
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
	
	//resource blocks
	public static Block RustyIronBlock;
	public static Block blazeBlock;
	public static BlockFalling sugarBlock;
	public static Block RubyBlock;
	public static Block SilverBlock;
	public static Block SaltBlock;
	public static Block endPearlBlock;
	
	//other blocks
	public static SaltLamp SaltLamp;
	public static Block CompressedCactus;
	public static Block CactusBookshelf;
	public static BlockRailPowered emeraldRailPowered;
	public static BlockRail emeraldRail;
	public static BlockLever mossyLever;
	public static DUPortal DUPortal;
	public static Block glowingObsidian;
	public static Block Present;
	public static xmasTree ChristmasSapling;
	public static BlockPane GoldBars;
	public static BlockOldLeaf ChristmasLeaves;
	public static Block ChristmasTopper;
	public static BlockPumpkin SantaHat;
	public static BlockBreakable soulGlass;
	public static BlockPane soulGlassPane;
	public static BlockPane SilverBars;
	public static BlockPane RustyIronBars;
	
	//stairs
	public static BlockStairs BedrockStairs;
	public static BlockStairs EndStairs;
	public static BlockStairs ObsidianStairs;
	public static BlockStairs GlowingObsidianStairs;
	public static BlockStairs CactusStairs;
	
	//crystals
	public static BlockBush diamondCrystal;
	public static BlockBush emeraldCrystal;
	public static BlockBush quartzCrystal;
	public static BlockBush redstoneCrystal;
	public static BlockBush rubyCrystal;
	
	// buttons
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
	
	// pressure plates
	public static BlockPressurePlate DirtPlate;
	public static BlockPressurePlate GrassPlate;
	public static BlockPressurePlate concretePlate;
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
	
	// crafting tables
	public static CustomWorkBench CustomWorkbenchCactus;
	public static CustomWorkBench CustomWorkbenchAcacia;
	public static CustomWorkBench CustomWorkbenchBirch;
	public static CustomWorkBench CustomWorkbenchDarkOak;
	public static CustomWorkBench CustomWorkbenchJungle;
	public static CustomWorkBench CustomWorkbenchSpruce;
	public static MossyFurnaceCode MossyFurnace;
	public static MossyFurnaceCode MossyFurnaceLit;
	
	// ores
	public static Block EnderPearlOre;
	public static Block SilverOreNether;
	public static Block GoldOreNether;
	public static Block RubyOre;
	public static Block EndRubyOre;
	public static Block SilverOre;
	public static Block SaltOre;
	
	// misc redstone components
	public static BlockHopper GoldHopper;
	public static BlockHopper SilverHopper;
	
	// chests
	public static Block CactusChest;
	public static Block CactusChestTrapped;
	public static Block CompressedCactusChest;
	public static Block CompressedCactusChestTrapped;
	
	// doors
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
	public static BlockDoor RustyDoor;
	
	// trapdoors
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
	
	//walls
	public static CustomWall BedrockWall;
	public static CustomWall GlowingObsidianWall;
	public static CustomWall ObsidianWall;
	public static CustomWall EndWall;
	
	// fences
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
	
	//fence gates
	public static BlockFenceGate RustyFenceGate;
	public static BlockFenceGate BlockCactusFenceGate;
	public static BlockFenceGate BlockSilverFenceGate;
	public static BlockFenceGate BlockBrickFenceGate;
	public static BlockFenceGate BlockDiamondFenceGate;
	public static BlockFenceGate BlockEmeraldFenceGate;
	public static BlockFenceGate BlockGoldFenceGate;
	public static BlockFenceGate BlockIronFenceGate;
	public static BlockFenceGate BlockRubyFenceGate;
	public static RSFenceGate BlockRedstoneFenceGate;

	public static void initAndRegister() {
		regBlock(RustyIronBars=new RustyIronBars());
		regBlock(SaltLamp=new SaltLamp());
		regBlock(CompressedCactus=new CompressedCactus());
		regBlock(CactusBookshelf=new CactusBookshelf());
		regBlock(SilverHopper=new SilverHopper());
		regBlock(SilverBars=new SilverBars());
		regBlock(emeraldRailPowered=new emeraldRailPowered());
		regBlock(emeraldRail=new emeraldRail());
		regBlock(mossyLever=new mossyLever());
		regBlock(DUPortal=new DUPortal());
		regBlock(glowingObsidian = new glowingObsidian());
		regBlock(soulGlassPane = new soulGlassPane());
		regBlock(soulGlass = new soulGlass());
		regBlock(Present = new Present());
		regBlock(SantaHat = new SantaHat());
		regBlock(ChristmasSapling = new ChristmasSapling());
		regBlock(ChristmasTopper = new ChristmasTopper());
		regBlock(GoldBars = new GoldBars());
		regBlock(ChristmasLeaves = new ChristmasLeaves());
		
		//crystals
		regBlock(diamondCrystal = new diamondCrystal());
		regBlock(emeraldCrystal = new emeraldCrystal());
		regBlock(quartzCrystal = new quartzCrystal());
		regBlock(redstoneCrystal = new redstoneCrystal());
		regBlock(rubyCrystal = new rubyCrystal());
		
		//walls
		regBlock(GlowingObsidianWall=new GlowingObsidianWall());
		regBlock(BedrockWall = new BedrockWall());
		regBlock(ObsidianWall = new ObsidianWall());
		regBlock(EndWall=new EndWall());
		
		//stairs
		regBlock(CactusStairs=new CactusStairs());
		regBlock(EndStairs=new EndStairs());
		regBlock(BedrockStairs=new BedrockStairs());
		regBlock(ObsidianStairs=new ObsidianStairs());
		regBlock(GlowingObsidianStairs=new GlowingObsidianStairs());
		
		//buttons
		regBlock(DirtButton=new DirtButton());
		regBlock(GrassButton=new GrassButton());
		regBlock(RustyButton=new RustyButton());
		regBlock(EndButton=new EndButton());
		regBlock(CactusButton=new CactusButton());
		regBlock(GlowingObsidianButton=new GlowingObsidianButton());
		regBlock(DiamondButton = new DiamondButton());
		regBlock(EmeraldButton = new EmeraldButton());
		regBlock(GoldButton = new GoldButton());
		regBlock(IronButton = new IronButton());
		regBlock(SilverButton = new SilverButton());
		regBlock(RubyButton = new RubyButton());
		regBlock(ObsidianButton = new ObsidianButton());
		regBlock(BedrockButton = new BedrockButton());
		regBlock(MossyButton = new MossyButton());
		regBlock(CobblestoneButton = new CobblestoneButton());
		regBlock(AndesiteButton = new AndesiteButton());
		regBlock(DioriteButton = new DioriteButton());
		regBlock(GraniteButton = new GraniteButton());
		regBlock(AcaciaButton = new AcaciaButton());
		regBlock(BirchButton = new BirchButton());
		regBlock(DarkOakButton = new DarkOakButton());
		regBlock(JungleButton = new JungleButton());
		regBlock(SpruceButton = new SpruceButton());
		
		// pressure plates
		regBlock(DirtPlate=new DirtPlate());
		regBlock(GrassPlate=new GrassPlate());
		regBlock(CactusPlate=new CactusPlate());
		regBlock(EndPlate=new EndPlate());
		regBlock(GlowingObsidianPlate=new GlowingObsidianPlate());
		regBlock(DiamondPlate = new DiamondPlate());
		regBlock(EmeraldPlate = new EmeraldPlate());
		regBlock(SilverPlate = new SilverPlate());
		regBlock(RubyPlate = new RubyPlate());
		regBlock(BedrockPlate = new BedrockPlate());
		regBlock(MossyPlate = new MossyPlate());
		regBlock(CobblestonePlate = new CobblestonePlate());
		regBlock(AndesitePlate = new AndesitePlate());
		regBlock(DioritePlate = new DioritePlate());
		regBlock(GranitePlate = new GranitePlate());
		regBlock(AcaciaPlate = new AcaciaPlate());
		regBlock(BirchPlate = new BirchPlate());
		regBlock(DarkOakPlate = new DarkOakPlate());
		regBlock(JunglePlate = new JunglePlate());
		regBlock(SprucePlate = new SprucePlate());
		regBlock(RustyPlate=new RustyPlate());
		
		// crafting tables
		regBlock(CustomWorkbenchCactus=new CustomWorkbenchCactus());
		regBlock(CustomWorkbenchAcacia = new CustomWorkbenchAcacia());
		regBlock(CustomWorkbenchBirch = new CustomWorkbenchBirch());
		regBlock(CustomWorkbenchDarkOak = new CustomWorkbenchDarkOak());
		regBlock(CustomWorkbenchJungle = new CustomWorkbenchJungle());
		regBlock(CustomWorkbenchSpruce = new CustomWorkbenchSpruce());
		regBlock(MossyFurnace = new MossyFurnace());
		
		// ores and resource blocks
		regBlock(EnderPearlOre=new EnderPearlOre());
		regBlock(EndRubyOre = new RubyOreEnd());
		regBlock(SilverOreNether=new SilverOreNether());
		regBlock(GoldOreNether=new GoldOreNether());
		regBlock(blazeBlock=new blazeBlock());
		regBlock(sugarBlock=new sugarBlock());
		regBlock(RubyOre = new RubyOre());
		regBlock(SilverOre=new SilverOre());
		regBlock(RubyBlock = new BlockRuby());
		regBlock(SilverBlock=new SilverBlock());
		regBlock(SaltBlock=new SaltBlock());
		regBlock(SaltOre=new SaltOre());
		regBlock(endPearlBlock=new endPearlBlock());
		regBlock(RustyIronBlock=new BlockRustyIron());
		
		// misc redstone components
		regBlock(GoldHopper = new GoldHopper());
		
		// chests
		regBlock(CompressedCactusChest=new CompressedCactusChest());
		regBlock(CompressedCactusChestTrapped=new CompressedCactusChestTrapped());
		regBlock(CactusChest = new CactusChest());
		regBlock(CactusChestTrapped = new CactusChestTrapped());
		
		// trapdoors
		regBlock(BlockCactusTrapDoor=new CactusTrapdoor());
		regBlock(BlockGlowingObsidianTrapdoor=new GlowingObsidianTrapdoor());
		regBlock(BlockEndTrapDoor=new EndTrapdoor());
		regBlock(BlockSilverTrapDoor = new SilverTrapdoor());
		regBlock(BlockGlassTrapDoor = new GlassTrapdoor());
		regBlock(BlockGoldTrapdoor = new GoldTrapdoor());
		regBlock(BlockDiamondTrapdoor = new DiamondTrapdoor());
		regBlock(BlockEmeraldTrapdoor = new EmeraldTrapdoor());
		regBlock(BlockAndesiteTrapDoor = new AndesiteTrapdoor());
		regBlock(BlockDioriteTrapdoor = new DioriteTrapdoor());
		regBlock(BlockGraniteTrapdoor = new GraniteTrapdoor());
		regBlock(BlockStoneTrapdoor = new StoneTrapdoor());
		regBlock(BlockCobblestoneTrapdoor = new CobblestoneTrapdoor());
		regBlock(BlockMossStoneTrapdoor = new MossStoneTrapdoor());
		regBlock(BlockObsidianTrapdoor = new ObsidianTrapdoor());
		regBlock(BlockBedrockTrapdoor = new BedrockTrapdoor());
		regBlock(BlockRubyTrapdoor = new RubyTrapdoor());
		regBlock(BlockRedstoneTrapdoor = new RedstoneTrapdoor());
		regBlock(RustyTrapdoor=new RustyTrapdoor());
		
		//fences
		regBlock(RustyFence=new RustyFence());
		regBlock(BlockCactusFence=new CactusFence());
		regBlock(BlockSilverFence=new SilverFence());
		regBlock(BlockBrickFence = new BrickFence());
		regBlock(BlockDiamondFence = new DiamondFence());
		regBlock(BlockEmeraldFence = new EmeraldFence());
		regBlock(BlockGoldFence = new GoldFence());
		regBlock(BlockIronFence = new IronFence());
		regBlock(BlockRubyFence = new RubyFence());
		regBlock(BlockRedstoneFence = new RedstoneFence());
		
		//fence gates
		regBlock(RustyFenceGate=new RustyFenceGate());
		regBlock(BlockCactusFenceGate=new CactusFenceGate());
		regBlock(BlockSilverFenceGate=new SilverFenceGate());
		regBlock(BlockBrickFenceGate = new BrickFenceGate());
		regBlock(BlockDiamondFenceGate = new DiamondFenceGate());
		regBlock(BlockEmeraldFenceGate = new EmeraldFenceGate());
		regBlock(BlockGoldFenceGate = new GoldFenceGate());
		regBlock(BlockIronFenceGate = new IronFenceGate());
		regBlock(BlockRubyFenceGate = new RubyFenceGate());
		regBlock(BlockRedstoneFenceGate = new RedstoneFenceGate());
		
		//unlit lamps
		regBlock(BlackRSLamp = new BlackRSLamp());
		regBlock(BlueRSLamp = new BlueRSLamp());
		regBlock(BrownRSLamp = new BrownRSLamp());
		regBlock(CyanRSLamp = new CyanRSLamp());
		regBlock(GrayRSLamp = new GrayRSLamp());
		regBlock(GreenRSLamp = new GreenRSLamp());
		regBlock(LightBlueRSLamp = new LightBlueRSLamp());
		regBlock(LimeRSLamp = new LimeRSLamp());
		regBlock(MagentaRSLamp = new MagentaRSLamp());
		regBlock(OrangeRSLamp = new OrangeRSLamp());
		regBlock(PinkRSLamp = new PinkRSLamp());
		regBlock(PurpleRSLamp = new PurpleRSLamp());
		regBlock(RedRSLamp = new RedRSLamp());
		regBlock(SilverRSLamp = new SilverRSLamp());
		regBlock(WhiteRSLamp = new WhiteRSLamp());
		regBlock(YellowRSLamp = new YellowRSLamp());
		
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
		
		// also don't need an item
		ForgeRegistries.BLOCKS.register(MossyFurnaceLit = new MossyFurnaceLit());
		
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

	private static void regBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	public static void registerRenders() {
		//block render registry list
		regRender(RustyIronBars);
		regRender(SaltLamp);
		regRender(CompressedCactus);
		regRender(CactusBookshelf);
		regRender(SilverBars);
		regRender(emeraldRailPowered);
		regRender(emeraldRail);
		regRender(mossyLever);
		regRender(DUPortal);
		regRender(glowingObsidian);
		regRender(soulGlassPane);
		regRender(soulGlass);
		regRender(Present);
		regRender(SantaHat);
		regRender(ChristmasSapling);
		regRender(GoldBars);
		regRender(ChristmasLeaves);
		regRender(ChristmasTopper);
		regRender(MossyFurnace);
		
		//crystals
		regRender(diamondCrystal);
		regRender(emeraldCrystal);
		regRender(quartzCrystal);
		regRender(redstoneCrystal);
		regRender(rubyCrystal);
		
		//walls
		regRender(GlowingObsidianWall);
		regRender(EndWall);
		regRender(BedrockWall);
		regRender(ObsidianWall);
		
		//stairs
		regRender(CactusStairs);
		regRender(EndStairs);
		regRender(ObsidianStairs);
		regRender(GlowingObsidianStairs);
		regRender(BedrockStairs);
		
		//buttons
		regRender(DirtButton);
		regRender(GrassButton);
		regRender(RustyButton);
		regRender(CactusButton);
		regRender(GlowingObsidianButton);
		regRender(EndButton);
		regRender(SilverButton);
		regRender(DiamondButton);
		regRender(EmeraldButton);
		regRender(GoldButton);
		regRender(IronButton);
		regRender(RubyButton);
		regRender(BedrockButton);
		regRender(ObsidianButton);
		regRender(CobblestoneButton);
		regRender(MossyButton);
		regRender(AndesiteButton);
		regRender(DioriteButton);
		regRender(GraniteButton);
		regRender(AcaciaButton);
		regRender(BirchButton);
		regRender(DarkOakButton);
		regRender(JungleButton);
		regRender(SpruceButton);
		
		// pressure plates
		regRender(DirtPlate);
		regRender(GrassPlate);
		regRender(RustyPlate);
		regRender(CactusPlate);
		regRender(GlowingObsidianPlate);
		regRender(EndPlate);
		regRender(SilverPlate);
		regRender(DiamondPlate);
		regRender(EmeraldPlate);
		regRender(RubyPlate);
		regRender(BedrockPlate);
		regRender(MossyPlate);
		regRender(CobblestonePlate);
		regRender(AndesitePlate);
		regRender(DioritePlate);
		regRender(GranitePlate);
		regRender(AcaciaPlate);
		regRender(BirchPlate);
		regRender(DarkOakPlate);
		regRender(JunglePlate);
		regRender(SprucePlate);
		
    	// crafting tables
		regRender(CustomWorkbenchCactus);
		regRender(CustomWorkbenchAcacia);
		regRender(CustomWorkbenchBirch);
		regRender(CustomWorkbenchDarkOak);
		regRender(CustomWorkbenchJungle);
		regRender(CustomWorkbenchSpruce);
		regRender(CustomWorkbenchAcacia);
		
		//ores and resource blocks
		regRender(RustyIronBlock);
		regRender(endPearlBlock);
		regRender(EnderPearlOre);
		regRender(EndRubyOre);
		regRender(SilverOreNether);
		regRender(GoldOreNether);
		regRender(SaltOre);
		regRender(SilverOre);
		regRender(RubyOre);
		regRender(sugarBlock);
		regRender(blazeBlock);
		regRender(SilverBlock);
		regRender(RubyBlock);
		regRender(SaltBlock);
		
		//misc redstone components
		regRender(GoldHopper);
		regRender(SilverHopper);
		
		//chests
		regRender(CompressedCactusChest);
		regRender(CompressedCactusChestTrapped);
		regRender(CactusChest);
		regRender(CactusChestTrapped);
		
		//trapdoors
		regRender(RustyTrapdoor);
		regRender(BlockCactusTrapDoor);
		regRender(BlockGlowingObsidianTrapdoor);
		regRender(BlockEndTrapDoor);
		regRender(BlockSilverTrapDoor);
		regRender(BlockGlassTrapDoor);
		regRender(BlockGoldTrapdoor);
		regRender(BlockDiamondTrapdoor);
		regRender(BlockEmeraldTrapdoor);
		regRender(BlockAndesiteTrapDoor);
		regRender(BlockDioriteTrapdoor);
		regRender(BlockGraniteTrapdoor);
		regRender(BlockStoneTrapdoor);
		regRender(BlockCobblestoneTrapdoor);
		regRender(BlockMossStoneTrapdoor);
		regRender(BlockObsidianTrapdoor);
		regRender(BlockBedrockTrapdoor);
		regRender(BlockRubyTrapdoor);
		regRender(BlockRedstoneTrapdoor);

		// fences
		regRender(RustyFence);
		regRender(BlockCactusFence);
		regRender(BlockSilverFenceGate);
		regRender(BlockSilverFence);
		regRender(BlockBrickFence);
		regRender(BlockDiamondFence);
		regRender(BlockEmeraldFence);
		regRender(BlockGoldFence);
		regRender(BlockIronFence);
		regRender(BlockRubyFence);
		regRender(BlockRedstoneFence);
		
		// fence gates
		regRender(RustyFenceGate);
		regRender(BlockCactusFenceGate);
		regRender(BlockBrickFenceGate);
		regRender(BlockDiamondFenceGate);
		regRender(BlockEmeraldFenceGate);
		regRender(BlockGoldFenceGate);
		regRender(BlockIronFenceGate);
		regRender(BlockRubyFenceGate);
		regRender(BlockRedstoneFenceGate);
		
		//lamps
		regRender(BlackRSLamp);
		regRender(BlueRSLamp);
		regRender(BrownRSLamp);
		regRender(CyanRSLamp);
		regRender(GrayRSLamp);
		regRender(GreenRSLamp);
		regRender(LightBlueRSLamp);
		regRender(LimeRSLamp);
		regRender(MagentaRSLamp);
		regRender(OrangeRSLamp);
		regRender(PinkRSLamp);
		regRender(PurpleRSLamp);
		regRender(RedRSLamp);
		regRender(SilverRSLamp);
		regRender(WhiteRSLamp);
		regRender(YellowRSLamp);
	}

	private static void regRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}