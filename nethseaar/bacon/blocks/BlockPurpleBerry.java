package nethseaar.bacon.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import nethseaar.bacon.Bacon;
import nethseaar.bacon.BaconItems;
import nethseaar.bacon.bases.BlockBacon;

public class BlockPurpleBerry extends BlockBacon{

	public BlockPurpleBerry(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Bacon.tabSubItems);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setBlockBoundsForItemRender();
	}

	@SideOnly(Side.CLIENT)
    private Icon top;
	
	@Override
	public void setBlockBoundsForItemRender()
	{
		float width = 0.375F;
		float radius = width/2;
		float height = 0.3F;
		this.setBlockBounds(0.5F - radius, 0.0F, 0.5F - radius, 0.5F + radius, height, 0.5F + radius);
	}
	
	@Override
	public void onNeighborBlockChange(World par1World, int xPos, int yPos, int zPos, int blockId)
	{
		if (!par1World.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos))
		{
			this.dropBlockAsItem(par1World, xPos, yPos, zPos, par1World.getBlockMetadata(xPos, yPos, zPos), 0);
			par1World.setBlockToAir(xPos, yPos, zPos);
		}
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 0 ? this.top : (par1 == 1 ? this.top: this.blockIcon);
    }

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	   @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon("purpleBerrySide");
	        this.top = par1IconRegister.registerIcon("purpleBerryTop");
	    }
}
