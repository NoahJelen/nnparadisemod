package com.NetherNoah.ParadiseMod.blocks.misc;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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