package nethseaar.bacon.client;

import net.minecraftforge.client.MinecraftForgeClient;
import nethseaar.bacon.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }

        
}