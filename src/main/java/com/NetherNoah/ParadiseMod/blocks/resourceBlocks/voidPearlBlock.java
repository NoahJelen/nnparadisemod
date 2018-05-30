package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
public class voidPearlBlock extends Block{
	public voidPearlBlock() {
		super(Material.IRON);
		setUnlocalizedName("voidPearlBlock");
		setRegistryName("void_pearl_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe",0);
	}
	@Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;
    }
}