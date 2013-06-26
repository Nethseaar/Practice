package nethseaar.bacon.dimension;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import nethseaar.bacon.BaconBlocks;

public class BiomeGenBacon extends BiomeGenBase{
	
	public BiomeGenBacon(int par1)
	{
	super(par1);
	this.minHeight = 0.1F;
	this.maxHeight = 0.6F;
	this.spawnableMonsterList.clear();
	this.spawnableCreatureList.clear();
	this.topBlock = ((byte)BaconBlocks.darkstone.blockID);
	this.fillerBlock = ((byte)BaconBlocks.darkstone.blockID);
	this.setBiomeName("Aksellesh");

	/** this changes the water colour, its set to red now but ggole the java colours **/
	this.waterColorMultiplier = 0xE42D17;
	}

}
