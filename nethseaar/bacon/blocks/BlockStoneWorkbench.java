package nethseaar.bacon.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import nethseaar.bacon.Bacon;

public class BlockStoneWorkbench extends BlockWorkbench {

	public BlockStoneWorkbench(int id) {
		super(id);
		setHardness(1.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(Bacon.tabSubItems);
	}

	 @SideOnly(Side.CLIENT)
	    private Icon workbenchIconTop;
	    @SideOnly(Side.CLIENT)
	    private Icon workbenchIconFront;


	    @SideOnly(Side.CLIENT)
	    public Icon getIcon(int par1, int par2)
	    {
	        return par1 == 1 ? this.workbenchIconTop : (par1 == 0 ? Block.stone.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.workbenchIconFront));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon("stoneTable1");
	        this.workbenchIconTop = par1IconRegister.registerIcon("stoneTableTop");
	        this.workbenchIconFront = par1IconRegister.registerIcon("stoneTable0");
	    }
	    
	    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	    {
	        if (par1World.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
	            return true;
	        }
	    }

}
