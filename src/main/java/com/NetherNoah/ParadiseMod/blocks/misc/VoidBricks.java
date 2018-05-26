package com.NetherNoah.ParadiseMod.blocks.misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class VoidBricks extends Block{
	public VoidBricks() { 
		super(Material.ROCK);
		setUnlocalizedName("VoidBricks");
		setRegistryName("void_bricks");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.STONE);
	}
}