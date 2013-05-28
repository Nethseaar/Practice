package nethseaar.bacon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import nethseaar.bacon.CommonProxy;

/**
 * ItemBonePickaxe
 * 
 * Class for bone pickaxes.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBonePickaxe extends ItemPickaxe {

	public ItemBonePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
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
