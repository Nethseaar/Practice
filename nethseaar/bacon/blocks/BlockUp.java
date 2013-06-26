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

public class BlockUp extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon upTop;
	@SideOnly(Side.CLIENT)
    private Icon upBottom;
    
        public BlockUp(int id, Material material) {
                super(id, material);
        }
        
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