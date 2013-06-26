package nethseaar.bacon.bases;

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
import nethseaar.bacon.Bacon;

public class StairBacon extends BlockStairs {

	public StairBacon(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		// TODO Auto-generated constructor stub
		setCreativeTab(Bacon.tabSubItems);
	}
	
	 @Override
 	public boolean isOpaqueCube() {
 		return false;
 	}

 	@Override
 	public boolean renderAsNormalBlock() {
 		return false;
 	}	
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.BLOCK_ID");
		}
}
