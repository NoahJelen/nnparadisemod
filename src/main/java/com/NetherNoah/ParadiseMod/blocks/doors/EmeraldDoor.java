package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EmeraldDoor extends BlockDoor {
	public EmeraldDoor() {
		super(Material.WOOD);
		setUnlocalizedName("EmeraldDoor");
		setRegistryName("emerald_door_block");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
	}
	private int getCloseSound()
    {
        return this.blockMaterial == Material.WOOD ? 1011 : 1012;
    }
    private int getOpenSound()
    {
        return this.blockMaterial == Material.WOOD ? 1005 : 1006;
    }
	// the item is the door itself
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : DoorItems.ItemEmeraldDoor;
	}
}