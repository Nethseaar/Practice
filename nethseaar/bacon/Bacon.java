package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.EnumHelperClient;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.oredict.OreDictionary;
import nethseaar.bacon.dimension.BiomeGenBacon;
import nethseaar.bacon.dimension.WorldProviderBacon;
import nethseaar.bacon.handlers.EventManager;
import nethseaar.bacon.handlers.FuelHandler;
import nethseaar.bacon.handlers.GuiHandler;
import nethseaar.bacon.handlers.HandlerBitumenBucket;
import nethseaar.bacon.handlers.PacketHandlerBacon;
import nethseaar.bacon.tileentities.TileEntityCondenser;


@Mod(modid= Bacon.modid, name="Bacon", version="v0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false, channels = "Bacon", packetHandler = PacketHandlerBacon.class)
public class Bacon {
	
	public static final String modid = "Bacon";

	EventManager eventmanager = new EventManager();

	@Instance("Bacon")
	public static Bacon instance = new Bacon();

	private GuiHandler GuiHandler = new GuiHandler();

	@SidedProxy(clientSide="nethseaar.bacon.client.ClientProxy", serverSide="nethseaar.bacon.CommonProxy")
	public static CommonProxy proxy;
	public static BiomeGenBase baconBiome;
	public static int dimension = 17;
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);
	}

	public static CreativeTabs tabInert = new CreativeTabs("tabInert")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(BaconBlocks.darkstone, 1, 0);
		}
	};

	public static CreativeTabs tabActive = new CreativeTabs("tabActive")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(BaconBlocks.deathstone, 1, 0);
		}
	};

	public static CreativeTabs tabSubItems = new CreativeTabs("tabSubItems")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(BaconItems.hex, 1, 0);
		}
	};

	@Init
	public void load(FMLInitializationEvent event) {

		MinecraftForge.EVENT_BUS.register(new HandlerBitumenBucket());
		BaconBlocks.init();
		BaconItems.init();
		BaconRecipes.init();

		GameRegistry.registerWorldGenerator(eventmanager);
		GameRegistry.registerFuelHandler(new FuelHandler());

		GameRegistry.registerTileEntity(TileEntityCondenser.class, "tileEntityCondenser");
		NetworkRegistry.instance().registerGuiHandler(this, GuiHandler);

		LanguageRegistry.instance().addStringLocalization("itemGroup.tabInert", "en_US", "Subterrain Blocks I");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabActive", "en_US", "Subterrain Blocks II");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabSubItems", "en_US", "Subterrain Blocks III");

		//DimensionManager.registerProviderType(dimension, WorldProviderBacon.class, false);
		//DimensionManager.registerDimension(dimension, dimension);
		//baconBiome = new BiomeGenBacon(80).setColor(2900485).setBiomeName("Bacon!").setDisableRain().setTemperatureRainfall(1F, 0F).setMinMaxHeight(0.1F, 1F);

		proxy.registerRenderers();		
	}


	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}