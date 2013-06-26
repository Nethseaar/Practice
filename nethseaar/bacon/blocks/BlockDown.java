package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockDown extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon downTop;
	@SideOnly(Side.CLIENT)
    private Icon downBottom;
    
        public BlockDown(int id, Material material) {
                super(id, material);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.downBottom : (par1 == 1 ? this.downTop: this.blockIcon);
        }
        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("upDownSides");
            this.downTop = par1IconRegister.registerIcon("downTop");
            this.downBottom = par1IconRegister.registerIcon("downBottom");
        }
}