package nethseaar.bacon.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import nethseaar.bacon.tileentities.ContainerCondenser;
import nethseaar.bacon.tileentities.GuiCondenser;
import nethseaar.bacon.tileentities.TileEntityCondenser;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		
		if(tile_entity instanceof TileEntityCondenser){
			return new ContainerCondenser(player.inventory, (TileEntityCondenser) tile_entity);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		
		if(tile_entity instanceof TileEntityCondenser){
			return new GuiCondenser(player.inventory, (TileEntityCondenser) tile_entity);
		}
		
		return null;
	}

}
