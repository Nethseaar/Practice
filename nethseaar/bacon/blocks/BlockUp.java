package nethseaar.bacon.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import nethseaar.bacon.entities.EntityFallingAscender;

public class BlockUp extends Block {

	@SideOnly(Side.CLIENT)
    private Icon upTop;
	@SideOnly(Side.CLIENT)
    private Icon upBottom;
    
        public BlockUp(int id, Material material) {
                super(id, material);
        }
        
        /** Do blocks fall instantly to where they stop or do they fall over time */
        public static boolean fallInstantly = false;

        /**
         * Called whenever the block is added into the world. Args: world, x, y, z
         */
        public void onBlockAdded(World par1World, int par2, int par3, int par4)
        {
            par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
        }

        /**
         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
         * their own) Args: x, y, z, neighbor blockID
         */
        public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
        {
            par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
        }

        /**
         * Ticks the block if it's been scheduled
         */
        public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            if (!par1World.isRemote)
            {
                this.tryToFall(par1World, par2, par3, par4);
            }
        }
        
        /**
         * If there is space to fall below will start this block falling
         */
        private void tryToFall(World par1World, int par2, int par3, int par4)
        {
            if (canFallAbove(par1World, par2, par3 + 1, par4) && par3 >= 0)
            {
                byte b0 = 32;

                if (!fallInstantly && par1World.checkChunksExist(par2 - b0, par3 - b0, par4 - b0, par2 + b0, par3 + b0, par4 + b0))
                {
                    if (!par1World.isRemote)
                    {
                    	EntityFallingAscender entityfallingsand = new EntityFallingAscender(par1World, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), this.blockID, par1World.getBlockMetadata(par2, par3, par4));
                        this.onStartFalling(entityfallingsand);
                        par1World.spawnEntityInWorld(entityfallingsand);
                    }
                }
                else
                {
                    par1World.setBlockToAir(par2, par3, par4);

                    while (canFallAbove(par1World, par2, par3 + 1, par4) && par3 > 0)
                    {
                        ++par3;
                    }

                    if (par3 > 0)
                    {
                        par1World.setBlock(par2, par3, par4, this.blockID);
                    }
                }
            }
        }
        
        public static boolean canFallAbove(World par0World, int par1, int par2, int par3)
        {
            int l = par0World.getBlockId(par1, par2, par3);

            if (par0World.isAirBlock(par1, par2, par3))
            {
                return true;
            }
            else if (l == Block.fire.blockID)
            {
                return true;
            }
            else
            {
                Material material = Block.blocksList[l].blockMaterial;
                return material == Material.water ? true : material == Material.lava;
            }
        }
        
        /**
         * Called when the falling block entity for this block is created
         */
        protected void onStartFalling(EntityFallingAscender par1EntityFallingSand) {}

        /**
         * How many world ticks before ticking
         */
        public int tickRate(World par1World)
        {
            return 2;
        }

        /**
         * Called when the falling block entity for this block hits the ground and turns back into a block
         */
        public void onFinishFalling(World par1World, int par2, int par3, int par4, int par5) {}
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.upBottom : (par1 == 1 ? this.upTop: this.blockIcon);
        }
        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("upDownSides");
            this.upTop = par1IconRegister.registerIcon("upTop");
            this.upBottom = par1IconRegister.registerIcon("upBottom");
        }
}