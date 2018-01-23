package com.NetherNoah.ParadiseMod.blocks.redstone;

import com.NetherNoah.ParadiseMod.tileentity.TileEntitySilverHopper;

import net.minecraft.block.BlockHopper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SilverHopper extends BlockHopper {
	public SilverHopper() {
		super();
		setUnlocalizedName("SilverHopper");
		setRegistryName("silver_hopper");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setSoundType(blockSoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntitySilverHopper();
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof TileEntityHopper)
            {
                playerIn.displayGUIChest((TileEntityHopper)tileentity);
                playerIn.addStat(StatList.HOPPER_INSPECTED);
            }
            return true;
        }
    }
}