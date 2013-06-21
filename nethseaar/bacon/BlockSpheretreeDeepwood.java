package nethseaar.bacon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSpheretreeDeepwood extends Block {

	@SideOnly(Side.CLIENT)
	private Icon spheretreeSide1;
	@SideOnly(Side.CLIENT)
	private Icon spheretreeSide2;
	@SideOnly(Side.CLIENT)
	private Icon spheretreeSide3;
	@SideOnly(Side.CLIENT)
    private Icon spheretreeOrigin;
	@SideOnly(Side.CLIENT)
    private Icon spheretree1Bottom;
	
        public BlockSpheretreeDeepwood(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public int getRenderType()
        {
            return 31;
        }

        public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
        {
            int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
            par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            switch (par2)
            {
            case 0: //North Facing Block 
            	if (par1 == 2) return spheretreeOrigin; //North par1 of Block
                if (par1 == 3) return spheretree1Bottom; //South par1 of Block
                if (par1 == 1 || par1 == 0) return spheretreeSide1;
                if (par1 == 5) return spheretreeSide2;
                if (par1 == 4) return blockIcon;
            case 1: //East Facing Block 
            	if (par1 == 4) return spheretree1Bottom; //West par1 of Block
                if (par1 == 5) return spheretreeOrigin; //East par1 of Block
                if (par1 == 1 || par1 == 0) return spheretreeSide2;
                if (par1 == 2) return blockIcon;
                if (par1 == 3) return spheretreeSide2;
            case 2: //South Facing Block
                 if (par1 == 2) return spheretree1Bottom; //North par1 of Block
                 if (par1 == 3) return spheretreeOrigin; //South par1 of Block
                 if (par1 == 1 || par1 == 0) return spheretreeSide3;
                 if (par1 == 5) return blockIcon;
                 if (par1 == 4) return spheretreeSide2;
            case 3: //West Facing Block
                if (par1 == 4) return spheretreeOrigin; //West par1 of Block
                if (par1 == 5) return spheretree1Bottom; //East par1 of Block
                if (par1 == 1 || par1 == 0) return blockIcon;
                if (par1 == 2) return spheretreeSide2;
                if (par1 == 3) return blockIcon;
            case 4:
            case 5:
            }
            return blockIcon; //Fall back if meta is out of range
        }
        
        @Override
        public boolean isWood(World world, int x, int y, int z)
        {
            return true;
        }
                 
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("spheretreeDeepwood0");
            this.spheretreeSide1 = par1IconRegister.registerIcon("spheretreeDeepwood1");
            this.spheretreeSide2 = par1IconRegister.registerIcon("spheretreeDeepwood2");
            this.spheretreeSide3 = par1IconRegister.registerIcon("spheretreeDeepwood3");
            this.spheretreeOrigin = par1IconRegister.registerIcon("spheretreeHeart");
            this.spheretree1Bottom = par1IconRegister.registerIcon("spheretreeDeepwoodBottom");
        }
}