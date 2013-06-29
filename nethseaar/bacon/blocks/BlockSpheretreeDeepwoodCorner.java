package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSpheretreeDeepwoodCorner extends Block {

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
	
        public BlockSpheretreeDeepwoodCorner(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
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
                  if (par1 == 5 || par1 == 2) return spheretree1Bottom; //West par1 of Block
                  if (par1 == 4 || par1 == 3) return spheretreeOrigin; //East par1 of Block
                  if (par1 == 1 || par1 == 0) return spheretreeSide1;
              case 1: //East Facing Block 
                  if (par1 == 5 || par1 == 2) return spheretreeOrigin; //West par1 of Block
                  if (par1 == 4 || par1 == 3) return spheretree1Bottom; //East par1 of Block
                  if (par1 == 1 || par1 == 0) return spheretreeSide2;
              case 2: //South Facing Block
                  if (par1 == 3 || par1 == 2) return spheretreeOrigin; //West par1 of Block
                  if (par1 == 5 || par1 == 4) return spheretree1Bottom; //East par1 of Block
                   if (par1 == 1 || par1 == 0) return spheretreeSide3;
              case 3: //West Facing Block
                  if (par1 == 4 || par1 == 2) return spheretreeOrigin; //West par1 of Block
                  if (par1 == 5 || par1 == 3) return spheretree1Bottom; //East par1 of Block
                  if (par1 == 1 || par1 == 0) return blockIcon;
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
        
        public int getRenderType()
        {
            return 31;
        }
        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("spheretreeDeepwoodCorner0");
            this.spheretreeSide1 = par1IconRegister.registerIcon("spheretreeDeepwoodCorner1");
            this.spheretreeSide2 = par1IconRegister.registerIcon("spheretreeDeepwoodCorner2");
            this.spheretreeSide3 = par1IconRegister.registerIcon("spheretreeDeepwoodCorner3");
            this.spheretreeOrigin = par1IconRegister.registerIcon("spheretreeDeepwoodBottom");
            this.spheretree1Bottom = par1IconRegister.registerIcon("spheretreeBranchwoodBottom");
        }


}