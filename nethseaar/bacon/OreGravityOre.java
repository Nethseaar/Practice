package nethseaar.bacon;

import java.util.Random;

import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class OreGravityOre extends BlockPortal {

	public OreGravityOre(int id, int texture, Material material) {
		super(id);
		setHardness(10.0F);
		setResistance(20.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(0.5F);
	}
	
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	 {

	  }
	
	 public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
	    {
	        byte b0 = 0;
	        byte b1 = 0;

	        if (par1World.getBlockId(par2 - 1, par3, par4) == BaconBlocks.deathstoneBrick.blockID || par1World.getBlockId(par2 + 1, par3, par4) == BaconBlocks.deathstoneBrick.blockID)
	        {
	            b0 = 1;
	        }

	        if (par1World.getBlockId(par2, par3, par4 - 1) == BaconBlocks.deathstoneBrick.blockID || par1World.getBlockId(par2, par3, par4 + 1) == BaconBlocks.deathstoneBrick.blockID)
	        {
	            b1 = 1;
	        }

	        if (b0 == b1)
	        {
	            return false;
	        }
	        else
	        {
	            if (par1World.getBlockId(par2 - b0, par3, par4 - b1) == 0)
	            {
	                par2 -= b0;
	                par4 -= b1;
	            }

	            int l;
	            int i1;

	            for (l = -1; l <= 2; ++l)
	            {
	                for (i1 = -1; i1 <= 3; ++i1)
	                {
	                    boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;

	                    if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
	                    {
	                        int j1 = par1World.getBlockId(par2 + b0 * l, par3 + i1, par4 + b1 * l);

	                        if (flag)
	                        {
	                            if (j1 != BaconBlocks.deathstoneBrick.blockID)
	                            {
	                                return false;
	                            }
	                        }
	                        else if (j1 != 0 && j1 != Block.fire.blockID)
	                        {
	                            return false;
	                        }
	                    }
	                }
	            }

	            for (l = 0; l < 2; ++l)
	            {
	                for (i1 = 0; i1 < 3; ++i1)
	                {
	                    par1World.setBlock(par2 + b0 * l, par3 + i1, par4 + b1 * l, Block.portal.blockID, 0, 2);
	                }
	            }

	            return true;
	        }
	    }
	
	 public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	    {
	        
	    }
	 
	 public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	    {
	        byte b0 = 0;
	        byte b1 = 1;

	        if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
	        {
	            b0 = 1;
	            b1 = 0;
	        }

	        int i1;

	        for (i1 = par3; par1World.getBlockId(par2, i1 - 1, par4) == this.blockID; --i1)
	        {
	            ;
	        }

	        if (par1World.getBlockId(par2, i1 - 1, par4) != BaconBlocks.deathstoneBrick.blockID)
	        {
	            par1World.setBlockToAir(par2, par3, par4);
	        }
	        else
	        {
	            int j1;

	            for (j1 = 1; j1 < 4 && par1World.getBlockId(par2, i1 + j1, par4) == this.blockID; ++j1)
	            {
	                ;
	            }

	            if (j1 == 3 && par1World.getBlockId(par2, i1 + j1, par4) == BaconBlocks.deathstoneBrick.blockID)
	            {
	                boolean flag = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
	                boolean flag1 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

	                if (flag && flag1)
	                {
	                    par1World.setBlockToAir(par2, par3, par4);
	                }
	                else
	                {
	                    if ((par1World.getBlockId(par2 + b0, par3, par4 + b1) != BaconBlocks.deathstoneBrick.blockID || par1World.getBlockId(par2 - b0, par3, par4 - b1) != this.blockID) && (par1World.getBlockId(par2 - b0, par3, par4 - b1) != BaconBlocks.deathstoneBrick.blockID || par1World.getBlockId(par2 + b0, par3, par4 + b1) != this.blockID))
	                    {
	                        par1World.setBlockToAir(par2, par3, par4);
	                    }
	                }
	            }
	            else
	            {
	                par1World.setBlockToAir(par2, par3, par4);
	            }
	        }
	    }
	 
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.gravityOre");
		}
}
