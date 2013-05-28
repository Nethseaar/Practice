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

public class BlockSouth extends BlockSand {

	@SideOnly(Side.CLIENT)
    private Icon southTop;
	@SideOnly(Side.CLIENT)
    private Icon southBottom;
	@SideOnly(Side.CLIENT)
	
        public BlockSouth(int id, Material material) {
                super(id, material);
        }
        
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int par1, int par2)
        {
            if(par1 == 4){
            	return this.southTop;
            	}
            if(par1 == 5){
            	return this.southBottom;
            	}
            else{
            	return this.blockIcon;
            }
        }

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon("northSouthSides");
            this.southTop = par1IconRegister.registerIcon("southTop");
            this.southBottom = par1IconRegister.registerIcon("southBottom");
        }
}