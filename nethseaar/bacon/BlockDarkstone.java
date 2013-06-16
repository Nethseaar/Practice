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
import net.minecraft.util.MathHelper;

public class BlockDarkstone extends BlockBacon
{
       public BlockDarkstone(int id, Material par2Material)
       {
             super(id, par2Material);
       }
      
       @SideOnly(Side.CLIENT)
       private Icon[] icons;
       
             public Icon getIconFromDamage(int par1)
       {
                int j = MathHelper.clamp_int(par1, 0, 5);
                return this.icons[j];
       }
       
       @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister par1IconRegister)
    {
             icons = new Icon[BaconBlocks.darkstoneNames.length];
    
             for(int i = 0; i < icons.length; i++)
             {      
            	 String[] darkstoneNames = {
            			"Darkstone", "Cracked Darkstone", "Condensed Darkstone", "Smooth Darkstone", "Darkstone Brick", "Carved Darkstone"
            		};
                    icons[i] = par1IconRegister.registerIcon("Bacon." + BaconBlocks.darkstoneNames[i]);
             }
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
