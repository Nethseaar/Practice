package nethseaar.bacon;

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
                    default: name = "broken";
             }
             return getUnlocalizedName() + "." + name;
       }
      
       public int getMetadata(int par1)
       {
             return par1;
       }
}
