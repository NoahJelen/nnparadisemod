package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class blazeBlock extends Block{
	public blazeBlock() {
		super(Material.IRON);
		setUnlocalizedName("blazeBlock");
		setRegistryName("blaze_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(1F);
	}
}