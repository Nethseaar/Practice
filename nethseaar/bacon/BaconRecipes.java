package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
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
		
		//* -------------------------------------------------------------------------------------- SHAPELESS RECIPES----------------------------------------------------

		//cracked -> normal
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone), new ItemStack(BaconBlocks.darkstone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone), new ItemStack(BaconBlocks.dimstone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone), new ItemStack(BaconBlocks.lightstone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.floatstone), new ItemStack(BaconBlocks.floatstone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstone), new ItemStack(BaconBlocks.springstone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.deathstone), new ItemStack(BaconBlocks.deathstone, 1, 1));
		
		//normal -> condensed
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 1, 2), new ItemStack(BaconBlocks.darkstone));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 1, 2), new ItemStack(BaconBlocks.dimstone));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 1, 2), new ItemStack(BaconBlocks.lightstone));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.floatstone, 1, 2), new ItemStack(BaconBlocks.floatstone));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstone, 1, 2), new ItemStack(BaconBlocks.springstone));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.deathstone, 1, 2), new ItemStack(BaconBlocks.deathstone));
		
		//condensed -> smooth
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 1, 3), new ItemStack(BaconBlocks.lightstone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 1, 3), new ItemStack(BaconBlocks.lightstone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 1, 3), new ItemStack(BaconBlocks.lightstone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.springstone, 1, 3), new ItemStack(BaconBlocks.springstone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.floatstone, 1, 3), new ItemStack(BaconBlocks.floatstone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.deathstone, 1, 3), new ItemStack(BaconBlocks.deathstone, 1, 2));
		
		//misc (vanilla) recipes
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.ringtreePlanks, 4), new ItemStack(BaconBlocks.ringtree));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks, 8), new ItemStack(BaconBlocks.spheretreeDeepwood));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks, 4), new ItemStack(BaconBlocks.spheretreeBranchwood));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconItems.flintTool), Item.flint);
		GameRegistry.addShapelessRecipe(new ItemStack(BaconItems.bitumenChunk), new ItemStack(BaconItems.bitumenInBucket));
		
		//stairs -> normal
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 1), new ItemStack(BaconBlocks.darkstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 1), new ItemStack(BaconBlocks.dimstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 1), new ItemStack(BaconBlocks.lightstoneStairs));
		
		//smooth stairs -> smooth
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 1, 3), new ItemStack(BaconBlocks.smoothDarkstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 1, 3), new ItemStack(BaconBlocks.smoothDimstoneStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 1, 3), new ItemStack(BaconBlocks.smoothLightstoneStairs));
		
		//brick stairs -> brick
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.darkstone, 1, 4), new ItemStack(BaconBlocks.darkstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.dimstone, 1, 4), new ItemStack(BaconBlocks.dimstoneBrickStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.lightstone, 1, 4), new ItemStack(BaconBlocks.lightstoneBrickStairs));
		
		//other stairs -> material
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.asphalt), new ItemStack(BaconBlocks.asphaltStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.ringtreePlanks), new ItemStack(BaconBlocks.ringtreePlankStairs));
		GameRegistry.addShapelessRecipe(new ItemStack(BaconBlocks.spheretreePlanks), new ItemStack(BaconBlocks.spheretreePlankStairs));
		
		//* -------------------------------------------------------------------------------------- SHAPED RECIPES ----------------------------------------------------

		// Vanilla Shaped Recipes
		GameRegistry.addRecipe(bitumenInBucket, "x", "y", 'x', bitumenChunk, 'y', bucket);
		
		// Dimension Wood Recipes
		GameRegistry.addRecipe(new ItemStack(BaconItems.ringtreeStick, 4), "x", "x",
				'x', ringtreePlanks);
		GameRegistry.addRecipe(new ItemStack(BaconItems.spheretreeStick, 4), "x", "x",
				'x', spheretreePlanks);
		
		// Block Recipes
		Block blockItems[] = {BaconBlocks.darkstone, BaconBlocks.dimstone, BaconBlocks.lightstone, BaconBlocks.springstone, BaconBlocks.floatstone, BaconBlocks.deathstone};

		// Stone Bricks --> Carved Stone
		for (int i = 0; i < blockItems.length; i++) {
			Block material = blockItems[i];
			for (int j = 0; j < blockItems.length - 1; j++) {
				Block result = (Block)blockItems[i];
				GameRegistry.addRecipe(new ItemStack(result, 4, 5), new Object[] {"xx", "xx", 'x', new ItemStack(material, 1, 4)});
			}
		}

		// Smooth Stone --> Stone Brick
		for (int i = 0; i < blockItems.length; i++) {
			Block material = blockItems[i];
			for (int j = 0; j < blockItems.length - 1; j++) {
				Block result = (Block) blockItems[i];
				GameRegistry.addRecipe(new ItemStack(result, 4, 4), new Object[] {"xx", "xx", 'x', new ItemStack(material, 1, 3)});
			}
		}

		// Hexes --> Cracked Stone
		Object crackedItems[] = {new ItemStack(BaconItems.hex, 1, 0), new ItemStack(BaconItems.hex, 1, 1), new ItemStack(BaconItems.hex, 1, 2), new ItemStack(BaconItems.hex, 1, 3), new ItemStack(BaconItems.hex, 1, 4), new ItemStack(BaconItems.hex, 1, 5)};

		for (int i = 0; i < crackedItems.length; i++) {
			Object material = crackedItems[i];
			for (int j = 0; j < crackedItems.length - 1; j++) {
				Block result = (Block)blockItems[i];
				GameRegistry.addRecipe(new ItemStack(result, 1, 1), new Object[] {"xxx", "xxx", "xxx", 'x', material});
			}
		}

		// Stone/Wood --> Stairs
		Object stairItems[][] = {{BaconBlocks.asphalt, BaconBlocks.spheretreePlanks, BaconBlocks.ringtreePlanks, BaconBlocks.darkstone, BaconBlocks.dimstone, BaconBlocks.lightstone, BaconBlocks.springstone, BaconBlocks.floatstone, BaconBlocks.deathstone,
			new ItemStack(BaconBlocks.darkstone, 1, 3), new ItemStack(BaconBlocks.dimstone, 1, 3), new ItemStack(BaconBlocks.lightstone, 1, 3), new ItemStack(BaconBlocks.springstone, 1, 3), new ItemStack(BaconBlocks.floatstone, 1, 3), new ItemStack(BaconBlocks.deathstone, 1, 3), new ItemStack(BaconBlocks.darkstone, 1, 4), new ItemStack(BaconBlocks.dimstone, 1, 4), new ItemStack(BaconBlocks.lightstone, 1, 4), new ItemStack(BaconBlocks.springstone, 1, 4), new ItemStack(BaconBlocks.floatstone, 1, 4), new ItemStack(BaconBlocks.deathstone, 1, 4)},
				{BaconBlocks.asphaltStairs, BaconBlocks.spheretreePlankStairs, BaconBlocks.ringtreePlankStairs, BaconBlocks.darkstoneStairs, BaconBlocks.dimstoneStairs, BaconBlocks.lightstoneStairs, BaconBlocks.springstoneStairs, BaconBlocks.floatstoneStairs, BaconBlocks.deathstoneStairs,  BaconBlocks.smoothDarkstoneStairs, BaconBlocks.smoothDimstoneStairs, BaconBlocks.smoothLightstoneStairs, BaconBlocks.smoothSpringstoneStairs, BaconBlocks.smoothFloatstoneStairs, BaconBlocks.smoothDeathstoneStairs,  BaconBlocks.darkstoneBrickStairs, BaconBlocks.dimstoneBrickStairs, BaconBlocks.lightstoneBrickStairs, BaconBlocks.springstoneBrickStairs, BaconBlocks.floatstoneBrickStairs, BaconBlocks.deathstoneBrickStairs}};

		for (int i = 0; i < stairItems[0].length; i++) {
			Object material = stairItems[0][i];
			for (int j = 0; j < stairItems.length - 1; j++) {
				Block result = (Block)stairItems[j + 1][i];
				GameRegistry.addRecipe(new ItemStack(result, 6), new Object[] {"x  ", "xx ", "xxx", 'x', material});
			}
		}

		// Bones, Materials --> Tools
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

		//* -------------------------------------------------------------------------------------- SMELTING RECIPES ----------------------------------------------------
		
		// Carved Stone --> Smooth Stone
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.darkstone.blockID, 5, new ItemStack(BaconBlocks.darkstone, 1, 4), 0.1f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.dimstone.blockID, 5, new ItemStack(BaconBlocks.dimstone, 1, 4), 0.3f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.lightstone.blockID, 5, new ItemStack(BaconBlocks.lightstone, 1, 4), 0.5f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.springstone.blockID, 5, new ItemStack(BaconBlocks.springstone, 1, 4), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.floatstone.blockID, 5, new ItemStack(BaconBlocks.floatstone, 1, 4), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.deathstone.blockID, 5, new ItemStack(BaconBlocks.deathstone, 1, 4), 0.8f);
		
		// Stone Brick --> Smooth Stone
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.darkstone.blockID, 4, new ItemStack(BaconBlocks.darkstone, 1, 3), 0.1f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.dimstone.blockID, 4, new ItemStack(BaconBlocks.dimstone, 1, 3), 0.3f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.lightstone.blockID, 4, new ItemStack(BaconBlocks.lightstone, 1, 3), 0.5f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.springstone.blockID, 4, new ItemStack(BaconBlocks.springstone, 1, 3), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.floatstone.blockID, 4, new ItemStack(BaconBlocks.floatstone, 1, 3), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.deathstone.blockID, 4, new ItemStack(BaconBlocks.deathstone, 1, 3), 0.8f);
		
		// Smooth Stone --> Condensed Stone
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.darkstone.blockID, 3, new ItemStack(BaconBlocks.darkstone, 1, 2), 0.1f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.dimstone.blockID, 3, new ItemStack(BaconBlocks.dimstone, 1, 2), 0.3f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.lightstone.blockID, 3, new ItemStack(BaconBlocks.lightstone, 1, 2), 0.5f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.springstone.blockID, 3, new ItemStack(BaconBlocks.springstone, 1, 2), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.floatstone.blockID, 3, new ItemStack(BaconBlocks.floatstone, 1, 2), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.deathstone.blockID, 3, new ItemStack(BaconBlocks.deathstone, 1, 2), 0.8f);
		
		// Condensed Stone --> Normal Stone
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.darkstone.blockID, 2, new ItemStack(BaconBlocks.darkstone), 0.1f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.dimstone.blockID, 2, new ItemStack(BaconBlocks.dimstone), 0.3f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.lightstone.blockID, 2, new ItemStack(BaconBlocks.lightstone), 0.5f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.springstone.blockID, 2, new ItemStack(BaconBlocks.springstone), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.floatstone.blockID, 2, new ItemStack(BaconBlocks.floatstone), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.deathstone.blockID, 2, new ItemStack(BaconBlocks.deathstone), 0.8f);
		
		// Normal Stone --> Cracked Stone
		GameRegistry.addSmelting(BaconBlocks.darkstone.blockID, new ItemStack(BaconBlocks.darkstone, 1, 1), 0.1f);
		GameRegistry.addSmelting(BaconBlocks.dimstone.blockID, new ItemStack(BaconBlocks.dimstone, 1, 1), 0.3f);
		GameRegistry.addSmelting(BaconBlocks.lightstone.blockID, new ItemStack(BaconBlocks.lightstone, 1, 1), 0.5f);
		GameRegistry.addSmelting(BaconBlocks.springstone.blockID, new ItemStack(BaconBlocks.springstone, 1, 1), 0.8f);
		GameRegistry.addSmelting(BaconBlocks.floatstone.blockID, new ItemStack(BaconBlocks.floatstone, 1, 1), 0.8f);
		GameRegistry.addSmelting(BaconBlocks.deathstone.blockID, new ItemStack(BaconBlocks.deathstone, 1, 1), 0.8f);
		
		// Cracked Stone --> Hexes
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.darkstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 0), 0.1f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.dimstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 1), 0.3f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.lightstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 2), 0.5f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.springstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 3), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.floatstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 4), 0.8f);
		FurnaceRecipes.smelting().addSmelting(BaconBlocks.deathstone.blockID, 1, new ItemStack(BaconItems.hex, 9, 5), 0.8f);
		
		// Vanilla Smelting Recipes
		GameRegistry.addSmelting(BaconItems.bitumenInBucket.itemID, new ItemStack(BaconItems.bucketBitumen), 0.8f);
		GameRegistry.addSmelting(BaconBlocks.bitumenOre.blockID, bitumenChunk, 1.0F);		
	}

}
