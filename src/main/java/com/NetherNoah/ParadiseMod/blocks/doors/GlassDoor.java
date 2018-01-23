package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GlassDoor extends BlockDoor {
	public GlassDoor() {
		super(Material.WOOD);
		setUnlocalizedName("GlassDoor");
		setRegistryName("glass_door_block");
		setHardness(.5F);
		setResistance(1F);
		setSoundType(blockSoundType.GLASS);
	}
	// the item is the door itself
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : this.getModItem();
	}
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(this.getModItem());
	}
	private Item getModItem() {
		return ModItems.ItemGlassDoor;
	}
}