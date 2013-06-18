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

	public static String[] dimstoneNames = {
		"Dimstone", "Cracked Dimstone", "Condensed Dimstone", "Smooth Dimstone", "Dimstone Brick", "Carved Dimstone"
	};

	public static String[] lightstoneNames = {
		"Lightstone", "Cracked Lightstone", "Condensed Lightstone", "Smooth Lightstone", "Lightstone Brick", "Carved Lightstone"
	};

	public static String[] springstoneNames = {
		"Springstone", "Cracked Springstone", "Condensed Springstone", "Smooth Springstone", "Springstone Brick", "Carved Springstone"
	};

	public static String[] floatstoneNames = {
		"Floatstone", "Cracked Floatstone", "Condensed Floatstone", "Smooth Floatstone", "Floatstone Brick", "Carved Floatstone"
	};

	public static String[] deathstoneNames = {
		"Deathstone", "Cracked Deathstone", "Condensed Deathstone", "Smooth Deathstone", "Deathstone Brick", "Carved Deathstone"
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
	public static BlockStairs springstoneStairs;
	public static BlockStairs floatstoneStairs;
	public static BlockStairs deathstoneStairs;

	//add Stairs	
	public static BlockStairs smoothDarkstoneStairs;
	public static BlockStairs smoothDimstoneStairs;
	public static BlockStairs smoothLightstoneStairs;
	public static BlockStairs smoothSpringstoneStairs;
	public static BlockStairs smoothFloatstoneStairs;
	public static BlockStairs smoothDeathstoneStairs;

	//add Stairs	
	public static BlockStairs darkstoneBrickStairs;
	public static BlockStairs dimstoneBrickStairs;
	public static BlockStairs lightstoneBrickStairs;
	public static BlockStairs springstoneBrickStairs;
	public static BlockStairs floatstoneBrickStairs;
	public static BlockStairs deathstoneBrickStairs;

	public static BlockStairs asphaltStairs;
	public static BlockStairs spheretreePlankStairs;
	public static BlockStairs ringtreePlankStairs;


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
		lightstone = new BlockLightstone(BlockIDs.lightstone, Material.rock).setUnlocalizedName("lightstone");
		dimstone = new BlockDimstone(BlockIDs.dimstone, Material.rock).setUnlocalizedName("dimstone");
		darkstone = new BlockDarkstone(BlockIDs.darkstone, Material.rock).setUnlocalizedName("darkstone");
		springstone = new BlockSpringstone(BlockIDs.springstone, Material.rock).setUnlocalizedName("springstone");
		floatstone = new BlockFloatstone(BlockIDs.floatstone, Material.rock).setUnlocalizedName("floatstone");
		deathstone = new BlockDeathstone(BlockIDs.deathstone, Material.cactus).setUnlocalizedName("deathstone");

		crackedDeathstone = new BlockCrackedDeathstone(BlockIDs.crackedDeathstone, Material.rock).setUnlocalizedName("crackedDeathstone").setStepSound(Block.soundStoneFootstep).setHardness(4.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setLightValue(1.0F);

		//initialize direction blocks
		up = new BlockUp(BlockIDs.up,  Material.rock).setUnlocalizedName("up").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		down = new BlockDown(BlockIDs.down,  Material.rock).setUnlocalizedName("down").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		east = new BlockEast(BlockIDs.east,  Material.rock).setUnlocalizedName("east").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		west = new BlockWest(BlockIDs.west,  Material.rock).setUnlocalizedName("west").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		north = new BlockNorth(BlockIDs.north,  Material.rock).setUnlocalizedName("north").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
		south = new BlockSouth(BlockIDs.south,  Material.rock).setUnlocalizedName("south").setStepSound(Block.soundSandFootstep).setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);

//		//initialize stone Stairs
//		darkstoneStairs = new StairBacon(BlockIDs.darkstoneStairs, BaconBlocks.darkstone, 0);
//		dimstoneStairs = new StairBacon(BlockIDs.dimstoneStairs, BaconBlocks.dimstone, 0);
//		lightstoneStairs = new StairBacon(BlockIDs.lightstoneStairs, BaconBlocks.lightstone, 0);
//		springstoneStairs = new StairBacon(BlockIDs.springstoneStairs, BaconBlocks.springstone, 0);
//		floatstoneStairs = new StairBacon(BlockIDs.floatstoneStairs, BaconBlocks.floatstone, 0);
//		deathstoneStairs = new StairBacon(BlockIDs.deathstoneStairs, BaconBlocks.deathstone, 0);
//
//		//initialize stone Stairs
//		smoothDarkstoneStairs = new StairBacon(BlockIDs.smoothDarkstoneStairs, BaconBlocks.darkstone, 0);
//		smoothDimstoneStairs = new StairBacon(BlockIDs.smoothDimstoneStairs, BaconBlocks.dimstone, 0);
//		smoothLightstoneStairs = new StairBacon(BlockIDs.smoothLightstoneStairs, BaconBlocks.lightstone, 0);
//		smoothSpringstoneStairs = new StairBacon(BlockIDs.smoothSpringstoneStairs, BaconBlocks.springstone, 0);
//		smoothFloatstoneStairs = new StairBacon(BlockIDs.smoothFloatstoneStairs, BaconBlocks.floatstone, 0);
//		smoothDeathstoneStairs = new StairBacon(BlockIDs.smoothDeathstoneStairs, BaconBlocks.deathstone, 0);
//
//		//initialize stone Stairs
//		darkstoneBrickStairs = new StairBacon(BlockIDs.darkstoneBrickStairs, BaconBlocks.darkstone, 0);
//		dimstoneBrickStairs = new StairBacon(BlockIDs.dimstoneBrickStairs, BaconBlocks.dimstone, 0);
//		lightstoneBrickStairs = new StairBacon(BlockIDs.lightstoneBrickStairs, BaconBlocks.lightstone, 0);
//		springstoneBrickStairs = new StairBacon(BlockIDs.springstoneBrickStairs, BaconBlocks.springstone, 0);
//		floatstoneBrickStairs = new StairBacon(BlockIDs.floatstoneBrickStairs, BaconBlocks.floatstone, 0);
//		deathstoneBrickStairs = new StairBacon(BlockIDs.deathstoneBrickStairs, BaconBlocks.deathstone, 0);
//
//		//initialize vanilla/organic Stairs
//		asphaltStairs = new StairBacon(BlockIDs.asphaltStairs, BaconBlocks.asphalt, 0);
//		ringtreePlankStairs = new StairBacon(BlockIDs.ringtreePlankStairs, BaconBlocks.ringtreePlanks, 0);
//		spheretreePlankStairs = new StairBacon(BlockIDs.spheretreePlankStairs, BaconBlocks.spheretreePlanks, 0);

		//initialize portal
		//port = new BlockPort(834, 0);

		//* -------------------------------------------------------------------------------------- REGISTER BLOCKS----------------------------------------------------

		//register ores
		GameRegistry.registerBlock(darknessOre, "darknessOre");
		GameRegistry.registerBlock(gravityOre, "gravityOre");
		GameRegistry.registerBlock(lethargyOre, "lethargyOre");
		GameRegistry.registerBlock(bitumenOre, "bitumenOre");

		//register stone blocks
		GameRegistry.registerBlock(lightstone, ItemBlockBacon.class, "Bacon" + (lightstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(dimstone, ItemBlockBacon.class, "Bacon" + (dimstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(darkstone, ItemBlockBacon.class, "Bacon" + (darkstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(springstone, ItemBlockBacon.class, "Bacon" + (springstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(floatstone, ItemBlockBacon.class, "Bacon" + (floatstone.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(deathstone, ItemBlockBacon.class, "Bacon" + (deathstone.getUnlocalizedName().substring(5)));

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


//		//register stone Stairs
//		GameRegistry.registerBlock(darkstoneStairs, "darkstoneStairs");
//		GameRegistry.registerBlock(dimstoneStairs, "dimstoneStairs");
//		GameRegistry.registerBlock(lightstoneStairs, "lightstoneStairs");
//		GameRegistry.registerBlock(springstoneStairs, "springstoneStairs");
//		GameRegistry.registerBlock(floatstoneStairs, "floatstoneStairs");
//		GameRegistry.registerBlock(deathstoneStairs, "deathstoneStairs");
//		
//		//register stone Stairs
//				GameRegistry.registerBlock(smoothDarkstoneStairs, "smoothDarkstoneStairs");
//				GameRegistry.registerBlock(smoothDimstoneStairs, "smoothDimstoneStairs");
//				GameRegistry.registerBlock(smoothLightstoneStairs, "smoothLightstoneStairs");
//				GameRegistry.registerBlock(smoothSpringstoneStairs, "smoothSpringstoneStairs");
//				GameRegistry.registerBlock(smoothFloatstoneStairs, "smoothFloatstoneStairs");
//				GameRegistry.registerBlock(smoothDeathstoneStairs, "smoothDeathstoneStairs");
//				
//				//register stone Stairs
//				GameRegistry.registerBlock(darkstoneBrickStairs, "darkstoneBrickStairs");
//				GameRegistry.registerBlock(dimstoneBrickStairs, "dimstoneBrickStairs");
//				GameRegistry.registerBlock(lightstoneBrickStairs, "lightstoneBrickStairs");
//				GameRegistry.registerBlock(springstoneBrickStairs, "springstoneBrickStairs");
//				GameRegistry.registerBlock(floatstoneBrickStairs, "floatstoneBrickStairs");
//				GameRegistry.registerBlock(deathstoneBrickStairs, "deathstoneBrickStairs");
//
//		//register vanilla/organic Stairs
//		GameRegistry.registerBlock(asphaltStairs, "asphaltStairs");
//		GameRegistry.registerBlock(ringtreePlankStairs, "ringtreePlankStairs");
//		GameRegistry.registerBlock(spheretreePlankStairs, "spheretreePlankStairs");

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
		for (int i = 0; i< lightstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(lightstone, 1, i), lightstoneNames[i]);
		}
		for (int i = 0; i< dimstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(dimstone, 1, i), dimstoneNames[i]);
		}		
		for (int i = 0; i< darkstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(darkstone, 1, i), darkstoneNames[i]);
		}
		for (int i = 0; i< springstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(springstone, 1, i), springstoneNames[i]);
		}		
		for (int i = 0; i< floatstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(floatstone, 1, i), floatstoneNames[i]);
		}
		for (int i = 0; i< deathstoneNames.length; i++)
		{LanguageRegistry.addName(new ItemStack(deathstone, 1, i), deathstoneNames[i]);
		}		

		LanguageRegistry.addName(crackedDeathstone, "Cracked Deathstone");

//		//register stone Stairs names
//		LanguageRegistry.addName(darkstoneStairs, "Darkstone Stairs");
//		LanguageRegistry.addName(dimstoneStairs, "Dimstone Stairs");
//		LanguageRegistry.addName(lightstoneStairs, "Lightstone Stairs");
//		LanguageRegistry.addName(springstoneStairs, "Springstone Stairs");
//		LanguageRegistry.addName(floatstoneStairs, "Floatstone Stairs");
//		LanguageRegistry.addName(deathstoneStairs, "Deathstone Stairs");
//		
//		//register stone Stairs
//		LanguageRegistry.addName(smoothDarkstoneStairs, "Smooth Darkstone Stairs");
//		LanguageRegistry.addName(smoothDimstoneStairs, "Smooth Dimstone Stairs");
//		LanguageRegistry.addName(smoothLightstoneStairs, "Smooth Lightstone Stairs");
//		LanguageRegistry.addName(smoothSpringstoneStairs, "Smooth Springstone Stairs");
//		LanguageRegistry.addName(smoothFloatstoneStairs, "Smooth Floatstone Stairs");
//		LanguageRegistry.addName(smoothDeathstoneStairs, "Smooth Deathstone Stairs");
//		
//		//register stone Stairs
//		LanguageRegistry.addName(darkstoneBrickStairs, "Darkstone Brick Stairs");
//		LanguageRegistry.addName(dimstoneBrickStairs, "Dimstone Brick Stairs");
//		LanguageRegistry.addName(lightstoneBrickStairs, "Lightstone Brick Stairs");
//		LanguageRegistry.addName(springstoneBrickStairs, "Springstone Brick Stairs");
//		LanguageRegistry.addName(floatstoneBrickStairs, "Floatstone Brick Stairs");
//		LanguageRegistry.addName(deathstoneBrickStairs, "Deathstone Brick Stairs");
//
//		//register vanilla/organic Stairs names
//		LanguageRegistry.addName(asphaltStairs, "Asphalt Stairs");
//		LanguageRegistry.addName(ringtreePlankStairs, "Ringtree Plank Stairs");
//		LanguageRegistry.addName(spheretreePlankStairs, "Spheretree Plank Stairs");

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
