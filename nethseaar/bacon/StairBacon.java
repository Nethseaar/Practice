package nethseaar.bacon;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class StairBacon extends BlockStairs {

	protected StairBacon(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		// TODO Auto-generated constructor stub
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
		for (int var4 = 0; var4 < 21; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.BLOCK_ID");
		}

}
