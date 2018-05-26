package com.NetherNoah.ParadiseMod.blocks.misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class PolishedVoidStone extends Block{
	public PolishedVoidStone() { 
		super(Material.ROCK);
		setUnlocalizedName("PolishedVoidStone");
		setRegistryName("polished_void_stone");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.STONE);
	}
}