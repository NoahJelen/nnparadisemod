package com.NetherNoah.ParadiseMod.blocks.base;

import java.util.Random;
import com.NetherNoah.ParadiseMod.init.ModItems.DoorItems;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CustomDoor extends BlockDoor {
	private Item door;
	public CustomDoor(Material material,Item doorItem, SoundType sound) {
		super(material);
		door=doorItem;
		System.out.println(door);
		setSoundType(sound);
	}
	
	//the item is the door itself
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
      //return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : door;
		return door;
    }

	@Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(door);
    }

	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(door);
    }
}