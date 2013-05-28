package nethseaar.bacon;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class OreBacon extends BlockOre {
        public OreBacon(int id, int texture, Material material) {
                super(id);
        }
        
        public void BlockOre(int i, String string) {
			// TODO Auto-generated constructor stub
		}

		public String getTextureFile () {
                return CommonProxy.BLOCK_PNG;
        }
}