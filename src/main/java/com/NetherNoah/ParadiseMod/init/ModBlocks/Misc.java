package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.blocks.base.BasicBlock;
import com.NetherNoah.ParadiseMod.blocks.base.CaveFormation;
import com.NetherNoah.ParadiseMod.blocks.base.CustomGlass;
import com.NetherNoah.ParadiseMod.blocks.base.CustomPane;
import com.NetherNoah.ParadiseMod.blocks.base.CustomPlant;
import com.NetherNoah.ParadiseMod.blocks.base.MossyFurnaceBase;
import com.NetherNoah.ParadiseMod.blocks.base.VoidFurnaceBase;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusBookshelf;
import com.NetherNoah.ParadiseMod.blocks.misc.DUPortal;
import com.NetherNoah.ParadiseMod.blocks.misc.DVPortal;
import com.NetherNoah.ParadiseMod.blocks.misc.RegenerationStone;
import com.NetherNoah.ParadiseMod.blocks.misc.emeraldRail;
import com.NetherNoah.ParadiseMod.blocks.misc.prismarineCrystalBlock;
import com.NetherNoah.ParadiseMod.blocks.misc.undergroundAir;
import com.NetherNoah.ParadiseMod.blocks.redstone.GoldHopper;
import com.NetherNoah.ParadiseMod.blocks.redstone.SilverHopper;
import com.NetherNoah.ParadiseMod.blocks.redstone.emeraldRailPowered;
import com.NetherNoah.ParadiseMod.blocks.redstone.mossyLever;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasLeaves;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasSapling;
import com.NetherNoah.ParadiseMod.blocks.xmas.ChristmasTopper;
import com.NetherNoah.ParadiseMod.blocks.xmas.Present;
import com.NetherNoah.ParadiseMod.blocks.xmas.SantaHat;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Misc {
	//cave formations
	public static CaveFormation icicle = new CaveFormation(SoundType.GLASS);
	public static CaveFormation mossyStoneFormation = new CaveFormation(SoundType.STONE);
	public static CaveFormation netherrackFormation = new CaveFormation(SoundType.STONE);
	public static CaveFormation sandstoneFormation = new CaveFormation(SoundType.STONE);
	public static CaveFormation stoneFormation = new CaveFormation(SoundType.STONE);

	//christmas stuff
	public static ChristmasSapling ChristmasSapling;
	public static BlockOldLeaf ChristmasLeaves;
	public static Block ChristmasTopper;
	public static Block Present;
	public static BlockPumpkin SantaHat;

	//deep void blocks
	public static Block PolishedVoidStone = new Block(Material.ROCK);
	public static Block RegenerationStone;
	public static Block VoidBricks = new Block(Material.ROCK);
	public static Block VoidStone = new Block(Material.ROCK);

	//flowers
	public static CustomPlant BlueRose = new CustomPlant();
	public static CustomPlant Rose = new CustomPlant();

	//furnaces
	public static MossyFurnaceBase MossyFurnace = new MossyFurnaceBase(false);
	public static MossyFurnaceBase MossyFurnaceLit = new MossyFurnaceBase(true);
	public static VoidFurnaceBase VoidFurnace = new VoidFurnaceBase(false);
	public static VoidFurnaceBase VoidFurnaceLit = new VoidFurnaceBase(true);

	//glass
	public static BlockBreakable bulletproofGlass = new CustomGlass();
	public static CustomPane bulletproofGlassPane = new CustomPane(Material.GLASS, false, SoundType.GLASS);
	public static BlockBreakable soulGlass = new CustomGlass();
	public static CustomPane soulGlassPane = new CustomPane(Material.GLASS, false, SoundType.GLASS);

	//hoppers
	public static BlockHopper GoldHopper;
	public static BlockHopper SilverHopper;

	//metal bars
	public static CustomPane GoldBars = new CustomPane(Material.IRON, true, SoundType.METAL);
	public static CustomPane RustyIronBars = new CustomPane(Material.IRON, true, SoundType.METAL);
	public static CustomPane SilverBars = new CustomPane(Material.IRON, true, SoundType.METAL);

	//others
	public static Block CactusBookshelf;
	public static BasicBlock CompressedCactus = new BasicBlock(Material.WOOD, SoundType.WOOD, false);
	public static BasicBlock glowingIce = new BasicBlock(Material.ICE, SoundType.GLASS,false);
	public static BasicBlock glowingObsidian = new BasicBlock(Material.ROCK,SoundType.STONE,true);
	public static BlockLever mossyLever;
	public static BlockBreakable prismarineCrystalBlock;
	public static Block Stonecutter = new Block(Material.ROCK);
	public static BlockAir undergroundAir;

	//portal blocks
	public static DUPortal DUPortal;
	public static DVPortal DVPortal;
	
	//rails
	public static BlockRail emeraldRail;
	public static BlockRailPowered emeraldRailPowered;

	public static void initAndRegister() {
		//cave formations
		Utils.regBlock(icicle.setUnlocalizedName("Icicle").setRegistryName("icicle"));
		Utils.regBlock(mossyStoneFormation.setUnlocalizedName("mossyStoneFormation").setRegistryName("mossy_stone_formation"));
		Utils.regBlock(netherrackFormation.setUnlocalizedName("netherrackFormation").setRegistryName("netherrack_formation"));
		Utils.regBlock(sandstoneFormation.setUnlocalizedName("sandstoneFormation").setRegistryName("sandstone_formation"));
		Utils.regBlock(stoneFormation.setUnlocalizedName("stoneFormation").setRegistryName("stone_formation"));
				
		//christmas stuff
		Utils.regBlock(ChristmasLeaves = new ChristmasLeaves());
		Utils.regBlock(ChristmasSapling = new ChristmasSapling());
		Utils.regBlock(ChristmasTopper = new ChristmasTopper());
		Utils.regBlock(Present = new Present());
		Utils.regBlock(SantaHat = new SantaHat());

		//deep void blocks
		Utils.regBlock(PolishedVoidStone.setUnlocalizedName("PolishedVoidStone").setRegistryName("polished_void_stone").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		Utils.regBlock(RegenerationStone=new RegenerationStone());
		Utils.regBlock(VoidBricks.setUnlocalizedName("VoidBricks").setRegistryName("void_bricks").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		Utils.regBlock(VoidStone.setUnlocalizedName("VoidStone").setRegistryName("void_stone").setHardness(5F).setResistance(15F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));

		//flowers
		Utils.regBlock(BlueRose.setUnlocalizedName("BlueRose").setRegistryName("blue_rose"));
		Utils.regBlock(Rose.setUnlocalizedName("Rose").setRegistryName("rose"));

		//furnaces
		Utils.regBlock(MossyFurnace.setUnlocalizedName("MossyFurnace").setRegistryName("mossy_furnace").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.DECORATIONS));
		ForgeRegistries.BLOCKS.register(MossyFurnaceLit.setUnlocalizedName("MossyFurnaceLit").setRegistryName("lit_mossy_furnace").setHardness(5F).setResistance(10F));		
		Utils.regBlock(VoidFurnace.setUnlocalizedName("VoidFurnace").setRegistryName("void_furnace").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.DECORATIONS));
		ForgeRegistries.BLOCKS.register(VoidFurnaceLit.setUnlocalizedName("VoidFurnaceLit").setRegistryName("lit_void_furnace").setHardness(5F).setResistance(10F));
		
		//glass
		soulGlassPane.setDefaultSlipperiness(1F);
		soulGlass.setDefaultSlipperiness(1F);

		Utils.regBlock(bulletproofGlass.setUnlocalizedName("bulletProofGlass").setRegistryName("bulletproof_glass").setHardness(.5F).setResistance(2000F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		Utils.regBlock(bulletproofGlassPane.setUnlocalizedName("bulletproofGlassPane").setRegistryName("bulletproof_glass_pane").setHardness(.5F).setResistance(2000F).setCreativeTab(CreativeTabs.DECORATIONS));
		Utils.regBlock(soulGlassPane.setUnlocalizedName("soulGlassPane").setRegistryName("soul_glass_pane").setHardness(.5F).setResistance(1F).setLightLevel(1F));
		Utils.regBlock(soulGlass.setUnlocalizedName("soulGlass").setRegistryName("soul_glass").setHardness(.5F).setResistance(1F).setLightLevel(1F));

		//hoppers
		Utils.regBlock(SilverHopper=new SilverHopper());
		Utils.regBlock(GoldHopper = new GoldHopper());

		//metal bars
		GoldBars.setHarvestLevel("pickaxe", 2);
		RustyIronBars.setHarvestLevel("pickaxe", 0);
		SilverBars.setHarvestLevel("pickaxe", 2);

		Utils.regBlock(GoldBars.setUnlocalizedName("GoldBars").setRegistryName("gold_bars").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.DECORATIONS));
		Utils.regBlock(RustyIronBars.setUnlocalizedName("RustyIronBars").setRegistryName("rusty_iron_bars").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.DECORATIONS));
		Utils.regBlock(SilverBars.setUnlocalizedName("SilverBars").setRegistryName("silver_bars").setHardness(5F).setResistance(10F).setCreativeTab(CreativeTabs.DECORATIONS));

		//others
		glowingIce.setDefaultSlipperiness(1F);
		glowingObsidian.setHarvestLevel("pickaxe",3);

		Utils.regBlock(CactusBookshelf=new CactusBookshelf());
		Utils.regBlock(CompressedCactus.setUnlocalizedName("CompressedCactus").setRegistryName("compressed_cactus").setHardness(2.5F).setResistance(5F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		Utils.regBlock(glowingIce.setUnlocalizedName("glowingIce").setRegistryName("glowing_ice").setHardness(.2F).setResistance(2F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(.46666667F));
		Utils.regBlock(glowingObsidian.setUnlocalizedName("glowingObsidian").setRegistryName("glowing_obsidian").setHardness(51F).setResistance(2000F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(.46666667F));
		Utils.regBlock(mossyLever=new mossyLever());
		Utils.regBlock(prismarineCrystalBlock=new prismarineCrystalBlock());
		Utils.regBlock(Stonecutter.setUnlocalizedName("Stonecutter").setRegistryName("stonecutter").setHardness(5F).setResistance(5.8333333333F).setCreativeTab(CreativeTabs.DECORATIONS));
		ForgeRegistries.BLOCKS.register(undergroundAir=new undergroundAir());

		//portal blocks
		Utils.regBlock(DUPortal=new DUPortal());
		Utils.regBlock(DVPortal=new DVPortal());

		//rails
		Utils.regBlock(emeraldRail=new emeraldRail());
		Utils.regBlock(emeraldRailPowered=new emeraldRailPowered());
	}

	public static void regRenders() {
		Utils.regRender(BlueRose);
		Utils.regRender(bulletproofGlass);
		Utils.regRender(bulletproofGlassPane);
		Utils.regRender(CactusBookshelf);
		Utils.regRender(ChristmasLeaves);
		Utils.regRender(ChristmasTopper);
		Utils.regRender(ChristmasSapling);
		Utils.regRender(CompressedCactus);
		Utils.regRender(DUPortal);
		Utils.regRender(DVPortal);
		Utils.regRender(emeraldRailPowered);
		Utils.regRender(emeraldRail);
		Utils.regRender(glowingIce);
		Utils.regRender(glowingObsidian);
		Utils.regRender(GoldBars);
		Utils.regRender(GoldHopper);
		Utils.regRender(icicle);
		Utils.regRender(MossyFurnace);
		Utils.regRender(mossyLever);
		Utils.regRender(mossyStoneFormation);
		Utils.regRender(netherrackFormation);
		Utils.regRender(PolishedVoidStone);
		Utils.regRender(Present);
		Utils.regRender(prismarineCrystalBlock);
		Utils.regRender(RegenerationStone);
		Utils.regRender(Rose);
		Utils.regRender(RustyIronBars);
		Utils.regRender(sandstoneFormation);
		Utils.regRender(SantaHat);
		Utils.regRender(SilverBars);
		Utils.regRender(SilverHopper);
		Utils.regRender(soulGlass);
		Utils.regRender(soulGlassPane);
		Utils.regRender(Stonecutter);
		Utils.regRender(stoneFormation);
		Utils.regRender(VoidBricks);
		Utils.regRender(VoidFurnace);
		Utils.regRender(VoidStone);
	}
}