package nethseaar.bacon;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderBacon extends WorldProvider
{
	 public String getDimensionName() 
	 {
	  return "BACON";
	 }
	 
	 public boolean canRespawnHere()
	 {
	  return true;
	 }
	 
	 public void registerWorldChunkManager()
	 {
	  this.worldChunkMgr = new WorldChunkManagerHell(Bacon.baconBiome, 0.8F, 0.1F);
	  this.dimensionId = 17;
	 }
	 
	 @Override
	 public IChunkProvider createChunkGenerator()
	 {
	  return new ChunkProviderBacon(worldObj, worldObj.getSeed(), true);
	 }
	 
	}
