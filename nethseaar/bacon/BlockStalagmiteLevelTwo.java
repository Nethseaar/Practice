package nethseaar.bacon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockStalagmiteLevelTwo extends Block {

	@SideOnly(Side.CLIENT)
    private Icon stalagmiteTop;
	
        public BlockStalagmiteLevelTwo(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        		this.setBlockBounds(0.1F, 0F, 0.1F, 0.9F, 1F, 0.9F);
        }
        
        @Override
    	public boolean isOpaqueCube() {
    		return false;
    	}

    	@Override
    	public boolean renderAsNormalBlock() {
    		return false;
    	}
    	
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.stalagmiteTop : (par1 == 1 ? this.stalagmiteTop: this.blockIcon);
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("stalagmite");
            this.stalagmiteTop = par1IconRegister.registerIcon("stalagmiteTop");
        }

}