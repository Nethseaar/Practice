package nethseaar.bacon;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockDarkstone extends Block
{
       public BlockDarkstone(int id, Material par2Material)
       {
             super(id, par2Material);
       }
      
       @SideOnly(Side.CLIENT)
       private Icon[] icons;
      
       @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
             icons = new Icon[6];
            
             for(int i = 0; i < icons.length; i++)
             {            	 	
                    icons[i] = par1IconRegister.registerIcon("Bacon." + (this.getUnlocalizedName().substring(5)) + i);
             }
    }
      
       @SideOnly(Side.CLIENT)
       public Icon getIcon(int par1, int par2)
       {
             return icons[par2];
       }
      
       @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 6; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
