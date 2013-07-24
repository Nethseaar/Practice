package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import nethseaar.bacon.blocks.BlockPurpleBerry;
import nethseaar.bacon.blocks.BlockRedRock;
import nethseaar.bacon.blocks.BlockRingtree;
import nethseaar.bacon.blocks.BlockSouth;
import nethseaar.bacon.blocks.BlockSpheretreeBranchwood;
import nethseaar.bacon.blocks.BlockSpheretreeBranchwood1;
import nethseaar.bacon.blocks.BlockSpheretreeCorewood;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwood;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwood1;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwoodBranch;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwoodBranch1;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwoodCorner;
import nethseaar.bacon.blocks.BlockSpheretreeDeepwoodCorner1;
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
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BaconBlocks {

	// Store all the names for meta-data subblocks.
	private static String[] darkstoneNames = {
		"Darkstone", "Cracked Darkstone", "Condensed Darkstone", "Smooth Darkstone", "Darkstone Brick", "Carved Darkstone", 
		"Springstone*", "Cracked Springstone*", "Condensed Springstone*", "Smooth Springstone*", "Springstone Brick*", "Carved Springstone*"
	};
	
	private static String[] dimstoneNames = {
		"Dimstone", "Cracked Dimstone", "Condensed Dimstone", "Smooth Dimstone", "Dimstone Brick", "Carved Dimstone",
		"Floatstone*", "Cracked Floatstone*", "Condensed Floatstone*", "Smooth Floatstone*", "Floatstone Brick*", "Carved Floatstone*"
	};

	private static String[] lightstoneNames = {
		"Lightstone", "Cracked Lightstone", "Condensed Lightstone", "Smooth Lightstone", "Lightstone Brick", "Carved Lightstone",
		"Deathstone*", "Cracked Deathstone*", "Condensed Deathstone*", "Smooth Deathstone*", "Deathstone Brick*", "Carved Deathstone*"
	};

	private static String[] springstoneNames = {
		"Springstone", "Cracked Springstone", "Condensed Springstone", "Smooth Springstone", "Springstone Brick", "Carved Springstone"
	};

	private static String[] floatstoneNames = {
		"Floatstone", "Cracked Floatstone", "Condensed Floatstone", "Smooth Floatstone", "Floatstone Brick", "Carved Floatstone"
	};

	private static String[] deathstoneNames = {
		"Deathstone", "Cracked Deathstone**", "Condensed Deathstone", "Smooth Deathstone", "Deathstone Brick", "Carved Deathstone"
	};

	private static String[] oreNames = {
		"Darkness Ore", "Gravity Ore", "Lethargy Ore", "Bitumen Ore"
	};

	// Declare Ores
	public static Block darknessOre;
	public static Block gravityOre;
	public static Block lethargyOre;
	public static Block bitumenOre;

	// Declare Dimension Stone Blocks
	public static Block darkstone;
	public static Block dimstone;
	public static Block lightstone;
	public static Block springstone;
	public static Block floatstone;
	public static Block deathstone;
	public static Block crackedDeathstone;

	// Declare Overworld Blocks
	public static Block asphalt;
	public static Block endObsidian;
	public static Block stoneWorkbench;
	public static Block spheretreeDeepwood;
	public static Block spheretreeBranchwood;
	public static Block lantern;
	public static Block boneTorch;
	public static Block brainMushroom;
	public static Block bitumenFlowing;
	public static Block bitumenStill;
	public static Block boneLadder;
	public static Block redRock;

	// Declare Organic Blocks
	public static Block ringtreePlanks;
	public static Block spheretreePlanks;
	public static Block spheretreeHeart;
	public static Block ringtree;
	public static Block spheretreeLeaves;
	public static Block purpleBerry;
	public static Block greenBerry;
	public static Block spheretreeDeepwoodBranch;
	public static Block spheretreeDeepwoodBranch1;
	public static Block spheretreeDeepwood1;
	public static Block spheretreeCorewood;
	public static Block spheretreeBranchwood1;
	public static Block spheretreeDeepwoodCorner;
	public static Block spheretreeDeepwoodCorner1;

	// Declare Stalagmite Blocks
	public static Block stalagmiteLevelOne;
	public static Block stalagmiteLevelTwo;
	public static Block stalagmiteLevelThree;
	public static Block stalagmiteLevelFour;
	public static Block stalagmiteLevelFive;

	// Declare Stalagmite Base Blocks
	public static Block stalagmiteLevelOneBase;
	public static Block stalagmiteLevelTwoBase;
	public static Block stalagmiteLevelThreeBase;
	public static Block stalagmiteLevelFourBase;
	public static Block stalagmiteLevelFiveBase;

	// Declare Dimension Stone Stairs	
	public static Block darkstoneStairs;
	public static Block dimstoneStairs;
	public static Block lightstoneStairs;
	public static Block springstoneStairs;
	public static Block floatstoneStairs;
	public static Block deathstoneStairs;

	// Declare Dimension Smooth Stone Stairs
	public static Block smoothDarkstoneStairs;
	public static Block smoothDimstoneStairs;
	public static Block smoothLightstoneStairs;
	public static Block smoothSpringstoneStairs;
	public static Block smoothFloatstoneStairs;
	public static Block smoothDeathstoneStairs;

	// Declare 	Dimension Stone Brick Stairs
	public static Block darkstoneBrickStairs;
	public static Block dimstoneBrickStairs;
	public static Block lightstoneBrickStairs;
	public static Block springstoneBrickStairs;
	public static Block floatstoneBrickStairs;
	public static Block deathstoneBrickStairs;

	// Declare Overworld and Organic Stairs
	public static Block asphaltStairs;
	public static Block spheretreePlankStairs;
	public static Block ringtreePlankStairs;


	// Declare direction blocks
	public static Block up;
	public static Block down;
	public static Block east;
	public static Block west;
	public static Block north;
	public static Block south;

	// Declare Machines
	public static Block condenserIdle;
	public static Block condenserActive;

	// Declare Portal block
	//public static Block port;

	@Init
	public static void init() {

		//* -------------------------------------------------------------------------------------- INITIALIZE BLOCKS----------------------------------------------------
		
		// Initialize Ores
		darknessOre = new OreDarknessOre(BlockIDs.darknessOre, 0, Material.rock).setUnlocalizedName(BlockNames.darknessOreName);
		gravityOre = new OreGravityOre(BlockIDs.gravityOre, 0, Material.rock).setUnlocalizedName(BlockNames.gravityOreName);
		lethargyOre = new OreLethargyOre(BlockIDs.lethargyOre, 0, Material.rock).setUnlocalizedName(BlockNames.lethargyOreName);
		bitumenOre = new OreBitumenOre(BlockIDs.bitumenOre, 0, Material.rock).setUnlocalizedName(BlockNames.bitumenOreName);

		// Initialize Overworld Blocks
		stoneWorkbench = new BlockStoneWorkbench(BlockIDs.stoneWorkbench).setUnlocalizedName(BlockNames.stoneWorkbenchName);
		boneLadder = new BlockBoneLadder(BlockIDs.boneLadder, 11).setUnlocalizedName(BlockNames.boneLadderName);
		asphalt = new BlockAsphalt(BlockIDs.asphalt, Material.rock).setUnlocalizedName(BlockNames.asphaltName).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		endObsidian = new BlockBacon(BlockIDs.endObsidian, Material.rock).setUnlocalizedName(BlockNames.endObsidianName).setStepSound(Block.soundStoneFootstep).setHardness(8.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		lantern = new BlockLantern(BlockIDs.lantern, 0).setUnlocalizedName(BlockNames.lanternName).setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(BlockIDs.boneTorch, 1).setUnlocalizedName(BlockNames.boneTorchName).setLightValue(0.9375F);
		brainMushroom = new BlockBrainMushroom(BlockIDs.brainMushroom, "brainMushroom").setUnlocalizedName(BlockNames.brainMushroomName).setCreativeTab(Bacon.tabSubItems);
		bitumenFlowing = new BlockBitumenFlowing(BlockIDs.bitumenStill - 1, Material.water).setUnlocalizedName(BlockNames.bitumenFlowingName);
		bitumenStill = new BlockBitumenStationary(BlockIDs.bitumenStill, Material.water).setUnlocalizedName(BlockNames.bitumenStillName);
		redRock = new BlockRedRock(BlockIDs.redRock, Material.rock).setUnlocalizedName(BlockNames.redRock);

		// Initialize Organic Blocks
		ringtreePlanks = new BlockBacon(BlockIDs.ringtreePlanks, Material.wood).setUnlocalizedName(BlockNames.ringtreePlanksName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreePlanks = new BlockBacon(BlockIDs.spheretreePlanks, Material.wood).setUnlocalizedName(BlockNames.spheretreePlanksName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeHeart = new BlockBacon(BlockIDs.spheretreeHeart, Material.wood).setUnlocalizedName(BlockNames.spheretreeHeartName).setStepSound(Block.soundWoodFootstep).setHardness(15.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		ringtree = new BlockRingtree(BlockIDs.ringtree, Material.wood).setUnlocalizedName(BlockNames.ringtreeName).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeLeaves = new BlockBacon(BlockIDs.spheretreeLeaves, Material.leaves).setUnlocalizedName(BlockNames.spheretreeLeavesName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwood = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwood, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeBranchwood = new BlockSpheretreeBranchwood(BlockIDs.spheretreeBranchwood, Material.wood).setUnlocalizedName(BlockNames.spheretreeBranchwoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);		
		purpleBerry = new BlockPurpleBerry(BlockIDs.purpleBerry, Material.plants).setUnlocalizedName(BlockNames.purpleBerryName);
		greenBerry = new BlockPurpleBerry(BlockIDs.greenBerry, Material.plants).setUnlocalizedName(BlockNames.greenBerryName);		
		spheretreeDeepwoodBranch = new BlockSpheretreeDeepwoodBranch(BlockIDs.spheretreeDeepwoodBranch, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodBranchName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodBranch1 = new BlockSpheretreeDeepwoodBranch1(BlockIDs.spheretreeDeepwoodBranch1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodBranch1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwood1 = new BlockSpheretreeDeepwood1(BlockIDs.spheretreeDeepwood1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwood1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeCorewood = new BlockSpheretreeCorewood(BlockIDs.spheretreeCorewood, Material.wood).setUnlocalizedName(BlockNames.spheretreeCorewoodName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeBranchwood1 = new BlockSpheretreeBranchwood1(BlockIDs.spheretreeBranchwood1, Material.wood).setUnlocalizedName(BlockNames.spheretreeBranchwood1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodCorner = new BlockSpheretreeDeepwoodCorner(BlockIDs.spheretreeDeepwoodCorner, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodCornerName).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		spheretreeDeepwoodCorner1 = new BlockSpheretreeDeepwoodCorner1(BlockIDs.spheretreeDeepwoodCorner1, Material.wood).setUnlocalizedName(BlockNames.spheretreeDeepwoodCorner1Name).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);

		// Initialize Stalagmite Blocks
		stalagmiteLevelOne = new BlockStalagmite(BlockIDs.stalagmiteLevelOne, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelOneName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelTwo = new BlockStalagmiteLevelTwo(BlockIDs.stalagmiteLevelTwo, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelTwoName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelThree = new BlockStalagmiteLevelThree(BlockIDs.stalagmiteLevelThree, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelThreeName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFour = new BlockStalagmiteLevelFour(BlockIDs.stalagmiteLevelFour, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFourName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFive = new BlockStalagmiteLevelFive(BlockIDs.stalagmiteLevelFive, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFiveName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);

		// Initialize Stalagmite Base Blocks
		stalagmiteLevelOneBase = new BlockStalagmiteBase(BlockIDs.stalagmiteLevelOneBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelOneBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelTwoBase = new BlockStalagmiteLevelTwoBase(BlockIDs.stalagmiteLevelTwoBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelTwoBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelThreeBase = new BlockStalagmiteLevelThreeBase(BlockIDs.stalagmiteLevelThreeBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelThreeBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFourBase = new BlockStalagmiteLevelFourBase(BlockIDs.stalagmiteLevelFourBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFourBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);
		stalagmiteLevelFiveBase = new BlockStalagmiteLevelFiveBase(BlockIDs.stalagmiteLevelFiveBase, Material.rock).setUnlocalizedName(BlockNames.stalagmiteLevelFiveBaseName).setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(Bacon.tabInert);


		// Initialize Dimension Stone Blocks
		lightstone = new BlockLightstone(BlockIDs.lightstone, Material.rock).setUnlocalizedName(BlockNames.lightstoneName);
		dimstone = new BlockDimstone(BlockIDs.dimstone, Material.rock).setUnlocalizedName(BlockNames.dimstoneName);
		darkstone = new BlockDarkstone(BlockIDs.darkstone, Material.rock).setUnlocalizedName(BlockNames.darkstoneName);
		springstone = new BlockSpringstone(BlockIDs.springstone, Material.rock).setUnlocalizedName(BlockNames.springstoneName);
		floatstone = new BlockFloatstone(BlockIDs.floatstone, Material.rock).setUnlocalizedName(BlockNames.floatstoneName);
		deathstone = new BlockDeathstone(BlockIDs.deathstone, Material.cactus).setUnlocalizedName(BlockNames.deathstoneName);
		crackedDeathstone = new BlockCrackedDeathstone(BlockIDs.crackedDeathstone, Material.rock).setUnlocalizedName(BlockNames.crackedDeathstoneName).setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive).setLightValue(1.0F);

		// Initialize Birection Blocks
		up = new BlockUp(BlockIDs.up,  Material.rock).setUnlocalizedName(BlockNames.upName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		down = new BlockDown(BlockIDs.down,  Material.rock).setUnlocalizedName(BlockNames.downName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		east = new BlockEast(BlockIDs.east,  Material.rock).setUnlocalizedName(BlockNames.eastName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		west = new BlockWest(BlockIDs.west,  Material.rock).setUnlocalizedName(BlockNames.westName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		north = new BlockNorth(BlockIDs.north,  Material.rock).setUnlocalizedName(BlockNames.northName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);
		south = new BlockSouth(BlockIDs.south,  Material.rock).setUnlocalizedName(BlockNames.southName).setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(Bacon.tabActive);

		// Initialize Dimension Stone Stairs
		darkstoneStairs = new StairBacon(BlockIDs.darkstoneStairs, BaconBlocks.darkstone, 0).setUnlocalizedName(BlockNames.darkstoneStairsName);
		dimstoneStairs = new StairBacon(BlockIDs.dimstoneStairs, BaconBlocks.dimstone, 0).setUnlocalizedName(BlockNames.dimstoneStairsName);
		lightstoneStairs = new StairBacon(BlockIDs.lightstoneStairs, BaconBlocks.lightstone, 0).setUnlocalizedName(BlockNames.lightstoneStairsName);
		springstoneStairs = new StairBacon(BlockIDs.springstoneStairs, BaconBlocks.springstone, 0).setUnlocalizedName(BlockNames.springstoneStairsName);
		floatstoneStairs = new StairBacon(BlockIDs.floatstoneStairs, BaconBlocks.floatstone, 0).setUnlocalizedName(BlockNames.floatstoneStairsName);
		deathstoneStairs = new StairBacon(BlockIDs.deathstoneStairs, BaconBlocks.deathstone, 0).setUnlocalizedName(BlockNames.deathstoneStairsName);

		// Initialize Dimension Smooth Stone Stairs
		smoothDarkstoneStairs = new StairBacon(BlockIDs.smoothDarkstoneStairs, BaconBlocks.darkstone, 3).setUnlocalizedName(BlockNames.smoothDarkstoneStairsName);
		smoothDimstoneStairs = new StairBacon(BlockIDs.smoothDimstoneStairs, BaconBlocks.dimstone, 3).setUnlocalizedName(BlockNames.smoothDimstoneStairsName);
		smoothLightstoneStairs = new StairBacon(BlockIDs.smoothLightstoneStairs, BaconBlocks.lightstone, 3).setUnlocalizedName(BlockNames.smoothLightstoneStairsName);
		smoothSpringstoneStairs = new StairBacon(BlockIDs.smoothSpringstoneStairs, BaconBlocks.springstone, 3).setUnlocalizedName(BlockNames.smoothSpringstoneStairsName);
		smoothFloatstoneStairs = new StairBacon(BlockIDs.smoothFloatstoneStairs, BaconBlocks.floatstone, 3).setUnlocalizedName(BlockNames.smoothFloatstoneStairsName);
		smoothDeathstoneStairs = new StairBacon(BlockIDs.smoothDeathstoneStairs, BaconBlocks.deathstone, 2).setUnlocalizedName(BlockNames.smoothDeathstoneStairsName);

		// Initialize Dimension Stone Brick Stairs
		darkstoneBrickStairs = new StairBacon(BlockIDs.darkstoneBrickStairs, BaconBlocks.darkstone, 4).setUnlocalizedName(BlockNames.darkstoneBrickStairsName);
		dimstoneBrickStairs = new StairBacon(BlockIDs.dimstoneBrickStairs, BaconBlocks.dimstone, 4).setUnlocalizedName(BlockNames.dimstoneBrickStairsName);
		lightstoneBrickStairs = new StairBacon(BlockIDs.lightstoneBrickStairs, BaconBlocks.lightstone, 4).setUnlocalizedName(BlockNames.lightstoneBrickStairsName);
		springstoneBrickStairs = new StairBacon(BlockIDs.springstoneBrickStairs, BaconBlocks.springstone, 4).setUnlocalizedName(BlockNames.springstoneBrickStairsName);
		floatstoneBrickStairs = new StairBacon(BlockIDs.floatstoneBrickStairs, BaconBlocks.floatstone, 4).setUnlocalizedName(BlockNames.floatstoneBrickStairsName);
		deathstoneBrickStairs = new StairBacon(BlockIDs.deathstoneBrickStairs, BaconBlocks.deathstone, 3).setUnlocalizedName(BlockNames.deathstoneBrickStairsName);

		// Initialize Overworld and Organic Stairs
		asphaltStairs = new StairBacon(BlockIDs.asphaltStairs, BaconBlocks.asphalt, 0).setUnlocalizedName(BlockNames.asphaltStairsName);
		ringtreePlankStairs = new StairBacon(BlockIDs.ringtreePlankStairs, BaconBlocks.ringtreePlanks, 0).setUnlocalizedName(BlockNames.ringtreePlankStairsName);
		spheretreePlankStairs = new StairBacon(BlockIDs.spheretreePlankStairs, BaconBlocks.spheretreePlanks, 0).setUnlocalizedName(BlockNames.spheretreePlankStairsName);

		// Initialize Machine Blocks
		condenserIdle = new BlockCondenser(BlockIDs.condenserIdle, false).setUnlocalizedName(BlockNames.condenserIdleName).setCreativeTab(Bacon.tabSubItems);
		condenserActive = new BlockCondenser(BlockIDs.condenserActive, true).setUnlocalizedName(BlockNames.condenserActiveName);

		// Initialize Portal Block
		//port = new BlockPort(834, 0);

		//* -------------------------------------------------------------------------------------- REGISTER BLOCKS----------------------------------------------------

		// Register Ores
		GameRegistry.registerBlock(darknessOre, BlockNames.darknessOreName);
		GameRegistry.registerBlock(gravityOre, BlockNames.gravityOreName);
		GameRegistry.registerBlock(lethargyOre, BlockNames.lethargyOreName);
		GameRegistry.registerBlock(bitumenOre, BlockNames.bitumenOreName);

		// Register Dimension Stone Blocks
		GameRegistry.registerBlock(lightstone, ItemBlockBacon.class, "Bacon" + (lightstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(dimstone, ItemBlockBacon.class, "Bacon" + (dimstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(darkstone, ItemBlockBacon.class, "Bacon" + (darkstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(springstone, ItemBlockBacon.class, "Bacon" + (springstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(floatstone, ItemBlockBacon.class, "Bacon" + (floatstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(deathstone, ItemBlockBacon.class, "Bacon" + (deathstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(crackedDeathstone, BlockNames.crackedDeathstoneName);

		// Register Overworld Blocks
		GameRegistry.registerBlock(stoneWorkbench, BlockNames.stoneWorkbenchName);
		OreDictionary.registerOre("craftingtable", stoneWorkbench);
		GameRegistry.registerBlock(boneLadder, BlockNames.boneLadderName);
		GameRegistry.registerBlock(asphalt, BlockNames.asphaltName);
		GameRegistry.registerBlock(endObsidian, BlockNames.endObsidianName);
		GameRegistry.registerBlock(lantern, BlockNames.lanternName);
		GameRegistry.registerBlock(boneTorch, BlockNames.boneTorchName);
		GameRegistry.registerBlock(brainMushroom, BlockNames.brainMushroomName);
		GameRegistry.registerBlock(bitumenFlowing, BlockNames.bitumenFlowingName);
		GameRegistry.registerBlock(bitumenStill, BlockNames.bitumenStillName);
		GameRegistry.registerBlock(redRock, BlockNames.redRock);

		// Register Organic Blocks
		GameRegistry.registerBlock(ringtreePlanks, BlockNames.ringtreePlanksName);
		GameRegistry.registerBlock(spheretreePlanks, BlockNames.spheretreePlanksName);
		OreDictionary.registerOre("plankWood", spheretreePlanks);
		OreDictionary.registerOre("plankWood", ringtreePlanks);
		GameRegistry.registerBlock(spheretreeHeart, BlockNames.spheretreeHeartName);
		GameRegistry.registerBlock(ringtree, BlockNames.ringtreeName);
		GameRegistry.registerBlock(spheretreeLeaves, BlockNames.spheretreeLeavesName);
		GameRegistry.registerBlock(spheretreeDeepwood, BlockNames.spheretreeDeepwoodName);
		GameRegistry.registerBlock(spheretreeBranchwood, BlockNames.spheretreeBranchwoodName);
		GameRegistry.registerBlock(purpleBerry, BlockNames.purpleBerryName);
		GameRegistry.registerBlock(greenBerry, ItemBlockBacon.class, "Bacon" + (greenBerry.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(spheretreeDeepwoodBranch, BlockNames.spheretreeDeepwoodBranchName);
		GameRegistry.registerBlock(spheretreeDeepwoodBranch1, BlockNames.spheretreeDeepwoodBranch1Name);
		GameRegistry.registerBlock(spheretreeDeepwood1, BlockNames.spheretreeDeepwood1Name);
		GameRegistry.registerBlock(spheretreeCorewood, BlockNames.spheretreeCorewoodName);
		GameRegistry.registerBlock(spheretreeBranchwood1, BlockNames.spheretreeBranchwood1Name);
		GameRegistry.registerBlock(spheretreeDeepwoodCorner, BlockNames.spheretreeDeepwoodCornerName);
		GameRegistry.registerBlock(spheretreeDeepwoodCorner1, BlockNames.spheretreeDeepwoodCorner1Name);

		// Register Stalagmite Blocks
		GameRegistry.registerBlock(stalagmiteLevelOne, BlockNames.stalagmiteLevelOneName);
		GameRegistry.registerBlock(stalagmiteLevelTwo, BlockNames.stalagmiteLevelTwoName);
		GameRegistry.registerBlock(stalagmiteLevelThree, BlockNames.stalagmiteLevelThreeName);
		GameRegistry.registerBlock(stalagmiteLevelFour, BlockNames.stalagmiteLevelFourName);
		GameRegistry.registerBlock(stalagmiteLevelFive, BlockNames.stalagmiteLevelFiveName);

		// Register Stalagmite Base Blocks
		GameRegistry.registerBlock(stalagmiteLevelOneBase, BlockNames.stalagmiteLevelOneBaseName);
		GameRegistry.registerBlock(stalagmiteLevelTwoBase, BlockNames.stalagmiteLevelTwoBaseName);
		GameRegistry.registerBlock(stalagmiteLevelThreeBase, BlockNames.stalagmiteLevelThreeBaseName);
		GameRegistry.registerBlock(stalagmiteLevelFourBase, BlockNames.stalagmiteLevelFourBaseName);
		GameRegistry.registerBlock(stalagmiteLevelFiveBase, BlockNames.stalagmiteLevelFiveBaseName);


		// Register Dimension Stone Stairs
		GameRegistry.registerBlock(darkstoneStairs, BlockNames.darkstoneStairsName);
		GameRegistry.registerBlock(dimstoneStairs, BlockNames.dimstoneStairsName);
		GameRegistry.registerBlock(lightstoneStairs, BlockNames.lightstoneStairsName);
		GameRegistry.registerBlock(springstoneStairs, BlockNames.springstoneStairsName);
		GameRegistry.registerBlock(floatstoneStairs, BlockNames.floatstoneStairsName);
		GameRegistry.registerBlock(deathstoneStairs, BlockNames.deathstoneStairsName);

		// Register Dimension Smooth Stone Stairs
		GameRegistry.registerBlock(smoothDarkstoneStairs, BlockNames.smoothDarkstoneStairsName);
		GameRegistry.registerBlock(smoothDimstoneStairs, BlockNames.smoothDimstoneStairsName);
		GameRegistry.registerBlock(smoothLightstoneStairs, BlockNames.smoothLightstoneStairsName);
		GameRegistry.registerBlock(smoothSpringstoneStairs, BlockNames.smoothSpringstoneStairsName);
		GameRegistry.registerBlock(smoothFloatstoneStairs, BlockNames.smoothFloatstoneStairsName);
		GameRegistry.registerBlock(smoothDeathstoneStairs, BlockNames.smoothDeathstoneStairsName);

		// Register Dimension Stone Brick Stairs
		GameRegistry.registerBlock(darkstoneBrickStairs, BlockNames.darkstoneBrickStairsName);
		GameRegistry.registerBlock(dimstoneBrickStairs, BlockNames.dimstoneBrickStairsName);
		GameRegistry.registerBlock(lightstoneBrickStairs, BlockNames.lightstoneBrickStairsName);
		GameRegistry.registerBlock(springstoneBrickStairs, BlockNames.springstoneBrickStairsName);
		GameRegistry.registerBlock(floatstoneBrickStairs, BlockNames.floatstoneBrickStairsName);
		GameRegistry.registerBlock(deathstoneBrickStairs, BlockNames.deathstoneBrickStairsName);

		// Register Overworld and Organic Stairs
		GameRegistry.registerBlock(asphaltStairs, BlockNames.asphaltStairsName);
		GameRegistry.registerBlock(ringtreePlankStairs, BlockNames.ringtreePlankStairsName);
		GameRegistry.registerBlock(spheretreePlankStairs, BlockNames.spheretreePlankStairsName);

		// Register Directional Blocks
		GameRegistry.registerBlock(up, BlockNames.upName);
		GameRegistry.registerBlock(down, BlockNames.downName);
		GameRegistry.registerBlock(east, BlockNames.eastName);
		GameRegistry.registerBlock(west, BlockNames.westName);
		GameRegistry.registerBlock(north, BlockNames.northName);
		GameRegistry.registerBlock(south, BlockNames.southName);

		// Register Machine Blocks
		GameRegistry.registerBlock(condenserIdle, BlockNames.condenserIdleName);
		GameRegistry.registerBlock(condenserActive, BlockNames.condenserActiveName);

		// Register Portal Block
		//GameRegistry.registerBlock(port, "port");

		//* -------------------------------------------------------------------------------------- REGISTER BLOCK NAMES----------------------------------------------------

		// Register Ore Names
		LanguageRegistry.addName(darknessOre, "Darkness Ore");
		LanguageRegistry.addName(gravityOre, "Gravity Ore");
		LanguageRegistry.addName(lethargyOre, "Lethargy Ore");
		LanguageRegistry.addName(bitumenOre, "Bitumen Ore");

		// Register Overworld Block Names
		LanguageRegistry.addName(stoneWorkbench, "Crafting Table");
		LanguageRegistry.addName(boneLadder, "Bone Ladder");
		LanguageRegistry.addName(asphalt, "Asphalt");
		LanguageRegistry.addName(endObsidian, "End Obsidian");
		LanguageRegistry.addName(lantern, "Lantern");
		LanguageRegistry.addName(boneTorch, "Bone Torch");
		LanguageRegistry.addName(brainMushroom, "Brain Mushroom");
		LanguageRegistry.addName(bitumenFlowing, "Flowing Bitumen");
		LanguageRegistry.addName(bitumenStill, "Still Bitumen");
		LanguageRegistry.addName(redRock, "Red Rock");

		// Register Organic Block Names
		LanguageRegistry.addName(ringtreePlanks, "Ringtree Planks");
		LanguageRegistry.addName(spheretreePlanks, "Spheretree Planks");
		LanguageRegistry.addName(spheretreeHeart, "Spheretree Heart");
		LanguageRegistry.addName(ringtree, "Kill You");
		LanguageRegistry.addName(spheretreeLeaves, "Sheretree Leaves");
		LanguageRegistry.addName(spheretreeDeepwood, "Spheretree Deepwood");
		LanguageRegistry.addName(spheretreeBranchwood, "Spheretree Branchwood");
		LanguageRegistry.addName(new ItemStack(greenBerry, 1, 0), "Berry Pod");
		LanguageRegistry.addName(new ItemStack(greenBerry, 1, 1), "Grown Berry Pod");
		LanguageRegistry.addName(purpleBerry, "Purple Berry");
		LanguageRegistry.addName(spheretreeDeepwoodBranch, "Spheretree Deepwood Branch");
		LanguageRegistry.addName(spheretreeDeepwoodBranch1, "Spheretree Deepwood Branch II");
		LanguageRegistry.addName(spheretreeDeepwood1, "Spheretree Deepwood II");
		LanguageRegistry.addName(spheretreeCorewood, "Spheretree Corewood");
		LanguageRegistry.addName(spheretreeBranchwood1, "Spheretree Branchwood II");
		LanguageRegistry.addName(spheretreeDeepwoodCorner, "Spheretree Deepwood Corner");
		LanguageRegistry.addName(spheretreeDeepwoodCorner1, "Spheretree Deepwood Corner II");

		// Register Stalagmite Block Names
		LanguageRegistry.addName(stalagmiteLevelOne, "stalagmiteLevelOne");
		LanguageRegistry.addName(stalagmiteLevelTwo, "stalagmiteLevelOne II");
		LanguageRegistry.addName(stalagmiteLevelThree, "stalagmiteLevelOne III");
		LanguageRegistry.addName(stalagmiteLevelFour, "stalagmiteLevelOne IV");
		LanguageRegistry.addName(stalagmiteLevelFive, "stalagmiteLevelOne V");

		// Register Stalagmite Base Block Names
		LanguageRegistry.addName(stalagmiteLevelOneBase, "Base of stalagmiteLevelOne");
		LanguageRegistry.addName(stalagmiteLevelTwoBase, "stalagmiteLevelOne Base II");
		LanguageRegistry.addName(stalagmiteLevelThreeBase, "stalagmiteLevelOne Base III");
		LanguageRegistry.addName(stalagmiteLevelFourBase, "stalagmiteLevelOne Base IV");
		LanguageRegistry.addName(stalagmiteLevelFiveBase, "stalagmiteLevelOne Base V");

		// Register Dimension Stone Block Names	
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

		// Register Dimension Stone Stair Block Names
		LanguageRegistry.addName(darkstoneStairs, "Darkstone Stairs");
		LanguageRegistry.addName(dimstoneStairs, "Dimstone Stairs");
		LanguageRegistry.addName(lightstoneStairs, "Lightstone Stairs");
		LanguageRegistry.addName(springstoneStairs, "Springstone Stairs");
		LanguageRegistry.addName(floatstoneStairs, "Floatstone Stairs");
		LanguageRegistry.addName(deathstoneStairs, "Deathstone Stairs");

		// Register Dimension Smooth Stone Stair Block Names
		LanguageRegistry.addName(smoothDarkstoneStairs, "Smooth Darkstone Stairs");
		LanguageRegistry.addName(smoothDimstoneStairs, "Smooth Dimstone Stairs");
		LanguageRegistry.addName(smoothLightstoneStairs, "Smooth Lightstone Stairs");
		LanguageRegistry.addName(smoothSpringstoneStairs, "Smooth Springstone Stairs");
		LanguageRegistry.addName(smoothFloatstoneStairs, "Smooth Floatstone Stairs");
		LanguageRegistry.addName(smoothDeathstoneStairs, "Smooth Deathstone Stairs");

		// Register Dimension Stone Brick Stair Block Names
		LanguageRegistry.addName(darkstoneBrickStairs, "Darkstone Brick Stairs");
		LanguageRegistry.addName(dimstoneBrickStairs, "Dimstone Brick Stairs");
		LanguageRegistry.addName(lightstoneBrickStairs, "Lightstone Brick Stairs");
		LanguageRegistry.addName(springstoneBrickStairs, "Springstone Brick Stairs");
		LanguageRegistry.addName(floatstoneBrickStairs, "Floatstone Brick Stairs");
		LanguageRegistry.addName(deathstoneBrickStairs, "Deathstone Brick Stairs");

		// Register Overworld and Organic Stair Block Names
		LanguageRegistry.addName(asphaltStairs, "Asphalt Stairs");
		LanguageRegistry.addName(ringtreePlankStairs, "Ringtree Plank Stairs");
		LanguageRegistry.addName(spheretreePlankStairs, "Spheretree Plank Stairs");

		// Register Directional Block Names
		LanguageRegistry.addName(up, "Ascender");
		LanguageRegistry.addName(down, "Descender");
		LanguageRegistry.addName(east, "Easter");
		LanguageRegistry.addName(west, "Wester");
		LanguageRegistry.addName(north, "Norther");
		LanguageRegistry.addName(south, "Souther");

		// Register Machine Block Names
		LanguageRegistry.addName(condenserIdle, "Condenser");
		LanguageRegistry.addName(condenserActive, "Condenser");

		//* -------------------------------------------------------------------------------------- SET BLOCK HARVEST LEVELS----------------------------------------------------

		//Set Ore Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(bitumenOre, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(darknessOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(gravityOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lethargyOre, "pickaxe", 3);
		
		//Set Dimension Stone Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(lightstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(dimstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(darkstone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(springstone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstone, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(crackedDeathstone, "pickaxe", 3);
		
		//Set Overworld Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(asphalt, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(endObsidian, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(redRock, "pickaxe", 1);

		//Set Organic Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(ringtreePlanks, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreePlanks, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreeHeart, "axe", 3);
		MinecraftForge.setBlockHarvestLevel(ringtree, "axe", 2);
		MinecraftForge.setBlockHarvestLevel(spheretreeLeaves, "shears", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreeDeepwood, "axe", 3);
		MinecraftForge.setBlockHarvestLevel(spheretreeBranchwood, "axe", 2);
		
		//Set Overworld and Vanilla Stair Harvest Levels
		MinecraftForge.setBlockHarvestLevel(asphaltStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ringtreePlankStairs, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(spheretreePlankStairs, "axe", 3);
		
		//Set Dimension Stone Stairs Harvest Levels
		MinecraftForge.setBlockHarvestLevel(darkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(springstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneStairs, "pickaxe", 3);
		
		//Set Dimension Smooth Stone Stairs Harvest Levels
		MinecraftForge.setBlockHarvestLevel(smoothDarkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothDimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothLightstoneStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(smoothSpringstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothFloatstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothDeathstoneStairs, "pickaxe", 3);
		
		//Set Dimension Stone Brick Stairs Harvest Levels
		MinecraftForge.setBlockHarvestLevel(darkstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneBrickStairs, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(springstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(floatstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(deathstoneBrickStairs, "pickaxe", 3);
		
		//Set Directional Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(up, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(down, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(east, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(west, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(south, "spade", 2);
		MinecraftForge.setBlockHarvestLevel(north, "spade", 2);
		
		//Set Stalagmite Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelOne, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelTwo, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelThree, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFour, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFive, "pickaxe", 1);
		
		//Set Stalagmite Base Blocks Harvest Levels
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelOneBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelTwoBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelThreeBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFourBase, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(stalagmiteLevelFiveBase, "pickaxe", 1);
	}
}
