package nethseaar.bacon.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import nethseaar.bacon.BaconBlocks;

public class BlockStalactiteBase extends Block {

	@SideOnly(Side.CLIENT)
	private Icon stalactiteTop;
	@SideOnly(Side.CLIENT)
	private Icon stoneBottom;

	public BlockStalactiteBase(int id, Material material) {
		super(id, material);
		this.setTickRandomly(true);
	}
	
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (par1World.isAirBlock(par2, par3 - 1, par4))
		{
			int l;

			for (l = 1; par1World.getBlockId(par2, par3 + l, par4) == this.blockID; ++l)
			{
				;
			}

			if (l < 3)
			{
				int i1 = par1World.getBlockMetadata(par2, par3, par4);

				if (i1 == 15)
				{
					if (par5Random.nextInt(3) == 1){
						par1World.setBlock(par2, par3 - 1, par4, BaconBlocks.stalactiteLevelOne.blockID);
					}
					else{
						par1World.setBlock(par2, par3 - 1, par4, BaconBlocks.stalactiteLevelTwo.blockID);
					}
					par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
				}
				else
				{
					par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 0 ? this.stalactiteTop : (par1 == 1 ? this.stoneBottom : this.blockIcon);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("stalactiteBase");
		this.stalactiteTop = par1IconRegister.registerIcon("stalagmiteTop");
		this.stoneBottom = par1IconRegister.registerIcon("stone");
	}


}