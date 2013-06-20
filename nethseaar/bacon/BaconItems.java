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

public class BaconItems {
	
	public static String[] hexNames = {
		"Darkstone Hex", "Dimstone Hex", "Lightstone Hex", "Springstone Hex", "Floatstone Hex", "Deathstone Hex"
	};
	
	// Add materials
			public static final EnumToolMaterial toolFLINT = EnumHelperClient.addToolMaterial("oneFLINT", 1, 15, 1.0F, 0, 0);
	
	//add items
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
		
		// Add pickaxes
		public static Item flintTool;
		public static Item stoneBonePick;
		public static Item ironBonePick;
		public static Item goldBonePick;
		public static Item diamondBonePick;

		// Add bone axes
		public static Item stoneBoneAxe;
		public static Item ironBoneAxe;
		public static Item goldBoneAxe;
		public static Item diamondBoneAxe;

		// Add bone hoes
		public static Item stoneBoneHoe;
		public static Item ironBoneHoe;
		public static Item goldBoneHoe;
		public static Item diamondBoneHoe;

		// Add bone shovels
		public static Item stoneBoneShovel;
		public static Item ironBoneShovel;
		public static Item goldBoneShovel;
		public static Item diamondBoneShovel;

		// Add bone swords
		public static Item stoneBoneSword;
		public static Item ironBoneSword;
		public static Item goldBoneSword;
		public static Item diamondBoneSword;
		
		public static Item bitumenInBucket;
		public static Item bucketBitumen;
		
		@Init
		public static void init() {
			
			//* --------------------------------------------------------------------------------------INITIALIZE ITEMS----------------------------------------------------
			//item initialization
			darkness = new ItemBacon(5000).setMaxStackSize(64).setUnlocalizedName("darkness").setCreativeTab(Bacon.tabSubItems);
			gravity = new ItemBacon(5001).setMaxStackSize(64).setUnlocalizedName("gravity").setCreativeTab(Bacon.tabSubItems);
			lethargy = new ItemBacon(5002).setMaxStackSize(64).setUnlocalizedName("lethargy").setCreativeTab(Bacon.tabSubItems);
			hex = new ItemHex(5003).setMaxStackSize(64).setUnlocalizedName("hex").setCreativeTab(Bacon.tabSubItems);
			bitumenChunk = new ItemBacon (5009).setMaxStackSize(64).setUnlocalizedName("bitumenChunk").setCreativeTab(Bacon.tabSubItems);
			bitumenInBucket = new ItemBacon(3328).setCreativeTab(Bacon.tabSubItems).setUnlocalizedName("bitumenInBucket").setContainerItem(Item.bucketEmpty).setMaxStackSize(1);
			greenBerry = new ItemBacon(5010).setMaxStackSize(64).setUnlocalizedName("greenBerry").setCreativeTab(Bacon.tabSubItems);
			compactGreenBerry = new ItemBacon(5011).setMaxStackSize(64).setUnlocalizedName("compactGreenBerry").setCreativeTab(Bacon.tabSubItems);
			compactPurpleBerry = new ItemBacon(5012).setMaxStackSize(64).setUnlocalizedName("compactPurpleBerry").setCreativeTab(Bacon.tabSubItems);
			shriveledGreenBerry = new ItemBacon(5013).setMaxStackSize(64).setUnlocalizedName("shriveledGreenBerry").setCreativeTab(Bacon.tabSubItems);
			shriveledPurpleBerry = new ItemBacon(5014).setMaxStackSize(64).setUnlocalizedName("shriveledPurpleBerry").setCreativeTab(Bacon.tabSubItems);
			spheretreeStick = new ItemBacon(5044).setMaxStackSize(64).setUnlocalizedName("spheretreeStick").setCreativeTab(Bacon.tabSubItems);
			ringtreeStick = new ItemBacon(5045).setMaxStackSize(64).setUnlocalizedName("ringtreeStick").setCreativeTab(Bacon.tabSubItems);
			bucketBitumen = new ItemBucketBitumen(3329).setUnlocalizedName("bitumenBucket");
			
			// Initialize pickaxes
			flintTool = new ItemFlintTool(3330, toolFLINT).setUnlocalizedName("flintTool");
			stoneBonePick = new ItemBonePickaxe(3331, EnumToolMaterial.STONE).setUnlocalizedName("stoneBonePick");
			ironBonePick = new ItemBonePickaxe(3332, EnumToolMaterial.IRON).setUnlocalizedName("ironBonePick");
			goldBonePick = new ItemBonePickaxe(3333, EnumToolMaterial.GOLD).setUnlocalizedName("goldBonePick");
			diamondBonePick = new ItemBonePickaxe(3334, EnumToolMaterial.EMERALD).setUnlocalizedName("diamondBonePick");

			// Initialize axes
			stoneBoneAxe = new ItemBoneAxe(3335, EnumToolMaterial.STONE).setUnlocalizedName("stoneBoneAxe");
			ironBoneAxe = new ItemBoneAxe(3336, EnumToolMaterial.IRON).setUnlocalizedName("ironBoneAxe");
			goldBoneAxe = new ItemBoneAxe(3337, EnumToolMaterial.GOLD).setUnlocalizedName("goldBoneAxe");
			diamondBoneAxe = new ItemBoneAxe(3338, EnumToolMaterial.EMERALD).setUnlocalizedName("diamondBoneAxe");

			// Initialize hoes
			stoneBoneHoe = new ItemBoneHoe(3339, EnumToolMaterial.STONE).setUnlocalizedName("stoneBoneHoe");
			ironBoneHoe = new ItemBoneHoe(3340, EnumToolMaterial.IRON).setUnlocalizedName("ironBoneHoe");
			goldBoneHoe = new ItemBoneHoe(3341, EnumToolMaterial.GOLD).setUnlocalizedName("goldBoneHoe");
			diamondBoneHoe= new ItemBoneHoe(3342, EnumToolMaterial.EMERALD).setUnlocalizedName("diamondBoneHoe");

			// Initialize shovels
			stoneBoneShovel = new ItemBoneShovel(3343, EnumToolMaterial.STONE).setUnlocalizedName("stoneBoneShovel");
			ironBoneShovel = new ItemBoneShovel(3344, EnumToolMaterial.IRON).setUnlocalizedName("ironBoneShovel");
			goldBoneShovel = new ItemBoneShovel(3345, EnumToolMaterial.GOLD).setUnlocalizedName("goldBoneShovel");
			diamondBoneShovel = new ItemBoneShovel(3346, EnumToolMaterial.EMERALD).setUnlocalizedName("diamondBoneShovel");

			// Initialize swords
			stoneBoneSword = new ItemBoneSword(3347, EnumToolMaterial.STONE).setUnlocalizedName("stoneBoneSword");
			ironBoneSword = new ItemBoneSword(3348, EnumToolMaterial.IRON).setUnlocalizedName("ironBoneSword");
			goldBoneSword = new ItemBoneSword(3349, EnumToolMaterial.GOLD).setUnlocalizedName("goldBoneSword");
			diamondBoneSword = new ItemBoneSword(3350, EnumToolMaterial.EMERALD).setUnlocalizedName("diamondBoneSword");
			
			//* -------------------------------------------------------------------------------------- REGISTER ITEMS----------------------------------------------------
			//item registry
					GameRegistry.registerItem(darkness, "Darkness");
					GameRegistry.registerItem(gravity, "Gravity");
					GameRegistry.registerItem(lethargy, "Lethargy");
					GameRegistry.registerItem(hex,  "Bacon" + (hex.getUnlocalizedName().substring(5)));
					GameRegistry.registerItem(bitumenChunk, "bitumenChunk");
					GameRegistry.registerItem(bitumenInBucket, "bitumenInBucket");
					GameRegistry.registerItem(spheretreeStick, "spheretreeStick");
					GameRegistry.registerItem(ringtreeStick, "ringtreeStick");
					GameRegistry.registerItem(bucketBitumen, "bucketBitumen");
					
					GameRegistry.registerItem(flintTool, "flintTool");
					GameRegistry.registerItem(stoneBonePick, "stoneBonePick");
					GameRegistry.registerItem(ironBonePick, "ironBonePick");
					GameRegistry.registerItem(goldBonePick, "goldBonePick");
					GameRegistry.registerItem(diamondBonePick, "diamondBonePick");
					GameRegistry.registerItem(stoneBoneAxe, "stoneBoneAxe");
					GameRegistry.registerItem(ironBoneAxe, "ironBoneAxe");
					GameRegistry.registerItem(goldBoneAxe, "goldBoneAxe");
					GameRegistry.registerItem(diamondBoneAxe, "diamondBoneAxe");
					GameRegistry.registerItem(stoneBoneHoe, "stoneBoneHoe");
					GameRegistry.registerItem(ironBoneHoe, "ironBoneHoe");
					GameRegistry.registerItem(goldBoneHoe, "goldBoneHoe");
					GameRegistry.registerItem(diamondBoneHoe, "diamondBoneHoe");
					GameRegistry.registerItem(stoneBoneShovel, "stoneBoneShovel");
					GameRegistry.registerItem(ironBoneShovel, "ironBoneShovel");
					GameRegistry.registerItem(goldBoneShovel, "goldBoneShovel");
					GameRegistry.registerItem(diamondBoneShovel, "diamondBoneShovel");
					GameRegistry.registerItem(stoneBoneSword, "stoneBoneSword");
					GameRegistry.registerItem(ironBoneSword, "ironBoneSword");
					GameRegistry.registerItem(goldBoneSword, "goldBoneSword");
					GameRegistry.registerItem(diamondBoneSword, "diamondBoneSword");
					
					GameRegistry.registerItem(greenBerry, "greenBerry");
					GameRegistry.registerItem(compactGreenBerry, "compactGreenBerry");
					GameRegistry.registerItem(compactPurpleBerry, "compactPurpleBerry");
					GameRegistry.registerItem(shriveledGreenBerry, "shriveledGreenBerry");
					GameRegistry.registerItem(shriveledPurpleBerry, "shriveledPurpleBerry");
					
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
