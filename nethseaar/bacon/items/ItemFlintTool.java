package nethseaar.bacon.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;


/**
 * ItemFlintTool
 * 
 * A simple flint tool.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemFlintTool extends ItemPickaxe {
	public ItemFlintTool(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		setCreativeTab(CreativeTabs.tabTools);
	}

	@SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister par1IconRegister){
     this.itemIcon = par1IconRegister.registerIcon("Bacon.flintTool");
 }
}
