package nethseaar.bacon;

import java.util.Random;

import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OreLethargyOre extends Block {

	public OreLethargyOre(int id, int texture, Material material) {
		super(id, material);
		setHardness(8.0F);
		setResistance(15.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(1.0F);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Bacon.lethargy.itemID;
	}
	public int quantityDropped(Random random){
		return 2;
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.lethargyOre");
		}
}