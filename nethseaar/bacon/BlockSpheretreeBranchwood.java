package nethseaar.bacon;

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

public class BlockSpheretreeBranchwood extends Block {

	@SideOnly(Side.CLIENT)
    private Icon sphereTreeOrigin;
	@SideOnly(Side.CLIENT)
    private Icon sphereTree1Bottom;
	
        public BlockSpheretreeBranchwood(int id, Material material) {
                super(id, material);
            	setHardness(3.0F);
        		setResistance(5.0F);
        		setStepSound(soundStoneFootstep);
        		setCreativeTab(CreativeTabs.tabBlock);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.sphereTree1Bottom : (par1 == 1 ? this.sphereTreeOrigin: this.blockIcon);
        }
        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("spheretreeBranchwood");
            this.sphereTreeOrigin = par1IconRegister.registerIcon("spheretreeDeepwoodBottom");
            this.sphereTree1Bottom = par1IconRegister.registerIcon("spheretreeBranchwoodBottom");
        }


}