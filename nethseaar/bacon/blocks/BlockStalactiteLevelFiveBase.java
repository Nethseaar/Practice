package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockStalactiteLevelFiveBase extends Block {

	@SideOnly(Side.CLIENT)
    private Icon stalactiteTop;
	private Icon stoneBottom;
	
        public BlockStalactiteLevelFiveBase(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        		this.setBlockBounds(0.4F, 0F, 0.4F, 0.6F, 1F, 0.6F);
        		this.setTickRandomly(true);
        }
    
        @Override
    	public void onNeighborBlockChange(World par1World, int xPos, int yPos, int zPos, int blockId)
    	{
    		if (!par1World.doesBlockHaveSolidTopSurface(xPos, yPos + 1, zPos))
    		{
    			this.dropBlockAsItem(par1World, xPos, yPos, zPos, par1World.getBlockMetadata(xPos, yPos, zPos), 0);
    			par1World.setBlockToAir(xPos, yPos, zPos);
    		}
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
            return par1 == 0 ? this.stalactiteTop : (par1 == 1 ? this.stoneBottom : this.blockIcon);
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("stalactiteBase");
            this.stalactiteTop = par1IconRegister.registerIcon("stalagmiteTop");
            this.stoneBottom = par1IconRegister.registerIcon("stone");
        }

}