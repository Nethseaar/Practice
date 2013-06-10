package nethseaar.bacon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

public class EntityCrackedDeathstone extends EntityTNTPrimed{

	public EntityCrackedDeathstone(World par1World) {
		super(par1World);
		this.fuse = 20;
	}
}
