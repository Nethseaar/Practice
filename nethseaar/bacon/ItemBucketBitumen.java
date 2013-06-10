package nethseaar.bacon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;

/**
 * ItemBucketBitumen
 * 
 * A bucket of bitumen.  Needs HandlerBitumenBucket to work.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemBucketBitumen extends ItemBucket{

	public ItemBucketBitumen(int id) {
		super(id, BaconBlocks.bitumenFlowing.blockID);
		setCreativeTab(CreativeTabs.tabMisc);
		setContainerItem(Item.bucketEmpty);
		setMaxStackSize(1);
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.itemIcon = par1iconregister.registerIcon("Bacon.bitumenBucket");
		}
}
