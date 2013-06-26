package nethseaar.bacon.blocks;

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
import nethseaar.bacon.Bacon;
import nethseaar.bacon.bases.BlockBacon;

public class BlockDarkstone extends BlockBacon
{
	public BlockDarkstone(int id, Material par2Material)
	{
		super(id, par2Material);
		setStepSound(Block.soundStoneFootstep);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(Bacon.tabInert);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{    	   
		icons = new Icon[12];
		
		String[] iconNames = {
				"darkstone", "crackedDarkstone", "condensedDarkstone", "smoothDarkstone", "darkstoneBrick", "carvedDarkstone",
				"springstone", "crackedSpringstone", "condensedSpringstone", "smoothSpringstone", "springstoneBrick", "carvedSpringstone"
				};

		for (int i = 0; i < iconNames.length; i++){
			icons[i] = par1IconRegister.registerIcon(iconNames[i]);
		}
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
		for (int var4 = 0; var4 < 12; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}
