package com.NetherNoah.ParadiseMod.blocks.resourceBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
public class blazeBlock extends Block{
	public blazeBlock() {
		super(Material.IRON);
		setUnlocalizedName("blazeBlock");
		setRegistryName("blaze_block");
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(1F);
	}
	@Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;
    }
}