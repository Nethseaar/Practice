package nethseaar.bacon;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import nethseaar.bacon.bases.BlockBacon;
import nethseaar.bacon.bases.StairBacon;
import nethseaar.bacon.blocks.BlockAsphalt;
import nethseaar.bacon.blocks.BlockBitumenFlowing;
import nethseaar.bacon.blocks.BlockBitumenStationary;
import nethseaar.bacon.blocks.BlockBoneLadder;
import nethseaar.bacon.blocks.BlockBoneTorch;
import nethseaar.bacon.blocks.BlockBrainMushroom;
import nethseaar.bacon.blocks.BlockCondenser;
import nethseaar.bacon.blocks.BlockCrackedDeathstone;
import nethseaar.bacon.blocks.BlockDarkstone;
import nethseaar.bacon.blocks.BlockDeathstone;
import nethseaar.bacon.blocks.BlockDimstone;
import nethseaar.bacon.blocks.BlockDown;
import nethseaar.bacon.blocks.BlockEast;
import nethseaar.bacon.blocks.BlockFloatstone;
import nethseaar.bacon.blocks.BlockLantern;
import nethseaar.bacon.blocks.BlockLightstone;
import nethseaar.bacon.blocks.BlockNorth;
import nethseaar.bacon.blocks.BlockPort;
import nethseaar.bacon.blocks.BlockPurpleBerry;
import nethseaar.bacon.blocks.BlockRingtree;
import nethseaar.bacon.blocks.BlockSouth;
import nethseaar.bacon.blocks.BlockSpheretreeBranchwood;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwood;
import nethseaar.bacon.blocks.BlockSpringstone;
import nethseaar.bacon.blocks.BlockStalagmite;
import nethseaar.bacon.blocks.BlockStalagmiteBase;
import nethseaar.bacon.blocks.BlockStalagmiteLevelFive;
import nethseaar.bacon.blocks.BlockStalagmiteLevelFiveBase;
import nethseaar.bacon.blocks.BlockStalagmiteLevelFour;
import nethseaar.bacon.blocks.BlockStalagmiteLevelFourBase;
import nethseaar.bacon.blocks.BlockStalagmiteLevelThree;
import nethseaar.bacon.blocks.BlockStalagmiteLevelThreeBase;
import nethseaar.bacon.blocks.BlockStalagmiteLevelTwo;
import nethseaar.bacon.blocks.BlockStalagmiteLevelTwoBase;
import nethseaar.bacon.blocks.BlockStoneWorkbench;
import nethseaar.bacon.blocks.BlockUp;
import nethseaar.bacon.blocks.BlockWest;
import nethseaar.bacon.blocks.OreBitumenOre;
import nethseaar.bacon.blocks.OreDarknessOre;
import nethseaar.bacon.blocks.OreGravityOre;
import nethseaar.bacon.blocks.OreLethargyOre;
import nethseaar.bacon.items.ItemBlockBacon;
import nethseaar.bacon.references.BlockIDs;
import nethseaar.bacon.references.BlockNames;

public class BaconBlocks {

	public static String[] darkstoneNames = {
		"Darkstone", "Cracked Darkstone", "Condensed Darkstone", "Smooth Darkstone", "Darkstone Brick", "Carved Darkstone", 
		"Springstone*", "Cracked Springstone*", "Condensed Springstone*", "Smooth Springstone*", "Springstone Brick*", "Carved Springstone*"
	};

	public static String[] dimstoneNames = {
		"Dimstone", "Cracked Dimstone", "Condensed Dimstone", "Smooth Dimstone", "Dimstone Brick", "Carved Dimstone",
		"Floatstone*", "Cracked Floatstone*", "Condensed Floatstone*", "Smooth Floatstone*", "Floatstone Brick*", "Carved Floatstone*"
	};

	public static String[] lightstoneNames = {
		"Lightstone", "Cracked Lightstone", "Condensed Lightstone", "Smooth Lightstone", "Lightstone Brick", "Carved Lightstone",
		"Deathstone*", "Cracked Deathstone*", "Condensed Deathstone*", "Smooth Deathstone*", "Deathstone Brick*", "Carved Deathstone*"
	};

	public static String[] springstoneNames = {
		"Springstone", "Cracked Springstone", "Condensed Springstone", "Smooth Springstone", "Springstone Brick", "Carved Springstone"
	};

	public static String[] floatstoneNames = {
		"Floatstone", "Cracked Floatstone", "Condensed Floatstone", "Smooth Floatstone", "Floatstone Brick", "Carved Floatstone"
	};

	public static String[] deathstoneNames = {
		"Deathstone", "Cracked Deathstone**", "Condensed Deathstone", "Smooth Deathstone", "Deathstone Brick", "Carved Deathstone"
	};

	public static String[] oreNames = {
		"Darkness Ore", "Gravity Ore", "Lethargy Ore", "Bitumen Ore"
	};
		
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

	public static Block crackedDeathstone;

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
	public static Block lantern;
	public static Block boneTorch;
	public static Block brainMushroom;
	public static Block bitumenFlowing;
	public static Block bitumenStill;
	public static Block purpleBerry;
	public static Block greenBerry;
	public static Block spheretreeDeepwoodBranch;
	public static Block spheretreeDeepwoodBranch1;
	public static Block spheretreeDeepwood1;
	public static Block spheretreeCorewood;
	public static Block spheretreeBranchwood1;
	public static Block spheretreeDeepwoodCorner;
	public static Block spheretreeDeepwoodCorner1;
	
	//stalagmite levels
	public static Block stalagmiteLevelTwo;
	public static Block stalagmiteLevelThree;
	public static Block stalagmiteLevelFour;
	public static Block stalagmiteLevelFive;

	//stalagmite base levels
	public static Block stalagmiteLevelTwoBase;
	public static Block stalagmiteLevelThreeBase;
	public static Block stalagmiteLevelFourBase;
	public static Block stalagmiteLevelFiveBase;

	//add Stairs	
	public static Block darkstoneStairs;
	public static Block dimstoneStairs;
	public static Block lightstoneStairs;
	public static Block springstoneStairs;
	public static Block floatstoneStairs;
	public static Block deathstoneStairs;

	//add 	
	public static Block smoothDarkstoneStairs;
	public static Block smoothDimstoneStairs;
	public static Block smoothLightstoneStairs;
	public static Block smoothSpringstoneStairs;
	public static Block smoothFloatstoneStairs;
	public static Block smoothDeathstoneStairs;

	//add 	
	public static Block darkstoneBrickStairs;
	public static Block dimstoneBrickStairs;
	public static Block lightstoneBrickStairs;
	public static Block springstoneBrickStairs;
	public static Block floatstoneBrickStairs;
	public static Block deathstoneBrickStairs;

	public static Block asphaltStairs;
	public static Block spheretreePlankStairs;
	public static Block ringtreePlankStairs;


	//add direction blocks
	public static Block up;
	public static Block down;
	public static Block east;
	public static Block west;
	public static Block north;
	public static Block south;

	// Add Machines
	public static Block condenserIdle;
	public static Block condenserActive;
	
	//add Portal block
	//public static Block port;

	@Init
	public static void init() {

		//* -------------------------------------------------------------------------------------- INITIALIZE BLOCKS----------------------------------------------------
		//initialize ores
		darknessOre = new OreDarknessOre(BlockIDs.darknessOre, 0, Material.rock).setUnlocalizedName(BlockNames.darknessOreName);
		gravityOre = new OreGravityOre(BlockIDs.gravityOre, 0, Material.rock).setUnlocalizedName(BlockNames.gravityOreName);
		lethargyOre = new OreLethargyOre(BlockIDs.lethargyOre, 0, Material.rock).setUnlocalizedName(BlockNames.lethargyOreName);
		bitumenOre = new OreBitumenOre(BlockIDs.bitumenOre, 0, Material.rock).setUnlocalizedName(BlockNames.bitumenOreName);

		// initialize vanilla/organic blocks
		stoneWorkbench = new BlockStoneWorkbench(BlockIDs.stoneWorkbench).setUnlocalizedName(BlockNames.stoneWorkbenchName);
		boneLadder = new BlockBoneLadder(BlockIDs.boneLadder, 11).setUnlocalizedName(BlockNames.boneLadderName);
		asphalt = new BlockAsphalt(BlockIDs.asphalt, Material.rock).setUnlocalizedName(BlockNames.asphaltName).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		endObsidian = new BlockBacon(BlockIDs.endObsidian, Material.rock).setUnlocalizedName(BlockNames.endObsidianName).setStepSound(Block.soundStoneFootstep).setHardness(8.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmite = new BlockStalagmite(BlockIDs.stalagmite, Material.rock).setUnlocalizedName(BlockNames.stalagmiteName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteBase = new BlockStalagmiteBase(BlockIDs.stalagmiteBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		ringtreePlanks = new BlockBacon(BlockIDs.ringtreePlanks, Material.wood).setUnlocalizedName(BlockNames.ringtreePlanksName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreePlanks = new BlockBacon(BlockIDs.spheretreePlanks, Material.wood).setUnlocalizedName(BlockNames.spheretreePlanksName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeHeart = new BlockBacon(BlockIDs.spheretreeHeart, Material.wood).setUnlocalizedName(BlockNames.spheretreeHeartName).setStepSound(Block.soundWoodFootstep).setHardness(15.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		ringtree = new BlockRingtree(BlockIDs.ringtree, Material.wood).setUnlocalizedName(BlockNames.ringtreeName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeLeaves = new BlockBacon(BlockIDs.spheretreeLeaves, Material.leaves).setUnlocalizedName(BlockNames.spheretreeLeavesName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwood = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwood, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeBranchwood = new BlockSpheretreeBranchwood(BlockIDs.spheretreeBranchwood, Material.wood).setUnlocalizedName(BlockNames.spheretreeBranchwoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		lantern = new BlockLantern(BlockIDs.lantern, 0).setUnlocalizedName(BlockNames.lanternName).setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(BlockIDs.boneTorch, 1).setUnlocalizedName(BlockNames.boneTorchName).setLightValue(0.9375F);
		brainMushroom = new BlockBrainMushroom(BlockIDs.brainMushroom, "brainMushroom").setUnlocalizedName(BlockNames.brainMushroomName).setCreativeTab(Bacon.tabSubItems);
		bitumenFlowing = new BlockBitumenFlowing(BlockIDs.bitumenStill - 1, Material.water).setUnlocalizedName(BlockNames.bitumenFlowingName);
		bitumenStill = new BlockBitumenStationary(BlockIDs.bitumenStill, Material.water).setUnlocalizedName(BlockNames.bitumenStillName);
		purpleBerry = new BlockPurpleBerry(BlockIDs.purpleBerry, Material.plants).setUnlocalizedName(BlockNames.purpleBerryName);
		greenBerry = new BlockPurpleBerry(BlockIDs.purpleBerry, Material.plants).setUnlocalizedName(BlockNames.purpleBerryName);
		
		spheretreeDeepwoodBranch = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwoodBranch, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodBranchName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodBranch1 = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwoodBranch1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodBranch1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwood1 = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwood1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwood1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeCorewood = new BlockSpheretreeDeepwood(BlockIDs.spheretreeCorewood, Material.wood).setUnlocalizedName(BlockNames.spheretreeCorewoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeBranchwood1 = new BlockSpheretreeDeepwood(BlockIDs.spheretreeBranchwood1, Material.wood).setUnlocalizedName(BlockNames.spheretreeBranchwood1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodCorner = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwoodCorner, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodCornerName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodCorner1 = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwoodCorner1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodCorner1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		
		
		//initialize stalagmite level blocks
		stalagmiteLevelTwo = new BlockStalagmiteLevelTwo(BlockIDs.stalagmiteLevelTwo, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelTwoName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelThree = new BlockStalagmiteLevelThree(BlockIDs.stalagmiteLevelThree, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelThreeName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFour = new BlockStalagmiteLevelFour(BlockIDs.stalagmiteLevelFour, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFourName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFive = new BlockStalagmiteLevelFive(BlockIDs.stalagmiteLevelFive, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFiveName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);

		//initialize stalagmite base level blocks
		stalagmiteLevelTwoBase = new BlockStalagmiteLevelTwoBase(BlockIDs.stalagmiteLevelTwoBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelTwoBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelThreeBase = new BlockStalagmiteLevelThreeBase(BlockIDs.stalagmiteLevelThreeBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelThreeBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFourBase = new BlockStalagmiteLevelFourBase(BlockIDs.stalagmiteLevelFourBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFourBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFiveBase = new BlockStalagmiteLevelFiveBase(BlockIDs.stalagmiteLevelFiveBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFiveBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);


		//initialize stone blocks
		lightstone = new BlockLightstone(BlockIDs.lightstone, Material.rock).setUnlocalizedName(BlockNames.lightstoneName);
		dimstone = new BlockDimstone(BlockIDs.dimstone, Material.rock).setUnlocalizedName(BlockNames.dimstoneName);
		darkstone = new BlockDarkstone(BlockIDs.darkstone, Material.rock).setUnlocalizedName(BlockNames.darkstoneName);
		springstone = new BlockSpringstone(BlockIDs.springstone, Material.rock).setUnlocalizedName(BlockNames.springstoneName);
		floatstone = new BlockFloatstone(BlockIDs.floatstone, Material.rock).setUnlocalizedName(BlockNames.floatstoneName);
		deathstone = new BlockDeathstone(BlockIDs.deathstone, Material.cactus).setUnlocalizedName(BlockNames.deathstoneName);

		crackedDeathstone = new BlockCrackedDeathstone(BlockIDs.crackedDeathstone, Material.rock).setUnlocalizedName(BlockNames.crackedDeathstoneName).setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive).setLightValue(1.0F);

		//initialize direction blocks
		up = new BlockUp(BlockIDs.up,  Material.rock).setUnlocalizedName(BlockNames.upName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		down = new BlockDown(BlockIDs.down,  Material.rock).setUnlocalizedName(BlockNames.downName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		east = new BlockEast(BlockIDs.east,  Material.rock).setUnlocalizedName(BlockNames.eastName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		west = new BlockWest(BlockIDs.west,  Material.rock).setUnlocalizedName(BlockNames.westName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		north = new BlockNorth(BlockIDs.north,  Material.rock).setUnlocalizedName(BlockNames.northName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		south = new BlockSouth(BlockIDs.south,  Material.rock).setUnlocalizedName(BlockNames.southName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);

		//initialize stone Stairs
		darkstoneStairs = new StairBacon(BlockIDs.darkstoneStairs, BaconBlocks.darkstone, 0).setUnlocalizedName(BlockNames.darkstoneStairsName);
		dimstoneStairs = new StairBacon(BlockIDs.dimstoneStairs, BaconBlocks.dimstone, 0).setUnlocalizedName(BlockNames.dimstoneStairsName);
		lightstoneStairs = new StairBacon(BlockIDs.lightstoneStairs, BaconBlocks.lightstone, 0).setUnlocalizedName(BlockNames.lightstoneStairsName);
		springstoneStairs = new StairBacon(BlockIDs.springstoneStairs, BaconBlocks.springstone, 0).setUnlocalizedName(BlockNames.springstoneStairsName);
		floatstoneStairs = new StairBacon(BlockIDs.floatstoneStairs, BaconBlocks.floatstone, 0).setUnlocalizedName(BlockNames.floatstoneStairsName);
		deathstoneStairs = new StairBacon(BlockIDs.deathstoneStairs, BaconBlocks.deathstone, 0).setUnlocalizedName(BlockNames.deathstoneStairsName);

		//initialize stone Stairs
		smoothDarkstoneStairs = new StairBacon(BlockIDs.smoothDarkstoneStairs, BaconBlocks.darkstone, 3).setUnlocalizedName(BlockNames.smoothDarkstoneStairsName);
		smoothDimstoneStairs = new StairBacon(BlockIDs.smoothDimstoneStairs, BaconBlocks.dimstone, 3).setUnlocalizedName(BlockNames.smoothDimstoneStairsName);
		smoothLightstoneStairs = new StairBacon(BlockIDs.smoothLightstoneStairs, BaconBlocks.lightstone, 3).setUnlocalizedName(BlockNames.smoothLightstoneStairsName);
		smoothSpringstoneStairs = new StairBacon(BlockIDs.smoothSpringstoneStairs, BaconBlocks.springstone, 3).setUnlocalizedName(BlockNames.smoothSpringstoneStairsName);
		smoothFloatstoneStairs = new StairBacon(BlockIDs.smoothFloatstoneStairs, BaconBlocks.floatstone, 3).setUnlocalizedName(BlockNames.smoothFloatstoneStairsName);
		smoothDeathstoneStairs = new StairBacon(BlockIDs.smoothDeathstoneStairs, BaconBlocks.deathstone, 2).setUnlocalizedName(BlockNames.smoothDeathstoneStairsName);

		//initialize stone Stairs
		darkstoneBrickStairs = new StairBacon(BlockIDs.darkstoneBrickStairs, BaconBlocks.darkstone, 4).setUnlocalizedName(BlockNames.darkstoneBrickStairsName);
		dimstoneBrickStairs = new StairBacon(BlockIDs.dimstoneBrickStairs, BaconBlocks.dimstone, 4).setUnlocalizedName(BlockNames.dimstoneBrickStairsName);
		lightstoneBrickStairs = new StairBacon(BlockIDs.lightstoneBrickStairs, BaconBlocks.lightstone, 4).setUnlocalizedName(BlockNames.lightstoneBrickStairsName);
		springstoneBrickStairs = new StairBacon(BlockIDs.springstoneBrickStairs, BaconBlocks.springstone, 4).setUnlocalizedName(BlockNames.springstoneBrickStairsName);
		floatstoneBrickStairs = new StairBacon(BlockIDs.floatstoneBrickStairs, BaconBlocks.floatstone, 4).setUnlocalizedName(BlockNames.floatstoneBrickStairsName);
		deathstoneBrickStairs = new StairBacon(BlockIDs.deathstoneBrickStairs, BaconBlocks.deathstone, 3).setUnlocalizedName(BlockNames.deathstoneBrickStairsName);

		//initialize vanilla/organic Stairs
		asphaltStairs = new StairBacon(BlockIDs.asphaltStairs, BaconBlocks.asphalt, 0).setUnlocalizedName(BlockNames.asphaltStairsName);
		ringtreePlankStairs = new StairBacon(BlockIDs.ringtreePlankStairs, BaconBlocks.ringtreePlanks, 0).setUnlocalizedName(BlockNames.ringtreePlankStairsName);
		spheretreePlankStairs = new StairBacon(BlockIDs.spheretreePlankStairs, BaconBlocks.spheretreePlanks, 0).setUnlocalizedName(BlockNames.spheretreePlankStairsName);
		
		// Initialize Machine Blocks
		condenserIdle = new BlockCondenser(BlockIDs.condenserIdle, false).setUnlocalizedName(BlockNames.condenserIdleName).setCreativeTab(Bacon.tabSubItems);
		condenserActive = new BlockCondenser(BlockIDs.condenserActive, true).setUnlocalizedName(BlockNames.condenserActiveName);

		//initialize portal
		//port = new BlockPort(834, 0);

		//* -------------------------------------------------------------------------------------- REGISTER BLOCKS----------------------------------------------------

		//register ores
		GameRegistry.registerBlock(darknessOre, BlockNames.darknessOreName);
		GameRegistry.registerBlock(gravityOre, BlockNames.gravityOreName);
		GameRegistry.registerBlock(lethargyOre, BlockNames.lethargyOreName);
		GameRegistry.registerBlock(bitumenOre, BlockNames.bitumenOreName);

		//register stone blocks
		GameRegistry.registerBlock(lightstone, ItemBlockBacon.class, "Bacon" + (lightstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(dimstone, ItemBlockBacon.class, "Bacon" + (dimstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(darkstone, ItemBlockBacon.class, "Bacon" + (darkstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(springstone, ItemBlockBacon.class, "Bacon" + (springstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(floatstone, ItemBlockBacon.class, "Bacon" + (floatstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(deathstone, ItemBlockBacon.class, "Bacon" + (deathstone.getUnlocalizedName().substring(5)));

		GameRegistry.registerBlock(crackedDeathstone, BlockNames.crackedDeathstoneName);

		//register vanilla/organic blocks
		GameRegistry.registerBlock(stoneWorkbench, BlockNames.stoneWorkbenchName);
		OreDictionary.registerOre("craftingtable", stoneWorkbench);
		GameRegistry.registerBlock(boneLadder, BlockNames.boneLadderName);
		GameRegistry.registerBlock(asphalt, BlockNames.asphaltName);
		GameRegistry.registerBlock(endObsidian, BlockNames.endObsidianName);
		GameRegistry.registerBlock(stalagmite, BlockNames.stalagmiteName);
		GameRegistry.registerBlock(stalagmiteBase, BlockNames.stalagmiteBaseName);
		GameRegistry.registerBlock(ringtreePlanks, BlockNames.ringtreePlanksName);
		GameRegistry.registerBlock(spheretreePlanks, BlockNames.spheretreePlanksName);
		OreDictionary.registerOre("plankWood", spheretreePlanks);
		OreDictionary.registerOre("plankWood", ringtreePlanks);
		GameRegistry.registerBlock(spheretreeHeart, BlockNames.spheretreeHeartName);
		GameRegistry.registerBlock(ringtree, BlockNames.ringtreeName);
		GameRegistry.registerBlock(spheretreeLeaves, BlockNames.spheretreeLeavesName);
		GameRegistry.registerBlock(spheretreeDeepwood, BlockNames.spheretreeDeepwoodName);
		GameRegistry.registerBlock(spheretreeBranchwood, BlockNames.spheretreeBranchwoodName);
		GameRegistry.registerBlock(lantern, BlockNames.lanternName);
		GameRegistry.registerBlock(boneTorch, BlockNames.boneTorchName);
		GameRegistry.registerBlock(brainMushroom, BlockNames.brainMushroomName);
		GameRegistry.registerBlock(bitumenFlowing, BlockNames.bitumenFlowingName);
		GameRegistry.registerBlock(bitumenStill, BlockNames.bitumenStillName);
		GameRegistry.registerBlock(purpleBerry, BlockNames.purpleBerryName);
		
		GameRegistry.registerBlock(greenBerry, ItemBlockBacon.class, "Bacon" + (greenBerry.getUnlocalizedName().substring(5)));
		
		GameRegistry.registerBlock(spheretreeDeepwoodBranch, BlockNames.spheretreeDeepwoodBranchName);
		GameRegistry.registerBlock(spheretreeDeepwoodBranch1, BlockNames.spheretreeDeepwoodBranch1Name);
		GameRegistry.registerBlock(spheretreeDeepwood1, BlockNames.spheretreeDeepwood1Name);
		GameRegistry.registerBlock(spheretreeCorewood, BlockNames.spheretreeCorewoodName);
		GameRegistry.registerBlock(spheretreeBranchwood1, BlockNames.spheretreeBranchwood1Name);
		GameRegistry.registerBlock(spheretreeDeepwoodCorner, BlockNames.spheretreeDeepwoodCornerName);
		GameRegistry.registerBlock(spheretreeDeepwoodCorner1, BlockNames.spheretreeDeepwoodCorner1Name);

		//register stalagmite level blocks
		GameRegistry.registerBlock(stalagmiteLevelTwo, BlockNames.stalagmiteLevelTwoName);
		GameRegistry.registerBlock(stalagmiteLevelThree, BlockNames.stalagmiteLevelThreeName);
		GameRegistry.registerBlock(stalagmiteLevelFour, BlockNames.stalagmiteLevelFourName);
		GameRegistry.registerBlock(stalagmiteLevelFive, BlockNames.stalagmiteLevelFiveName);

		//register stalagmite base level blocks
		GameRegistry.registerBlock(stalagmiteLevelTwoBase, BlockNames.stalagmiteLevelTwoBaseName);
		GameRegistry.registerBlock(stalagmiteLevelThreeBase, BlockNames.stalagmiteLevelThreeBaseName);
		GameRegistry.registerBlock(stalagmiteLevelFourBase, BlockNames.stalagmiteLevelFourBaseName);
		GameRegistry.registerBlock(stalagmiteLevelFiveBase, BlockNames.stalagmiteLevelFiveBaseName);


		//register stone Stairs
		GameRegistry.registerBlock(darkstoneStairs, BlockNames.darkstoneStairsName);
		GameRegistry.registerBlock(dimstoneStairs, BlockNames.dimstoneStairsName);
		GameRegistry.registerBlock(lightstoneStairs, BlockNames.lightstoneStairsName);
		GameRegistry.registerBlock(springstoneStairs, BlockNames.springstoneStairsName);
		GameRegistry.registerBlock(floatstoneStairs, BlockNames.floatstoneStairsName);
		GameRegistry.registerBlock(deathstoneStairs, BlockNames.deathstoneStairsName);

		//register stone Stairs
		GameRegistry.registerBlock(smoothDarkstoneStairs, BlockNames.smoothDarkstoneStairsName);
		GameRegistry.registerBlock(smoothDimstoneStairs, BlockNames.smoothDimstoneStairsName);
		GameRegistry.registerBlock(smoothLightstoneStairs, BlockNames.smoothLightstoneStairsName);
		GameRegistry.registerBlock(smoothSpringstoneStairs, BlockNames.smoothSpringstoneStairsName);
		GameRegistry.registerBlock(smoothFloatstoneStairs, BlockNames.smoothFloatstoneStairsName);
		GameRegistry.registerBlock(smoothDeathstoneStairs, BlockNames.smoothDeathstoneStairsName);

		//register stone Stairs
		GameRegistry.registerBlock(darkstoneBrickStairs, BlockNames.darkstoneBrickStairsName);
		GameRegistry.registerBlock(dimstoneBrickStairs, BlockNames.dimstoneBrickStairsName);
		GameRegistry.registerBlock(lightstoneBrickStairs, BlockNames.lightstoneBrickStairsName);
		GameRegistry.registerBlock(springstoneBrickStairs, BlockNames.springstoneBrickStairsName);
		GameRegistry.registerBlock(floatstoneBrickStairs, BlockNames.floatstoneBrickStairsName);
		GameRegistry.registerBlock(deathstoneBrickStairs, BlockNames.deathstoneBrickStairsName);

		//register vanilla/organic Stairs
		GameRegistry.registerBlock(asphaltStairs, BlockNames.asphaltStairsName);
		GameRegistry.registerBlock(ringtreePlankStairs, BlockNames.ringtreePlankStairsName);
		GameRegistry.registerBlock(spheretreePlankStairs, BlockNames.spheretreePlankStairsName);

		//register directional blocks
		GameRegistry.registerBlock(up, BlockNames.upName);
		GameRegistry.registerBlock(down, BlockNames.downName);
		GameRegistry.registerBlock(east, BlockNames.eastName);
		GameRegistry.registerBlock(west, BlockNames.westName);
		GameRegistry.registerBlock(north, BlockNames.northName);
		GameRegistry.registerBlock(south, BlockNames.southName);

		GameRegistry.registerBlock(condenserIdle, BlockNames.condenserIdleName);
		GameRegistry.registerBlock(condenserActive, BlockNames.condenserActiveName);
		
		//register portal block
		//GameRegistry.registerBlock(port, "port");

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
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(boneTorch, "Bone Torch");
		LanguageRegistry.addName(brainMushroom, "Brain Mushroom");
		LanguageRegistry.addName(bitumenFlowing, "Flowing Bitumen");
		LanguageRegistry.addName(bitumenStill, "Still Bitumen");
		LanguageRegistry.addName(purpleBerry, "Purple Berry");
		
		LanguageRegistry.addName(new ItemStack(lightstone, 1, 0), "Berry Pod");
		LanguageRegistry.addName(new ItemStack(lightstone, 1, 1), "Grown Berry Pod");
		
		LanguageRegistry.addName(spheretreeDeepwoodBranch, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeDeepwoodBranch1, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeDeepwood1, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeCorewood, "Spheretree Corewood");
		LanguageRegistry.addName(spheretreeBranchwood1, "Spheretree Branchwood");
		LanguageRegistry.addName(spheretreeDeepwoodCorner, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeDeepwoodCorner1, "Spheretree Deepwood");
		
		//register stalagmite level names
		LanguageRegistry.addName(stalagmiteLevelTwo, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelThree, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelFour, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelFive, "Stalagmite");

		//register stalagmite base level names
		LanguageRegistry.addName(stalagmiteLevelTwoBase, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelThreeBase, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelFourBase, "Stalagmite");
		LanguageRegistry.addName(stalagmiteLevelFiveBase, "Stalagmite");

		//register ore names
		LanguageRegistry.addName(darknessOre, "Darkness Ore");
		LanguageRegistry.addName(gravityOre, "Gravity Ore");
		LanguageRegistry.addName(lethargyOre, "Lethargy Ore");
		LanguageRegistry.addName(bitumenOre, "Bitumen Ore");

		//register stone block names	
		for (int i = 0; i < lightstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(lightstone, 1, i), lightstoneNames[i]);
		}
		for (int i = 0; i < dimstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(dimstone, 1, i), dimstoneNames[i]);
		}		
		for (int i = 0; i < darkstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(darkstone, 1, i), darkstoneNames[i]);
		}
		for (int i = 0; i < springstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(springstone, 1, i), springstoneNames[i]);
		}		
		for (int i = 0; i < floatstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(floatstone, 1, i), floatstoneNames[i]);
		}
		for (int i = 0; i < deathstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(deathstone, 1, i), deathstoneNames[i]);
		}		

		LanguageRegistry.addName(crackedDeathstone, "Cracked Deathstone");

		//register stone Stairs names
		LanguageRegistry.addName(darkstoneStairs, "Darkstone Stairs");
		LanguageRegistry.addName(dimstoneStairs, "Dimstone Stairs");
		LanguageRegistry.addName(lightstoneStairs, "Lightstone Stairs");
		LanguageRegistry.addName(springstoneStairs, "Springstone Stairs");
		LanguageRegistry.addName(floatstoneStairs, "Floatstone Stairs");
		LanguageRegistry.addName(deathstoneStairs, "Deathstone Stairs");

		//register stone Stairs
		LanguageRegistry.addName(smoothDarkstoneStairs, "Smooth Darkstone Stairs");
		LanguageRegistry.addName(smoothDimstoneStairs, "Smooth Dimstone Stairs");
		LanguageRegistry.addName(smoothLightstoneStairs, "Smooth Lightstone Stairs");
		LanguageRegistry.addName(smoothSpringstoneStairs, "Smooth Springstone Stairs");
		LanguageRegistry.addName(smoothFloatstoneStairs, "Smooth Floatstone Stairs");
		LanguageRegistry.addName(smoothDeathstoneStairs, "Smooth Deathstone Stairs");

		//register stone Stairs
		LanguageRegistry.addName(darkstoneBrickStairs, "Darkstone Brick Stairs");
		LanguageRegistry.addName(dimstoneBrickStairs, "Dimstone Brick Stairs");
		LanguageRegistry.addName(lightstoneBrickStairs, "Lightstone Brick Stairs");
		LanguageRegistry.addName(springstoneBrickStairs, "Springstone Brick Stairs");
		LanguageRegistry.addName(floatstoneBrickStairs, "Floatstone Brick Stairs");
		LanguageRegistry.addName(deathstoneBrickStairs, "Deathstone Brick Stairs");

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
		
		LanguageRegistry.addName(condenserIdle, "Condenser");
		LanguageRegistry.addName(condenserActive, "Condenser");

		//* -------------------------------------------------------------------------------------- SET BLOCK HARVEST LEVELS----------------------------------------------------


		//Set Harvest Level
		MinecraftForge.setBlockHarvestLevel(bitumenOre, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(darknessOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(gravityOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lethargyOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(lightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(dimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(darkstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(springstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(crackedDeathstone, "pickaxe", 3);
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
		MinecraftForge.setBlockHarvestLevel(springstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothDarkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothDimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothLightstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothSpringstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothFloatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothDeathstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(darkstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneBrickStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(springstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneBrickStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(up, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(down, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(east, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(west, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(south, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(north, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(springstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelTwo, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelThree, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFour, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFive, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelTwoBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelThreeBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFourBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFiveBase, "pickaxe", 1);
	}
}
