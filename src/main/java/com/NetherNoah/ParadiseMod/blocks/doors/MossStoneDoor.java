package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class MossStoneDoor extends BlockDoor {
	public MossStoneDoor() {
		super(Material.IRON);
		setUnlocalizedName("MossStoneDoor");
		setRegistryName("moss_stone_door_block");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
	}
	//the item is the door itself
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
      return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR :DoorItems.MossStoneDoor;
    }
	
	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(DoorItems.MossStoneDoor);
    }
}