package com.NetherNoah.ParadiseMod.blocks.xmas;

import java.util.Random;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.world.worldgen.misc.ChristmasTree;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChristmasSapling extends BlockBush implements IGrowable
{
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
    public ChristmasSapling()
    {
        setDefaultState(blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
        setCreativeTab(CreativeTabs.DECORATIONS);
		setUnlocalizedName("ChristmasSapling");
		setRegistryName("christmas_sapling");
		setLightLevel(1F);
		setSoundType(SoundType.PLANT);
		if (!ModConfig.HideXmasFeatures)
			setCreativeTab(ParadiseMod.xmas);
    }
    @Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SAPLING_AABB;
    }
    @Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);
            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
                grow(worldIn, pos, state, rand);
        }
    }
    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (state.getValue(STAGE).intValue() == 0)
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        else
            generateTree(worldIn, pos, state, rand);
    }
    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        WorldGenerator worldgenerator = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
        int i = 0;
        int j = 0;
        boolean flag = false;
        tree:
        for (i = 0; i >= -1; --i){
        	for (j = 0; j >= -1; --j){
        		if (isTwoByTwoOfType(worldIn, pos, i, j)){
        			worldgenerator = new ChristmasTree(true);
                    flag = true;
                    break tree;
                }
        	}
        }
        if (!flag){
        	i = 0;
        	j = 0;
        	worldgenerator = new ChristmasTree(true);
        }
        IBlockState iblockstate2 = Blocks.AIR.getDefaultState();
        if (flag)
        {
            worldIn.setBlockState(pos.add(i, 0, j), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i, 0, j + 1), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate2, 4);
        }
        else
            worldIn.setBlockState(pos, iblockstate2, 4);
        if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j)))
        {
            if (flag)
            {
                worldIn.setBlockState(pos.add(i, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
            }
            else
                worldIn.setBlockState(pos, state, 4);
        }
    }
    private boolean isTwoByTwoOfType(World worldIn, BlockPos pos, int x, int z)
    {
        return isTypeAt(worldIn, pos.add(x, 0, z))
        	&& isTypeAt(worldIn, pos.add(x + 1, 0, z))
        	&& isTypeAt(worldIn, pos.add(x, 0, z + 1))
        	&& isTypeAt(worldIn, pos.add(x + 1, 0, z + 1));
    }
    public boolean isTypeAt(World worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        return iblockstate.getBlock() == this;
    }
    @Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }
    @Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return worldIn.rand.nextFloat() < 0.45D;
    }
    @Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        grow(worldIn, pos, state, rand);
    }
    @Override
	public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }
    @Override
	public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | state.getValue(STAGE).intValue() << 3;
        return i;
    }
    @Override
	protected BlockStateContainer createBlockState()
    {
    	return new BlockStateContainer(this, new IProperty[] {STAGE});
    }
}