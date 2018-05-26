package com.NetherNoah.ParadiseMod.blocks.misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class VoidStone extends Block{
	public VoidStone() { 
		super(Material.ROCK);
		setUnlocalizedName("VoidStone");
		setRegistryName("void_stone");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.STONE);
	}
}