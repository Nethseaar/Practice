package nethseaar.bacon;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.UP;
import static net.minecraftforge.common.ForgeDirection.WEST;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLantern extends Block {
	
	@SideOnly(Side.CLIENT)
    private Icon lanternTop;
	@SideOnly(Side.CLIENT)
    private Icon lanternBottom;

	protected BlockLantern(int id, int texture) {
		super(id, Material.circuits);
		this.setCreativeTab(Bacon.tabSubItems);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setBlockBoundsForItemRender();
	}

	@Override
	public void setBlockBoundsForItemRender()
	{
		float width = 0.375F;
		float radius = width/2;
		float height = 0.5F;
		this.setBlockBounds(0.5F - radius, 0.0F, 0.5F - radius, 0.5F + radius, height, 0.5F + radius);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int xPos, int yPos, int zPos)
	{
		return super.canPlaceBlockAt(world, xPos, yPos, zPos) && world.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos);
	}

	@Override
	public void onNeighborBlockChange(World world, int xPos, int yPos, int zPos, int blockId)
	{
		if (!world.doesBlockHaveSolidTopSurface(xPos, yPos - 1, zPos))
		{
			this.dropBlockAsItem(world, xPos, yPos, zPos, world.getBlockMetadata(xPos, yPos, zPos), 0);
		}
	}

	@Override
	public void randomDisplayTick(World par1World, int parX, int parY, int parZ, Random par5Random)
	{
		double posX = (double)((float)parX + 0.5F);
		double posY = (double)((float)parY + 0.2F);
		double posZ = (double)((float)parZ + 0.5F);
		par1World.spawnParticle("smoke", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
		par1World.spawnParticle("flame", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
	}

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 0 ? this.lanternTop : (par1 == 1 ? this.lanternBottom: this.blockIcon);
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
	        this.blockIcon = par1IconRegister.registerIcon("lanternSide");
	        this.lanternTop = par1IconRegister.registerIcon("lanternTop");
	        this.lanternBottom = par1IconRegister.registerIcon("lanternBottom");
	    }

}
