package nethseaar.bacon;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == Bacon.bitumenChunk.itemID){
			return 2000;
		}
		else if(var1 == Bacon.ringtreePlanks.blockID || var1 == Bacon.spheretreePlanks.blockID){
			return 300;
		}
		else if(var1 == Bacon.ringtree.blockID || var1 == Bacon.spheretreeBranchwood.blockID){
			return 800;
		}
		else if(var1 == Bacon.spheretreeDeepwood.blockID){
			return 1600;
		}
		else if(var1 == Bacon.spheretreeHeart.blockID){
			return 3200;
		}
		else if(var1 == Bacon.ringtreePlankStairs.blockID){
			return 300;
		}
		else if(var1 == Bacon.spheretreePlankStairs.blockID){
			return 300;
		}
		else{
			return 0;
		}
	}
}
