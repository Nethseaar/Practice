package nethseaar.bacon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import nethseaar.bacon.CommonProxy;

/**
 * ItemBoneAxe
 * 
 * Class for bone axes.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBoneHoe extends ItemHoe {

	public ItemBoneHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		int damage = this.getMaxDamage();
		this.setMaxDamage((int)(damage * 1.5));
	}

	public void updateIcons(IconRegister par1iconregister){
		this.itemIcon = par1iconregister.registerIcon("Bacon.ITEM_PNG");
		}
	
	@Override
    public int getItemEnchantability()
    {
        return super.getItemEnchantability() + 2;
    }

}
