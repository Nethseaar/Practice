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
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockDeathstone extends Block {

	public BlockDeathstone(int id, Material material) {
		super(id, material);
		setStepSound(Block.soundStoneFootstep);
		setHardness(4.0F);
		setResistance(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(1.0F);
	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
    }

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
        par5Entity.attackEntityFrom(DamageSource.lava, 3);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{    	   
		icons = new Icon[5];

		icons[0] = par1IconRegister.registerIcon("deathstone");
		icons[1] = par1IconRegister.registerIcon("condensedDeathstone");
		icons[2] = par1IconRegister.registerIcon("smoothDeathstone");
		icons[3] = par1IconRegister.registerIcon("deathstoneBrick");
		icons[4] = par1IconRegister.registerIcon("carvedDeathstone");
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
		for (int var4 = 0; var4 < 5; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}
