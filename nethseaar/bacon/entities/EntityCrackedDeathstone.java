package nethseaar.bacon.entities;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

public class EntityCrackedDeathstone extends EntityTNTPrimed{

	public EntityCrackedDeathstone(World par1World) {
		super(par1World);
		this.fuse = 20;
	}

	 public EntityCrackedDeathstone(World par1World, double par2, double par4, double par6, EntityLiving par8EntityLiving)
    {
        this(par1World);
        this.setPosition(par2, par4, par6);
        float f = (float)(Math.random() * Math.PI * 2.0D);
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.20000000298023224D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.fuse = 20;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
    }
}
