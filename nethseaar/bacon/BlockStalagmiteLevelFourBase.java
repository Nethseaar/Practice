package nethseaar.bacon;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockStalagmiteLevelFourBase extends Block {

	@SideOnly(Side.CLIENT)
    private Icon stalagmiteTop;
	private Icon stoneBottom;
	
        public BlockStalagmiteLevelFourBase(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        		this.setBlockBounds(0.3F, 0F, 0.3F, 0.7F, 1F, 0.7F);
        		this.setTickRandomly(true);
        }

        @Override
    	public void onNeighborBlockChange(World par1World, int xPos, int yPos, int zPos, int blockId)
    	{
    		if (!par1World.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos))
    		{
    			this.dropBlockAsItem(par1World, xPos, yPos, zPos, par1World.getBlockMetadata(xPos, yPos, zPos), 0);
    			par1World.setBlockToAir(xPos, yPos, zPos);
    		}
    	}
        
        public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    	{
    		if (par1World.isAirBlock(par2, par3 + 1, par4))
    		{
    			int l;

    			for (l = 1; par1World.getBlockId(par2, par3 - l, par4) == this.blockID; ++l)
    			{
    				;
    			}

    			if (l < 3)
    			{
    				int i1 = par1World.getBlockMetadata(par2, par3, par4);

    				if (i1 == 15)
    				{
    					if (par5Random.nextInt(3) == 1){
    						par1World.setBlock(par2, par3 + 1, par4, BaconBlocks.stalagmiteLevelFour.blockID);
    						if (par5Random.nextInt(3) == 1){
    							par1World.setBlock(par2, par3, par4, BaconBlocks.stalagmiteLevelThreeBase.blockID);
    						}
    					}
    					else{
    						par1World.setBlock(par2, par3 + 1, par4, BaconBlocks.stalagmiteLevelFive.blockID);
    					}
    					par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
    				}
    				else
    				{
    					par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
    				}
    			}
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
            return par1 == 0 ? this.stalagmiteTop : (par1 == 1 ? this.stalagmiteTop: this.blockIcon);
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("stalagmiteBase");
            this.stalagmiteTop = par1IconRegister.registerIcon("stalagmiteTop");
            this.stoneBottom = par1IconRegister.registerIcon("stone");
        }

}