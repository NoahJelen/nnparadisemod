//this was derived from the vanilla code
package com.NetherNoah.ParadiseMod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.IHopper;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;

public class TileEntitySilverHopper extends TileEntityHopper {
	//speed up movement
	public static boolean pullItemFromSlot(IHopper hopper, IInventory inventoryIn, int index, EnumFacing direction)
    {
        ItemStack itemstack = inventoryIn.getStackInSlot(index);
        if (!itemstack.isEmpty() && canExtractItemFromSlot(inventoryIn, itemstack, index, direction))
        {
            ItemStack itemstack1 = itemstack.copy();
            ItemStack itemstack2 = putStackInInventoryAllSlots(inventoryIn, hopper, inventoryIn.decrStackSize(index, 32), (EnumFacing)null);
            if (itemstack2.isEmpty())
            {
                inventoryIn.markDirty();
                return true;
            }
            inventoryIn.setInventorySlotContents(index, itemstack1);
        }
        return false;
    }
	//extract a whole item stack from the last hopper
    public static boolean canExtractItemFromSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side)
    {
        return !(inventoryIn instanceof ISidedInventory) || ((ISidedInventory)inventoryIn).canExtractItem(index, stack, side);
    }
    @Override
    public ItemStack decrStackSize(int index, int count)
    {
        fillWithLoot((EntityPlayer)null);
        ItemStack itemstack = ItemStackHelper.getAndSplit(getItems(), index, 64);
        return itemstack;
    }
}