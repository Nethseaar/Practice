package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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


@Mod(modid="Bacon", name="Bacon", version="v0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Bacon {

	EventManager eventmanager = new EventManager();

	// Add materials
		public static final EnumToolMaterial toolFLINT = EnumHelperClient.addToolMaterial("oneFLINT", 1, 15, 1.0F, 0, 0);

	//add ores
	public static Block darknessOre;
	public static Block gravityOre;
	public static Block lethargyOre;
	public static Block bitumenOre;
	
	//add stone blocks
	public static Block darkstone;
	public static Block dimstone;
	public static Block lightstone;
	public static Block springstone;
	public static Block floatstone;
	public static Block deathstone;

	//add cracked stone blocks
	public static Block crackedDarkstone;
	public static Block crackedDimstone;
	public static Block crackedLightstone;
	public static Block crackedSpringstone;
	public static Block crackedFloatstone;
	public static Block crackedDeathstone;

	//add condensed stone blocks
	public static Block condensedDarkstone;
	public static Block condensedDimstone;
	public static Block condensedLightstone;
	public static Block condensedSpringstone;
	public static Block condensedFloatstone;
	public static Block condensedDeathstone;

	//add smooth stone blocks
	public static Block smoothDarkstone;
	public static Block smoothDimstone;
	public static Block smoothLightstone;
	public static Block smoothSpringstone;
	public static Block smoothFloatstone;
	public static Block smoothDeathstone;

	//add brick blocks
	public static Block darkstoneBrick;
	public static Block dimstoneBrick;
	public static Block lightstoneBrick;
	public static Block springstoneBrick;
	public static Block floatstoneBrick;
	public static Block deathstoneBrick;

	//add carved blocks
	public static Block carvedDarkstone;
	public static Block carvedDimstone;
	public static Block carvedLightstone;
	public static Block carvedSpringstone;
	public static Block carvedFloatstone;
	public static Block carvedDeathstone;

	//add vanilla/organic blocks
	public static Block asphalt;
	public static Block endObsidian;
	public static Block stalagmite;
	public static Block stalagmiteBase;
	public static Block ringtreePlanks;
	public static Block spheretreePlanks;
	public static Block spheretreeHeart;
	public static Block ringtree;
	public static Block spheretreeLeaves;
	public static Block stoneWorkbench;
	public static Block boneLadder;
	public static Block spheretreeDeepwood;
	public static Block spheretreeBranchwood;

	//add Stairs	
	public static BlockStairs darkstoneStairs;
	public static BlockStairs dimstoneStairs;
	public static BlockStairs lightstoneStairs;
	public static BlockStairs smoothDarkstoneStairs;
	public static BlockStairs smoothDimstoneStairs;
	public static BlockStairs smoothLightstoneStairs;
	public static BlockStairs darkstoneBrickStairs;
	public static BlockStairs dimstoneBrickStairs;
	public static BlockStairs lightstoneBrickStairs;
	public static BlockStairs springstoneStairs;
	public static BlockStairs floatstoneStairs;
	public static BlockStairs deathstoneStairs;
	public static BlockStairs smoothSpringstoneStairs;
	public static BlockStairs smoothFloatstoneStairs;
	public static BlockStairs smoothDeathstoneStairs;
	public static BlockStairs springstoneBrickStairs;
	public static BlockStairs floatstoneBrickStairs;
	public static BlockStairs deathstoneBrickStairs;
	public static BlockStairs asphaltStairs;
	public static BlockStairs ringtreePlankStairs;
	public static BlockStairs spheretreePlankStairs;

	//add direction blocks
	public static Block up;
	public static Block down;
	public static Block east;
	public static Block west;
	public static Block north;
	public static Block south;

	//add items
	public static Item darkness;
	public static Item gravity;
	public static Item lethargy;
	public static Item darkstoneHex;
	public static Item dimstoneHex;
	public static Item lightstoneHex;
	public static Item deathstoneHex;
	public static Item floatstoneHex;
	public static Item springstoneHex;
	public static Item bitumenChunk;
	
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


	@Instance("Bacon")
	public static Bacon instance;

	@SidedProxy(clientSide="nethseaar.bacon.client.ClientProxy", serverSide="nethseaar.bacon.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void load(FMLInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(eventmanager);


		proxy.registerRenderers();
		//* --------------------------------------------------------------------------------------INITIALIZE ITEMS----------------------------------------------------
		//item initialization
		darkness = new ItemBacon(5000).setMaxStackSize(64).setUnlocalizedName("darkness").setCreativeTab(CreativeTabs.tabMaterials);
		gravity = new ItemBacon(5001).setMaxStackSize(64).setUnlocalizedName("gravity").setCreativeTab(CreativeTabs.tabMaterials);
		lethargy = new ItemBacon(5002).setMaxStackSize(64).setUnlocalizedName("lethargy").setCreativeTab(CreativeTabs.tabMaterials);
		darkstoneHex = new ItemBacon(5003).setMaxStackSize(64).setUnlocalizedName("darkstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		dimstoneHex = new ItemBacon(5004).setMaxStackSize(64).setUnlocalizedName("dimstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		lightstoneHex = new ItemBacon(5005).setMaxStackSize(64).setUnlocalizedName("lightstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		springstoneHex = new ItemBacon(5008).setMaxStackSize(64).setUnlocalizedName("springstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		floatstoneHex = new ItemBacon(5007).setMaxStackSize(64).setUnlocalizedName("floatstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		deathstoneHex = new ItemBacon(5006).setMaxStackSize(64).setUnlocalizedName("deathstoneHex").setCreativeTab(CreativeTabs.tabMaterials);
		bitumenChunk = new ItemBacon (5009).setMaxStackSize(64).setUnlocalizedName("bitumenChunk").setCreativeTab(CreativeTabs.tabMaterials);
		bitumenInBucket = new ItemBacon(3328).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("bitumenInBucket").setContainerItem(Item.bucketEmpty).setMaxStackSize(1);

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
				GameRegistry.registerItem(darkstoneHex, "darkstoneHex");
				GameRegistry.registerItem(dimstoneHex, "dimstoneHex");
				GameRegistry.registerItem(lightstoneHex, "lightstoneHex");
				GameRegistry.registerItem(springstoneHex, "springstoneHex");
				GameRegistry.registerItem(floatstoneHex, "floatstoneHex");
				GameRegistry.registerItem(deathstoneHex, "deathstoneHex");
				GameRegistry.registerItem(bitumenChunk, "bitumenChunk");
				GameRegistry.registerItem(bitumenInBucket, "bitumenInBucket");
				
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
				
		//* -------------------------------------------------------------------------------------- REGISTER ITEM NAMES----------------------------------------------------
		//item name registry
				LanguageRegistry.addName(darkness, "Darkness");
				LanguageRegistry.addName(gravity, "Gravity");
				LanguageRegistry.addName(lethargy, "Lethargy");
				LanguageRegistry.addName(darkstoneHex, "Darkstone Hex");
				LanguageRegistry.addName(dimstoneHex, "Dimstone Hex");
				LanguageRegistry.addName(lightstoneHex, "Lightstone Hex");
				LanguageRegistry.addName(springstoneHex, "Springtstone Hex");
				LanguageRegistry.addName(floatstoneHex, "Floatstone Hex");
				LanguageRegistry.addName(deathstoneHex, "Deathstone Hex");
				LanguageRegistry.addName(bitumenChunk, "Bitumen Chunk");
				GameRegistry.registerItem(bitumenInBucket, "Bitumen in Bucket");
				
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
		

		//* -------------------------------------------------------------------------------------- INITIALIZE BLOCKS----------------------------------------------------
		//initialize ores
		darknessOre = new OreDarknessOre(4080, 0, Material.rock).setUnlocalizedName("darknessOre");
		gravityOre = new OreGravityOre(4081, 0, Material.rock).setUnlocalizedName("gravityOre");
		lethargyOre = new OreLethargyOre(4082, 0, Material.rock).setUnlocalizedName("lethargyOre");
		bitumenOre = new OreBitumenOre(4083, 0, Material.rock).setUnlocalizedName("bitumenOre");
		
		// initialize vanilla/organic blocks
		stoneWorkbench = new BlockStoneWorkbench(436).setUnlocalizedName("stoneworkbench");
		boneLadder = new BlockBoneLadder(443, 11).setUnlocalizedName("boneladder");
		asphalt = new BlockAsphalt(3513, Material.rock).setUnlocalizedName("asphalt").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		endObsidian = new BlockBacon(3514, Material.rock).setUnlocalizedName("endObsidian").setStepSound(Block.soundStoneFootstep).setHardness(8.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmite = new BlockStalagmite(3515, Material.rock).setUnlocalizedName("stalagmite").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteBase = new BlockStalagmiteBase(3516, Material.rock).setUnlocalizedName("stalagmiteBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		ringtreePlanks = new BlockBacon(3517, Material.wood).setUnlocalizedName("ringtreePlanks").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreePlanks = new BlockBacon(3518, Material.wood).setUnlocalizedName("spheretreePlanks").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeHeart = new BlockBacon(3519, Material.wood).setUnlocalizedName("spheretreeHeart").setStepSound(Block.soundWoodFootstep).setHardness(15.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		ringtree = new BlockRingtree(3520, Material.wood).setUnlocalizedName("ringtreeside").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeLeaves = new BlockBacon(3521, Material.leaves).setUnlocalizedName("spheretreeLeaves").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabDecorations);
		spheretreeDeepwood = new BlockSpheretreeDeepwood(3522, Material.wood).setUnlocalizedName("spheretreeDeepwood").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeBranchwood = new BlockSpheretreeBranchwood(3523, Material.wood).setUnlocalizedName("spheretreeBranchwood").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		
		//initialize stone blocks
		lightstone = new BlockBacon(500, Material.rock).setUnlocalizedName("lightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		dimstone = new BlockBacon(4084, Material.rock).setUnlocalizedName("dimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		darkstone = new BlockBacon(4085, Material.rock).setUnlocalizedName("darkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		springstone = new BlockBacon(4087, Material.rock).setUnlocalizedName("springstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		floatstone = new BlockBacon(4086, Material.rock).setUnlocalizedName("floatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		deathstone = new BlockBacon(4088, Material.cactus).setUnlocalizedName("deathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		
		//initialize condensed stone blocks
		condensedLightstone = new BlockBacon(3501, Material.rock).setUnlocalizedName("condensedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		condensedDimstone = new BlockBacon(4093, Material.rock).setUnlocalizedName("condensedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		condensedDarkstone = new BlockBacon(4089, Material.rock).setUnlocalizedName("condensedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		condensedSpringstone = new BlockBacon(3551,  Material.rock).setUnlocalizedName("condensedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		condensedFloatstone = new BlockBacon(3509, Material.rock).setUnlocalizedName("condensedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		condensedDeathstone = new BlockBacon(3505, Material.rock).setUnlocalizedName("condensedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		
		//initialize cracked stone blocks
		crackedLightstone = new BlockBacon(3503, Material.rock).setUnlocalizedName("crackedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		crackedDimstone = new BlockBacon(4095, Material.rock).setUnlocalizedName("crackedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		crackedDarkstone = new BlockBacon(4091, Material.rock).setUnlocalizedName("crackedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		crackedSpringstone = new BlockBacon(3550,  Material.rock).setUnlocalizedName("crackedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		crackedFloatstone = new BlockBacon(3511, Material.rock).setUnlocalizedName("crackedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		crackedDeathstone = new BlockBacon(3507, Material.rock).setUnlocalizedName("crackedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		
		//initialize smooth stone blocks
		smoothLightstone = new BlockBacon(3502, Material.rock).setUnlocalizedName("smoothLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		smoothDimstone = new BlockBacon(4094, Material.rock).setUnlocalizedName("smoothDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		smoothDarkstone = new BlockBacon(4090, Material.rock).setUnlocalizedName("smoothDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		smoothSpringstone = new BlockBacon(3552,  Material.rock).setUnlocalizedName("smoothSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		smoothFloatstone = new BlockBacon(3510, Material.rock).setUnlocalizedName("smoothFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		smoothDeathstone = new BlockBacon(3506, Material.rock).setUnlocalizedName("smoothDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize stone brick blocks
		lightstoneBrick = new BlockBacon(3504, Material.rock).setUnlocalizedName("lightstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		dimstoneBrick = new BlockBacon(3500, Material.rock).setUnlocalizedName("dimstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		darkstoneBrick = new BlockBacon(4092, Material.rock).setUnlocalizedName("darkstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		springstoneBrick = new BlockBacon(3553,  Material.rock).setUnlocalizedName("springstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		floatstoneBrick = new BlockBacon(3512, Material.rock).setUnlocalizedName("floatstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		deathstoneBrick = new BlockBacon(3508, Material.rock).setUnlocalizedName("deathstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		
		//initialize carved stone blocks
		carvedDarkstone = new BlockBacon(3533,  Material.rock).setUnlocalizedName("carvedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedDimstone = new BlockBacon(3534,  Material.rock).setUnlocalizedName("carvedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedLightstone = new BlockBacon(3535,  Material.rock).setUnlocalizedName("carvedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedSpringstone = new BlockBacon(3537,  Material.rock).setUnlocalizedName("carvedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedFloatstone = new BlockBacon(3538,  Material.rock).setUnlocalizedName("carvedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedDeathstone = new BlockBacon(3536,  Material.rock).setUnlocalizedName("carvedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		
		//initialize direction blocks
		up = new BlockUp(3542,  Material.rock).setUnlocalizedName("up").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		down = new BlockDown(3556,  Material.rock).setUnlocalizedName("down").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		east = new BlockEast(3557,  Material.rock).setUnlocalizedName("east").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		west = new BlockWest(3558,  Material.rock).setUnlocalizedName("west").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		north = new BlockNorth(3559,  Material.rock).setUnlocalizedName("north").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		south = new BlockSouth(3560,  Material.rock).setUnlocalizedName("south").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		
		//initialize stone Stairs
		darkstoneStairs = new StairBacon(3524, Bacon.darkstone, 0);
		dimstoneStairs = new StairBacon(3525, Bacon.dimstone, 0);
		lightstoneStairs = new StairBacon(3526, Bacon.lightstone, 0);
		springstoneStairs = new StairBacon(3543, Bacon.springstone, 0);
		floatstoneStairs = new StairBacon(3544, Bacon.floatstone, 0);
		deathstoneStairs = new StairBacon(3545, Bacon.deathstone, 0);
		
		//initialize smooth stone Stairs
		smoothDarkstoneStairs = new StairBacon(3527, Bacon.smoothDarkstone, 0);
		smoothDimstoneStairs = new StairBacon(3528, Bacon.smoothDimstone, 0);
		smoothLightstoneStairs = new StairBacon(3529, Bacon.smoothLightstone, 0);
		smoothSpringstoneStairs = new StairBacon(3554, Bacon.smoothSpringstone, 0);
		smoothFloatstoneStairs = new StairBacon(3548, Bacon.smoothFloatstone, 0);
		smoothDeathstoneStairs = new StairBacon(3549, Bacon.smoothDeathstone, 0);
		
		//initialize stone brick Stairs
		darkstoneBrickStairs = new StairBacon(3530, Bacon.darkstoneBrick, 0);
		dimstoneBrickStairs = new StairBacon(3531, Bacon.dimstoneBrick, 0);
		lightstoneBrickStairs = new StairBacon(3532, Bacon.lightstoneBrick, 0);
		springstoneBrickStairs = new StairBacon(3555, Bacon.springstoneBrick, 0);
		floatstoneBrickStairs = new StairBacon(3546, Bacon.floatstoneBrick, 0);
		deathstoneBrickStairs = new StairBacon(3547, Bacon.deathstoneBrick, 0);
		
		//initialize vanilla/organic Stairs
		asphaltStairs = new StairBacon(3539, Bacon.asphalt, 0);
		ringtreePlankStairs = new StairBacon(3540, Bacon.ringtreePlanks, 0);
		spheretreePlankStairs = new StairBacon(3541, Bacon.spheretreePlanks, 0);

		//* -------------------------------------------------------------------------------------- REGISTER BLOCKS----------------------------------------------------
		
		//register ores
		GameRegistry.registerBlock(darknessOre, "darknessOre");
		GameRegistry.registerBlock(gravityOre, "gravityOre");
		GameRegistry.registerBlock(lethargyOre, "lethargyOre");
		GameRegistry.registerBlock(bitumenOre, "bitumenOre");
		
		//register stone blocks
		GameRegistry.registerBlock(lightstone, "lightstone");
		GameRegistry.registerBlock(dimstone, "dimstone");
		GameRegistry.registerBlock(darkstone, "darkstone");
		GameRegistry.registerBlock(springstone, "springstone");
		GameRegistry.registerBlock(floatstone, "floatstone");
		GameRegistry.registerBlock(deathstone, "deathstone");
		
		//register condensed stone blocks
		GameRegistry.registerBlock(condensedDarkstone, "condensedDarkstone");
		GameRegistry.registerBlock(condensedDimstone, "condensedDimstone");
		GameRegistry.registerBlock(condensedLightstone, "condensedLightstone");
		GameRegistry.registerBlock(condensedSpringstone, "condensedSpringstone");
		GameRegistry.registerBlock(condensedFloatstone, "condensedFloatstone");
		GameRegistry.registerBlock(condensedDeathstone, "condensedDeathstone");
		
		//register smooth stone blocks
		GameRegistry.registerBlock(smoothDarkstone, "smoothDarkstone");
		GameRegistry.registerBlock(smoothDimstone, "smoothDimstone");
		GameRegistry.registerBlock(smoothLightstone, "smoothLightstone");
		GameRegistry.registerBlock(smoothSpringstone, "smoothSpringstone");
		GameRegistry.registerBlock(smoothFloatstone, "smoothFloatstone");
		GameRegistry.registerBlock(smoothDeathstone, "smoothDeathstone");
		
		//register stone brick blocks
		GameRegistry.registerBlock(darkstoneBrick, "darkstoneBrick");
		GameRegistry.registerBlock(dimstoneBrick, "dimstoneBrick");
		GameRegistry.registerBlock(lightstoneBrick, "lightstoneBrick");
		GameRegistry.registerBlock(springstoneBrick, "springstoneBrick");
		GameRegistry.registerBlock(floatstoneBrick, "floatstoneBrick");
		GameRegistry.registerBlock(deathstoneBrick, "deathstoneBrick");
		
		//register cracked blocks
		GameRegistry.registerBlock(crackedDarkstone, "crackedDarkstone");
		GameRegistry.registerBlock(crackedDimstone, "crackedDimstone");
		GameRegistry.registerBlock(crackedLightstone, "crackedLightstone");
		GameRegistry.registerBlock(crackedSpringstone, "crackedSpringstone");
		GameRegistry.registerBlock(crackedFloatstone, "crackedFloatstone");
		GameRegistry.registerBlock(crackedDeathstone, "crackedDeathstone");
		
		//register vanilla/organic blocks
		GameRegistry.registerBlock(stoneWorkbench, "stoneworkbench");
		GameRegistry.registerBlock(boneLadder, "boneladder");
		GameRegistry.registerBlock(asphalt, "asphalt");
		GameRegistry.registerBlock(endObsidian, "endObsidian");
		GameRegistry.registerBlock(stalagmite, "stalagmite");
		GameRegistry.registerBlock(stalagmiteBase, "stalagmiteBase");
		GameRegistry.registerBlock(ringtreePlanks, "ringtreePlanks");
		GameRegistry.registerBlock(spheretreePlanks, "spheretreePlanks");
		GameRegistry.registerBlock(spheretreeHeart, "spheretreeHeart");
		GameRegistry.registerBlock(ringtree, "ringtree");
		GameRegistry.registerBlock(spheretreeLeaves, "spheretreeLeaves");
		GameRegistry.registerBlock(spheretreeDeepwood, "spheretreeDeepwood");
		GameRegistry.registerBlock(spheretreeBranchwood, "spheretreeBranchwood");
		
		//register carved stone blocks
		GameRegistry.registerBlock(carvedDarkstone, "carvedDarkstone");
		GameRegistry.registerBlock(carvedDimstone, "carvedDimstone");
		GameRegistry.registerBlock(carvedLightstone, "carvedLightstone");
		GameRegistry.registerBlock(carvedSpringstone, "carvedSpringstone");
		GameRegistry.registerBlock(carvedFloatstone, "carvedFloatstone");
		GameRegistry.registerBlock(carvedDeathstone, "carvedDeathstone");
		
		//register stone Stairs
		GameRegistry.registerBlock(darkstoneStairs, "darkstoneStairs");
		GameRegistry.registerBlock(dimstoneStairs, "dimstoneStairs");
		GameRegistry.registerBlock(lightstoneStairs, "lightstoneStairs");
		GameRegistry.registerBlock(springstoneStairs, "springstoneStairs");
		GameRegistry.registerBlock(floatstoneStairs, "floatstoneStairs");
		GameRegistry.registerBlock(deathstoneStairs, "deathstoneStairs");
		
		//register smooth stone Stairs
		GameRegistry.registerBlock(smoothDarkstoneStairs, "smoothDarkstoneStairs");
		GameRegistry.registerBlock(smoothDimstoneStairs, "smoothDimstoneStairs");
		GameRegistry.registerBlock(smoothLightstoneStairs, "smoothLightstoneStairs");
		GameRegistry.registerBlock(smoothSpringstoneStairs, "smoothSpringstoneStairs");
		GameRegistry.registerBlock(smoothFloatstoneStairs, "smoothFloatstoneStairs");
		GameRegistry.registerBlock(smoothDeathstoneStairs, "smoothDeathstoneStairs");
		
		//register stone brick Stairs
		GameRegistry.registerBlock(darkstoneBrickStairs, "darkstoneBrickStairs");
		GameRegistry.registerBlock(dimstoneBrickStairs, "dimstoneBrickStairs");
		GameRegistry.registerBlock(lightstoneBrickStairs, "lightstoneBrickStairs");
		GameRegistry.registerBlock(springstoneBrickStairs, "springstoneBrickStairs");
		GameRegistry.registerBlock(floatstoneBrickStairs, "floatstoneBrickStairs");
		GameRegistry.registerBlock(deathstoneBrickStairs, "deathstoneBrickStairs");
		
		//register vanilla/organic Stairs
		GameRegistry.registerBlock(asphaltStairs, "asphaltStairs");
		GameRegistry.registerBlock(ringtreePlankStairs, "ringtreePlankStairs");
		GameRegistry.registerBlock(spheretreePlankStairs, "spheretreePlankStairs");
		
		//register directional blocks
		GameRegistry.registerBlock(up, "up");
		GameRegistry.registerBlock(down, "down");
		GameRegistry.registerBlock(east, "east");
		GameRegistry.registerBlock(west, "west");
		GameRegistry.registerBlock(north, "north");
		GameRegistry.registerBlock(south, "south");
		
		//* -------------------------------------------------------------------------------------- REGISTER BLOCK NAMES----------------------------------------------------

		//register vanilla/organic block names
		LanguageRegistry.addName(stoneWorkbench, "Crafting Table");
		LanguageRegistry.addName(boneLadder, "Bone Ladder");
		LanguageRegistry.addName(asphalt, "Asphalt");
		LanguageRegistry.addName(endObsidian, "End Obsidian");
		LanguageRegistry.addName(stalagmite, "Stalagmite");
		LanguageRegistry.addName(stalagmiteBase, "Base of Stalagmite");
		LanguageRegistry.addName(ringtreePlanks, "Ringtree Planks");
		LanguageRegistry.addName(spheretreePlanks, "Spheretree Planks");
		LanguageRegistry.addName(spheretreeHeart, "Spheretree Heart");
		LanguageRegistry.addName(ringtree, "Kill You");
		LanguageRegistry.addName(spheretreeLeaves, "Sheretree Leaves");
		LanguageRegistry.addName(spheretreeDeepwood, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeBranchwood, "Spheretree Branchwood");
		
		//register ore names
		LanguageRegistry.addName(darknessOre, "Darkness Ore");
		LanguageRegistry.addName(gravityOre, "Gravity Ore");
		LanguageRegistry.addName(lethargyOre, "Lethargy Ore");
		LanguageRegistry.addName(bitumenOre, "Bitumen Ore");
		
		//register stone block names
		LanguageRegistry.addName(lightstone, "Lightstone");
		LanguageRegistry.addName(dimstone, "Dimstone");
		LanguageRegistry.addName(darkstone, "Darkstone");
		LanguageRegistry.addName(springstone, "Springstone");
		LanguageRegistry.addName(floatstone, "Floatstone");
		LanguageRegistry.addName(deathstone, "Deathstone");
		
		//register condensed stone block names
		LanguageRegistry.addName(condensedDarkstone, "Condensed Darkstone");
		LanguageRegistry.addName(condensedDimstone, "Condensed Dimstone");
		LanguageRegistry.addName(condensedLightstone, "Condensed Lightstone");
		LanguageRegistry.addName(condensedSpringstone, "Condensed Springstone");
		LanguageRegistry.addName(condensedFloatstone, "Condensed Floatstone");
		LanguageRegistry.addName(condensedDeathstone, "Condensed Deathstone");

		//register smooth stone block names
		LanguageRegistry.addName(smoothDarkstone, "Smooth Darkstone");
		LanguageRegistry.addName(smoothDimstone, "Smooth Dimstone");
		LanguageRegistry.addName(smoothLightstone, "Smooth Lightstone");
		LanguageRegistry.addName(smoothSpringstone, "Smooth Springstone");
		LanguageRegistry.addName(smoothFloatstone, "Smooth Floatstone");
		LanguageRegistry.addName(smoothDeathstone, "Smooth Deathstone");
		
		//register stone brick block names
		LanguageRegistry.addName(darkstoneBrick, "Darkstone Brick");
		LanguageRegistry.addName(dimstoneBrick, "Dimstone Brick");
		LanguageRegistry.addName(lightstoneBrick, "Lightstone Brick");
		LanguageRegistry.addName(springstoneBrick, "Springstone Brick");
		LanguageRegistry.addName(floatstoneBrick, "Floatstone Brick");
		LanguageRegistry.addName(deathstoneBrick, "Deathstone Brick");
		
		//register cracked stone block names
		LanguageRegistry.addName(crackedDarkstone, "Cracked Darkstone");
		LanguageRegistry.addName(crackedDimstone, "Cracked Dimstone");
		LanguageRegistry.addName(crackedLightstone, "Cracked Lightstone");
		LanguageRegistry.addName(crackedSpringstone, "Cracked Springstone");
		LanguageRegistry.addName(crackedFloatstone, "Cracked Floatstone");
		LanguageRegistry.addName(crackedDeathstone, "Cracked Deathstone");
	
		//register stone Stairs names
		LanguageRegistry.addName(darkstoneStairs, "Darkstone Stairs");
		LanguageRegistry.addName(dimstoneStairs, "Dimstone Stairs");
		LanguageRegistry.addName(lightstoneStairs, "Lightstone Stairs");
		LanguageRegistry.addName(springstoneStairs, "Springstone Stairs");
		LanguageRegistry.addName(floatstoneStairs, "Floatstone Stairs");
		LanguageRegistry.addName(deathstoneStairs, "Deathstone Stairs");
		
		//register smooth stone Stairs names
		LanguageRegistry.addName(smoothDarkstoneStairs, "Smooth Darkstone Stairs");
		LanguageRegistry.addName(smoothDimstoneStairs, "Smooth Dimstone Stairs");
		LanguageRegistry.addName(smoothLightstoneStairs, "Smooth Lightstone Stairs");
		LanguageRegistry.addName(smoothSpringstoneStairs, "Smooth Springstone Stairs");
		LanguageRegistry.addName(smoothFloatstoneStairs, "Smooth Floatstone Stairs");
		LanguageRegistry.addName(smoothDeathstoneStairs, "Smooth Deathstone Stairs");
		
		//register stone brick Stairs names
		LanguageRegistry.addName(darkstoneBrickStairs, "Darkstone Brick Stairs");
		LanguageRegistry.addName(dimstoneBrickStairs, "Dimstone Brick Stairs");
		LanguageRegistry.addName(lightstoneBrickStairs, "Lightstone Brick Stairs");
		LanguageRegistry.addName(springstoneBrickStairs, "Springstone Brick Stairs");
		LanguageRegistry.addName(floatstoneBrickStairs, "Floatstone Brick Stairs");
		LanguageRegistry.addName(deathstoneBrickStairs, "Deathstone Brick Stairs");
		
		//register carved stone names
		LanguageRegistry.addName(carvedDarkstone, "Carved Darkstone");
		LanguageRegistry.addName(carvedDimstone, "Carved Dimstone");
		LanguageRegistry.addName(carvedLightstone, "Carved Lightstone");
		LanguageRegistry.addName(carvedDeathstone, "Carved Deathstone");
		LanguageRegistry.addName(carvedFloatstone, "Carved Floatstone");
		LanguageRegistry.addName(carvedSpringstone, "Carved Springstone");
		
		//register vanilla/organic Stairs names
		LanguageRegistry.addName(asphaltStairs, "Asphalt Stairs");
		LanguageRegistry.addName(ringtreePlankStairs, "Ringtree Plank Stairs");
		LanguageRegistry.addName(spheretreePlankStairs, "Spheretree Plank Stairs");
		
		//register directional block names
		LanguageRegistry.addName(up, "Ascender");
		LanguageRegistry.addName(down, "Descender");
		LanguageRegistry.addName(east, "Easter");
		LanguageRegistry.addName(west, "Wester");
		LanguageRegistry.addName(north, "Norther");
		LanguageRegistry.addName(south, "Souther");

		//* -------------------------------------------------------------------------------------- SET BLOCK HARVEST LEVELS----------------------------------------------------

		
		//Set Harvest Level
		MinecraftForge.setBlockHarvestLevel(darknessOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(gravityOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lethargyOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(lightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(dimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(darkstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(springstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(condensedDarkstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothDarkstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(crackedDarkstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(darkstoneBrick, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(condensedDimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothDimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(crackedDimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(dimstoneBrick, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(condensedLightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothLightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(crackedLightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(lightstoneBrick, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(condensedDeathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothDeathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(crackedDeathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(deathstoneBrick, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(condensedFloatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothFloatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(crackedFloatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(floatstoneBrick, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(asphalt, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(endObsidian, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(stalagmite, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ringtreePlanks, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreePlanks, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreeHeart, "axe", 3);
		MinecraftForge.setBlockHarvestLevel(ringtree, "axe", 2);
		MinecraftForge.setBlockHarvestLevel(spheretreeLeaves, "shears", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreeDeepwood, "axe", 3);
		MinecraftForge.setBlockHarvestLevel(spheretreeBranchwood, "axe", 2);
		MinecraftForge.setBlockHarvestLevel(asphaltStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ringtreePlankStairs, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreePlankStairs, "axe", 3);
		MinecraftForge.setBlockHarvestLevel(darkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothDarkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothDimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothLightstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(darkstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneBrickStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(carvedDarkstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(carvedDimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(carvedLightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(carvedSpringstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(carvedFloatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(carvedDeathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(up, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(down, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(east, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(west, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(south, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(north, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(springstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothFloatstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothDeathstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneBrickStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(floatstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(springstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothSpringstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(springstoneBrick, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(crackedSpringstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothSpringstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(condensedSpringstone, "pickaxe", 1);

		//itemstacks
		ItemStack crackedDarkstoneStack = new ItemStack(Bacon.crackedDarkstone);
		ItemStack crackedDimstoneStack = new ItemStack(Bacon.crackedDimstone);
		ItemStack crackedLightstoneStack = new ItemStack(Bacon.crackedLightstone);
		ItemStack DarkStoneHexStack = new ItemStack(Bacon.darkstoneHex);
		ItemStack DimStoneHexStack = new ItemStack(Bacon.dimstoneHex);
		ItemStack LightStoneHexStack = new ItemStack(Bacon.lightstoneHex);
		ItemStack DarkStoneStack = new ItemStack(Bacon.darkstone);
		ItemStack DimStoneStack = new ItemStack(Bacon.dimstone);
		ItemStack LightStoneStack = new ItemStack(Bacon.lightstone);
		ItemStack condensedDarkstoneStack = new ItemStack(Bacon.condensedDarkstone);
		ItemStack condensedDimstoneStack = new ItemStack(Bacon.condensedDimstone);
		ItemStack condensedLightstoneStack = new ItemStack(Bacon.condensedLightstone);
		ItemStack smoothDarkstoneStack = new ItemStack(Bacon.smoothDarkstone);
		ItemStack smoothDimstoneStack = new ItemStack(Bacon.smoothDimstone);
		ItemStack smoothLightstoneStack = new ItemStack(Bacon.smoothLightstone);
		ItemStack darkstoneBrickStack = new ItemStack(Bacon.darkstoneBrick);
		ItemStack dimstoneBrickStack = new ItemStack(Bacon.dimstoneBrick);
		ItemStack lightstoneBrickStack = new ItemStack(Bacon.lightstoneBrick);
		ItemStack DeathStoneStackStack = new ItemStack(Bacon.deathstone);
		ItemStack FloatStoneStackStack = new ItemStack(Bacon.floatstone);
		ItemStack deathstoneBrickStack = new ItemStack(Bacon.deathstoneBrick);
		ItemStack floatstoneBrickStack = new ItemStack(Bacon.floatstoneBrick);
		ItemStack smoothDeathstoneStack = new ItemStack(Bacon.smoothDeathstone);
		ItemStack smoothFloatstoneStack = new ItemStack(Bacon.smoothFloatstone);
		ItemStack condensedDeathstoneStack = new ItemStack(Bacon.condensedDeathstone);
		ItemStack condensedFloatstoneStack = new ItemStack(Bacon.condensedFloatstone);
		ItemStack crackedDeathstoneStack = new ItemStack(Bacon.crackedDeathstone);
		ItemStack crackedFloatstoneStack = new ItemStack(Bacon.crackedFloatstone);
		ItemStack DeathStoneHexStack = new ItemStack(Bacon.deathstoneHex);
		ItemStack FloatStoneHexStack = new ItemStack(Bacon.floatstoneHex);
		ItemStack SpringStoneHexStack = new ItemStack (Bacon.springstoneHex);
		ItemStack RingTree = new ItemStack(Bacon.ringtree);
		ItemStack ringtreePlanks = new ItemStack(Bacon.ringtreePlanks);
		ItemStack spheretreeDeepwood = new ItemStack(Bacon.spheretreeDeepwood);
		ItemStack spheretreeBranchwood = new ItemStack(Bacon.spheretreeBranchwood);
		ItemStack spheretreePlanks = new ItemStack(Bacon.spheretreePlanks);
		ItemStack DarkStoneStairs = new ItemStack(Bacon.darkstoneStairs);
		ItemStack LightStoneStairs = new ItemStack(Bacon.lightstoneStairs);
		ItemStack DimStoneStairs = new ItemStack(Bacon.dimstoneStairs);
		ItemStack smoothDarkstoneStairs = new ItemStack(Bacon.smoothDarkstoneStairs);
		ItemStack smoothLightstoneStairs = new ItemStack(Bacon.smoothLightstoneStairs);
		ItemStack smoothDimstoneStairs = new ItemStack(Bacon.smoothDimstoneStairs);
		ItemStack darkstoneBrickStairs = new ItemStack(Bacon.darkstoneBrickStairs);
		ItemStack lightstoneBrickStairs = new ItemStack(Bacon.lightstoneBrickStairs);
		ItemStack dimstoneBrickStairs = new ItemStack(Bacon.dimstoneBrickStairs);
		ItemStack AsphaltStack = new ItemStack(Bacon.asphalt);
		ItemStack SpringStoneStairs = new ItemStack(Bacon.springstoneStairs);
		ItemStack FloatStoneStairs = new ItemStack(Bacon.floatstoneStairs);
		ItemStack DeathStoneStairs = new ItemStack(Bacon.deathstoneStairs);
		ItemStack carvedDimstoneStack = new ItemStack(Bacon.carvedDimstone);
		ItemStack carvedDarkstoneStack = new ItemStack(Bacon.carvedDarkstone);
		ItemStack carvedLightstoneStack = new ItemStack(Bacon.carvedLightstone);
		ItemStack carvedSpringstoneStack = new ItemStack(Bacon.carvedSpringstone);
		ItemStack CarvedFloatStack = new ItemStack(Bacon.carvedFloatstone);
		ItemStack CarvedDeathStack = new ItemStack(Bacon.carvedDeathstone);
		ItemStack smoothSpringstoneStack = new ItemStack(Bacon.smoothSpringstone);
		ItemStack springstoneBrickStack = new ItemStack(Bacon.springstoneBrick);
		ItemStack smoothSpringstoneStairs = new ItemStack(Bacon.smoothSpringstoneStairs);
		ItemStack springstoneBrickStairs = new ItemStack(Bacon.springstoneBrickStairs);

		//shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.darkstone), new ItemStack(Bacon.crackedDarkstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.dimstone), new ItemStack(Bacon.crackedDimstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.lightstone), new ItemStack(Bacon.crackedLightstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedDarkstone), new ItemStack(Bacon.darkstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedDimstone), new ItemStack(Bacon.dimstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedLightstone), new ItemStack(Bacon.lightstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothDarkstone), new ItemStack(Bacon.condensedDarkstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothDimstone), new ItemStack(Bacon.condensedDimstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothLightstone), new ItemStack(Bacon.condensedLightstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.deathstone), new ItemStack(Bacon.crackedDeathstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.floatstone), new ItemStack(Bacon.crackedFloatstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedDeathstone), new ItemStack(Bacon.deathstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedFloatstone), new ItemStack(Bacon.floatstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothDeathstone), new ItemStack(Bacon.condensedDeathstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothFloatstone), new ItemStack(Bacon.condensedFloatstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.ringtreePlanks, 4), new ItemStack(Bacon.ringtree));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.spheretreePlanks, 8), new ItemStack(Bacon.spheretreeDeepwood));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.spheretreePlanks, 4), new ItemStack(Bacon.spheretreeBranchwood));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.darkstone, 6), new ItemStack(Bacon.darkstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.dimstone, 6), new ItemStack(Bacon.dimstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.lightstone, 6), new ItemStack(Bacon.lightstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothDarkstone, 6), new ItemStack(Bacon.smoothDarkstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothDimstone, 6), new ItemStack(Bacon.smoothDimstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothLightstone, 6), new ItemStack(Bacon.smoothLightstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.darkstoneBrick, 6), new ItemStack(Bacon.darkstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.dimstoneBrick, 6), new ItemStack(Bacon.dimstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.lightstoneBrick, 6), new ItemStack(Bacon.lightstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.asphalt, 6), new ItemStack(Bacon.asphaltStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.ringtreePlanks, 6), new ItemStack(Bacon.ringtreePlankStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.spheretreePlanks, 6), new ItemStack(Bacon.spheretreePlankStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.springstone, 6), new ItemStack(Bacon.springstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothSpringstone, 6), new ItemStack(Bacon.smoothSpringstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.springstoneBrick, 6), new ItemStack(Bacon.springstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.smoothSpringstone), new ItemStack(Bacon.condensedSpringstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.condensedSpringstone, 6), new ItemStack(Bacon.springstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Bacon.springstone, 6), new ItemStack(Bacon.crackedSpringstone));

		//shaped recipes
		GameRegistry.addRecipe(new ItemStack(Bacon.darkstoneBrick, 4), "xx", "xx",
				'x', smoothDarkstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.dimstoneBrick, 4),  "xx", "xx",
				'x', smoothDimstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.lightstoneBrick, 4),  "xx", "xx",
				'x', smoothLightstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.deathstoneBrick, 4),  "xx", "xx",
				'x', smoothDeathstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.floatstoneBrick, 4),  "xx", "xx",
				'x', smoothFloatstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedDarkstone, 4), "xx", "xx",
				'x', darkstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedDimstone, 4),  "xx", "xx",
				'x', dimstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedLightstone, 4),  "xx", "xx",
				'x', lightstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedDeathstone, 4),  "xx", "xx",
				'x', deathstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedFloatstone, 4),  "xx", "xx",
				'x', floatstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.carvedSpringstone, 4),  "xx", "xx",
				'x', floatstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.springstoneBrick, 4),  "xx", "xx",
				'x', smoothSpringstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.crackedDarkstone), "xxx", "xxx", "xxx",
				'x', DarkStoneHexStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.crackedDimstone), "xxx", "xxx", "xxx",
				'x', DimStoneHexStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.crackedLightstone), "xxx", "xxx", "xxx",
				'x', LightStoneHexStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.crackedDeathstone), "xxx", "xxx", "xxx",
				'x', DeathStoneHexStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.crackedFloatstone), "xxx", "xxx", "xxx",
				'x', FloatStoneHexStack);
		 GameRegistry.addRecipe(new ItemStack(Bacon.crackedSpringstone), "xxx", "xxx", "xxx",
	            'x', SpringStoneHexStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.darkstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', DarkStoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.lightstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', LightStoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.dimstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', DimStoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.smoothDarkstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', smoothDarkstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.smoothLightstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', smoothLightstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.smoothDimstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', smoothDimstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.darkstoneBrickStairs, 6), "x  ", "xx ", "xxx",
				'x', darkstoneBrickStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.lightstoneBrickStairs, 6), "x  ", "xx ", "xxx",
				'x', LightStoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.dimstoneBrickStairs, 6), "x  ", "xx ", "xxx",
				'x', DimStoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.asphaltStairs, 6), "x  ", "xx ", "xxx",
				'x', AsphaltStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.ringtreePlankStairs, 6), "x  ", "xx ", "xxx",
				'x', ringtreePlanks);
		GameRegistry.addRecipe(new ItemStack(Bacon.spheretreePlankStairs, 6), "x  ", "xx ", "xxx",
				'x', spheretreePlanks);
		GameRegistry.addRecipe(new ItemStack(Bacon.smoothSpringstoneStairs, 6), "x  ", "xx ", "xxx",
				'x', smoothSpringstoneStack);
		GameRegistry.addRecipe(new ItemStack(Bacon.springstoneBrickStairs, 6), "x  ", "xx ", "xxx",
				'x', springstoneBrickStack);


		//smelting recipes
		GameRegistry.addSmelting(Bacon.darkstoneBrick.blockID, new ItemStack(Bacon.smoothDarkstone), 0.1f);
		GameRegistry.addSmelting(Bacon.dimstoneBrick.blockID, new ItemStack(Bacon.smoothDimstone), 0.3f);
		GameRegistry.addSmelting(Bacon.lightstoneBrick.blockID, new ItemStack(Bacon.smoothLightstone), 0.5f);
		GameRegistry.addSmelting(Bacon.smoothDarkstone.blockID, new ItemStack(Bacon.condensedDarkstone), 0.1f);
		GameRegistry.addSmelting(Bacon.smoothDimstone.blockID, new ItemStack(Bacon.condensedDimstone), 0.3f);
		GameRegistry.addSmelting(Bacon.smoothLightstone.blockID, new ItemStack(Bacon.condensedLightstone), 0.5f);
		GameRegistry.addSmelting(Bacon.condensedDarkstone.blockID, new ItemStack(Bacon.darkstone), 0.1f);
		GameRegistry.addSmelting(Bacon.condensedDimstone.blockID, new ItemStack(Bacon.dimstone), 0.3f);
		GameRegistry.addSmelting(Bacon.condensedLightstone.blockID, new ItemStack(Bacon.lightstone), 0.5f);
		GameRegistry.addSmelting(Bacon.darkstone.blockID, new ItemStack(Bacon.crackedDarkstone), 0.1f);
		GameRegistry.addSmelting(Bacon.dimstone.blockID, new ItemStack(Bacon.crackedDimstone), 0.3f);
		GameRegistry.addSmelting(Bacon.lightstone.blockID, new ItemStack(Bacon.crackedLightstone), 0.5f);
		GameRegistry.addSmelting(Bacon.crackedDarkstone.blockID, new ItemStack(Bacon.darkstoneHex, 9), 0.1f);
		GameRegistry.addSmelting(Bacon.crackedDimstone.blockID, new ItemStack(Bacon.dimstoneHex, 9), 0.3f);
		GameRegistry.addSmelting(Bacon.crackedLightstone.blockID, new ItemStack(Bacon.lightstoneHex, 9), 0.5f);
		GameRegistry.addSmelting(Bacon.crackedDeathstone.blockID, new ItemStack(Bacon.deathstoneHex, 9), 0.5f);
		GameRegistry.addSmelting(Bacon.crackedFloatstone.blockID, new ItemStack(Bacon.floatstoneHex, 9), 0.5f);
		GameRegistry.addSmelting(Bacon.condensedDeathstone.blockID, new ItemStack(Bacon.deathstone), 0.8f);
		GameRegistry.addSmelting(Bacon.condensedFloatstone.blockID, new ItemStack(Bacon.floatstone), 0.8f);
		GameRegistry.addSmelting(Bacon.deathstone.blockID, new ItemStack(Bacon.crackedDeathstone), 0.8f);
		GameRegistry.addSmelting(Bacon.floatstone.blockID, new ItemStack(Bacon.crackedFloatstone), 0.8f);
		GameRegistry.addSmelting(Bacon.smoothDeathstone.blockID, new ItemStack(Bacon.condensedDeathstone), 0.8f);
		GameRegistry.addSmelting(Bacon.smoothFloatstone.blockID, new ItemStack(Bacon.condensedFloatstone), 0.8f);
		GameRegistry.addSmelting(Bacon.deathstoneBrick.blockID, new ItemStack(Bacon.smoothDeathstone), 0.8f);
		GameRegistry.addSmelting(Bacon.floatstoneBrick.blockID, new ItemStack(Bacon.smoothFloatstone), 0.8f);
		GameRegistry.addSmelting(Bacon.smoothSpringstone.blockID, new ItemStack(Bacon.condensedSpringstone), 0.8f);
		GameRegistry.addSmelting(Bacon.springstoneBrick.blockID, new ItemStack(Bacon.smoothSpringstone), 0.8f);
		GameRegistry.addSmelting(Bacon.condensedSpringstone.blockID, new ItemStack(Bacon.springstone), 0.8f);
		GameRegistry.addSmelting(Bacon.springstone.blockID, new ItemStack(Bacon.crackedSpringstone), 0.8f);
		GameRegistry.addSmelting(Bacon.crackedSpringstone.blockID, new ItemStack(Bacon.springstoneHex, 9), 0.8f);
		
		String toolPatterns[][] = {{"xxx", " i ", " i "},{"xx", "xi", " i"},{"x", "i", "i"},{"xx", " i", " i"},{"x", "x", "i"}};
		Object items[][] = {{Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold},
				{stoneBonePick, ironBonePick, diamondBonePick, goldBonePick},
				{stoneBoneAxe, ironBoneAxe, diamondBoneAxe, goldBoneAxe},
				{stoneBoneShovel, ironBoneShovel, diamondBoneShovel, goldBoneShovel},
				{stoneBoneHoe, ironBoneHoe, diamondBoneHoe, goldBoneHoe},
				{stoneBoneSword, ironBoneSword, diamondBoneSword, goldBoneSword}};

		for (int i = 0; i < items[0].length; i++) {
			Object material = items[0][i];
			for (int j = 0; j < items.length - 1; j++) {
				Item result = (Item)items[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result), new Object[] {toolPatterns[j], 'i', Item.bone, 'x', material});
			}
		}
		
		ItemStack oneBitChunk = new ItemStack(bitumenChunk);
		ItemStack oneBucket = new ItemStack(Item.bucketEmpty);
		//ItemStack oneBucketBit = new ItemStack(bitumenBucket);
		ItemStack oneBitInBucket = new ItemStack(bitumenInBucket);

		GameRegistry.addRecipe(oneBitInBucket, "x", "y", 'x', oneBitChunk, 'y', oneBucket);
		GameRegistry.addShapelessRecipe(new ItemStack(flintTool), Item.flint);
		GameRegistry.addShapelessRecipe(oneBitChunk, oneBitInBucket);
		//GameRegistry.addSmelting(bitumenInBucket.itemID, oneBucketBit, 1.0F);
		GameRegistry.addSmelting(Bacon.bitumenOre.blockID, oneBitChunk, 1.0F);
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}