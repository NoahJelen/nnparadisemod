package com.NetherNoah.ParadiseMod.blocks.chests;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.tileentity.TileEntityCactusChest;

import net.minecraft.block.BlockChest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CactusChestTrapped extends BlockChest {
	public CactusChestTrapped(){
		super(BlockChest.Type.TRAP);
		setUnlocalizedName("CactusChestTrapped");
		setRegistryName("cactus_chest_trapped");
		setHardness(.5F);
		setResistance(1F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(blockSoundType.CLOTH);
	}
	@Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCactusChest();
    }
}