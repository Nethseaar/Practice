package nethseaar.bacon;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;
import nethseaar.bacon.references.BlockIDs;
import nethseaar.bacon.references.BlockNames;
import nethseaar.bacon.references.ItemIDs;
import nethseaar.bacon.references.ItemNames;

public class Config {
	
	public static void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
	BlockIDs.darknessOre = config.getBlock(BlockNames.darknessOreName, BlockIDs.darknessOreDefault).getInt(BlockIDs.darknessOre);
	BlockIDs.gravityOre = config.getBlock(BlockNames.gravityOreName, BlockIDs.gravityOreDefault).getInt(BlockIDs.gravityOre);
	BlockIDs.lethargyOre = config.getBlock(BlockNames.lethargyOreName, BlockIDs.lethargyOreDefault).getInt(BlockIDs.lethargyOre);
	BlockIDs.darknessOre = config.getBlock(BlockNames.darknessOreName, BlockIDs.darknessOreDefault).getInt(BlockIDs.darknessOre);
	
	BlockIDs.stoneWorkbench = config.getBlock(BlockNames.stoneWorkbenchName, BlockIDs.stoneWorkbenchDefault).getInt(BlockIDs.stoneWorkbench);
	BlockIDs.boneLadder = config.getBlock(BlockNames.boneLadderName, BlockIDs.boneLadderDefault).getInt(BlockIDs.boneLadder);
	BlockIDs.asphalt = config.getBlock(BlockNames.asphaltName, BlockIDs.asphaltDefault).getInt(BlockIDs.asphalt);
	BlockIDs.endObsidian = config.getBlock(BlockNames.endObsidianName, BlockIDs.endObsidianDefault).getInt(BlockIDs.endObsidian);
	BlockIDs.stalagmite = config.getBlock(BlockNames.stalagmiteName, BlockIDs.stalagmiteDefault).getInt(BlockIDs.stalagmite);
	BlockIDs.stalagmiteBase = config.getBlock(BlockNames.stalagmiteBaseName, BlockIDs.stalagmiteBaseDefault).getInt(BlockIDs.stalagmiteBase);
	BlockIDs.ringtreePlanks = config.getBlock(BlockNames.ringtreePlanksName, BlockIDs.ringtreePlanksDefault).getInt(BlockIDs.ringtreePlanks);
	BlockIDs.spheretreePlanks = config.getBlock(BlockNames.spheretreePlanksName, BlockIDs.spheretreePlanksDefault).getInt(BlockIDs.spheretreePlanks);
	BlockIDs.spheretreeHeart = config.getBlock(BlockNames.spheretreeHeartName, BlockIDs.spheretreeHeartDefault).getInt(BlockIDs.spheretreeHeart);
	BlockIDs.ringtree = config.getBlock(BlockNames.ringtreeName, BlockIDs.ringtreeDefault).getInt(BlockIDs.ringtree);
	BlockIDs.spheretreeLeaves = config.getBlock(BlockNames.spheretreeLeavesName, BlockIDs.spheretreeLeavesDefault).getInt(BlockIDs.spheretreeLeaves);
	BlockIDs.spheretreeDeepwood = config.getBlock(BlockNames.spheretreeDeepwoodName, BlockIDs.spheretreeDeepwoodDefault).getInt(BlockIDs.spheretreeDeepwood);
	BlockIDs.spheretreeBranchwood = config.getBlock(BlockNames.spheretreeBranchwoodName, BlockIDs.spheretreeBranchwoodDefault).getInt(BlockIDs.spheretreeBranchwood);
	BlockIDs.lantern = config.getBlock(BlockNames.lanternName, BlockIDs.lanternDefault).getInt(BlockIDs.lantern);
	BlockIDs.boneTorch = config.getBlock(BlockNames.boneTorchName, BlockIDs.boneTorchDefault).getInt(BlockIDs.boneTorch);
	BlockIDs.brainMushroom = config.getBlock(BlockNames.brainMushroomName, BlockIDs.brainMushroomDefault).getInt(BlockIDs.brainMushroom);
	BlockIDs.bitumenStill = config.getBlock(BlockNames.bitumenStillName, BlockIDs.bitumenStillDefault).getInt(BlockIDs.bitumenStill);
	BlockIDs.purpleBerry = config.getBlock(BlockNames.purpleBerryName, BlockIDs.purpleBerryDefault).getInt(BlockIDs.purpleBerry);
	
	BlockIDs.stalagmiteLevelTwo = config.getBlock(BlockNames.stalagmiteLevelTwoName, BlockIDs.stalagmiteLevelTwoDefault).getInt(BlockIDs.stalagmiteLevelTwo);
	BlockIDs.stalagmiteLevelThree = config.getBlock(BlockNames.stalagmiteLevelThreeName, BlockIDs.stalagmiteLevelThreeDefault).getInt(BlockIDs.stalagmiteLevelThree);
	BlockIDs.stalagmiteLevelFour = config.getBlock(BlockNames.stalagmiteLevelFourName, BlockIDs.stalagmiteLevelFourDefault).getInt(BlockIDs.stalagmiteLevelFour);
	BlockIDs.stalagmiteLevelFive = config.getBlock(BlockNames.stalagmiteLevelFiveName, BlockIDs.stalagmiteLevelFiveDefault).getInt(BlockIDs.stalagmiteLevelFive);
	BlockIDs.stalagmiteLevelTwoBase = config.getBlock(BlockNames.stalagmiteLevelTwoBaseName, BlockIDs.stalagmiteLevelTwoBaseDefault).getInt(BlockIDs.stalagmiteLevelTwoBase);
	BlockIDs.stalagmiteLevelThreeBase = config.getBlock(BlockNames.stalagmiteLevelThreeBaseName, BlockIDs.stalagmiteLevelThreeBaseDefault).getInt(BlockIDs.stalagmiteLevelThreeBase);
	BlockIDs.stalagmiteLevelFourBase = config.getBlock(BlockNames.stalagmiteLevelFourBaseName, BlockIDs.stalagmiteLevelFourBaseDefault).getInt(BlockIDs.stalagmiteLevelFourBase);
	BlockIDs.stalagmiteLevelFiveBase = config.getBlock(BlockNames.stalagmiteLevelFiveBaseName, BlockIDs.stalagmiteLevelFiveBaseDefault).getInt(BlockIDs.stalagmiteLevelFiveBase);
	
	BlockIDs.lightstone = config.getBlock(BlockNames.lightstoneName, BlockIDs.lightstoneDefault).getInt(BlockIDs.lightstone);
	BlockIDs.dimstone = config.getBlock(BlockNames.dimstoneName, BlockIDs.dimstoneDefault).getInt(BlockIDs.dimstone);
	BlockIDs.darkstone = config.getBlock(BlockNames.darkstoneName, BlockIDs.darkstoneDefault).getInt(BlockIDs.darkstone);
	BlockIDs.springstone = config.getBlock(BlockNames.springstoneName, BlockIDs.springstoneDefault).getInt(BlockIDs.springstone);
	BlockIDs.floatstone = config.getBlock(BlockNames.floatstoneName, BlockIDs.floatstoneDefault).getInt(BlockIDs.floatstone);
	BlockIDs.deathstone = config.getBlock(BlockNames.deathstoneName, BlockIDs.deathstoneDefault).getInt(BlockIDs.deathstone);
	
	BlockIDs.crackedDeathstone = config.getBlock(BlockNames.crackedDeathstoneName, BlockIDs.crackedDeathstoneDefault).getInt(BlockIDs.crackedDeathstone);
	
	BlockIDs.up = config.getBlock(BlockNames.upName, BlockIDs.upDefault).getInt(BlockIDs.up);
	BlockIDs.down = config.getBlock(BlockNames.downName, BlockIDs.downDefault).getInt(BlockIDs.down);
	BlockIDs.east = config.getBlock(BlockNames.eastName, BlockIDs.eastDefault).getInt(BlockIDs.east);
	BlockIDs.west = config.getBlock(BlockNames.westName, BlockIDs.westDefault).getInt(BlockIDs.west);
	BlockIDs.north = config.getBlock(BlockNames.northName, BlockIDs.northDefault).getInt(BlockIDs.north);
	BlockIDs.south = config.getBlock(BlockNames.southName, BlockIDs.southDefault).getInt(BlockIDs.south);
	
	BlockIDs.darkstoneStairs = config.getBlock(BlockNames.darkstoneStairsName, BlockIDs.darkstoneStairsDefault).getInt(BlockIDs.darkstoneStairs);
	BlockIDs.dimstoneStairs = config.getBlock(BlockNames.dimstoneStairsName, BlockIDs.dimstoneStairsDefault).getInt(BlockIDs.dimstoneStairs);
	BlockIDs.lightstoneStairs = config.getBlock(BlockNames.lightstoneStairsName, BlockIDs.lightstoneStairsDefault).getInt(BlockIDs.lightstoneStairs);
	BlockIDs.springstoneStairs = config.getBlock(BlockNames.springstoneStairsName, BlockIDs.springstoneStairsDefault).getInt(BlockIDs.springstoneStairs);
	BlockIDs.floatstoneStairs = config.getBlock(BlockNames.floatstoneStairsName, BlockIDs.floatstoneStairsDefault).getInt(BlockIDs.floatstoneStairs);
	BlockIDs.deathstoneStairs = config.getBlock(BlockNames.deathstoneStairsName, BlockIDs.deathstoneStairsDefault).getInt(BlockIDs.deathstoneStairs);
	
	BlockIDs.smoothDarkstoneStairs = config.getBlock(BlockNames.smoothDarkstoneStairsName, BlockIDs.smoothDarkstoneStairsDefault).getInt(BlockIDs.smoothDarkstoneStairs);
	BlockIDs.smoothDimstoneStairs = config.getBlock(BlockNames.smoothDimstoneStairsName, BlockIDs.smoothDimstoneStairsDefault).getInt(BlockIDs.smoothDimstoneStairs);
	BlockIDs.smoothLightstoneStairs = config.getBlock(BlockNames.smoothLightstoneStairsName, BlockIDs.smoothLightstoneStairsDefault).getInt(BlockIDs.smoothLightstoneStairs);
	BlockIDs.smoothSpringstoneStairs = config.getBlock(BlockNames.smoothSpringstoneStairsName, BlockIDs.smoothSpringstoneStairsDefault).getInt(BlockIDs.smoothSpringstoneStairs);
	BlockIDs.smoothFloatstoneStairs = config.getBlock(BlockNames.smoothFloatstoneStairsName, BlockIDs.smoothFloatstoneStairsDefault).getInt(BlockIDs.smoothFloatstoneStairs);
	BlockIDs.smoothDeathstoneStairs = config.getBlock(BlockNames.smoothDeathstoneStairsName, BlockIDs.smoothDeathstoneStairsDefault).getInt(BlockIDs.smoothDeathstoneStairs);
	
	BlockIDs.darkstoneBrickStairs = config.getBlock(BlockNames.darkstoneBrickStairsName, BlockIDs.darkstoneBrickStairsDefault).getInt(BlockIDs.darkstoneBrickStairs);
	BlockIDs.dimstoneBrickStairs = config.getBlock(BlockNames.dimstoneBrickStairsName, BlockIDs.dimstoneBrickStairsDefault).getInt(BlockIDs.dimstoneBrickStairs);
	BlockIDs.lightstoneBrickStairs = config.getBlock(BlockNames.lightstoneBrickStairsName, BlockIDs.lightstoneBrickStairsDefault).getInt(BlockIDs.lightstoneBrickStairs);
	BlockIDs.springstoneBrickStairs = config.getBlock(BlockNames.springstoneBrickStairsName, BlockIDs.springstoneBrickStairsDefault).getInt(BlockIDs.springstoneBrickStairs);
	BlockIDs.floatstoneBrickStairs = config.getBlock(BlockNames.floatstoneBrickStairsName, BlockIDs.floatstoneBrickStairsDefault).getInt(BlockIDs.floatstoneBrickStairs);
	BlockIDs.deathstoneBrickStairs = config.getBlock(BlockNames.deathstoneBrickStairsName, BlockIDs.deathstoneBrickStairsDefault).getInt(BlockIDs.deathstoneBrickStairs);
	
	BlockIDs.asphaltStairs = config.getBlock(BlockNames.asphaltStairsName, BlockIDs.asphaltStairsDefault).getInt(BlockIDs.asphaltStairs);
	BlockIDs.ringtreePlankStairs = config.getBlock(BlockNames.ringtreePlankStairsName, BlockIDs.ringtreePlankStairsDefault).getInt(BlockIDs.ringtreePlankStairs);
	BlockIDs.spheretreePlankStairs = config.getBlock(BlockNames.spheretreePlankStairsName, BlockIDs.spheretreePlankStairsDefault).getInt(BlockIDs.spheretreePlankStairs);
	
	BlockIDs.condenserIdle = config.getBlock(BlockNames.condenserIdleName, BlockIDs.condenserIdleDefault).getInt(BlockIDs.condenserIdle);
	BlockIDs.condenserActive = config.getBlock(BlockNames.condenserActiveName, BlockIDs.condenserActiveDefault).getInt(BlockIDs.condenserActive);
		
	ItemIDs.darkness = config.getItem(ItemNames.darknessName, ItemIDs.darknessDefault).getInt(ItemIDs.darkness);
	ItemIDs.gravity = config.getItem(ItemNames.gravityName, ItemIDs.gravityDefault).getInt(ItemIDs.gravity);
	ItemIDs.lethargy = config.getItem(ItemNames.lethargyName, ItemIDs.lethargyDefault).getInt(ItemIDs.lethargy);
	ItemIDs.hex = config.getItem(ItemNames.hexName, ItemIDs.hexDefault).getInt(ItemIDs.hex);
	ItemIDs.bitumenChunk = config.getItem(ItemNames.bitumenChunkName, ItemIDs.bitumenChunkDefault).getInt(ItemIDs.bitumenChunk);
	ItemIDs.bitumenInBucket = config.getItem(ItemNames.bitumenInBucketName, ItemIDs.bitumenInBucketDefault).getInt(ItemIDs.bitumenInBucket);
	ItemIDs.greenBerry = config.getItem(ItemNames.greenBerryName, ItemIDs.greenBerryDefault).getInt(ItemIDs.greenBerry);
	ItemIDs.compactGreenBerry = config.getItem(ItemNames.compactGreenBerryName, ItemIDs.compactGreenBerryDefault).getInt(ItemIDs.compactGreenBerry);
	ItemIDs.compactPurpleBerry = config.getItem(ItemNames.compactPurpleBerryName, ItemIDs.compactPurpleBerryDefault).getInt(ItemIDs.compactPurpleBerry);
	ItemIDs.shriveledGreenBerry = config.getItem(ItemNames.shriveledGreenBerryName, ItemIDs.shriveledGreenBerryDefault).getInt(ItemIDs.shriveledGreenBerry);
	ItemIDs.shriveledPurpleBerry = config.getItem(ItemNames.shriveledPurpleBerryName, ItemIDs.shriveledPurpleBerryDefault).getInt(ItemIDs.shriveledPurpleBerry);
	ItemIDs.spheretreeStick = config.getItem(ItemNames.spheretreeStickName, ItemIDs.spheretreeStickDefault).getInt(ItemIDs.spheretreeStick);
	ItemIDs.ringtreeStick = config.getItem(ItemNames.ringtreeStickName, ItemIDs.ringtreeStickDefault).getInt(ItemIDs.ringtreeStick);
	ItemIDs.bitumenBucket = config.getItem(ItemNames.bitumenBucketName, ItemIDs.bitumenBucketDefault).getInt(ItemIDs.bitumenBucket);
	ItemIDs.flintTool = config.getItem(ItemNames.flintToolName, ItemIDs.flintToolDefault).getInt(ItemIDs.flintTool);
	ItemIDs.stoneBonePick = config.getItem(ItemNames.stoneBonePickName, ItemIDs.stoneBonePickDefault).getInt(ItemIDs.stoneBonePick);
	ItemIDs.ironBonePick = config.getItem(ItemNames.ironBonePickName, ItemIDs.ironBonePickDefault).getInt(ItemIDs.ironBonePick);
	ItemIDs.goldBonePick = config.getItem(ItemNames.goldBonePickName, ItemIDs.goldBonePickDefault).getInt(ItemIDs.goldBonePick);
	ItemIDs.diamondBonePick = config.getItem(ItemNames.diamondBonePickName, ItemIDs.diamondBonePickDefault).getInt(ItemIDs.diamondBonePick);
	
	ItemIDs.stoneBoneAxe = config.getItem(ItemNames.stoneBoneAxeName, ItemIDs.stoneBoneAxeDefault).getInt(ItemIDs.stoneBoneAxe);
	ItemIDs.ironBoneAxe = config.getItem(ItemNames.ironBoneAxeName, ItemIDs.ironBoneAxeDefault).getInt(ItemIDs.ironBoneAxe);
	ItemIDs.goldBoneAxe = config.getItem(ItemNames.goldBoneAxeName, ItemIDs.goldBoneAxeDefault).getInt(ItemIDs.goldBoneAxe);
	ItemIDs.diamondBoneAxe = config.getItem(ItemNames.diamondBoneAxeName, ItemIDs.diamondBoneAxeDefault).getInt(ItemIDs.diamondBoneAxe);
	
	ItemIDs.stoneBoneHoe = config.getItem(ItemNames.stoneBoneHoeName, ItemIDs.stoneBoneHoeDefault).getInt(ItemIDs.stoneBoneHoe);
	ItemIDs.ironBoneHoe = config.getItem(ItemNames.ironBoneHoeName, ItemIDs.ironBoneHoeDefault).getInt(ItemIDs.ironBoneHoe);
	ItemIDs.goldBoneHoe = config.getItem(ItemNames.goldBoneHoeName, ItemIDs.goldBoneHoeDefault).getInt(ItemIDs.goldBoneHoe);
	ItemIDs.diamondBoneHoe = config.getItem(ItemNames.diamondBoneHoeName, ItemIDs.diamondBoneHoeDefault).getInt(ItemIDs.diamondBoneHoe);
	
	ItemIDs.stoneBoneShovel = config.getItem(ItemNames.stoneBoneShovelName, ItemIDs.stoneBoneShovelDefault).getInt(ItemIDs.stoneBoneShovel);
	ItemIDs.ironBoneShovel = config.getItem(ItemNames.ironBoneShovelName, ItemIDs.ironBoneShovelDefault).getInt(ItemIDs.ironBoneShovel);
	ItemIDs.goldBoneShovel = config.getItem(ItemNames.goldBoneShovelName, ItemIDs.goldBoneShovelDefault).getInt(ItemIDs.goldBoneShovel);
	ItemIDs.diamondBoneShovel = config.getItem(ItemNames.diamondBoneShovelName, ItemIDs.diamondBoneShovelDefault).getInt(ItemIDs.diamondBoneShovel);
	
	ItemIDs.stoneBoneSword = config.getItem(ItemNames.stoneBoneSwordName, ItemIDs.stoneBoneSwordDefault).getInt(ItemIDs.stoneBoneSword);
	ItemIDs.ironBoneSword = config.getItem(ItemNames.ironBoneSwordName, ItemIDs.ironBoneSwordDefault).getInt(ItemIDs.ironBoneSword);
	ItemIDs.goldBoneSword = config.getItem(ItemNames.goldBoneSwordName, ItemIDs.goldBoneSwordDefault).getInt(ItemIDs.goldBoneSword);
	ItemIDs.diamondBoneSword = config.getItem(ItemNames.diamondBoneSwordName, ItemIDs.diamondBoneSwordDefault).getInt(ItemIDs.diamondBoneSword);
	config.save();
	}
}
