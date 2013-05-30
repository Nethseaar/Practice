package nethseaar.bacon;

import java.util.Random;

import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OreDarknessOre extends Block {

	public OreDarknessOre(int id, int texture, Material material) {
		super(id, material);
		setHardness(3.0F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Bacon.darkness.itemID;
	}
	public int quantityDropped(Random random){
		return 4;
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.darknessOre");
		}
}