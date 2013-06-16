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

public class BaconBlocks {
	
	public static String[] darkstoneNames = {
		"Darkstone", "Cracked Darkstone", "Condensed Darkstone", "Smooth Darkstone", "Darkstone Brick", "Carved Darkstone"
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

	//add cracked stone blocks
	//public static Block crackedDarkstone;
	public static Block crackedDimstone;
	public static Block crackedLightstone;
	public static Block crackedSpringstone;
	public static Block crackedFloatstone;
	public static Block crackedDeathstone;

	//add condensed stone blocks
	//public static Block condensedDarkstone;
	public static Block condensedDimstone;
	public static Block condensedLightstone;
	public static Block condensedSpringstone;
	public static Block condensedFloatstone;
	public static Block condensedDeathstone;

	//add smooth stone blocks
	//public static Block smoothDarkstone;
	public static Block smoothDimstone;
	public static Block smoothLightstone;
	public static Block smoothSpringstone;
	public static Block smoothFloatstone;
	public static Block smoothDeathstone;

	//add brick blocks
	//public static Block darkstoneBrick;
	public static Block dimstoneBrick;
	public static Block lightstoneBrick;
	public static Block springstoneBrick;
	public static Block floatstoneBrick;
	public static Block deathstoneBrick;

	//add carved blocks
	//public static Block carvedDarkstone;
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
	public static Block lantern;
	public static Block boneTorch;
	public static Block brainMushroom;
	public static Block bitumenFlowing;
	public static Block bitumenStill;

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
	
	//add Portal block
	//public static Block port;

	@Init
	public static void init() {

		//* -------------------------------------------------------------------------------------- INITIALIZE BLOCKS----------------------------------------------------
		//initialize ores
		darknessOre = new OreDarknessOre(BlockIDs.darknessOre, 0, Material.rock).setUnlocalizedName("darknessOre");
		gravityOre = new OreGravityOre(BlockIDs.gravityOre, 0, Material.rock).setUnlocalizedName("gravityOre");
		lethargyOre = new OreLethargyOre(BlockIDs.lethargyOre, 0, Material.rock).setUnlocalizedName("lethargyOre");
		bitumenOre = new OreBitumenOre(BlockIDs.bitumenOre, 0, Material.rock).setUnlocalizedName("bitumenOre");

		// initialize vanilla/organic blocks
		stoneWorkbench = new BlockStoneWorkbench(BlockIDs.stoneWorkbench).setUnlocalizedName("stoneworkbench");
		boneLadder = new BlockBoneLadder(BlockIDs.boneLadder, 11).setUnlocalizedName("boneladder");
		asphalt = new BlockAsphalt(BlockIDs.asphalt, Material.rock).setUnlocalizedName("asphalt").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		endObsidian = new BlockBacon(BlockIDs.endObsidian, Material.rock).setUnlocalizedName("endObsidian").setStepSound(Block.soundStoneFootstep).setHardness(8.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmite = new BlockStalagmite(BlockIDs.stalagmite, Material.rock).setUnlocalizedName("stalagmite").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteBase = new BlockStalagmiteBase(BlockIDs.stalagmiteBase, Material.rock).setUnlocalizedName("stalagmiteBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		ringtreePlanks = new BlockBacon(BlockIDs.ringtreePlanks, Material.wood).setUnlocalizedName("ringtreePlanks").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreePlanks = new BlockBacon(BlockIDs.spheretreePlanks, Material.wood).setUnlocalizedName("spheretreePlanks").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeHeart = new BlockBacon(BlockIDs.spheretreeHeart, Material.wood).setUnlocalizedName("spheretreeHeart").setStepSound(Block.soundWoodFootstep).setHardness(15.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		ringtree = new BlockRingtree(BlockIDs.ringtree, Material.wood).setUnlocalizedName("ringtreeside").setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeLeaves = new BlockBacon(BlockIDs.spheretreeLeaves, Material.leaves).setUnlocalizedName("spheretreeLeaves").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabDecorations);
		spheretreeDeepwood = new BlockSpheretreeDeepwood(BlockIDs.spheretreeDeepwood, Material.wood).setUnlocalizedName("spheretreeDeepwood").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		spheretreeBranchwood = new BlockSpheretreeBranchwood(BlockIDs.spheretreeBranchwood, Material.wood).setUnlocalizedName("spheretreeBranchwood").setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		lantern = new BlockLantern(BlockIDs.lantern, 0).setUnlocalizedName("lantern").setLightValue(0.9375F);
		boneTorch = new BlockBoneTorch(BlockIDs.boneTorch, 1).setUnlocalizedName("boneTorch").setLightValue(0.9375F);
		brainMushroom = new BlockBrainMushroom(BlockIDs.brainMushroom, "brainMushroom").setUnlocalizedName("brainMushroom").setCreativeTab(CreativeTabs.tabDecorations);
		bitumenFlowing = new BlockBitumenFlowing(BlockIDs.bitumenStill - 1, Material.water).setUnlocalizedName("bitumenFlowing");
		bitumenStill = new BlockBitumenStationary(BlockIDs.bitumenStill, Material.water).setUnlocalizedName("bitumenStill");

		//initialize stalagmite level blocks
		stalagmiteLevelTwo = new BlockStalagmiteLevelTwo(BlockIDs.stalagmiteLevelTwo, Material.rock).setUnlocalizedName("stalagmiteLevelTwo").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelThree = new BlockStalagmiteLevelThree(BlockIDs.stalagmiteLevelThree, Material.rock).setUnlocalizedName("stalagmiteLevelThree").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelFour = new BlockStalagmiteLevelFour(BlockIDs.stalagmiteLevelFour, Material.rock).setUnlocalizedName("stalagmiteLevelFour").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelFive = new BlockStalagmiteLevelFive(BlockIDs.stalagmiteLevelFive, Material.rock).setUnlocalizedName("stalagmiteLevelFive").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);

		//initialize stalagmite base level blocks
		stalagmiteLevelTwoBase = new BlockStalagmiteLevelTwoBase(BlockIDs.stalagmiteLevelTwoBase, Material.rock).setUnlocalizedName("stalagmiteLevelTwoBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelThreeBase = new BlockStalagmiteLevelThreeBase(BlockIDs.stalagmiteLevelThreeBase, Material.rock).setUnlocalizedName("stalagmiteLevelThreeBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelFourBase = new BlockStalagmiteLevelFourBase(BlockIDs.stalagmiteLevelFourBase, Material.rock).setUnlocalizedName("stalagmiteLevelFourBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		stalagmiteLevelFiveBase = new BlockStalagmiteLevelFiveBase(BlockIDs.stalagmiteLevelFiveBase, Material.rock).setUnlocalizedName("stalagmiteLevelFiveBase").setStepSound(Block.soundStoneFootstep).setHardness(0.8F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);


		//initialize stone blocks
		lightstone = new BlockBacon(BlockIDs.lightstone, Material.rock).setUnlocalizedName("lightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		dimstone = new BlockBacon(BlockIDs.dimstone, Material.rock).setUnlocalizedName("dimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		darkstone = new BlockDarkstone(BlockIDs.darkstone, Material.rock).setUnlocalizedName("darkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		springstone = new BlockSpringstone(BlockIDs.springstone, Material.rock).setUnlocalizedName("springstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		floatstone = new BlockFloatstone(BlockIDs.floatstone, Material.rock).setUnlocalizedName("floatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		deathstone = new BlockDeathstone(BlockIDs.deathstone, Material.cactus).setUnlocalizedName("deathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize condensed stone blocks
		condensedLightstone = new BlockBacon(BlockIDs.condensedLightstone, Material.rock).setUnlocalizedName("condensedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		condensedDimstone = new BlockBacon(BlockIDs.condensedDimstone, Material.rock).setUnlocalizedName("condensedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		//condensedDarkstone = new BlockBacon(BlockIDs.condensedDarkstone, Material.rock).setUnlocalizedName("condensedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		condensedSpringstone = new BlockBacon(BlockIDs.condensedSpringstone,  Material.rock).setUnlocalizedName("condensedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		condensedFloatstone = new BlockBacon(BlockIDs.condensedFloatstone, Material.rock).setUnlocalizedName("condensedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		condensedDeathstone = new BlockBacon(BlockIDs.condensedDeathstone, Material.rock).setUnlocalizedName("condensedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize cracked stone blocks
		crackedLightstone = new BlockBacon(BlockIDs.crackedLightstone, Material.rock).setUnlocalizedName("crackedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		crackedDimstone = new BlockBacon(BlockIDs.crackedDimstone, Material.rock).setUnlocalizedName("crackedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		//crackedDarkstone = new BlockBacon(BlockIDs.crackedDarkstone, Material.rock).setUnlocalizedName("crackedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		crackedSpringstone = new BlockBacon(BlockIDs.crackedSpringstone,  Material.rock).setUnlocalizedName("crackedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		crackedFloatstone = new BlockBacon(BlockIDs.crackedFloatstone, Material.rock).setUnlocalizedName("crackedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		crackedDeathstone = new BlockCrackedDeathstone(BlockIDs.crackedDeathstone, Material.rock).setUnlocalizedName("crackedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize smooth stone blocks
		smoothLightstone = new BlockBacon(BlockIDs.smoothLightstone, Material.rock).setUnlocalizedName("smoothLightstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		smoothDimstone = new BlockBacon(BlockIDs.smoothDimstone, Material.rock).setUnlocalizedName("smoothDimstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		//smoothDarkstone = new BlockBacon(BlockIDs.smoothDarkstone, Material.rock).setUnlocalizedName("smoothDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		smoothSpringstone = new BlockBacon(BlockIDs.smoothSpringstone,  Material.rock).setUnlocalizedName("smoothSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		smoothFloatstone = new BlockBacon(BlockIDs.smoothFloatstone, Material.rock).setUnlocalizedName("smoothFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		smoothDeathstone = new BlockBacon(BlockIDs.smoothDeathstone, Material.rock).setUnlocalizedName("smoothDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize stone brick blocks
		lightstoneBrick = new BlockBacon(BlockIDs.lightstoneBrick, Material.rock).setUnlocalizedName("lightstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);
		dimstoneBrick = new BlockBacon(BlockIDs.dimstoneBrick, Material.rock).setUnlocalizedName("dimstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		//darkstoneBrick = new BlockBacon(BlockIDs.darkstoneBrick, Material.rock).setUnlocalizedName("darkstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		springstoneBrick = new BlockBacon(BlockIDs.springstoneBrick,  Material.rock).setUnlocalizedName("springstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		floatstoneBrick = new BlockBacon(BlockIDs.floatstoneBrick, Material.rock).setUnlocalizedName("floatstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.5F);
		deathstoneBrick = new BlockBacon(BlockIDs.deathstoneBrick, Material.rock).setUnlocalizedName("deathstoneBrick").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize carved stone blocks
		//carvedDarkstone = new BlockBacon(BlockIDs.carvedDarkstone,  Material.rock).setUnlocalizedName("carvedDarkstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedDimstone = new BlockBacon(BlockIDs.carvedDimstone,  Material.rock).setUnlocalizedName("carvedDimstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedLightstone = new BlockBacon(BlockIDs.carvedLightstone,  Material.rock).setUnlocalizedName("carvedLightstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedSpringstone = new BlockBacon(BlockIDs.carvedSpringstone,  Material.rock).setUnlocalizedName("carvedSpringstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedFloatstone = new BlockBacon(BlockIDs.carvedFloatstone,  Material.rock).setUnlocalizedName("carvedFloatstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		carvedDeathstone = new BlockBacon(BlockIDs.carvedDeathstone,  Material.rock).setUnlocalizedName("carvedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);

		//initialize direction blocks
		up = new BlockUp(BlockIDs.up,  Material.rock).setUnlocalizedName("up").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		down = new BlockDown(BlockIDs.down,  Material.rock).setUnlocalizedName("down").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		east = new BlockEast(BlockIDs.east,  Material.rock).setUnlocalizedName("east").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		west = new BlockWest(BlockIDs.west,  Material.rock).setUnlocalizedName("west").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		north = new BlockNorth(BlockIDs.north,  Material.rock).setUnlocalizedName("north").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		south = new BlockSouth(BlockIDs.south,  Material.rock).setUnlocalizedName("south").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);

		//initialize stone Stairs
		darkstoneStairs = new StairBacon(BlockIDs.darkstoneStairs, BaconBlocks.darkstone, 0);
		dimstoneStairs = new StairBacon(BlockIDs.dimstoneStairs, BaconBlocks.dimstone, 0);
		lightstoneStairs = new StairBacon(BlockIDs.lightstoneStairs, BaconBlocks.lightstone, 0);
		springstoneStairs = new StairBacon(BlockIDs.springstoneStairs, BaconBlocks.springstone, 0);
		floatstoneStairs = new StairBacon(BlockIDs.floatstoneStairs, BaconBlocks.floatstone, 0);
		deathstoneStairs = new StairBacon(BlockIDs.deathstoneStairs, BaconBlocks.deathstone, 0);

		//initialize smooth stone Stairs
		//smoothDarkstoneStairs = new StairBacon(BlockIDs.smoothDarkstoneStairs, BaconBlocks.smoothDarkstone, 0);
		smoothDimstoneStairs = new StairBacon(BlockIDs.smoothDimstoneStairs, BaconBlocks.smoothDimstone, 0);
		smoothLightstoneStairs = new StairBacon(BlockIDs.smoothLightstoneStairs, BaconBlocks.smoothLightstone, 0);
		smoothSpringstoneStairs = new StairBacon(BlockIDs.smoothSpringstoneStairs, BaconBlocks.smoothSpringstone, 0);
		smoothFloatstoneStairs = new StairBacon(BlockIDs.smoothFloatstoneStairs, BaconBlocks.smoothFloatstone, 0);
		smoothDeathstoneStairs = new StairBacon(BlockIDs.smoothDeathstoneStairs, BaconBlocks.smoothDeathstone, 0);

		//initialize stone brick Stairs
		//darkstoneBrickStairs = new StairBacon(BlockIDs.darkstoneBrickStairs, BaconBlocks.darkstoneBrick, 0);
		dimstoneBrickStairs = new StairBacon(BlockIDs.dimstoneBrickStairs, BaconBlocks.dimstoneBrick, 0);
		lightstoneBrickStairs = new StairBacon(BlockIDs.lightstoneBrickStairs, BaconBlocks.lightstoneBrick, 0);
		springstoneBrickStairs = new StairBacon(BlockIDs.springstoneBrickStairs, BaconBlocks.springstoneBrick, 0);
		floatstoneBrickStairs = new StairBacon(BlockIDs.floatstoneBrickStairs, BaconBlocks.floatstoneBrick, 0);
		deathstoneBrickStairs = new StairBacon(BlockIDs.deathstoneBrickStairs, BaconBlocks.deathstoneBrick, 0);

		//initialize vanilla/organic Stairs
		asphaltStairs = new StairBacon(BlockIDs.asphaltStairs, BaconBlocks.asphalt, 0);
		ringtreePlankStairs = new StairBacon(BlockIDs.ringtreePlankStairs, BaconBlocks.ringtreePlanks, 0);
		spheretreePlankStairs = new StairBacon(BlockIDs.spheretreePlankStairs, BaconBlocks.spheretreePlanks, 0);
		
		//initialize portal
		//port = new BlockPort(834, 0);

		//* -------------------------------------------------------------------------------------- REGISTER BLOCKS----------------------------------------------------

		//register ores
		GameRegistry.registerBlock(darknessOre, "darknessOre");
		GameRegistry.registerBlock(gravityOre, "gravityOre");
		GameRegistry.registerBlock(lethargyOre, "lethargyOre");
		GameRegistry.registerBlock(bitumenOre, "bitumenOre");

		//register stone blocks
		GameRegistry.registerBlock(lightstone, "lightstone");
		GameRegistry.registerBlock(dimstone, "dimstone");
		GameRegistry.registerBlock(darkstone, ItemBlockBacon.class, "Bacon" + (darkstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(springstone, "springstone");
		GameRegistry.registerBlock(floatstone, "floatstone");
		GameRegistry.registerBlock(deathstone, "deathstone");

		//register condensed stone blocks
		//GameRegistry.registerBlock(condensedDarkstone, "condensedDarkstone");
		GameRegistry.registerBlock(condensedDimstone, "condensedDimstone");
		GameRegistry.registerBlock(condensedLightstone, "condensedLightstone");
		GameRegistry.registerBlock(condensedSpringstone, "condensedSpringstone");
		GameRegistry.registerBlock(condensedFloatstone, "condensedFloatstone");
		GameRegistry.registerBlock(condensedDeathstone, "condensedDeathstone");

		//register smooth stone blocks
		//GameRegistry.registerBlock(smoothDarkstone, "smoothDarkstone");
		GameRegistry.registerBlock(smoothDimstone, "smoothDimstone");
		GameRegistry.registerBlock(smoothLightstone, "smoothLightstone");
		GameRegistry.registerBlock(smoothSpringstone, "smoothSpringstone");
		GameRegistry.registerBlock(smoothFloatstone, "smoothFloatstone");
		GameRegistry.registerBlock(smoothDeathstone, "smoothDeathstone");

		//register stone brick blocks
		//GameRegistry.registerBlock(darkstoneBrick, "darkstoneBrick");
		GameRegistry.registerBlock(dimstoneBrick, "dimstoneBrick");
		GameRegistry.registerBlock(lightstoneBrick, "lightstoneBrick");
		GameRegistry.registerBlock(springstoneBrick, "springstoneBrick");
		GameRegistry.registerBlock(floatstoneBrick, "floatstoneBrick");
		GameRegistry.registerBlock(deathstoneBrick, "deathstoneBrick");

		//register cracked blocks
		//GameRegistry.registerBlock(crackedDarkstone, "crackedDarkstone");
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
		GameRegistry.registerBlock(lantern, "lantern");
		GameRegistry.registerBlock(boneTorch, "boneTorch");
		GameRegistry.registerBlock(brainMushroom, "brainMushroom");
		GameRegistry.registerBlock(bitumenFlowing, "bitumenFlowing");
		GameRegistry.registerBlock(bitumenStill, "bitumenStill");

		//register stalagmite level blocks
		GameRegistry.registerBlock(stalagmiteLevelTwo, "stalagmiteLevelTwo");
		GameRegistry.registerBlock(stalagmiteLevelThree, "stalagmiteLevelThree");
		GameRegistry.registerBlock(stalagmiteLevelFour, "stalagmiteLevelFour");
		GameRegistry.registerBlock(stalagmiteLevelFive, "stalagmiteLevelFive");

		//register stalagmite base level blocks
		GameRegistry.registerBlock(stalagmiteLevelTwoBase, "stalagmiteLevelTwoBase");
		GameRegistry.registerBlock(stalagmiteLevelThreeBase, "stalagmiteLevelThreeBase");
		GameRegistry.registerBlock(stalagmiteLevelFourBase, "stalagmiteLevelFourBase");
		GameRegistry.registerBlock(stalagmiteLevelFiveBase, "stalagmiteLevelFiveBase");


		//register carved stone blocks
		//GameRegistry.registerBlock(carvedDarkstone, "carvedDarkstone");
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
		//GameRegistry.registerBlock(smoothDarkstoneStairs, "smoothDarkstoneStairs");
		GameRegistry.registerBlock(smoothDimstoneStairs, "smoothDimstoneStairs");
		GameRegistry.registerBlock(smoothLightstoneStairs, "smoothLightstoneStairs");
		GameRegistry.registerBlock(smoothSpringstoneStairs, "smoothSpringstoneStairs");
		GameRegistry.registerBlock(smoothFloatstoneStairs, "smoothFloatstoneStairs");
		GameRegistry.registerBlock(smoothDeathstoneStairs, "smoothDeathstoneStairs");

		//register stone brick Stairs
		//GameRegistry.registerBlock(darkstoneBrickStairs, "darkstoneBrickStairs");
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
		LanguageRegistry.addName(lightstone, "Lightstone");
		LanguageRegistry.addName(dimstone, "Dimstone");
		
		for (int i = 0; i<darkstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(darkstone, 1, i), darkstoneNames[i]);
		}
		
		LanguageRegistry.addName(springstone, "Springstone");
		LanguageRegistry.addName(floatstone, "Floatstone");
		LanguageRegistry.addName(deathstone, "Deathstone");

		//register condensed stone block names
		//LanguageRegistry.addName(condensedDarkstone, "Condensed Darkstone");
		LanguageRegistry.addName(condensedDimstone, "Condensed Dimstone");
		LanguageRegistry.addName(condensedLightstone, "Condensed Lightstone");
		LanguageRegistry.addName(condensedSpringstone, "Condensed Springstone");
		LanguageRegistry.addName(condensedFloatstone, "Condensed Floatstone");
		LanguageRegistry.addName(condensedDeathstone, "Condensed Deathstone");

		//register smooth stone block names
		//LanguageRegistry.addName(smoothDarkstone, "Smooth Darkstone");
		LanguageRegistry.addName(smoothDimstone, "Smooth Dimstone");
		LanguageRegistry.addName(smoothLightstone, "Smooth Lightstone");
		LanguageRegistry.addName(smoothSpringstone, "Smooth Springstone");
		LanguageRegistry.addName(smoothFloatstone, "Smooth Floatstone");
		LanguageRegistry.addName(smoothDeathstone, "Smooth Deathstone");

		//register stone brick block names
		//LanguageRegistry.addName(darkstoneBrick, "Darkstone Brick");
		LanguageRegistry.addName(dimstoneBrick, "Dimstone Brick");
		LanguageRegistry.addName(lightstoneBrick, "Lightstone Brick");
		LanguageRegistry.addName(springstoneBrick, "Springstone Brick");
		LanguageRegistry.addName(floatstoneBrick, "Floatstone Brick");
		LanguageRegistry.addName(deathstoneBrick, "Deathstone Brick");

		//register cracked stone block names
		//LanguageRegistry.addName(crackedDarkstone, "Cracked Darkstone");
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
		//LanguageRegistry.addName(smoothDarkstoneStairs, "Smooth Darkstone Stairs");
		LanguageRegistry.addName(smoothDimstoneStairs, "Smooth Dimstone Stairs");
		LanguageRegistry.addName(smoothLightstoneStairs, "Smooth Lightstone Stairs");
		LanguageRegistry.addName(smoothSpringstoneStairs, "Smooth Springstone Stairs");
		LanguageRegistry.addName(smoothFloatstoneStairs, "Smooth Floatstone Stairs");
		LanguageRegistry.addName(smoothDeathstoneStairs, "Smooth Deathstone Stairs");

		//register stone brick Stairs names
		//LanguageRegistry.addName(darkstoneBrickStairs, "Darkstone Brick Stairs");
		LanguageRegistry.addName(dimstoneBrickStairs, "Dimstone Brick Stairs");
		LanguageRegistry.addName(lightstoneBrickStairs, "Lightstone Brick Stairs");
		LanguageRegistry.addName(springstoneBrickStairs, "Springstone Brick Stairs");
		LanguageRegistry.addName(floatstoneBrickStairs, "Floatstone Brick Stairs");
		LanguageRegistry.addName(deathstoneBrickStairs, "Deathstone Brick Stairs");

		//register carved stone names
		//LanguageRegistry.addName(carvedDarkstone, "Carved Darkstone");
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
		//MinecraftForge.setBlockHarvestLevel(condensedDarkstone, "pickaxe", 2);
		//MinecraftForge.setBlockHarvestLevel(smoothDarkstone, "pickaxe", 2);
		//MinecraftForge.setBlockHarvestLevel(crackedDarkstone, "pickaxe", 2);
		//MinecraftForge.setBlockHarvestLevel(darkstoneBrick, "pickaxe", 2);
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
		//MinecraftForge.setBlockHarvestLevel(smoothDarkstoneStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(smoothDimstoneStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(smoothLightstoneStairs, "pickaxe", 3);
		//MinecraftForge.setBlockHarvestLevel(darkstoneBrickStairs, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(dimstoneBrickStairs, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(lightstoneBrickStairs, "pickaxe", 3);
		//MinecraftForge.setBlockHarvestLevel(carvedDarkstone, "pickaxe", 1);
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
