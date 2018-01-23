package com.NetherNoah.ParadiseMod.blocks.misc;

import com.NetherNoah.ParadiseMod.tileentity.TEAntiMobLamp;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SaltLamp extends Block implements ITileEntityProvider{
	public SaltLamp() {
		super(Material.GLASS);
		setUnlocalizedName("SaltLamp");
		setRegistryName("salt_lamp");
		setHardness(.5F);
		setResistance(1F);
		setLightLevel(1F);
		setSoundType(blockSoundType.GLASS);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TEAntiMobLamp();
	}
}