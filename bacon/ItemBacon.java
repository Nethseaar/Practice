package nethseaar.bacon;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBacon extends Item {

	public ItemBacon(int id) {
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister par1IconRegister){
     this.itemIcon = par1IconRegister.registerIcon("bacon.ITEM_PNG");
 }
}