package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaconRecipes {

	@Init
	public static void init() {
		
		//itemstacks
				ItemStack crackedDarkstoneStack = new ItemStack(BaconBlocks.crackedDarkstone);
				ItemStack crackedDimstoneStack = new ItemStack(BaconBlocks.crackedDimstone);
				ItemStack crackedLightstoneStack = new ItemStack(BaconBlocks.crackedLightstone);
				ItemStack DarkStoneHexStack = new ItemStack(BaconItems.darkstoneHex);
				ItemStack DimStoneHexStack = new ItemStack(BaconItems.dimstoneHex);
				ItemStack LightStoneHexStack = new ItemStack(BaconItems.lightstoneHex);
				ItemStack DarkStoneStack = new ItemStack(BaconBlocks.darkstone);
				ItemStack DimStoneStack = new ItemStack(BaconBlocks.dimstone);
				ItemStack LightStoneStack = new ItemStack(BaconBlocks.lightstone);
				ItemStack condensedDarkstoneStack = new ItemStack(BaconBlocks.condensedDarkstone);
				ItemStack condensedDimstoneStack = new ItemStack(BaconBlocks.condensedDimstone);
				ItemStack condensedLightstoneStack = new ItemStack(BaconBlocks.condensedLightstone);
				ItemStack smoothDarkstoneStack = new ItemStack(BaconBlocks.smoothDarkstone);
				ItemStack smoothDimstoneStack = new ItemStack(BaconBlocks.smoothDimstone);
				ItemStack smoothLightstoneStack = new ItemStack(BaconBlocks.smoothLightstone);
				ItemStack darkstoneBrickStack = new ItemStack(BaconBlocks.darkstoneBrick);
				ItemStack dimstoneBrickStack = new ItemStack(BaconBlocks.dimstoneBrick);
				ItemStack lightstoneBrickStack = new ItemStack(BaconBlocks.lightstoneBrick);
				ItemStack DeathStoneStackStack = new ItemStack(BaconBlocks.deathstone);
				ItemStack FloatStoneStackStack = new ItemStack(BaconBlocks.floatstone);
				ItemStack deathstoneBrickStack = new ItemStack(BaconBlocks.deathstoneBrick);
				ItemStack floatstoneBrickStack = new ItemStack(BaconBlocks.floatstoneBrick);
				ItemStack smoothDeathstoneStack = new ItemStack(BaconBlocks.smoothDeathstone);
				ItemStack smoothFloatstoneStack = new ItemStack(BaconBlocks.smoothFloatstone);
				ItemStack condensedDeathstoneStack = new ItemStack(BaconBlocks.condensedDeathstone);
				ItemStack condensedFloatstoneStack = new ItemStack(BaconBlocks.condensedFloatstone);
				ItemStack crackedDeathstoneStack = new ItemStack(BaconBlocks.crackedDeathstone);
				ItemStack crackedFloatstoneStack = new ItemStack(BaconBlocks.crackedFloatstone);
				ItemStack DeathStoneHexStack = new ItemStack(BaconItems.deathstoneHex);
				ItemStack FloatStoneHexStack = new ItemStack(BaconItems.floatstoneHex);
				ItemStack SpringStoneHexStack = new ItemStack (BaconItems.springstoneHex);
				ItemStack RingTree = new ItemStack(BaconBlocks.ringtree);
				ItemStack ringtreePlanks = new ItemStack(BaconBlocks.ringtreePlanks);
				ItemStack spheretreeDeepwood = new ItemStack(BaconBlocks.spheretreeDeepwood);
				ItemStack spheretreeBranchwood = new ItemStack(BaconBlocks.spheretreeBranchwood);
				ItemStack spheretreePlanks = new ItemStack(BaconBlocks.spheretreePlanks);
				ItemStack DarkStoneStairs = new ItemStack(BaconBlocks.darkstoneStairs);
				ItemStack LightStoneStairs = new ItemStack(BaconBlocks.lightstoneStairs);
				ItemStack DimStoneStairs = new ItemStack(BaconBlocks.dimstoneStairs);
				ItemStack smoothDarkstoneStairs = new ItemStack(BaconBlocks.smoothDarkstoneStairs);
				ItemStack smoothLightstoneStairs = new ItemStack(BaconBlocks.smoothLightstoneStairs);
				ItemStack smoothDimstoneStairs = new ItemStack(BaconBlocks.smoothDimstoneStairs);
				ItemStack darkstoneBrickStairs = new ItemStack(BaconBlocks.darkstoneBrickStairs);
				ItemStack lightstoneBrickStairs = new ItemStack(BaconBlocks.lightstoneBrickStairs);
				ItemStack dimstoneBrickStairs = new ItemStack(BaconBlocks.dimstoneBrickStairs);
				ItemStack AsphaltStack = new ItemStack(BaconBlocks.asphalt);
				ItemStack SpringStoneStairs = new ItemStack(BaconBlocks.springstoneStairs);
				ItemStack FloatStoneStairs = new ItemStack(BaconBlocks.floatstoneStairs);
				ItemStack DeathStoneStairs = new ItemStack(BaconBlocks.deathstoneStairs);
				ItemStack carvedDimstoneStack = new ItemStack(BaconBlocks.carvedDimstone);
				ItemStack carvedDarkstoneStack = new ItemStack(BaconBlocks.carvedDarkstone);
				ItemStack carvedLightstoneStack = new ItemStack(BaconBlocks.carvedLightstone);
				ItemStack carvedSpringstoneStack = new ItemStack(BaconBlocks.carvedSpringstone);
				ItemStack CarvedFloatStack = new ItemStack(BaconBlocks.carvedFloatstone);
				ItemStack CarvedDeathStack = new ItemStack(BaconBlocks.carvedDeathstone);
				ItemStack smoothSpringstoneStack = new ItemStack(BaconBlocks.smoothSpringstone);
				ItemStack springstoneBrickStack = new ItemStack(BaconBlocks.springstoneBrick);
				ItemStack smoothSpringstoneStairs = new ItemStack(BaconBlocks.smoothSpringstoneStairs);
				ItemStack springstoneBrickStairs = new ItemStack(BaconBlocks.springstoneBrickStairs);
				ItemStack stickStack = new ItemStack(Item.stick);
				ItemStack spheretreeStickStack = new ItemStack(BaconItems.spheretreeStick);
				ItemStack stoneBonePickStack = new ItemStack(BaconItems.stoneBonePick);
				ItemStack stoneBoneShovelStack = new ItemStack(BaconItems.stoneBoneShovel);
				ItemStack stoneBoneHoeStack = new ItemStack(BaconItems.stoneBoneHoe);
				ItemStack stoneBoneAxeStack = new ItemStack(BaconItems.stoneBoneAxe);
				ItemStack ironBonePickStack = new ItemStack(BaconItems.ironBonePick);
				ItemStack ironBoneShovelStack = new ItemStack(BaconItems.ironBoneShovel);
				ItemStack ironBoneHoeStack = new ItemStack(BaconItems.ironBoneHoe);
				ItemStack ironBoneAxeStack = new ItemStack(BaconItems.ironBoneAxe);
				ItemStack goldBonePickStack = new ItemStack(BaconItems.goldBonePick);
				ItemStack goldBoneShovelStack = new ItemStack(BaconItems.goldBoneShovel);
				ItemStack goldBoneHoeStack = new ItemStack(BaconItems.goldBoneHoe);
				ItemStack goldBoneAxeStack = new ItemStack(BaconItems.goldBoneAxe);
				ItemStack diamondBonePickStack = new ItemStack(BaconItems.diamondBonePick);
				ItemStack diamondBoneShovelStack = new ItemStack(BaconItems.diamondBoneShovel);
				ItemStack diamondBoneHoeStack = new ItemStack(BaconItems.diamondBoneHoe);
				ItemStack diamondBoneAxeStack = new ItemStack(BaconItems.diamondBoneAxe);
				ItemStack stoneBoneSwordStack = new ItemStack(BaconItems.diamondBoneSword);
				ItemStack ironBoneSwordStack = new ItemStack(BaconItems.diamondBoneSword);
				ItemStack goldBoneSwordStack = new ItemStack(BaconItems.diamondBoneSword);
				ItemStack diamondBoneSwordStack = new ItemStack(BaconItems.diamondBoneSword);
				
				//shapeless recipes
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone), new ItemStack(BaconBlocks.crackedDarkstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone), new ItemStack(BaconBlocks.crackedDimstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone), new ItemStack(BaconBlocks.crackedLightstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedDarkstone), new ItemStack(BaconBlocks.darkstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedDimstone), new ItemStack(BaconBlocks.dimstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedLightstone), new ItemStack(BaconBlocks.lightstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothDarkstone), new ItemStack(BaconBlocks.condensedDarkstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothDimstone), new ItemStack(BaconBlocks.condensedDimstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothLightstone), new ItemStack(BaconBlocks.condensedLightstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.deathstone), new ItemStack(BaconBlocks.crackedDeathstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.floatstone), new ItemStack(BaconBlocks.crackedFloatstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedDeathstone), new ItemStack(BaconBlocks.deathstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedFloatstone), new ItemStack(BaconBlocks.floatstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothDeathstone), new ItemStack(BaconBlocks.condensedDeathstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothFloatstone), new ItemStack(BaconBlocks.condensedFloatstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.ringtreePlanks, 4), new ItemStack(BaconBlocks.ringtree));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks, 8), new ItemStack(BaconBlocks.spheretreeDeepwood));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks, 4), new ItemStack(BaconBlocks.spheretreeBranchwood));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 6), new ItemStack(BaconBlocks.darkstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 6), new ItemStack(BaconBlocks.dimstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 6), new ItemStack(BaconBlocks.lightstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothDarkstone, 6), new ItemStack(BaconBlocks.smoothDarkstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothDimstone, 6), new ItemStack(BaconBlocks.smoothDimstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothLightstone, 6), new ItemStack(BaconBlocks.smoothLightstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstoneBrick, 6), new ItemStack(BaconBlocks.darkstoneBrickStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstoneBrick, 6), new ItemStack(BaconBlocks.dimstoneBrickStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstoneBrick, 6), new ItemStack(BaconBlocks.lightstoneBrickStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.asphalt, 6), new ItemStack(BaconBlocks.asphaltStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.ringtreePlanks, 6), new ItemStack(BaconBlocks.ringtreePlankStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks, 6), new ItemStack(BaconBlocks.spheretreePlankStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstone, 6), new ItemStack(BaconBlocks.springstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothSpringstone, 6), new ItemStack(BaconBlocks.smoothSpringstoneStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstoneBrick, 6), new ItemStack(BaconBlocks.springstoneBrickStairs));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.smoothSpringstone), new ItemStack(BaconBlocks.condensedSpringstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.condensedSpringstone, 6), new ItemStack(BaconBlocks.springstone));
				GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstone, 6), new ItemStack(BaconBlocks.crackedSpringstone));

				//shaped recipes
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.darkstoneBrick, 4), "xx", "xx",
						'x', smoothDarkstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.dimstoneBrick, 4),  "xx", "xx",
						'x', smoothDimstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.lightstoneBrick, 4),  "xx", "xx",
						'x', smoothLightstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.deathstoneBrick, 4),  "xx", "xx",
						'x', smoothDeathstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.floatstoneBrick, 4),  "xx", "xx",
						'x', smoothFloatstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedDarkstone, 4), "xx", "xx",
						'x', darkstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedDimstone, 4),  "xx", "xx",
						'x', dimstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedLightstone, 4),  "xx", "xx",
						'x', lightstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedDeathstone, 4),  "xx", "xx",
						'x', deathstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedFloatstone, 4),  "xx", "xx",
						'x', floatstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.carvedSpringstone, 4),  "xx", "xx",
						'x', springstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.springstoneBrick, 4),  "xx", "xx",
						'x', smoothSpringstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedDarkstone), "xxx", "xxx", "xxx",
						'x', DarkStoneHexStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedDimstone), "xxx", "xxx", "xxx",
						'x', DimStoneHexStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedLightstone), "xxx", "xxx", "xxx",
						'x', LightStoneHexStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedDeathstone), "xxx", "xxx", "xxx",
						'x', DeathStoneHexStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedFloatstone), "xxx", "xxx", "xxx",
						'x', FloatStoneHexStack);
				 GameRegistry.addRecipe(new ItemStack(BaconBlocks.crackedSpringstone), "xxx", "xxx", "xxx",
			            'x', SpringStoneHexStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.darkstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', DarkStoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.lightstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', LightStoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.dimstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', DimStoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.smoothDarkstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', smoothDarkstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.smoothLightstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', smoothLightstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.smoothDimstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', smoothDimstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.darkstoneBrickStairs, 6), "x  ", "xx ", "xxx",
						'x', darkstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.lightstoneBrickStairs, 6), "x  ", "xx ", "xxx",
						'x', LightStoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.dimstoneBrickStairs, 6), "x  ", "xx ", "xxx",
						'x', DimStoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.asphaltStairs, 6), "x  ", "xx ", "xxx",
						'x', AsphaltStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.ringtreePlankStairs, 6), "x  ", "xx ", "xxx",
						'x', ringtreePlanks);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.spheretreePlankStairs, 6), "x  ", "xx ", "xxx",
						'x', spheretreePlanks);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.smoothSpringstoneStairs, 6), "x  ", "xx ", "xxx",
						'x', smoothSpringstoneStack);
				GameRegistry.addRecipe(new ItemStack(BaconBlocks.springstoneBrickStairs, 6), "x  ", "xx ", "xxx",
						'x', springstoneBrickStack);
				GameRegistry.addRecipe(new ItemStack(BaconItems.ringtreeStick, 4), "x", "x",
						'x', ringtreePlanks);
				GameRegistry.addRecipe(new ItemStack(BaconItems.spheretreeStick, 4), "x", "x",
						'x', spheretreePlanks);
				GameRegistry.addRecipe(new ItemStack(Block.torchWood, 4), "y", "x",
						'x', spheretreeStickStack, 'y', Item.coal);
				GameRegistry.addRecipe(new ItemStack(Block.torchWood, 4), "y", "x",
						'x', spheretreeStickStack, 'y', Item.coal);
				GameRegistry.addRecipe(new ItemStack(Block.torchRedstoneActive, 4), "y", "x",
						'x', spheretreeStickStack, 'y', Item.redstone);
				GameRegistry.addRecipe(new ItemStack(Block.torchRedstoneActive, 4), "y", "x",
						'x', spheretreeStickStack, 'y', Item.redstone);
				
				//smelting recipes
				GameRegistry.addSmelting(BaconBlocks.darkstoneBrick.blockID, new ItemStack(BaconBlocks.smoothDarkstone), 0.1f);
				GameRegistry.addSmelting(BaconBlocks.dimstoneBrick.blockID, new ItemStack(BaconBlocks.smoothDimstone), 0.3f);
				GameRegistry.addSmelting(BaconBlocks.lightstoneBrick.blockID, new ItemStack(BaconBlocks.smoothLightstone), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.smoothDarkstone.blockID, new ItemStack(BaconBlocks.condensedDarkstone), 0.1f);
				GameRegistry.addSmelting(BaconBlocks.smoothDimstone.blockID, new ItemStack(BaconBlocks.condensedDimstone), 0.3f);
				GameRegistry.addSmelting(BaconBlocks.smoothLightstone.blockID, new ItemStack(BaconBlocks.condensedLightstone), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.condensedDarkstone.blockID, new ItemStack(BaconBlocks.darkstone), 0.1f);
				GameRegistry.addSmelting(BaconBlocks.condensedDimstone.blockID, new ItemStack(BaconBlocks.dimstone), 0.3f);
				GameRegistry.addSmelting(BaconBlocks.condensedLightstone.blockID, new ItemStack(BaconBlocks.lightstone), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.darkstone.blockID, new ItemStack(BaconBlocks.crackedDarkstone), 0.1f);
				GameRegistry.addSmelting(BaconBlocks.dimstone.blockID, new ItemStack(BaconBlocks.crackedDimstone), 0.3f);
				GameRegistry.addSmelting(BaconBlocks.lightstone.blockID, new ItemStack(BaconBlocks.crackedLightstone), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.crackedDarkstone.blockID, new ItemStack(BaconItems.darkstoneHex, 9), 0.1f);
				GameRegistry.addSmelting(BaconBlocks.crackedDimstone.blockID, new ItemStack(BaconItems.dimstoneHex, 9), 0.3f);
				GameRegistry.addSmelting(BaconBlocks.crackedLightstone.blockID, new ItemStack(BaconItems.lightstoneHex, 9), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.crackedDeathstone.blockID, new ItemStack(BaconItems.deathstoneHex, 9), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.crackedFloatstone.blockID, new ItemStack(BaconItems.floatstoneHex, 9), 0.5f);
				GameRegistry.addSmelting(BaconBlocks.condensedDeathstone.blockID, new ItemStack(BaconBlocks.deathstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.condensedFloatstone.blockID, new ItemStack(BaconBlocks.floatstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.deathstone.blockID, new ItemStack(BaconBlocks.crackedDeathstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.floatstone.blockID, new ItemStack(BaconBlocks.crackedFloatstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.smoothDeathstone.blockID, new ItemStack(BaconBlocks.condensedDeathstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.smoothFloatstone.blockID, new ItemStack(BaconBlocks.condensedFloatstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.deathstoneBrick.blockID, new ItemStack(BaconBlocks.smoothDeathstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.floatstoneBrick.blockID, new ItemStack(BaconBlocks.smoothFloatstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.smoothSpringstone.blockID, new ItemStack(BaconBlocks.condensedSpringstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.springstoneBrick.blockID, new ItemStack(BaconBlocks.smoothSpringstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.condensedSpringstone.blockID, new ItemStack(BaconBlocks.springstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.springstone.blockID, new ItemStack(BaconBlocks.crackedSpringstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.crackedSpringstone.blockID, new ItemStack(BaconItems.springstoneHex, 9), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedFloatstone.blockID, new ItemStack(BaconBlocks.smoothFloatstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedSpringstone.blockID, new ItemStack(BaconBlocks.smoothSpringstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedDeathstone.blockID, new ItemStack(BaconBlocks.smoothDeathstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedLightstone.blockID, new ItemStack(BaconBlocks.smoothLightstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedDimstone.blockID, new ItemStack(BaconBlocks.smoothDimstone), 0.8f);
				GameRegistry.addSmelting(BaconBlocks.carvedDarkstone.blockID, new ItemStack(BaconBlocks.smoothDarkstone), 0.8f);
				GameRegistry.addSmelting(BaconItems.bitumenInBucket.itemID, new ItemStack(BaconItems.bucketBitumen), 0.8f);
				
//				String toolPatterns[][] = {{"xxx", " i ", " i "},{"xx", "xi", " i"},{"x", "i", "i"},{"xx", " i", " i"},{"x", "x", "i"}};
//				Object items[][] = {{Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold},
//						{stoneBonePickStack, ironBonePickStack, diamondBonePickStack, goldBonePickStack},
//						{stoneBoneAxeStack, ironBoneAxeStack, diamondBoneAxeStack, goldBoneAxeStack},
//						{stoneBoneShovelStack, ironBoneShovelStack, diamondBoneShovelStack, goldBoneShovelStack},
//						{stoneBoneHoeStack, ironBoneHoeStack, diamondBoneHoeStack, goldBoneHoeStack},
//						{stoneBoneSwordStack, ironBoneSwordStack, diamondBoneSwordStack, goldBoneSwordStack}};
//
//				for (int i = 0; i < items[0].length; i++) {
//					Object material = items[0][i];
//					for (int j = 0; j < items.length - 1; j++) {
//						Item result = (Item)items[j + 1][i];
//						GameRegistry.addRecipe(new ItemStack(result), new Object[] {toolPatterns[j], 'i', Item.bone, 'x', material});
//					}
//				}
				
				ItemStack oneBitChunk = new ItemStack(BaconItems.bitumenChunk);
				ItemStack oneBucket = new ItemStack(Item.bucketEmpty);
				//ItemStack oneBucketBit = new ItemStack(bitumenBucket);
				ItemStack oneBitInBucket = new ItemStack(BaconItems.bitumenInBucket);

				GameRegistry.addRecipe(oneBitInBucket, "x", "y", 'x', oneBitChunk, 'y', oneBucket);
				GameRegistry.addShapelessRecipe(new ItemStack(BaconItems.flintTool), Item.flint);
				GameRegistry.addShapelessRecipe(oneBitChunk, oneBitInBucket);
				//GameRegistry.addSmelting(bitumenInBucket.itemID, oneBucketBit, 1.0F);
				GameRegistry.addSmelting(BaconBlocks.bitumenOre.blockID, oneBitChunk, 1.0F);
	}
		
}
