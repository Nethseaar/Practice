package nethseaar.bacon.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import nethseaar.bacon.entities.EntityCrackedDeathstone;

public class BlockCrackedDeathstone extends Block {

	public BlockCrackedDeathstone(int id, Material material) {
		super(id, material);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
	}

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
	    par1World.setBlockToAir(par2, par3, par4);
		EntityTNTPrimed entitycrackeddeathstone= new EntityCrackedDeathstone(par1World, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), null);
		par1World.spawnEntityInWorld(entitycrackeddeathstone);
		par1World.playSoundAtEntity(entitycrackeddeathstone, "random.fuse", 1.0F, 1.0F);
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.deathstone");
	}

	public boolean canDropFromExplosion(Explosion par1Explosion)
	{
		return false;
	}
}
