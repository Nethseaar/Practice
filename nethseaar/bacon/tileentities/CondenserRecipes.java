package nethseaar.bacon.tileentities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import nethseaar.bacon.BaconBlocks;
import nethseaar.bacon.BaconItems;

public class CondenserRecipes {
    private static final CondenserRecipes smeltingBase = new CondenserRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final CondenserRecipes smelting()
    {
        return smeltingBase;
    }

    private CondenserRecipes()
    {
    	// Condensed Stone --> Smooth Stone
		this.addSmelting(BaconBlocks.darkstone.blockID, 2, new ItemStack(BaconBlocks.darkstone, 1, 3), 0.1f);
		this.addSmelting(BaconBlocks.dimstone.blockID, 2, new ItemStack(BaconBlocks.dimstone, 1, 3), 0.3f);
		this.addSmelting(BaconBlocks.lightstone.blockID, 2, new ItemStack(BaconBlocks.lightstone, 1, 3), 0.5f);
		this.addSmelting(BaconBlocks.springstone.blockID, 2, new ItemStack(BaconBlocks.springstone, 1, 3), 0.8f);
		this.addSmelting(BaconBlocks.floatstone.blockID, 2, new ItemStack(BaconBlocks.floatstone, 1, 3), 0.8f);
		this.addSmelting(BaconBlocks.deathstone.blockID, 2, new ItemStack(BaconBlocks.deathstone, 1, 3), 0.8f);
		
		// Normal Stone --> Condensed Stone
		this.addSmelting(BaconBlocks.darkstone.blockID, new ItemStack(BaconBlocks.darkstone, 1, 2), 0.1f);
		this.addSmelting(BaconBlocks.dimstone.blockID, new ItemStack(BaconBlocks.dimstone, 1, 2), 0.3f);
		this.addSmelting(BaconBlocks.lightstone.blockID, new ItemStack(BaconBlocks.lightstone, 1, 2), 0.5f);
		this.addSmelting(BaconBlocks.springstone.blockID, new ItemStack(BaconBlocks.springstone, 1, 2), 0.8f);
		this.addSmelting(BaconBlocks.floatstone.blockID, new ItemStack(BaconBlocks.floatstone, 1, 2), 0.8f);
		this.addSmelting(BaconBlocks.deathstone.blockID, new ItemStack(BaconBlocks.deathstone, 1, 2), 0.8f);
		
		// Cracked Stone --> Normal Stone
		this.addSmelting(BaconBlocks.darkstone.blockID, 1, new ItemStack(BaconBlocks.darkstone), 0.1f);
		this.addSmelting(BaconBlocks.dimstone.blockID, 1, new ItemStack(BaconBlocks.dimstone), 0.3f);
		this.addSmelting(BaconBlocks.lightstone.blockID, 1, new ItemStack(BaconBlocks.lightstone), 0.5f);
		this.addSmelting(BaconBlocks.springstone.blockID, 1, new ItemStack(BaconBlocks.springstone), 0.8f);
		this.addSmelting(BaconBlocks.floatstone.blockID, 1, new ItemStack(BaconBlocks.floatstone), 0.8f);
		this.addSmelting(BaconBlocks.crackedDeathstone.blockID, 1, new ItemStack(BaconBlocks.deathstone), 0.8f);
		
		// Hexes --> Cracked Stone
		this.addSmelting(BaconItems.hex.itemID, 0, new ItemStack(BaconBlocks.darkstone, 1, 1), 0.1f);
		this.addSmelting(BaconItems.hex.itemID, 1, new ItemStack(BaconBlocks.dimstone, 1, 1), 0.3f);
		this.addSmelting(BaconItems.hex.itemID, 2, new ItemStack(BaconBlocks.lightstone, 1, 1), 0.5f);
		this.addSmelting(BaconItems.hex.itemID, 3, new ItemStack(BaconBlocks.springstone, 1, 1), 0.8f);
		this.addSmelting(BaconItems.hex.itemID, 4, new ItemStack(BaconBlocks.floatstone, 1, 1), 0.8f);
		this.addSmelting(BaconItems.hex.itemID, 5, new ItemStack(BaconBlocks.crackedDeathstone), 0.8f);
		
		this.addSmelting(BaconItems.shriveledGreenBerry.itemID, new ItemStack(BaconItems.compactGreenBerry), 0.8f);
		this.addSmelting(BaconItems.shriveledPurpleBerry.itemID, new ItemStack(BaconItems.compactPurpleBerry), 0.8f);
    }

    /**
     * Adds a smelting recipe.
     */
    public void addSmelting(int par1, ItemStack par2ItemStack, float par3)
    {
        this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemID, metadata), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getSmeltingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)smeltingList.get(Integer.valueOf(item.itemID));
    }

    /**
     * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
     */
    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }
        float ret = item.getItem().getSmeltingExperience(item);
        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
        }
        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float)experienceList.get(item.itemID)).floatValue();
        }
        return (ret < 0 ? 0 : ret);
    }

    public Map<List<Integer>, ItemStack> getMetaSmeltingList()
    {
        return metaSmeltingList;
    }
}

