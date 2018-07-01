//this was derived from the vanilla code
package com.NetherNoah.ParadiseMod.tileentity.hopper;

import com.NetherNoah.ParadiseMod.blocks.redstone.SilverHopper;

import net.minecraft.block.BlockHopper;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;

public class TileEntitySilverHopper extends TileEntityHopper {
    private int transferCooldown = -1;
    private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(5, ItemStack.EMPTY);
    
    @Override
    public void setTransferCooldown(int ticks)
    {
        this.transferCooldown = ticks/2;
    }
}