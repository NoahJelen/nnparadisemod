package com.NetherNoah.ParadiseMod.blocks.misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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