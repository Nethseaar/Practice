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

public class BlockDarkstone extends BlockBacon
{
	public BlockDarkstone(int id, Material par2Material)
	{
		super(id, par2Material);
		setStepSound(Block.soundStoneFootstep);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{    	   
		icons = new Icon[6];

		icons[0] = par1IconRegister.registerIcon("darkstone");
		icons[1] = par1IconRegister.registerIcon("crackedDarkstone");
		icons[2] = par1IconRegister.registerIcon("condensedDarkstone");
		icons[3] = par1IconRegister.registerIcon("smoothDarkstone");
		icons[4] = par1IconRegister.registerIcon("darkstoneBrick");
		icons[5] = par1IconRegister.registerIcon("carvedDarkstone");
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
