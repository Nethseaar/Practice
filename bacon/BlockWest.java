package nethseaar.bacon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockWest extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon westTop;
	@SideOnly(Side.CLIENT)
    private Icon westBottom;
	@SideOnly(Side.CLIENT)
	
        public BlockWest(int id, Material material) {
                super(id, material);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            if(par1 == 2){
            	return this.westTop;
            	}
            if(par1 == 3){
            	return this.westBottom;
            	}
            else{
            	return this.blockIcon;
            }
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("eastWestSides");
            this.westTop = par1IconRegister.registerIcon("westTop");
            this.westBottom = par1IconRegister.registerIcon("westBottom");
        }
}