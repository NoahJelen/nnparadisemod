package com.NetherNoah.ParadiseMod.blocks.misc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class VoidStone extends Block{
	public VoidStone() { 
		super(Material.ROCK);
		setUnlocalizedName("VoidStone");
		setRegistryName("void_stone");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.STONE);
	}
}