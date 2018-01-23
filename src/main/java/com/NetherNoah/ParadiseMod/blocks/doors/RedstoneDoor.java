package com.NetherNoah.ParadiseMod.blocks.doors;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.CustomBlockCode.RSDoor;
import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RedstoneDoor extends RSDoor {
	public RedstoneDoor() {
		super(Material.WOOD);
		setUnlocalizedName("RedstoneDoor");
		setRegistryName("redstone_door_block");
		setHardness(5F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(blockSoundType.METAL);
	}
	public int getCloseSound()
    {
        return this.blockMaterial == Material.WOOD ? 1011 : 1012;
    }
    private int getOpenSound()
    {
        return this.blockMaterial == Material.WOOD ? 1005 : 1006;
    }
	//this door is a rs power block!
	@Override
	public int getWeakPower(IBlockState state, IBlockAccess worldIn, BlockPos pos,  EnumFacing side){
	    return 15;
	}
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}
	//the item is the door itself
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
      return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : this.getModItem();
    }
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getModItem());
    }
    private Item getModItem()
    {
        return ModItems.ItemRedstoneDoor;
    }
}