package com.NetherNoah.ParadiseMod;

import com.NetherNoah.ParadiseMod.creativeTabs.ChristmasTab;
import com.NetherNoah.ParadiseMod.handlers.AntiMobLampHandler;
import com.NetherNoah.ParadiseMod.handlers.CustomCraftBenchGuiHandler;
import com.NetherNoah.ParadiseMod.handlers.OreDictHandler;
import com.NetherNoah.ParadiseMod.handlers.Events;
import com.NetherNoah.ParadiseMod.init.LiquidRedstone;
import com.NetherNoah.ParadiseMod.init.ModBlocks;
import com.NetherNoah.ParadiseMod.init.ModItems;
import com.NetherNoah.ParadiseMod.init.ModSmelting;
import com.NetherNoah.ParadiseMod.proxy.CommonProxy;
import com.NetherNoah.ParadiseMod.tileentity.TEAntiMobLamp;
import com.NetherNoah.ParadiseMod.tileentity.TEMossyFurnace;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCompressedCactusChest;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityGoldHopper;
import com.NetherNoah.ParadiseMod.tileentity.TileEntitySilverHopper;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;
import com.NetherNoah.ParadiseMod.world.worldgen.DirtGen;
import com.NetherNoah.ParadiseMod.world.worldgen.OreGenEnd;
import com.NetherNoah.ParadiseMod.world.worldgen.OreGenNether;
import com.NetherNoah.ParadiseMod.world.worldgen.OreGenOverworld;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.BrickPyramid;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Home;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.MesaTemple;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Minerbase;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Ocean;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.RoguePortal;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.Runway;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.WickerMan;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.AttieCat.JeffTank;
import com.NetherNoah.ParadiseMod.world.worldgen.structures.AttieCat.Shrine;

import net.minecraft.creativetab.CreativeTabs;
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
		LootTableList.register(new ResourceLocation("nnparadisemod", "starter_chest"));
		LootTableList.register(new ResourceLocation("nnparadisemod", "mining_chest"));
		LootTableList.register(new ResourceLocation("nnparadisemod", "treasure_chest"));
		
		//this should prevent monsters from spawing
		MinecraftForge.EVENT_BUS.register((this.AntiMobLampHandler = new AntiMobLampHandler()));
        MinecraftForge.EVENT_BUS.register(SaltLampRegistry.getLampRegistry());
        MinecraftForge.EVENT_BUS.register(Events.class);
        
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
		
		//liquids
		LiquidRedstone.register();
		FluidRegistry.addBucketForFluid(LiquidRedstone.FluidLiquidRedstone.instance);
		System.out.println("NetherNoah777: Oh my God! Adding liquid redstone was a big pain the a**!!!!!!!");
		
		//tile entities
		GameRegistry.registerTileEntity(TEMossyFurnace.class,"mossy_furnace");
		GameRegistry.registerTileEntity(TileEntityCactusChest.class,"cactus_chest");
		GameRegistry.registerTileEntity(TileEntityCompressedCactusChest.class,"compressed_cactus_chest");
		GameRegistry.registerTileEntity(TileEntityGoldHopper.class,"gold_hopper");
		GameRegistry.registerTileEntity(TileEntitySilverHopper.class,"silver_hopper");
		GameRegistry.registerTileEntity(TEAntiMobLamp.class,"salt_lamp");
		System.out.println("Nether Noah's Paradise Mod: Successfully registered tile entities");
		
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
				new DirtGen()};
		for(int i=0;i<14;i++) {
			GameRegistry.registerWorldGenerator(generators[i],1);
		}
		System.out.println("Nether Noah's Paradise Mod: Successfully registered world generators");
		ModBlocks.initAndRegister();
		System.out.println("Nether Noah's Paradise Mod: Successfully registered blocks");
		ModItems.initAndRegister();
		System.out.println("Nether Noah's Paradise Mod: Successfully registered items");
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		OreDictHandler.registerOreDict();
		System.out.println("Nether Noah's Paradise Mod: added ores to ore dictionary");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new CustomCraftBenchGuiHandler());
		proxy.init();
		ModSmelting.register();
		System.out.println("Nether Noah's Paradise Mod: Successfully registered smelting recipes");
		DimensionRegistry.MainRegistry();
		System.out.println("Nether Noah's Paradise Mod: Successfully added the Deep Underground to Minecraft");
	}
	/*/
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
	}
	/*/
}