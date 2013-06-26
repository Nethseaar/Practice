package nethseaar.bacon.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nethseaar.bacon.BaconBlocks;
import nethseaar.bacon.BaconItems;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == BaconItems.bitumenChunk.itemID){
			return 1800;
		}
		else if(var1 == BaconBlocks.ringtreePlanks.blockID || var1 == BaconBlocks.spheretreePlanks.blockID){
			return 300;
		}
		else if(var1 == BaconBlocks.ringtree.blockID || var1 == BaconBlocks.spheretreeBranchwood.blockID){
			return 800;
		}
		else if(var1 == BaconBlocks.ringtreePlankStairs.blockID || var1 == BaconBlocks.spheretreePlankStairs.blockID){
			return 500;
		}
		else if(var1 == BaconItems.ringtreeStick.itemID || var1 == BaconItems.spheretreeStick.itemID){
			return 200;
		}
		else if(var1 == BaconBlocks.spheretreeDeepwood.blockID){
			return 1600;
		}
		else if(var1 == BaconBlocks.spheretreeHeart.blockID){
			return 3200;
		}
		else{
			return 0;
		}
	}
}
