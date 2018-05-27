package com.NetherNoah.ParadiseMod.blocks.misc;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class Stonecutter extends Block{
	public Stonecutter() {
		super(Material.WOOD);
		setUnlocalizedName("Stonecutter");
		setRegistryName("stonecutter");
		setHardness(5F);
		setResistance(5.8333333333F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setSoundType(blockSoundType.STONE);
	}
}