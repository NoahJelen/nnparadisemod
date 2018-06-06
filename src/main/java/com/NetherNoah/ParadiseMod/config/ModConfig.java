package com.NetherNoah.ParadiseMod.config;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid=Reference.MOD_ID,name="Nether Noah's Paradise Mod",category="nnparadisemod")
public class ModConfig {
    
    @Config.LangKey("config.worldgen")
    public static WorldGen worldgen=new WorldGen();
    
    @Config.LangKey("config.dimensions")
    public static Dimensions dimensions=new Dimensions();
    
    public static class WorldGen{

        @Config.LangKey("config.structures")
        public Structures structures=new Structures();
    	public class Structures{
        	@Config.Comment("Generate Brick Pyramids")
            @Config.LangKey("config.brickpyramids")
        	public Boolean BrickPyramids=true;
        	
            @Config.LangKey("config.chance")
            public int BrickPyramidsChance=1000;
        	
        	@Config.Comment("Generate Rusty Iron Buoys in oceans")
            @Config.LangKey("config.buoys")
        	public Boolean Buoys=true;
        	
            @Config.LangKey("config.chance")
            public int BuoysChance=600;
            
            @Config.Comment("AttieCat wanted this")
            @Config.LangKey("config.grassblocklarge")
            public Boolean GiantGrassBlock=false;
            
            @Config.LangKey("config.chance")
            public int GiantGrassBlockChance=100;
            
        	@Config.Comment("Generate Starter Homes")
            @Config.LangKey("config.homes")
        	public Boolean Homes=true;
        	
            @Config.LangKey("config.chance")
            public int HomesChance=60;

        	@Config.Comment("Generate Landmines")
            @Config.LangKey("config.mines")
        	public Boolean Landmines=true;
        	
            @Config.LangKey("config.chance")
            public int LandminesChance=30;

        	@Config.Comment("Generate Temples in Mesa-type biomes")
            @Config.LangKey("config.mesatemples")
        	public Boolean MesaTemple=true;
        	
            @Config.LangKey("config.chance")
            public int MesaTempleChance=500;

        	@Config.Comment("Generate Abandoned Miner Bases")
            @Config.LangKey("config.minerbase")
        	public Boolean MinerBase=true;
        	
            @Config.LangKey("config.chance")
            public int MinerBaseChance=1000;

        	@Config.Comment("Generate Mini Strongholds")
            @Config.LangKey("config.ministronghold")
        	public Boolean MiniStronghold=true;
        	
            @Config.LangKey("config.chance")
            public int MiniStrongholdChance=1000;

        	@Config.Comment("Generate Shipwrecks in the oceans")
            @Config.LangKey("config.shipwreck")
        	public Boolean Shipwreck=true;
        	
            @Config.LangKey("config.chance")
            public int ShipwreckChance=800;

        	@Config.Comment("Generate Underwater Villages")
            @Config.LangKey("config.oceanvillages")
        	public Boolean OceanVillage=true;
        	
            @Config.LangKey("config.chance")
            public int OceanVillageChance=600;
            
            @Config.Comment("AttieCat requested this")
            @Config.LangKey("config.playertemples")
            public Boolean PlayerTemples=false;
            
            @Config.LangKey("config.chance")
            public int PlayerTemplesChance=100;
            
        	@Config.Comment("Generate Rogue Nether Portals")
            @Config.LangKey("config.portal")
        	public Boolean RoguePortal=true;
        	
            @Config.LangKey("config.chance")
            public int RoguePortalChance=700;

        	@Config.Comment("Generate Elytra Runways")
            @Config.LangKey("config.runways")
        	public Boolean Runway=true;
        	
            @Config.LangKey("config.chance")
            public int RunwayChance=800;

        	@Config.Comment("Generate Wheels in the Sky")
            @Config.LangKey("config.skywheels")
        	public Boolean SkyWheel=true;
        	
            @Config.LangKey("config.chance")
            public int SkyWheelChance=1000;

        	@Config.Comment("Generate Treasure Chests")
            @Config.LangKey("config.treasure")
        	public Boolean TreasureChest=true;
        	
            @Config.LangKey("config.chance")
            public int TreasureChestChance=1000;

        	@Config.Comment("Generate Void Dungeons in the Deep Void")
            @Config.LangKey("config.voiddungeons")
        	public Boolean VoidDungeon=true;
        	
            @Config.LangKey("config.chance")
            public int VoidDungeonChance=60;
        	
        	@Config.Comment("Generate Large Void Dungeons in the Deep Void")
            @Config.LangKey("config.voiddungeonslarge")
        	public Boolean VoidDungeonLarge=true;
        	
            @Config.LangKey("config.chance")
            public int VoidDungeonLargeChance=1000;

        	@Config.Comment("Generate Void Towers in the Deep Void")
            @Config.LangKey("config.voidtowers")
        	public Boolean VoidTower=true;
        	
            @Config.LangKey("config.chance")
            public int VoidTowerChance=1000;
        	
        	@Config.Comment("Generate Wicker Man structures with Eddie the Stray in forests")
            @Config.LangKey("config.wickerman")
        	public Boolean WickerMan=true;
        	
            @Config.LangKey("config.chance")
            public int WickerManChance=800;
        	
            @Config.LangKey("config.attiecat")
        	public AttieCat attiecat=new AttieCat();
        	public class AttieCat{
        		
        		@Config.Comment("Generate Jeff the Creeper's tank in the nether")
                @Config.LangKey("config.jefftank")
        		public Boolean JeffTank=true;
            	
                @Config.LangKey("config.chance")
                public int JeffTankChance=30;
    		
        		@Config.Comment("Generate Bill the Enderman & John the Shulker's shrines in the end")
                @Config.LangKey("config.shrines")
        		public Boolean Shrines=true;
            	
                @Config.LangKey("config.chance")
                public int ShrinesChance=400;
        	}
        }
    
        @Config.Comment("Generate roses")
        @Config.LangKey("config.rosegen")
    	public Boolean GenerateRoses=true;
        
        @Config.Comment("Generate this mod's ores in the overworld")
        @Config.LangKey("config.owores")
    	public Boolean GenerateOverworldOres=true;
        
        @Config.Comment("Generate this mod's ores in the nether")
        @Config.LangKey("config.nores")
    	public Boolean GenerateNetherOres=true;
        
        @Config.Comment("Generate this mod's ores in the end")
        @Config.LangKey("config.eores")
    	public Boolean GenerateEndOres=true;
        
        @Config.LangKey("config.oceanfloors")
        @Config.Comment("Generate sand, clay, and dirt on the ocean floors instead of boring gravel")
    	public Boolean BeautifyOceanFloors=true;
    }
    
    public static class Dimensions{
    	
        @Config.RequiresMcRestart
        @Config.LangKey("config.dunum")
        @Config.Comment("Dimension ID for the Deep Underground")
    	public int DeepUndergroundDim=-2;
        
        @Config.RequiresMcRestart
        @Config.LangKey("config.dvnum")
        @Config.Comment("Dimension ID for the Deep Void")
    	public int DeepVoidDim=-3;

        @Config.LangKey("config.duenable")
        @Config.Comment("Enable/Disable the Deep Underground Dimension")
        public Boolean DUEnabled=true;

        @Config.LangKey("config.dvenable")
        @Config.Comment("Enable/Disable the Deep Void Dimension")
        public Boolean DVEnabled=true;
    }

    @Config.RequiresMcRestart
    @Config.Comment("Hide Christmas Features")
    @Config.LangKey("config.xmas")
    public static Boolean HideXmasFeatures = false;
    @Mod.EventBusSubscriber
    private static class ConfigHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if(event.getModID().equals(Reference.MOD_ID))
                ConfigManager.load(Reference.MOD_ID, Config.Type.INSTANCE);
        }
    }
}