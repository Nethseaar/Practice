package nethseaar.bacon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import nethseaar.bacon.Bacon;
/**
 * BlockBoneTorch
 * 
 * A torch crafted by right-clicking a bone shard on a block of liquid bitumen.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockBoneLadder extends BlockLadder {

	public BlockBoneLadder(int id, int texture) {
		super(id);
		this.setCreativeTab(Bacon.tabSubItems);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundWoodFootstep);
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.boneLadder");
		}

}
