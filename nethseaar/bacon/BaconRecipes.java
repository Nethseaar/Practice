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

		// Item Stacks
		ItemStack ringtreePlanks = new ItemStack(BaconBlocks.ringtreePlanks);
		ItemStack spheretreePlanks = new ItemStack(BaconBlocks.spheretreePlanks);
		ItemStack bitumenChunk = new ItemStack(BaconItems.bitumenChunk);
		ItemStack bucket = new ItemStack(Item.bucketEmpty);
		ItemStack bitumenInBucket = new ItemStack(BaconItems.bitumenInBucket);
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(BaconItems.flintTool), Item.flint);
		GameRegistry.addShapelessRecipe(bitumenChunk, bitumenInBucket);
		//Shaped Recipes
		
		GameRegistry.addRecipe(bitumenInBucket, "x", "y", 'x', bitumenChunk, 'y', bucket);
		
		GameRegistry.addRecipe(new ItemStack(BaconItems.ringtreeStick, 4), "x", "x",
				'x', ringtreePlanks);
		
		GameRegistry.addRecipe(new ItemStack(BaconItems.spheretreeStick, 4), "x", "x",
				'x', spheretreePlanks);

		Block carvedItems[][] = {{BaconBlocks.darkstoneBrick, BaconBlocks.dimstoneBrick, BaconBlocks.lightstoneBrick, BaconBlocks.springstoneBrick, BaconBlocks.floatstoneBrick, BaconBlocks.deathstoneBrick},
				{BaconBlocks.carvedDarkstone, BaconBlocks.carvedDimstone, BaconBlocks.carvedLightstone, BaconBlocks.carvedSpringstone, BaconBlocks.carvedFloatstone, BaconBlocks.carvedDeathstone}};

		for (int i = 0; i < carvedItems[0].length; i++) {
			Object material = carvedItems[0][i];
			for (int j = 0; j < carvedItems.length - 1; j++) {
				Block result = (Block)carvedItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result, 4), new Object[] {"xx", "xx", 'x', material});
			}
		}

		Block brickItems[][] = {{BaconBlocks.smoothDarkstone, BaconBlocks.smoothDimstone, BaconBlocks.smoothLightstone, BaconBlocks.smoothSpringstone, BaconBlocks.smoothFloatstone, BaconBlocks.smoothDeathstone},
				{ BaconBlocks.darkstoneBrick, BaconBlocks.dimstoneBrick, BaconBlocks.lightstoneBrick, BaconBlocks.springstoneBrick, BaconBlocks.floatstoneBrick, BaconBlocks.deathstoneBrick}};

		for (int i = 0; i < brickItems[0].length; i++) {
			Object material = brickItems[0][i];
			for (int j = 0; j < brickItems.length - 1; j++) {
				Block result = (Block)brickItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result, 4), new Object[] {"xx", "xx", 'x', material});
			}
		}

		Object crackedItems[][] = {{BaconItems.darkstoneHex, BaconItems.dimstoneHex, BaconItems.lightstoneHex, BaconItems.springstoneHex, BaconItems.floatstoneHex, BaconItems.deathstoneHex},
				{BaconBlocks.crackedDarkstone, BaconBlocks.crackedDimstone, BaconBlocks.crackedLightstone, BaconBlocks.crackedSpringstone, BaconBlocks.crackedFloatstone, BaconBlocks.crackedDeathstone}};

		for (int i = 0; i < crackedItems[0].length; i++) {
			Object material = crackedItems[0][i];
			for (int j = 0; j < crackedItems.length - 1; j++) {
				Block result = (Block)crackedItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result), new Object[] {"xxx", "xxx", "xxx", 'x', material});
			}
		}

		Block stairItems[][] = {{BaconBlocks.asphalt, BaconBlocks.spheretreePlanks, BaconBlocks.ringtreePlanks, BaconBlocks.darkstone, BaconBlocks.dimstone, BaconBlocks.lightstone, BaconBlocks.springstone, BaconBlocks.floatstone, BaconBlocks.deathstone,  BaconBlocks.smoothDarkstone, BaconBlocks.smoothDimstone, BaconBlocks.smoothLightstone, BaconBlocks.smoothSpringstone, BaconBlocks.smoothFloatstone, BaconBlocks.smoothDeathstone,  BaconBlocks.darkstoneBrick, BaconBlocks.dimstoneBrick, BaconBlocks.lightstoneBrick, BaconBlocks.springstoneBrick, BaconBlocks.floatstoneBrick, BaconBlocks.deathstoneBrick},
				{BaconBlocks.asphaltStairs, BaconBlocks.spheretreePlankStairs, BaconBlocks.ringtreePlankStairs, BaconBlocks.darkstoneStairs, BaconBlocks.dimstoneStairs, BaconBlocks.lightstoneStairs, BaconBlocks.springstone, BaconBlocks.floatstone, BaconBlocks.deathstone,  BaconBlocks.smoothDarkstoneStairs, BaconBlocks.smoothDimstoneStairs, BaconBlocks.smoothLightstoneStairs, BaconBlocks.smoothSpringstone, BaconBlocks.smoothFloatstone, BaconBlocks.smoothDeathstone,  BaconBlocks.darkstoneBrickStairs, BaconBlocks.dimstoneBrickStairs, BaconBlocks.lightstoneBrickStairs, BaconBlocks.springstoneBrick, BaconBlocks.floatstoneBrick, BaconBlocks.deathstoneBrick}};

		for (int i = 0; i < stairItems[0].length; i++) {
			Block material = stairItems[0][i];
			for (int j = 0; j < stairItems.length - 1; j++) {
				Block result = (Block)stairItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result, 6), new Object[] {"x  ", "xx ", "xxx", 'x', material});
			}
		}

		String toolPatterns[][] = {{"xxx", " i ", " i "},{"xx", "xi", " i"},{"x", "i", "i"},{"xx", " i", " i"},{"x", "x", "i"}};
		Object toolItems[][] = {{Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold},
				{BaconItems.stoneBonePick, BaconItems.ironBonePick, BaconItems.diamondBonePick, BaconItems.goldBonePick},
				{BaconItems.stoneBoneAxe, BaconItems.ironBoneAxe, BaconItems.diamondBoneAxe, BaconItems.goldBoneAxe},
				{BaconItems.stoneBoneShovel, BaconItems.ironBoneShovel, BaconItems.diamondBoneShovel, BaconItems.goldBoneShovel},
				{BaconItems.stoneBoneHoe, BaconItems.ironBoneHoe, BaconItems.diamondBoneHoe, BaconItems.goldBoneHoe},
				{BaconItems.stoneBoneSword, BaconItems.ironBoneSword, BaconItems.diamondBoneSword, BaconItems.goldBoneSword}};

		for (int i = 0; i < toolItems[0].length; i++) {
			Object material = toolItems[0][i];
			for (int j = 0; j < toolItems.length - 1; j++) {
				Item result = (Item)toolItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result), new Object[] {toolPatterns[j], 'i', Item.bone, 'x', material});
			}
		}

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
		GameRegistry.addSmelting(BaconBlocks.bitumenOre.blockID, bitumenChunk, 1.0F);		
	}

}
