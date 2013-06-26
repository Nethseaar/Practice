package nethseaar.bacon.bases;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;


public class ItemBacon extends Item {

	public ItemBacon(int id) {
		super(id);
	}
		
	@SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister par1IconRegister){
     this.itemIcon = par1IconRegister.registerIcon("bacon.ITEM_PNG");
 }
}