package com.NetherNoah.ParadiseMod;

import com.NetherNoah.ParadiseMod.creativeTabs.ChristmasTab;
import com.NetherNoah.ParadiseMod.handlers.AntiMobLampHandler;
import com.NetherNoah.ParadiseMod.handlers.CaveGenHandler;
import com.NetherNoah.ParadiseMod.handlers.CustomCraftBenchGuiHandler;
import com.NetherNoah.ParadiseMod.handlers.Events;
import com.NetherNoah.ParadiseMod.handlers.OreDictHandler;
import com.NetherNoah.ParadiseMod.init.LiquidRedstone;
import com.NetherNoah.ParadiseMod.init.ModSmelting;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Buttons;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Chests;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Crystals;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Doors;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Fences;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Gates;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Plates;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Slabs;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Stairs;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Tables;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Trapdoors;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Walls;
import com.NetherNoah.ParadiseMod.init.ModItems.Armor;
import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;
import com.NetherNoah.ParadiseMod.init.ModItems.MiscItems;
import com.NetherNoah.ParadiseMod.init.ModItems.Tools;
import com.NetherNoah.ParadiseMod.proxy.CommonProxy;
import com.NetherNoah.ParadiseMod.tileentity.SaltLamp.SaltLampRegistry;
import com.NetherNoah.ParadiseMod.tileentity.SaltLamp.TEAntiMobLamp;
import com.NetherNoah.ParadiseMod.tileentity.chest.TileEntityCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.chest.TileEntityCompressedCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.furnace.TEMossyFurnace;
import com.NetherNoah.ParadiseMod.tileentity.furnace.TEVoidFurnace;
import com.NetherNoah.ParadiseMod.tileentity.hopper.TileEntityGoldHopper;
import com.NetherNoah.ParadiseMod.tileentity.hopper.TileEntitySilverHopper;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;
import com.NetherNoah.ParadiseMod.world.worldgen.misc.DUTrees;
import com.NetherNoah.ParadiseMod.world.worldgen.misc.DirtGen;
import com.NetherNoah.ParadiseMod.world.worldgen.misc.Rose;
import com.NetherNoah.ParadiseMod.world.worldgen.ores.OreGenEnd;
import com.NetherNoah.ParadiseMod.world.worldgen.ores.OreGenNether;
import com.NetherNoah.ParadiseMod.world.worldgen.ores.OreGenOverworld;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Buoy;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.EasterEgg;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.EasterEgg2;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.GiantGrassBlock;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Home;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Ocean;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.PlayerTemples;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.RoguePortal;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Runway;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.SkyWheel;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.TreasureChest;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.UndergroundVillage;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.WickerMan;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.AttieCat.JeffTank;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.AttieCat.Shrine;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.BrickPyramid;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.MesaTemple;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.Minerbase;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.MiniStronghold;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.VoidDungeon;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.VoidDungeonLarge;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Dungeons.VoidTower;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Landmines.LandMine;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Landmines.LandMineDirt;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Landmines.LandMineStone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class ParadiseMod {
	public static final CreativeTabs xmas = new ChristmasTab();
	private AntiMobLampHandler AntiMobLampHandler;
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@Instance
	public static ParadiseMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//loot tables
		LootTableList.register(new ResourceLocation("nnparadisemod","starter_chest"));
		LootTableList.register(new ResourceLocation("nnparadisemod","mining_chest"));
		LootTableList.register(new ResourceLocation("nnparadisemod","treasure_chest"));
		
		//this should prevent monsters from spawning
		MinecraftForge.EVENT_BUS.register((this.AntiMobLampHandler = new AntiMobLampHandler()));
        MinecraftForge.EVENT_BUS.register(SaltLampRegistry.getLampRegistry());
        
        //events
        MinecraftForge.EVENT_BUS.register(Events.class);
        MinecraftForge.EVENT_BUS.register(CaveGenHandler.class);
        
        //some modifications to vanilla blocks
        //This is NOT a coremod!
		Blocks.REDSTONE_BLOCK.setResistance(2000F);
		Blocks.WOODEN_BUTTON.setUnlocalizedName("oak_button");
		Blocks.STRUCTURE_BLOCK.setCreativeTab(CreativeTabs.REDSTONE);
		Blocks.STRUCTURE_VOID.setCreativeTab(CreativeTabs.REDSTONE);
		Blocks.COMMAND_BLOCK.setCreativeTab(CreativeTabs.REDSTONE);
		Blocks.REPEATING_COMMAND_BLOCK.setCreativeTab(CreativeTabs.REDSTONE);
		Blocks.CHAIN_COMMAND_BLOCK.setCreativeTab(CreativeTabs.REDSTONE);
		Blocks.BARRIER.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		Blocks.MOB_SPAWNER.setCreativeTab(CreativeTabs.DECORATIONS);
		
		//liquids
		LiquidRedstone.register();
		FluidRegistry.addBucketForFluid(LiquidRedstone.FluidLiquidRedstone.instance);
		
		//tile entities
		GameRegistry.registerTileEntity(TEMossyFurnace.class,"mossy_furnace");
		GameRegistry.registerTileEntity(TEVoidFurnace.class,"void_furnace");
		GameRegistry.registerTileEntity(TileEntityCactusChest.class,"cactus_chest");
		GameRegistry.registerTileEntity(TileEntityCompressedCactusChest.class,"compressed_cactus_chest");
		GameRegistry.registerTileEntity(TileEntityGoldHopper.class,"gold_hopper");
		GameRegistry.registerTileEntity(TileEntitySilverHopper.class,"silver_hopper");
		GameRegistry.registerTileEntity(TEAntiMobLamp.class,"salt_lamp");
		
		//world generators
		IWorldGenerator[] generators = {
				//structures!
				new Home(),
				new WickerMan(),
				new Ocean(),
				new BrickPyramid(),
				new Minerbase(),
				new RoguePortal(),
				new MesaTemple(),
				new Runway(),
				new TreasureChest(),
				new SkyWheel(),
				new MiniStronghold(),
				new LandMine(),
				new LandMineDirt(),
				new LandMineStone(),
				new Buoy(),
				new TreasureChest(),
				new SkyWheel(),
				new MiniStronghold(),
				new VoidDungeonLarge(),
				new VoidDungeon(),
				new VoidTower(),
				new PlayerTemples(),
				new GiantGrassBlock(),
				
				//created by AttieCat
				new Shrine(),
				new JeffTank(),
				
				//overworld ore gen
				new OreGenOverworld(),
				
				//nether ore gen
				new OreGenNether(),
				
				//end ore gen
				new OreGenEnd(),
				
				//dirt, gravel, sand, and clay on the ocean floors
				new DirtGen(),
				
				//flowers
				new Rose(),
				
				//trees in the Deep Underground
				new DUTrees(),
				
				//easter egg
				new EasterEgg(),
				new EasterEgg2(),
				
				//underground villages
				new UndergroundVillage()
		};
		
		for(int i=0;i<generators.length;i++) 
			GameRegistry.registerWorldGenerator(generators[i],1);

		//block categories
		Lamps.initAndRegister();
		Ores.initAndRegister();
		Misc.initAndRegister();
		Crystals.initAndRegister();
		Walls.initAndRegister();
		Stairs.initAndRegister();
		Buttons.initAndRegister();
		Plates.initAndRegister();
		Tables.initAndRegister();
		Chests.initAndRegister();
		Doors.initAndRegister();
		Trapdoors.initAndRegister();
		Fences.initAndRegister();
		Gates.initAndRegister();
		Slabs.initAndRegister();
		
		//item categories
		Tools.initAndRegister();
		Armor.initAndRegister();
		DoorItems.initAndRegister();
		MiscItems.initAndRegister();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		OreDictHandler.registerOreDict();

		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new CustomCraftBenchGuiHandler());
		proxy.init();

		ModSmelting.register();

		DimensionRegistry.registerDimensions();

		//spawn mobs in the deep void dimension
		EntityRegistry.addSpawn(EntityZombie.class, 10, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntityCreeper.class, 10, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntitySpider.class, 10, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntitySkeleton.class, 10, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntityWitherSkeleton.class, 1, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntitySlime.class, 10, 0, 10, EnumCreatureType.MONSTER, Biomes.VOID);
		EntityRegistry.addSpawn(EntityEnderman.class, 1, 0, 1, EnumCreatureType.MONSTER, Biomes.VOID);
	}
	/*/
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
	}
	/*/
}