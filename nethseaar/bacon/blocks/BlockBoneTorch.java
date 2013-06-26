package nethseaar.bacon.blocks;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.UP;
import static net.minecraftforge.common.ForgeDirection.WEST;
import nethseaar.bacon.Bacon;
import nethseaar.bacon.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.ForgeDirection;

/**
 * BlockBoneTorch
 * 
 * A torch crafted by right-clicking a bone shard on a block of liquid bitumen.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockBoneTorch extends BlockTorch {

	public BlockBoneTorch(int id, int texture) {
		super(id);
		this.setCreativeTab(Bacon.tabSubItems);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.boneTorch");
		}
	
}
