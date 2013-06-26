package nethseaar.bacon.handlers;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import nethseaar.bacon.BaconBlocks;
import nethseaar.bacon.BaconItems;

/**
 * HandlerBitumenBucket
 * 
 * Allows right-clicking on bitumen with a bucket to yield a bucket of bitumen.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class HandlerBitumenBucket {

	@ForgeSubscribe
	public void onBucketFill(FillBucketEvent event){

		ItemStack result = fillCustomBucket(event.world,event.target);

		if(result == null)
			return;

		event.result=result;
		event.setResult(Result.ALLOW);
	}

	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {

		int blockID = world.getBlockId(pos.blockX,pos.blockY,pos.blockZ);

		if((blockID == BaconBlocks.bitumenStill.blockID || blockID == BaconBlocks.bitumenFlowing.blockID)
				&& world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) 
		{
			world.setBlock(pos.blockX, pos.blockY, pos.blockZ, 0);
			return new ItemStack(BaconItems.bucketBitumen);
		} 
		else
			return null;
	}
}


