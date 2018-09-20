package com.NetherNoah.ParadiseMod.init.ModBlocks;

import com.NetherNoah.ParadiseMod.Utils;
import com.NetherNoah.ParadiseMod.CustomBlockCode.MossyFurnaceCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.VoidFurnaceCode;
import com.NetherNoah.ParadiseMod.CustomBlockCode.xmasTree;
import com.NetherNoah.ParadiseMod.blocks.formations.icicle;
import com.NetherNoah.ParadiseMod.blocks.formations.mossyStoneFormation;
import com.NetherNoah.ParadiseMod.blocks.formations.netherrackFormation;
import com.NetherNoah.ParadiseMod.blocks.formations.sandstoneFormation;
import com.NetherNoah.ParadiseMod.blocks.formations.stoneFormation;
import com.NetherNoah.ParadiseMod.blocks.misc.BlueRose;
import com.NetherNoah.ParadiseMod.blocks.misc.CactusBookshelf;
import com.NetherNoah.ParadiseMod.blocks.misc.CompressedCactus;
import com.NetherNoah.ParadiseMod.blocks.misc.DUPortal;
import com.NetherNoah.ParadiseMod.blocks.misc.DVPortal;
import com.NetherNoah.ParadiseMod.blocks.misc.GoldBars;
import com.NetherNoah.ParadiseMod.blocks.misc.MossyFurnace;
import com.NetherNoah.ParadiseMod.blocks.misc.MossyFurnaceLit;
import com.NetherNoah.ParadiseMod.blocks.misc.PolishedVoidStone;
import com.NetherNoah.ParadiseMod.blocks.misc.RegenerationStone;
import com.NetherNoah.ParadiseMod.blocks.misc.Rose;
import com.NetherNoah.ParadiseMod.blocks.misc.RustyIronBars;
import com.NetherNoah.ParadiseMod.blocks.misc.SilverBars;
import com.NetherNoah.ParadiseMod.blocks.misc.Stonecutter;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidBricks;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidFurnace;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidFurnaceLit;
import com.NetherNoah.ParadiseMod.blocks.misc.VoidStone;
import com.NetherNoah.ParadiseMod.blocks.misc.bulletproofGlass;
import com.NetherNoah.ParadiseMod.blocks.misc.emeraldRail;
import com.NetherNoah.ParadiseMod.blocks.misc.glowingIce;
import com.NetherNoah.ParadiseMod.blocks.misc.glowingObsidian;
import com.NetherNoah.ParadiseMod.blocks.misc.prismarineCrystalBlock;
import com.NetherNoah.ParadiseMod.blocks.misc.soulGlass;
import com.NetherNoah.ParadiseMod.blocks.misc.soulGlassPane;
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
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailPowered;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Misc {
	//cave formations
	public static BlockDirectional icicle;
	public static BlockDirectional stoneFormation;
	public static BlockDirectional mossyStoneFormation;
	public static BlockDirectional sandstoneFormation;
	public static BlockDirectional netherrackFormation;

	public static BlockBreakable bulletproofGlass;
	public static BlockBreakable prismarineCrystalBlock;
	public static BlockAir undergroundAir;
	public static Block VoidBricks;
	public static Block RegenerationStone;
	public static Block PolishedVoidStone;
	public static Block VoidStone;
	public static BlockBush BlueRose;
	public static BlockBush Rose;
	public static Block Stonecutter;
	public static Block CompressedCactus;
	public static Block CactusBookshelf;
	public static BlockRailPowered emeraldRailPowered;
	public static BlockRail emeraldRail;
	public static BlockLever mossyLever;
	public static DUPortal DUPortal;
	public static DVPortal DVPortal;
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
	public static BlockHopper SilverHopper;
	public static BlockHopper GoldHopper;
	public static MossyFurnaceCode MossyFurnace;
	public static MossyFurnaceCode MossyFurnaceLit;
	public static VoidFurnaceCode VoidFurnace;
	public static VoidFurnaceCode VoidFurnaceLit;
	public static Block glowingIce;

	public static void initAndRegister() {
		Utils.regBlock(icicle=new icicle());
		Utils.regBlock(stoneFormation=new stoneFormation());
		Utils.regBlock(mossyStoneFormation=new mossyStoneFormation());
		Utils.regBlock(sandstoneFormation=new sandstoneFormation());
		Utils.regBlock(netherrackFormation=new netherrackFormation());

		Utils.regBlock(bulletproofGlass=new bulletproofGlass());
		Utils.regBlock(prismarineCrystalBlock=new prismarineCrystalBlock());
		Utils.regBlock(RegenerationStone=new RegenerationStone());
		Utils.regBlock(VoidBricks=new VoidBricks());
		Utils.regBlock(PolishedVoidStone=new PolishedVoidStone());
		Utils.regBlock(VoidStone=new VoidStone());
		Utils.regBlock(DVPortal=new DVPortal());
		Utils.regBlock(BlueRose=new BlueRose());
		Utils.regBlock(Rose=new Rose());
		Utils.regBlock(Stonecutter=new Stonecutter());
		Utils.regBlock(RustyIronBars=new RustyIronBars());
		Utils.regBlock(CompressedCactus=new CompressedCactus());
		Utils.regBlock(CactusBookshelf=new CactusBookshelf());
		Utils.regBlock(SilverHopper=new SilverHopper());
		Utils.regBlock(SilverBars=new SilverBars());
		Utils.regBlock(emeraldRailPowered=new emeraldRailPowered());
		Utils.regBlock(emeraldRail=new emeraldRail());
		Utils.regBlock(mossyLever=new mossyLever());
		Utils.regBlock(DUPortal=new DUPortal());
		Utils.regBlock(glowingObsidian = new glowingObsidian());
		Utils.regBlock(soulGlassPane = new soulGlassPane());
		Utils.regBlock(soulGlass = new soulGlass());
		Utils.regBlock(Present = new Present());
		Utils.regBlock(SantaHat = new SantaHat());
		Utils.regBlock(ChristmasSapling = new ChristmasSapling());
		Utils.regBlock(ChristmasTopper = new ChristmasTopper());
		Utils.regBlock(GoldBars = new GoldBars());
		Utils.regBlock(ChristmasLeaves = new ChristmasLeaves());
		Utils.regBlock(GoldHopper = new GoldHopper());
		Utils.regBlock(MossyFurnace = new MossyFurnace());
		Utils.regBlock(VoidFurnace=new VoidFurnace());
		Utils.regBlock(glowingIce=new glowingIce());
		ForgeRegistries.BLOCKS.register(undergroundAir=new undergroundAir());
		ForgeRegistries.BLOCKS.register(MossyFurnaceLit = new MossyFurnaceLit());
		ForgeRegistries.BLOCKS.register(VoidFurnaceLit=new VoidFurnaceLit());
		
	}

	public static void regRenders() {
		Utils.regRender(icicle);
		Utils.regRender(stoneFormation);
		Utils.regRender(mossyStoneFormation);
		Utils.regRender(sandstoneFormation);
		Utils.regRender(netherrackFormation);

		Utils.regRender(bulletproofGlass);
		Utils.regRender(prismarineCrystalBlock);
		Utils.regRender(glowingIce);
		Utils.regRender(RegenerationStone);
		Utils.regRender(VoidBricks);
		Utils.regRender(PolishedVoidStone);
		Utils.regRender(VoidStone);
		Utils.regRender(DVPortal);
		Utils.regRender(BlueRose);
		Utils.regRender(Rose);
		Utils.regRender(Stonecutter);
		Utils.regRender(RustyIronBars);
		Utils.regRender(CompressedCactus);
		Utils.regRender(CactusBookshelf);
		Utils.regRender(SilverHopper);
		Utils.regRender(SilverBars);
		Utils.regRender(emeraldRailPowered);
		Utils.regRender(emeraldRail);
		Utils.regRender(mossyLever);
		Utils.regRender(DUPortal);
		Utils.regRender(glowingObsidian);
		Utils.regRender(soulGlassPane);
		Utils.regRender(soulGlass);
		Utils.regRender(Present);
		Utils.regRender(SantaHat);
		Utils.regRender(ChristmasSapling);
		Utils.regRender(ChristmasTopper);
		Utils.regRender(GoldBars);
		Utils.regRender(ChristmasLeaves);
		Utils.regRender(GoldHopper);
		Utils.regRender(MossyFurnace);
		Utils.regRender(VoidFurnace);
	}
}
