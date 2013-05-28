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

public class BlockEast extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon eastTop;
	@SideOnly(Side.CLIENT)
    private Icon eastBottom;
	
        public BlockEast(int id, Material material) {
                super(id, material);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            if(par1 == 2){
            	return this.eastTop;
            	}
            if(par1 == 3){
            	return this.eastBottom;
            	}
            else{
            	return this.blockIcon;
            }
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("eastWestSides");
            this.eastTop = par1IconRegister.registerIcon("eastTop");
            this.eastBottom = par1IconRegister.registerIcon("eastBottom");
        }
}