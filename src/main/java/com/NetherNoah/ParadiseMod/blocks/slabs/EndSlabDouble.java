//this class is based off of CJMinecraft's example mod
//https://github.com/CJMinecraft01/BitOfEverything
package com.NetherNoah.ParadiseMod.blocks.slabs;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Slabs;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EndSlabDouble extends EndSlab {

	public EndSlabDouble() {
		super("double_end_slab");
	}

	@Override
	public boolean isDouble() {
		return true;
	}
	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Slabs.end_slab);
    }

}