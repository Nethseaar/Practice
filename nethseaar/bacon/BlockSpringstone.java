package nethseaar.bacon;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockSpringstone extends Block {

	public BlockSpringstone(int id, Material material) {
		super(id, material);
		setStepSound(Block.soundStoneFootstep);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2), (double)par3, (double)((float)par4), (double)((float)par2 + 1), (double)((float)(par3 + 1)-f), (double)((float)par4 + 1));
	}

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionY += 1.5D;
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{    	   
		icons = new Icon[6];

		icons[0] = par1IconRegister.registerIcon("springstone");
		icons[1] = par1IconRegister.registerIcon("crackedSpringstone");
		icons[2] = par1IconRegister.registerIcon("condensedSpringstone");
		icons[3] = par1IconRegister.registerIcon("smoothSpringstone");
		icons[4] = par1IconRegister.registerIcon("springstoneBrick");
		icons[5] = par1IconRegister.registerIcon("carvedSpringstone");
	}


	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return icons[par2];
	}

	public int quantityDropped(Random random){
		return 1;
	}

	public int damageDropped(int metadata)
	{
	     return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int var4 = 0; var4 < 6; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}
