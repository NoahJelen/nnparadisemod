package com.NetherNoah.ParadiseMod.blocks.misc;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class CompressedCactus extends Block{
	public CompressedCactus() {
		super(Material.WOOD);
		setUnlocalizedName("CompressedCactus");
		setRegistryName("compressed_cactus");
		setHardness(2.5F);
		setResistance(5F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.WOOD);
	}
}