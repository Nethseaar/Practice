package nethseaar.bacon.bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBacon extends Block {

	public BlockBacon(int id, Material material){
		super(id, material);
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.BLOCK_PNG");
		}

}
