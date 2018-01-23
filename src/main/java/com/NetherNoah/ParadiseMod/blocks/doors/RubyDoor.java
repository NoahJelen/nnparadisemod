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

public class RubyDoor extends BlockDoor {
	public RubyDoor() {
		super(Material.WOOD);
		setUnlocalizedName("RubyDoor");
		setRegistryName("ruby_door_block");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(blockSoundType.METAL);
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
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : this.getModItem();
	}
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(this.getModItem());
	}
	private Item getModItem() {
		return ModItems.ItemRubyDoor;
	}
}