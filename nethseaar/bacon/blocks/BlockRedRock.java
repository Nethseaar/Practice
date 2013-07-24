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
import net.minecraft.world.World;
import nethseaar.bacon.BaconBlocks;

public class BlockRedRock extends Block {

	@SideOnly(Side.CLIENT)
	private Icon single;
	@SideOnly(Side.CLIENT)
	private Icon two;
	@SideOnly(Side.CLIENT)
	private Icon line;
	@SideOnly(Side.CLIENT)
	private Icon elbow;
	@SideOnly(Side.CLIENT)
	private Icon square;
	@SideOnly(Side.CLIENT)
	private Icon plus;
	@SideOnly(Side.CLIENT)
	private Icon squid;
	@SideOnly(Side.CLIENT)
	private Icon protrusion;
	@SideOnly(Side.CLIENT)
	private Icon missingCorner;
	@SideOnly(Side.CLIENT)
	private Icon diagonals;
	@SideOnly(Side.CLIENT)
	private Icon t;
	@SideOnly(Side.CLIENT)
	private Icon utah0;
	@SideOnly(Side.CLIENT)
	private Icon utah1;
	@SideOnly(Side.CLIENT)
	private Icon edge;

	public BlockRedRock(int id, Material material) {
		super(id, material);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		this.setTickRandomly(true);
	}
	
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
		}
		// check for doubles
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
		else if(par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
		// check for lines
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}
		// check for squares and elbows
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			if(par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2); //elbow
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2); //square
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			if(par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			if(par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			if(par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);			}
		}
		// check for true plus
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){

			// check for solo plus
			if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);			
				}
			//check for squid (3 false)
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 6, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 6, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 6, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 6, 2);			
			}
			//check for protrusion (2 false on same side)
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 7, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 7, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 7, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 7, 2);			
			}
			//check for missing corner
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 8, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 8, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 8, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 8, 2);			
			}
			//check for diagonals
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 9, 2);			
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 9, 2);			
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
			}
		}
		// check for three trues (T)
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 10, 2);			
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 12, 2);			
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
			}
		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 10, 2);			
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 12, 2);			
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
			}

		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 10, 2);			
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 12, 2);			
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
			}

		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 10, 2);			
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 11, 2);			
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 12, 2);			
			}
			else{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID){
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 13, 2);			
		}
		else{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);			
		}
	}

	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID){
			return 0;
		}
		// check for doubles
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID){
			return 1;
		}
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID){
			return 1;
		}
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			return 1;
		}
		else if(par1World.getBlockId(par2 + 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID){
			return 1;
		}
		// check for lines
		else if(par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID &&
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID){
			return 2;
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			return 2;
		}
		// check for squares and elbows
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			if(par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				return 3; //elbow
			}
			else{
				return 4; //square
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			if(par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 3;
			}
			else{
				return 4;
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			if(par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID){
				return 3;
			}
			else{
				return 4;
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			if(par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				return 3;
			}
			else{
				return 4;
			}
		}
		// check for true plus
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){

			// check for solo plus
			if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 5;
			}
			//check for squid (3 false)
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 6;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 6;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 6;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 6;
			}
			//check for protrusion (2 false on same side)
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 7;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 7;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 7;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 7;
			}
			//check for missing corner
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 8;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 8;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 8;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 8;
			}
			//check for diagonals
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 9;
			}
			else if(par1World.getBlockId(par2 - 1 , par3, par4 - 1) == this.blockID && 
					par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID && 
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 9;
			}
			else{
				return 0;
			}
		}
		// check for three trues (T)
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) != this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				return 10;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID){
				return 11;
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID){
				return 11;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID){
				return 12;
			}
			else{
				return 0;
			}
		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				return 10;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				return 11;
			}
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				return 11;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				return 12;
			}
			else{
				return 0;
			}

		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) == this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) != this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				return 10;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				return 11;
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) != this.blockID){
				return 11;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID){
				return 12;
			}
			else{
				return 0;
			}

		}
		else if(par1World.getBlockId(par2 , par3, par4 - 1) != this.blockID && 
				par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && 
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID){
			// check for two falses (T)
			if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 10;
			}
			// check a false and a true (Utah)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) != this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 11;
			}
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) != this.blockID){
				return 11;
			}
			// check two trues (six block)
			else if(		par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID &&
					par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID){
				return 12;
			}
			else{
				return 0;
			}
		}
		else if(par1World.getBlockId(par2, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4 + 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 + 1, par3, par4 - 1) == this.blockID &&
				par1World.getBlockId(par2 - 1, par3, par4 + 1) == this.blockID){
			return 13;
		}
		else{
			return 0;
		}
	}

	public Icon getIcon(int par1, int par2)
	{
		if(par2 == 0){
			return par1 == 0 || par1 == 1 ? this.single : this.blockIcon;
		}
		if(par2 == 1){
			return par1 == 0 || par1 == 1 ? this.two : this.blockIcon;
		}
		if(par2 == 2){
			return par1 == 0 || par1 == 1 ? this.line : this.blockIcon;
		}
		if(par2 == 3){
			return par1 == 0 || par1 == 1 ? this.elbow : this.blockIcon;
		}
		if(par2 == 4){
			return par1 == 0 || par1 == 1 ? this.square : this.blockIcon;
		}
		if(par2 == 5){
			return par1 == 0 || par1 == 1 ? this.plus : this.blockIcon;
		}
		if(par2 == 6){
			return par1 == 0 || par1 == 1 ? this.squid : this.blockIcon;
		}
		if(par2 == 7){
			return par1 == 0 || par1 == 1 ? this.protrusion : this.blockIcon;
		}
		if(par2 == 8){
			return par1 == 0 || par1 == 1 ? this.missingCorner : this.blockIcon;
		}
		if(par2 == 9){
			return par1 == 0 || par1 == 1 ? this.diagonals : this.blockIcon;
		}
		if(par2 == 10){
			return par1 == 0 || par1 == 1 ? this.t : this.blockIcon;
		}
		if(par2 == 11){
			return par1 == 0 || par1 == 1 ? this.utah0 : this.blockIcon;
		}
		if(par2 == 12){
			return par1 == 0 || par1 == 1 ? this.utah1 : this.blockIcon;
		}
		if(par2 == 13){
			return par1 == 0 || par1 == 1 ? this.single : this.blockIcon;
		}
		else{
			return par1 == 0 || par1 == 1 ? this.single : this.blockIcon;
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("redRockSide");
		this.single = par1IconRegister.registerIcon("single");
		this.two = par1IconRegister.registerIcon("two");
		this.line = par1IconRegister.registerIcon("line");
		this.elbow = par1IconRegister.registerIcon("elbow");
		this.square = par1IconRegister.registerIcon("square");
		this.plus = par1IconRegister.registerIcon("plus");
		this.squid = par1IconRegister.registerIcon("squid");
		this.protrusion = par1IconRegister.registerIcon("protrusion");
		this.missingCorner = par1IconRegister.registerIcon("missingCorner");
		this.diagonals = par1IconRegister.registerIcon("diagonals");
		this.t = par1IconRegister.registerIcon("t");
		this.utah0 = par1IconRegister.registerIcon("utah0");
		this.utah1 = par1IconRegister.registerIcon("utah1");
		this.edge = par1IconRegister.registerIcon("edge");
	}

}