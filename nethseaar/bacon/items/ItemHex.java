package nethseaar.bacon.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHex extends Item{
@SideOnly(Side.CLIENT)
private Icon[] icon;
public String[] itemNames = new String[] {"darkstoneHex", "dimstoneHex", "lightstoneHex", "springstoneHex", "floatstoneHex", "deathstoneHex"};
public ItemHex(int par1)
{
         super(par1);
         this.setHasSubtypes(true);
         this.setMaxDamage(0);
}

public String getUnlocalizedName(ItemStack par1ItemStack)
{
	int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 5);
	return super.getUnlocalizedName() + "." + itemNames[i];
}

public Icon getIconFromDamage(int par1)
{
    int j = MathHelper.clamp_int(par1, 0, 5);
    return this.icon[j];
}

@SideOnly(Side.CLIENT)
public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
{
         for (int j = 0; j < 6; ++j)
         {
                 par3List.add(new ItemStack(par1, 1, j));
         }
}

public void registerIcons(IconRegister par1IconRegister)
{
	
         
	this.icon = new Icon[6];
        
         for (int i = 0; i < itemNames.length; ++i)
         {
                 icon[i] = par1IconRegister.registerIcon(itemNames[i]);
         }
}

@SideOnly(Side.CLIENT)
public Icon getIcon(int par1, int par2) {
	return icon[par2];
}
}