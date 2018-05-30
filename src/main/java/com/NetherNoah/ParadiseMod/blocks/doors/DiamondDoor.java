package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DiamondDoor extends BlockDoor {
	public DiamondDoor() {
		super(Material.IRON);
		setUnlocalizedName("DiamondDoor");
		setRegistryName("diamond_door_block");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
	}
	// the item is the door itself
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : DoorItems.ItemDiamondDoor;
	}
}