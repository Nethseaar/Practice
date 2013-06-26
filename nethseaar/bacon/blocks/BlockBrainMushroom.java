package nethseaar.bacon.blocks;

import net.minecraft.block.BlockMushroom;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBrainMushroom extends BlockMushroom {

	public BlockBrainMushroom(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.brainMushroom");
		}
}
