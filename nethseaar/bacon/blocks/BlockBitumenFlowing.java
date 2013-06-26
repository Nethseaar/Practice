package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraftforge.liquids.ILiquid;
import nethseaar.bacon.BaconBlocks;

/**
 * BlockBitumenFlowing
 * 
 * Bitumen liquid that is moving.
 * 
 * @author lolinder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockBitumenFlowing extends BlockFlowing implements ILiquid {

	public BlockBitumenFlowing(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(100F);
		this.setLightOpacity(3);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.bitumenStill");
		this.blockIcon = par1iconregister.registerIcon("Bacon.bitumenFlowing");
	}

	@Override
	public int stillLiquidId() {
		return BaconBlocks.bitumenStill.blockID;
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