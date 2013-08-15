package nethseaar.bacon.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import nethseaar.bacon.BaconBlocks;

public class BlockRedRock extends Block {

	@SideOnly(Side.CLIENT)
	private Icon single;
	@SideOnly(Side.CLIENT)
	private Icon two0;
	@SideOnly(Side.CLIENT)
	private Icon two1;
	@SideOnly(Side.CLIENT)
	private Icon two2;
	@SideOnly(Side.CLIENT)
	private Icon two3;
	@SideOnly(Side.CLIENT)
	private Icon line0;
	@SideOnly(Side.CLIENT)
	private Icon line1;
	@SideOnly(Side.CLIENT)
	private Icon elbow0;
	@SideOnly(Side.CLIENT)
	private Icon elbow1;
	@SideOnly(Side.CLIENT)
	private Icon elbow2;
	@SideOnly(Side.CLIENT)
	private Icon elbow3;
	@SideOnly(Side.CLIENT)
	private Icon square0;
	@SideOnly(Side.CLIENT)
	private Icon square1;
	@SideOnly(Side.CLIENT)
	private Icon square2;
	@SideOnly(Side.CLIENT)
	private Icon square3;
	@SideOnly(Side.CLIENT)
	private Icon plus;
	@SideOnly(Side.CLIENT)
	private Icon squid0;
	@SideOnly(Side.CLIENT)
	private Icon squid1;
	@SideOnly(Side.CLIENT)
	private Icon squid2;
	@SideOnly(Side.CLIENT)
	private Icon squid3;
	@SideOnly(Side.CLIENT)
	private Icon protrusion0;
	@SideOnly(Side.CLIENT)
	private Icon protrusion1;
	@SideOnly(Side.CLIENT)
	private Icon protrusion2;
	@SideOnly(Side.CLIENT)
	private Icon protrusion3;
	@SideOnly(Side.CLIENT)
	private Icon missingCorner0;
	@SideOnly(Side.CLIENT)
	private Icon missingCorner1;
	@SideOnly(Side.CLIENT)
	private Icon missingCorner2;
	@SideOnly(Side.CLIENT)
	private Icon missingCorner3;
	@SideOnly(Side.CLIENT)
	private Icon diagonals0;
	@SideOnly(Side.CLIENT)
	private Icon diagonals1;
	@SideOnly(Side.CLIENT)
	private Icon t0;
	@SideOnly(Side.CLIENT)
	private Icon t1;
	@SideOnly(Side.CLIENT)
	private Icon t2;
	@SideOnly(Side.CLIENT)
	private Icon t3;
	@SideOnly(Side.CLIENT)
	private Icon utah00;
	@SideOnly(Side.CLIENT)
	private Icon utah01;
	@SideOnly(Side.CLIENT)
	private Icon utah02;
	@SideOnly(Side.CLIENT)
	private Icon utah03;
	@SideOnly(Side.CLIENT)
	private Icon utah10;
	@SideOnly(Side.CLIENT)
	private Icon utah11;
	@SideOnly(Side.CLIENT)
	private Icon utah12;
	@SideOnly(Side.CLIENT)
	private Icon utah13;
	@SideOnly(Side.CLIENT)
	private Icon edge0;
	@SideOnly(Side.CLIENT)
	private Icon edge1;
	@SideOnly(Side.CLIENT)
	private Icon edge2;
	@SideOnly(Side.CLIENT)
	private Icon edge3;
	@SideOnly(Side.CLIENT)
	private Icon center;

	public BlockRedRock(int id, Material material) {
		super(id, material);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	public Icon getBlockTexture(IBlockAccess par1World, int x, int y, int z, int side)
	{
		if(par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID && 
				par1World.getBlockId(x, y, z - 1) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID){
			return side == 0 || side == 1 ? this.single : this.blockIcon;
		}
		// check for doubles
		else if(par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID && 
				par1World.getBlockId(x, y, z - 1) != this.blockID &&
				par1World.getBlockId(x, y, z + 1) == this.blockID){
			return side == 0 || side == 1 ? this.two0 : this.blockIcon; // north
		}
		else if(par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID &&
				par1World.getBlockId(x, y, z - 1) == this.blockID){
			return side == 0 || side == 1 ? this.two1 : this.blockIcon; // south
		}
		else if(par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID && 
				par1World.getBlockId(x, y, z - 1) != this.blockID &&
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			return side == 0 || side == 1 ? this.two2 : this.blockIcon; // west
		}
		else if(par1World.getBlockId(x + 1, y, z) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID && 
				par1World.getBlockId(x, y, z - 1) != this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID){
			return side == 0 || side == 1 ? this.two3 : this.blockIcon; // east
		}
		// check for lines
		else if(par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID &&
				par1World.getBlockId(x, y, z + 1) == this.blockID && 
				par1World.getBlockId(x, y, z - 1) == this.blockID){
			return side == 0 || side == 1 ? this.line0 : this.blockIcon; // north-south
		}
		else if(par1World.getBlockId(x, y, z - 1) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			return side == 0 || side == 1 ? this.line1 : this.blockIcon; // east-west
		}
		// check for squares and elbows
		else if(par1World.getBlockId(x, y, z - 1) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			if(par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.elbow2 : this.blockIcon; //elbow south-east, is good
			}
			else{
				return side == 0 || side == 1 ? this.square2 : this.blockIcon; //square
			} // z + is south, x+ is east
		}
		else if(par1World.getBlockId(x, y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID){
			if(par1World.getBlockId(x - 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.elbow3 : this.blockIcon; // _| is good
			}
			else{
				return side == 0 || side == 1 ? this.square3 : this.blockIcon;
			}
		}
		else if(par1World.getBlockId(x, y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID &&
				par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			if(par1World.getBlockId(x + 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.elbow1 : this.blockIcon; // L, is not good
			}
			else{
				return side == 0 || side == 1 ? this.square1 : this.blockIcon;
			}
		}
		else if(par1World.getBlockId(x, y, z - 1) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID){
			if(par1World.getBlockId(x - 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.elbow0 : this.blockIcon; // south-west, is not good
			}
			else{
				return side == 0 || side == 1 ? this.square0 : this.blockIcon;
			}
		}
		// check for true plus
		else if(par1World.getBlockId(x , y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){

			// check for solo plus
			if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.plus : this.blockIcon;
			}
			//check for squid (3 false)
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.squid3 : this.blockIcon; // 3
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.squid0 : this.blockIcon; // 2
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.squid1 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.squid2 : this.blockIcon; // 1
			}
			//check for protrusion (2 false on same side)
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.protrusion3 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.protrusion0 : this.blockIcon;//
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.protrusion1 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.protrusion2 : this.blockIcon;
			}
			//check for missing corner
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.missingCorner2 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.missingCorner1 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.missingCorner0 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.missingCorner3 : this.blockIcon;
			}
			//check for diagonals
			else if(par1World.getBlockId(x - 1 , y, z - 1) != this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.diagonals0 : this.blockIcon;
			}
			else if(par1World.getBlockId(x - 1 , y, z - 1) == this.blockID && 
					par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID && 
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.diagonals1 : this.blockIcon;
			}
			else{
				return side == 0 || side == 1 ? this.center : this.blockIcon;
			}
		}
		// check for three trues (T)
		else if(par1World.getBlockId(x , y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) != this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x - 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.t3 : this.blockIcon;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x - 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.utah03 : this.blockIcon;
			}
			else if(		par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x - 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.utah10 : this.blockIcon;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x - 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.edge3 : this.blockIcon;
			}
			else{
				return side == 0 || side == 1 ? this.center : this.blockIcon;
			}
		}
		else if(par1World.getBlockId(x , y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) != this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(x + 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.t2 : this.blockIcon;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(x + 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.utah11 : this.blockIcon;
			}
			else if(		par1World.getBlockId(x + 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.utah02 : this.blockIcon;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(x + 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.edge2 : this.blockIcon;
			}
			else{
				return side == 0 || side == 1 ? this.center : this.blockIcon;
			}

		}
		else if(par1World.getBlockId(x , y, z - 1) == this.blockID && 
				par1World.getBlockId(x, y, z + 1) != this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(x - 1, y, z - 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.t1 : this.blockIcon;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(x - 1, y, z - 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.utah01 : this.blockIcon;
			}
			else if(		par1World.getBlockId(x - 1, y, z - 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) != this.blockID){
				return side == 0 || side == 1 ? this.utah13 : this.blockIcon;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(x - 1, y, z - 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z - 1) == this.blockID){
				return side == 0 || side == 1 ? this.edge1 : this.blockIcon;
			}
			else{
				return side == 0 || side == 1 ? this.center : this.blockIcon;
			}

		}
		else if(par1World.getBlockId(x , y, z - 1) != this.blockID && 
				par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID && 
				par1World.getBlockId(x + 1, y, z) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.t0 : this.blockIcon;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(x - 1, y, z + 1) != this.blockID &&
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.utah12 : this.blockIcon;
			}
			else if(		par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z + 1) != this.blockID){
				return side == 0 || side == 1 ? this.utah00 : this.blockIcon;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(x - 1, y, z + 1) == this.blockID &&
					par1World.getBlockId(x + 1, y, z + 1) == this.blockID){
				return side == 0 || side == 1 ? this.edge0 : this.blockIcon;
			}
			else{
				return side == 0 || side == 1 ? this.center : this.blockIcon;
			}
		}
		else if(par1World.getBlockId(x, y, z + 1) == this.blockID &&
				par1World.getBlockId(x, y, z - 1) == this.blockID &&
				par1World.getBlockId(x + 1, y, z) == this.blockID &&
				par1World.getBlockId(x - 1, y, z) == this.blockID &&
				par1World.getBlockId(x + 1, y, z + 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z - 1) == this.blockID &&
				par1World.getBlockId(x + 1, y, z - 1) == this.blockID &&
				par1World.getBlockId(x - 1, y, z + 1) == this.blockID){
			return side == 0 || side == 1 ? this.center : this.blockIcon;
		}
		else{
			return side == 0 || side == 1 ? this.center : this.blockIcon;
		}
	}

	public Icon getIcon(int par1, int par2)
	{
			return par1 == 0 || par1 == 1 ? this.single : this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("redRockSide");
		this.single = par1IconRegister.registerIcon("single");
		this.two0 = par1IconRegister.registerIcon("two0");
		this.two1 = par1IconRegister.registerIcon("two1");
		this.two2 = par1IconRegister.registerIcon("two2");
		this.two3 = par1IconRegister.registerIcon("two3");
		this.line0 = par1IconRegister.registerIcon("line0");
		this.line1 = par1IconRegister.registerIcon("line1");
		this.elbow0 = par1IconRegister.registerIcon("elbow0");
		this.elbow1 = par1IconRegister.registerIcon("elbow1");
		this.elbow2 = par1IconRegister.registerIcon("elbow2");
		this.elbow3 = par1IconRegister.registerIcon("elbow3");
		this.square0 = par1IconRegister.registerIcon("square0");
		this.square1 = par1IconRegister.registerIcon("square1");
		this.square2 = par1IconRegister.registerIcon("square2");
		this.square3 = par1IconRegister.registerIcon("square3");
		this.plus = par1IconRegister.registerIcon("plus");
		this.squid0 = par1IconRegister.registerIcon("squid0");
		this.squid1 = par1IconRegister.registerIcon("squid1");
		this.squid2 = par1IconRegister.registerIcon("squid2");
		this.squid3 = par1IconRegister.registerIcon("squid3");
		this.protrusion0 = par1IconRegister.registerIcon("protrusion0");
		this.protrusion1 = par1IconRegister.registerIcon("protrusion1");
		this.protrusion2 = par1IconRegister.registerIcon("protrusion2");
		this.protrusion3 = par1IconRegister.registerIcon("protrusion3");
		this.missingCorner0 = par1IconRegister.registerIcon("missingCorner0");
		this.missingCorner1 = par1IconRegister.registerIcon("missingCorner1");
		this.missingCorner2 = par1IconRegister.registerIcon("missingCorner2");
		this.missingCorner3 = par1IconRegister.registerIcon("missingCorner3");
		this.diagonals0 = par1IconRegister.registerIcon("diagonals0");
		this.diagonals1 = par1IconRegister.registerIcon("diagonals1");
		this.t0 = par1IconRegister.registerIcon("t0");
		this.t1 = par1IconRegister.registerIcon("t1");
		this.t2 = par1IconRegister.registerIcon("t2");
		this.t3 = par1IconRegister.registerIcon("t3");
		this.utah00 = par1IconRegister.registerIcon("utah00");
		this.utah01 = par1IconRegister.registerIcon("utah01");
		this.utah02 = par1IconRegister.registerIcon("utah02");
		this.utah03 = par1IconRegister.registerIcon("utah03");
		this.utah10 = par1IconRegister.registerIcon("utah10");
		this.utah11 = par1IconRegister.registerIcon("utah11");
		this.utah12 = par1IconRegister.registerIcon("utah12");
		this.utah13 = par1IconRegister.registerIcon("utah13");
		this.edge0 = par1IconRegister.registerIcon("edge0");
		this.edge1 = par1IconRegister.registerIcon("edge1");
		this.edge2 = par1IconRegister.registerIcon("edge2");
		this.edge3 = par1IconRegister.registerIcon("edge3");
		this.center = par1IconRegister.registerIcon("center");
	}

}