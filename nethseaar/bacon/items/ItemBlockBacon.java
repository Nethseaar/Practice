package nethseaar.bacon.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBacon extends ItemBlock
{
	public ItemBlockBacon(int par1)
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch(itemstack.getItemDamage())
		{
		case 0:
		{
			name = "darkstone";
			break;
		}
		case 1:
		{
			name = "crackedDarkstone";
			break;
		}
		case 2:
		{
			name = "condensedDarkstone";
			break;
		}
		case 3:
		{
			name = "smoothDarkstone";
			break;
		}
		case 4:
		{
			name = "darkstoneBrick";
			break;
		}
		case 6:
		{
			name = "carvedDarkstone";
			break;
		}
		case 7:
		{
			name = "springstone";
			break;
		}
		case 8:
		{
			name = "crackedSpringstone";
			break;
		}
		case 9:
		{
			name = "condensedSpringstone";
			break;
		}
		case 10:
		{
			name = "smoothSpringstone";
			break;
		}
		case 11:
		{
			name = "springstoneBrick";
			break;
		}
		case 12:
		{
			name = "carvedSpringstone";
			break;
		}
		default: name = "broken";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
