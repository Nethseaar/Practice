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

public class BlockNorth extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon northTop;
	@SideOnly(Side.CLIENT)
    private Icon northBottom;
	
        public BlockNorth(int id, Material material) {
                super(id, material);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            if(par1 == 4){
            	return this.northTop;
            	}
            if(par1 == 5){
            	return this.northBottom;
            	}
            else{
            	return this.blockIcon;
            }
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("northSouthSides");
            this.northTop = par1IconRegister.registerIcon("northTop");
            this.northBottom = par1IconRegister.registerIcon("northBottom");
        }
}