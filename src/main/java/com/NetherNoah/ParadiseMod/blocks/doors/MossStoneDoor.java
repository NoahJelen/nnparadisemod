package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

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
      return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : DoorItems.ItemMossStoneDoor;
    }
}