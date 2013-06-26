package nethseaar.bacon.blocks;

import java.util.Random;

import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockAsphalt extends Block {

	public BlockAsphalt(int id, Material material) {
		super(id, material);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2), (double)par3, (double)((float)par4), (double)((float)par2 + 1), (double)((float)(par3 + 1)-f), (double)((float)par4 + 1));
	}

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionX *= 1.13D;
		par5Entity.motionZ *= 1.13D;
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.asphalt");
	}
}
