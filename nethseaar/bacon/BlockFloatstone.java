package nethseaar.bacon;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockFloatstone extends Block {

	public BlockFloatstone(int id, Material material) {
		super(id, material);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2), (double)par3, (double)((float)par4), (double)((float)par2 + 1), (double)((float)(par3 + 1)-f), (double)((float)par4 + 1));
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.floatstone");
	}
}
