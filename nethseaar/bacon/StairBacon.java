package nethseaar.bacon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;

public class StairBacon extends BlockStairs {

	protected StairBacon(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		// TODO Auto-generated constructor stub
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.BLOCK_PNG");
		}

}
