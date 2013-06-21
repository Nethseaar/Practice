package nethseaar.bacon;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;
import nethseaar.bacon.BlockIDs;

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
		
	config.save();
	}
}
