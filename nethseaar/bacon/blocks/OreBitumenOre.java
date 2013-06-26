package nethseaar.bacon.blocks;

import java.util.Random;

import nethseaar.bacon.BaconItems;
import nethseaar.bacon.CommonProxy;
import nethseaar.bacon.Bacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OreBitumenOre extends Block {

	public OreBitumenOre(int id, int texture, Material material) {
		super(id, material);
		setHardness(3.0F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(Bacon.tabInert);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return BaconItems.bitumenChunk.itemID;
	}
	public int quantityDropped(Random random){
		return 1;
	}
	
	public void updateIcons(IconRegister par1iconregister){
		this.blockIcon = par1iconregister.registerIcon("Bacon.bitumenOre");
		}
}
