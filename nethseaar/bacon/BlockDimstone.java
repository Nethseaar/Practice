package nethseaar.bacon;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class BlockDimstone extends BlockBacon
{
	public BlockDimstone(int id, Material par2Material)
	{
		super(id, par2Material);
		setStepSound(Block.soundStoneFootstep);
		setHardness(3.0F);
		setResistance(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(0.5F);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{    	   
		icons = new Icon[6];

		icons[0] = par1IconRegister.registerIcon("dimstone");
		icons[1] = par1IconRegister.registerIcon("crackedDimstone");
		icons[2] = par1IconRegister.registerIcon("condensedDimstone");
		icons[3] = par1IconRegister.registerIcon("smoothDimstone");
		icons[4] = par1IconRegister.registerIcon("dimstoneBrick");
		icons[5] = par1IconRegister.registerIcon("carvedDimstone");
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
