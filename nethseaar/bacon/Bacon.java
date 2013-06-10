package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.DimensionManager;


@Mod(modid="Bacon", name="Bacon", version="v0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Bacon {

	EventManager eventmanager = new EventManager();
	
	@Instance("Bacon")
	public static Bacon instance;

	@SidedProxy(clientSide="nethseaar.bacon.client.ClientProxy", serverSide="nethseaar.bacon.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void load(FMLInitializationEvent event) {
		
		MinecraftForge.EVENT_BUS.register(new HandlerBitumenBucket());
		
		BaconBlocks.init();
		BaconItems.init();
		BaconRecipes.init();
		
		GameRegistry.registerWorldGenerator(eventmanager);
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		proxy.registerRenderers();		
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}