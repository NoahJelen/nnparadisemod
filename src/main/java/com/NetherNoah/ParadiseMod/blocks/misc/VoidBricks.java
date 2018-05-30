package com.NetherNoah.ParadiseMod.blocks.misc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class VoidBricks extends Block{
	public VoidBricks() { 
		super(Material.ROCK);
		setUnlocalizedName("VoidBricks");
		setRegistryName("void_bricks");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.STONE);
	}
}