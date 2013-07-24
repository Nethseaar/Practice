package nethseaar.bacon;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.oredict.OreDictionary;
import nethseaar.bacon.bases.ItemBacon;
import nethseaar.bacon.items.ItemBoneAxe;
import nethseaar.bacon.items.ItemBoneHoe;
import nethseaar.bacon.items.ItemBonePickaxe;
import nethseaar.bacon.items.ItemBoneShovel;
import nethseaar.bacon.items.ItemBoneSword;
import nethseaar.bacon.items.ItemBucketBitumen;
import nethseaar.bacon.items.ItemFlintTool;
import nethseaar.bacon.items.ItemHex;
import nethseaar.bacon.references.ItemIDs;
import nethseaar.bacon.references.ItemNames;

public class BaconItems {

	// Store Hex Names
	private static String[] hexNames = {
		"Darkstone Hex", "Dimstone Hex", "Lightstone Hex", "Springstone Hex", "Floatstone Hex", "Deathstone Hex"
	};

	//  Declare Materials
	public static final EnumToolMaterial toolFLINT = EnumHelperClient.addToolMaterial("oneFLINT", 1, 15, 1.0F, 0, 0);

	// Declare Items
	public static Item darkness;
	public static Item gravity;
	public static Item lethargy;
	public static Item hex;
	public static Item bitumenChunk;
	public static Item greenBerry;
	public static Item shriveledGreenBerry;
	public static Item shriveledPurpleBerry;
	public static Item compactGreenBerry;
	public static Item compactPurpleBerry;
	public static Item spheretreeStick;
	public static Item ringtreeStick;

	// Declare Pickaxes
	public static Item flintTool;
	public static Item stoneBonePick;
	public static Item ironBonePick;
	public static Item goldBonePick;
	public static Item diamondBonePick;

	// Declare Bone Axes
	public static Item stoneBoneAxe;
	public static Item ironBoneAxe;
	public static Item goldBoneAxe;
	public static Item diamondBoneAxe;

	// Declare Bone Hoes
	public static Item stoneBoneHoe;
	public static Item ironBoneHoe;
	public static Item goldBoneHoe;
	public static Item diamondBoneHoe;

	// Declare Bone Shovels
	public static Item stoneBoneShovel;
	public static Item ironBoneShovel;
	public static Item goldBoneShovel;
	public static Item diamondBoneShovel;

	// Declare Bone Swords
	public static Item stoneBoneSword;
	public static Item ironBoneSword;
	public static Item goldBoneSword;
	public static Item diamondBoneSword;

	// Declare Contained Items
	public static Item bitumenInBucket;
	public static Item bucketBitumen;

	@Init
	public static void init() {

		//* --------------------------------------------------------------------------------------INITIALIZE ITEMS----------------------------------------------------
		// Initialize Items
		darkness = new ItemBacon(ItemIDs.darkness).setMaxStackSize(64).setUnlocalizedName(ItemNames.darknessName).setCreativeTab(Bacon.tabSubItems);
		gravity = new ItemBacon(ItemIDs.gravity).setMaxStackSize(64).setUnlocalizedName(ItemNames.gravityName).setCreativeTab(Bacon.tabSubItems);
		lethargy = new ItemBacon(ItemIDs.lethargy).setMaxStackSize(64).setUnlocalizedName(ItemNames.lethargyName).setCreativeTab(Bacon.tabSubItems);
		hex = new ItemHex(ItemIDs.hex).setMaxStackSize(64).setUnlocalizedName(ItemNames.hexName).setCreativeTab(Bacon.tabSubItems);
		bitumenChunk = new ItemBacon (ItemIDs.bitumenChunk).setMaxStackSize(64).setUnlocalizedName(ItemNames.bitumenChunkName).setCreativeTab(Bacon.tabSubItems);
		bitumenInBucket = new ItemBacon(ItemIDs.bitumenInBucket).setCreativeTab(Bacon.tabSubItems).setUnlocalizedName(ItemNames.bitumenInBucketName).setContainerItem(Item.bucketEmpty).setMaxStackSize(1);
		greenBerry = new ItemBacon(ItemIDs.greenBerry).setMaxStackSize(64).setUnlocalizedName(ItemNames.greenBerryName).setCreativeTab(Bacon.tabSubItems);
		compactGreenBerry = new ItemBacon(ItemIDs.compactGreenBerry).setMaxStackSize(64).setUnlocalizedName(ItemNames.compactGreenBerryName).setCreativeTab(Bacon.tabSubItems);
		compactPurpleBerry = new ItemBacon(ItemIDs.compactPurpleBerry).setMaxStackSize(64).setUnlocalizedName(ItemNames.compactPurpleBerryName).setCreativeTab(Bacon.tabSubItems);
		shriveledGreenBerry = new ItemBacon(ItemIDs.shriveledGreenBerry).setMaxStackSize(64).setUnlocalizedName(ItemNames.shriveledGreenBerryName).setCreativeTab(Bacon.tabSubItems);
		shriveledPurpleBerry = new ItemBacon(ItemIDs.shriveledPurpleBerry).setMaxStackSize(64).setUnlocalizedName(ItemNames.shriveledPurpleBerryName).setCreativeTab(Bacon.tabSubItems);
		spheretreeStick = new ItemBacon(ItemIDs.spheretreeStick).setMaxStackSize(64).setUnlocalizedName(ItemNames.spheretreeStickName).setCreativeTab(Bacon.tabSubItems);
		ringtreeStick = new ItemBacon(ItemIDs.ringtreeStick).setMaxStackSize(64).setUnlocalizedName(ItemNames.ringtreeStickName).setCreativeTab(Bacon.tabSubItems);
		bucketBitumen = new ItemBucketBitumen(ItemIDs.bitumenBucket).setUnlocalizedName(ItemNames.bitumenBucketName);

		// Initialize Pickaxes
		flintTool = new ItemFlintTool(ItemIDs.flintTool, toolFLINT).setUnlocalizedName(ItemNames.flintToolName);
		stoneBonePick = new ItemBonePickaxe(ItemIDs.stoneBonePick, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.stoneBonePickName);
		ironBonePick = new ItemBonePickaxe(ItemIDs.ironBonePick, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.ironBonePickName);
		goldBonePick = new ItemBonePickaxe(ItemIDs.goldBonePick, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.goldBonePickName);
		diamondBonePick = new ItemBonePickaxe(ItemIDs.diamondBonePick, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.diamondBonePickName);

		// Initialize Axes
		stoneBoneAxe = new ItemBoneAxe(ItemIDs.stoneBoneAxe, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.stoneBoneAxeName);
		ironBoneAxe = new ItemBoneAxe(ItemIDs.ironBoneAxe, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.ironBoneAxeName);
		goldBoneAxe = new ItemBoneAxe(ItemIDs.goldBoneAxe, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.goldBoneAxeName);
		diamondBoneAxe = new ItemBoneAxe(ItemIDs.diamondBoneAxe, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.diamondBoneAxeName);

		// Initialize Hoes
		stoneBoneHoe = new ItemBoneHoe(ItemIDs.stoneBoneHoe, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.stoneBoneHoeName);
		ironBoneHoe = new ItemBoneHoe(ItemIDs.ironBoneHoe, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.ironBoneHoeName);
		goldBoneHoe = new ItemBoneHoe(ItemIDs.goldBoneHoe, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.goldBoneHoeName);
		diamondBoneHoe= new ItemBoneHoe(ItemIDs.diamondBoneHoe, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.diamondBoneHoeName);

		// Initialize Shovels
		stoneBoneShovel = new ItemBoneShovel(ItemIDs.stoneBoneShovel, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.stoneBoneShovelName);
		ironBoneShovel = new ItemBoneShovel(ItemIDs.ironBoneShovel, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.ironBoneShovelName);
		goldBoneShovel = new ItemBoneShovel(ItemIDs.goldBoneShovel, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.goldBoneShovelName);
		diamondBoneShovel = new ItemBoneShovel(ItemIDs.diamondBoneShovel, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.diamondBoneShovelName);

		// Initialize Swords
		stoneBoneSword = new ItemBoneSword(ItemIDs.stoneBoneSword, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.stoneBoneSwordName);
		ironBoneSword = new ItemBoneSword(ItemIDs.ironBoneSword, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.ironBoneSwordName);
		goldBoneSword = new ItemBoneSword(ItemIDs.goldBoneSword, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.goldBoneSwordName);
		diamondBoneSword = new ItemBoneSword(ItemIDs.diamondBoneSword, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.diamondBoneSwordName);

		//* -------------------------------------------------------------------------------------- REGISTER ITEMS----------------------------------------------------
		// Item registry
		GameRegistry.registerItem(darkness, ItemNames.darknessName);
		GameRegistry.registerItem(gravity, ItemNames.gravityName);
		GameRegistry.registerItem(lethargy, ItemNames.lethargyName);
		GameRegistry.registerItem(hex,  "Bacon" + (hex.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(bitumenChunk, ItemNames.bitumenChunkName);
		GameRegistry.registerItem(bitumenInBucket, ItemNames.bitumenInBucketName);
		OreDictionary.registerOre("stickWood", ringtreeStick);
		OreDictionary.registerOre("stickWood", spheretreeStick);
		GameRegistry.registerItem(bucketBitumen, ItemNames.bitumenBucketName);

		GameRegistry.registerItem(flintTool, ItemNames.flintToolName);
		GameRegistry.registerItem(stoneBonePick, ItemNames.stoneBonePickName);
		GameRegistry.registerItem(ironBonePick, ItemNames.ironBonePickName);
		GameRegistry.registerItem(goldBonePick, ItemNames.goldBonePickName);
		GameRegistry.registerItem(diamondBonePick, ItemNames.diamondBonePickName);
		GameRegistry.registerItem(stoneBoneAxe, ItemNames.stoneBoneAxeName);
		GameRegistry.registerItem(ironBoneAxe, ItemNames.ironBoneAxeName);
		GameRegistry.registerItem(goldBoneAxe, ItemNames.goldBoneAxeName);
		GameRegistry.registerItem(diamondBoneAxe, ItemNames.diamondBoneAxeName);
		GameRegistry.registerItem(stoneBoneHoe, ItemNames.stoneBoneHoeName);
		GameRegistry.registerItem(ironBoneHoe, ItemNames.ironBoneHoeName);
		GameRegistry.registerItem(goldBoneHoe, ItemNames.goldBoneHoeName);
		GameRegistry.registerItem(diamondBoneHoe, ItemNames.diamondBoneHoeName);
		GameRegistry.registerItem(stoneBoneShovel, ItemNames.stoneBoneShovelName);
		GameRegistry.registerItem(ironBoneShovel, ItemNames.ironBoneShovelName);
		GameRegistry.registerItem(goldBoneShovel, ItemNames.goldBoneShovelName);
		GameRegistry.registerItem(diamondBoneShovel, ItemNames.diamondBoneShovelName);
		GameRegistry.registerItem(stoneBoneSword, ItemNames.stoneBoneSwordName);
		GameRegistry.registerItem(ironBoneSword, ItemNames.ironBoneSwordName);
		GameRegistry.registerItem(goldBoneSword, ItemNames.goldBoneSwordName);
		GameRegistry.registerItem(diamondBoneSword, ItemNames.diamondBoneSwordName);

		GameRegistry.registerItem(greenBerry, ItemNames.greenBerryName);
		GameRegistry.registerItem(compactGreenBerry, ItemNames.compactGreenBerryName);
		GameRegistry.registerItem(compactPurpleBerry, ItemNames.compactPurpleBerryName);
		GameRegistry.registerItem(shriveledGreenBerry, ItemNames.shriveledGreenBerryName);
		GameRegistry.registerItem(shriveledPurpleBerry, ItemNames.shriveledPurpleBerryName);

		//* -------------------------------------------------------------------------------------- REGISTER ITEM NAMES----------------------------------------------------
		//item name registry
		LanguageRegistry.addName(darkness, "Darkness");
		LanguageRegistry.addName(gravity, "Gravity");
		LanguageRegistry.addName(lethargy, "Lethargy");
		for (int i = 0; i < hexNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(hex, 1, i), hexNames[i]);
		}	
		LanguageRegistry.addName(bitumenChunk, "Bitumen Chunk");
		LanguageRegistry.addName(bitumenInBucket, "Bitumen in Bucket");
		LanguageRegistry.addName(spheretreeStick, "Spherewood Stick");
		LanguageRegistry.addName(ringtreeStick, "Ringwood Stick");
		LanguageRegistry.addName(bucketBitumen, "Bitumen Bucket");

		LanguageRegistry.addName(flintTool, "Flint Tool");
		LanguageRegistry.addName(stoneBonePick, "Stone Pickaxe");
		LanguageRegistry.addName(ironBonePick, "Iron Pickaxe");
		LanguageRegistry.addName(goldBonePick, "Gold Pickaxe");
		LanguageRegistry.addName(diamondBonePick, "Diamond Pickaxe");
		LanguageRegistry.addName(stoneBoneAxe, "Stone Axe");
		LanguageRegistry.addName(ironBoneAxe, "Iron Axe");
		LanguageRegistry.addName(goldBoneAxe, "Gold Axe");
		LanguageRegistry.addName(diamondBoneAxe, "Diamond Axe");
		LanguageRegistry.addName(stoneBoneHoe, "Stone Hoe");
		LanguageRegistry.addName(ironBoneHoe, "Iron Hoe");
		LanguageRegistry.addName(goldBoneHoe, "Gold Hoe");
		LanguageRegistry.addName(diamondBoneHoe, "Diamond Hoe");
		LanguageRegistry.addName(stoneBoneShovel, "Stone Shovel");
		LanguageRegistry.addName(ironBoneShovel, "Iron Shovel");
		LanguageRegistry.addName(goldBoneShovel, "Gold Shovel");
		LanguageRegistry.addName(diamondBoneShovel, "Diamond Shovel");
		LanguageRegistry.addName(stoneBoneSword, "Stone Sword");
		LanguageRegistry.addName(ironBoneSword, "Iron Sword");
		LanguageRegistry.addName(goldBoneSword, "Gold Sword");
		LanguageRegistry.addName(diamondBoneSword, "Diamond Sword");

		LanguageRegistry.addName(greenBerry, "Green Berry");
		LanguageRegistry.addName(compactGreenBerry, "Compact Green Berry");
		LanguageRegistry.addName(compactPurpleBerry, "Compact Purple Berry");
		LanguageRegistry.addName(shriveledGreenBerry, "Shriveled Green Berry");
		LanguageRegistry.addName(shriveledPurpleBerry, "Shriveled Purple Berry");
	}
}
