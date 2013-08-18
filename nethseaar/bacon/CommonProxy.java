package nethseaar.bacon;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import nethseaar.bacon.Bacon;
import nethseaar.bacon.renderer.RenderFallingAscender;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
        public static String ITEMS_PNG = "/nethseaar/bacon/textures/items/item.png";
        public static String BLOCK_PNG = "/nethseaar/bacon/textures/blocks/block.png";

     
        
        public void registerRenderers() {
        	   RenderingRegistry.registerEntityRenderingHandler(Entity.class, new RenderFallingAscender());
        }
}