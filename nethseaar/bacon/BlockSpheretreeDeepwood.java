package nethseaar.bacon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSpheretreeDeepwood extends Block {

	@SideOnly(Side.CLIENT)
    private Icon sphereTreeOrigin;
	@SideOnly(Side.CLIENT)
    private Icon sphereTree1Bottom;
	
        public BlockSpheretreeDeepwood(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        }
        
        
        /**
         * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
         */
        public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
        {
            int j1 = par9 & 3;
            byte b0 = 0;

            switch (par5)
            {
                case 0:
                case 1:
                    b0 = 0;
                    break;
                case 2:
                case 3:
                    b0 = 8;
                    break;
                case 4:
                case 5:
                    b0 = 4;
            }

            return j1 | b0;
        }
        
        /**
         * returns a number between 0 and 3
         */
        public static int limitToValidMetadata(int par0)
        {
            return par0 & 6;
        }
        

        @Override
        public boolean isWood(World world, int x, int y, int z)
        {
            return true;
        }
        
        /**
         * The type of render function that is called for this block
         */
        public int getRenderType()
        {
            return 31;
        }
        
        @SideOnly(Side.CLIENT)

        /**
         * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
         */
        public Icon getIcon(int par1, int par2)
        {
            int k = par2 & 12;
            int l = par2 & 3;
            return k == 0 && (par1 == 1) ? this.sphereTreeOrigin : (k == 0 && (par1 == 0) ? this.sphereTree1Bottom : k == 1 && (par1 == 0) ? this.sphereTreeOrigin : (k == 1 && (par1 == 1) ? this.sphereTree1Bottom : (k == 4 && (par1 == 5) ? this.sphereTreeOrigin : (k == 4 && (par1 == 4) ? this.sphereTree1Bottom : (k == 8 && (par1 == 3) ? this.sphereTreeOrigin : (k == 8 && (par1 == 2) ? this.sphereTree1Bottom : this.blockIcon))))));
        }
        
//        @SideOnly(Side.CLIENT)
//        public Icon getIcon(int par1, int par2)
//        {
//            return par1 == 0 ? this.sphereTree1Bottom : (par1 == 1 ? this.sphereTreeOrigin: this.blockIcon);
//        }
                
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("spheretreeDeepwood");
            this.sphereTreeOrigin = par1IconRegister.registerIcon("spheretreeHeart");
            this.sphereTree1Bottom = par1IconRegister.registerIcon("spheretreeDeepwoodBottom");
        }
}