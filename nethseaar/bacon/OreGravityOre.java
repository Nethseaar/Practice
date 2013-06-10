package nethseaar.bacon;

import java.util.Random;

import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OreGravityOre extends Block {

	public OreGravityOre(int id, int texture, Material material) {
		super(id, material);
		setHardness(10.0F);
		setResistance(20.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(0.5F);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return BaconItems.gravity.itemID;
	}
	public int quantityDropped(Random random){
		return 2;
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.gravityOre");
		}
}
