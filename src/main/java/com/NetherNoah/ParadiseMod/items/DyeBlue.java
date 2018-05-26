package com.NetherNoah.ParadiseMod.items;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DyeBlue extends Item {
	public DyeBlue() {
		setUnlocalizedName("DyeBlue");
		setRegistryName("blue_dye");
		setCreativeTab(CreativeTabs.MISC);
	}
}