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

public class BlockStalagmiteBase extends Block {

	@SideOnly(Side.CLIENT)
    private Icon stalagmiteTop;
	@SideOnly(Side.CLIENT)
    private Icon stoneBottom;
	
        public BlockStalagmiteBase(int id, Material material) {
                super(id, material);
        		this.setTickRandomly(true);
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
                        par1World.setBlock(par2, par3 + 1, par4, BaconBlocks.stalagmiteLevelTwo.blockID);
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
                    }
                }
            }
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.stoneBottom : (par1 == 1 ? this.stalagmiteTop: this.blockIcon);
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("stalagmiteBase");
            this.stalagmiteTop = par1IconRegister.registerIcon("stalagmiteTop");
            this.stoneBottom = par1IconRegister.registerIcon("stone");
        }


}