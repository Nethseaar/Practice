package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraftforge.liquids.ILiquid;
import nethseaar.bacon.BaconBlocks;

/**
 * BlockBitumenStationary
 * 
 * Bitumen liquid that is still.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockBitumenStationary extends BlockStationary  implements ILiquid{

	public BlockBitumenStationary(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.disableStats();
	}
	
	@Override
	public int stillLiquidId() {
		return BaconBlocks.bitumenStill.blockID;
	}
	
	@Override
	  public int getRenderType() {
	    return 4;
	  }
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.bitumen");
		this.blockIcon = par1iconregister.registerIcon("Bacon.bitumen_flow");
	}

	@Override
	public boolean isMetaSensitive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int stillLiquidMeta() {
		// TODO Auto-generated method stub
		return 0;
	}
}