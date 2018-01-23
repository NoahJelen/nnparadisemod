//based off of the source code from the Portable Craft Bench mod by RenEvo
//https://github.com/renevo/pcb
package com.NetherNoah.ParadiseMod.handlers;
import com.NetherNoah.ParadiseMod.GUI.ContainerCustomCraftBench;
import com.NetherNoah.ParadiseMod.GUI.CustomCraftBenchGui;

//based off of the source code from the Portable Craft Bench mod by RenEvo
//https://github.com/renevo/pcb
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CustomCraftBenchGuiHandler implements IGuiHandler {
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	id=0;
        return new CustomCraftBenchGui(player.inventory, world, new BlockPos(x, y, z));
    }
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	id=0;
        return new ContainerCustomCraftBench(player.inventory, world, new BlockPos(x, y, z));
    }
}