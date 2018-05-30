package com.NetherNoah.ParadiseMod.CustomBlockCode.pressurePlates;

import java.util.List;

import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BedrockPlateCode extends BlockBasePressurePlate
{
    public static final PropertyBool POWERED = PropertyBool.create("powered");
    private final BedrockPlateCode.Sensitivity sensitivity;
    protected BedrockPlateCode(Material materialIn, BedrockPlateCode.Sensitivity sensitivityIn)
    {
        super(materialIn);
        setDefaultState(blockState.getBaseState().withProperty(POWERED, Boolean.valueOf(false)));
        sensitivity = sensitivityIn;
    }
    @Override
	protected int getRedstoneStrength(IBlockState state)
    {
        return state.getValue(POWERED).booleanValue() ? 15 : 0;
    }
    @Override
	protected IBlockState setRedstoneStrength(IBlockState state, int strength)
    {
        return state.withProperty(POWERED, Boolean.valueOf(strength > 0));
    }
    @Override
	protected void playClickOnSound(World worldIn, BlockPos color)
    {
        if (blockMaterial == Material.WOOD)
        {
            worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.8F);
        }
        else
        {
            worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
        }
    }
    @Override
	protected void playClickOffSound(World worldIn, BlockPos pos)
    {
        if (blockMaterial == Material.WOOD)
        {
            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.7F);
        }
        else
        {
            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
        }
    }
    @Override
	protected int computeRedstoneStrength(World worldIn, BlockPos pos)
    {
        AxisAlignedBB axisalignedbb = PRESSURE_AABB.offset(pos);
        List <? extends Entity > list;
        switch (sensitivity)
        {
        	case PLAYER:
        		list = worldIn.<Entity>getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
        		break;
            case EVERYTHING:
                list = worldIn.getEntitiesWithinAABBExcludingEntity((Entity)null, axisalignedbb);
                break;
            case MOBS:
                list = worldIn.<Entity>getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
                break;
            default:
                return 0;
        }
        if (!list.isEmpty())
        {
            for (Entity entity : list)
            {
                if (!entity.doesEntityNotTriggerPressurePlate())
                {
                    return 15;
                }
            }
        }
        return 0;
    }
    @Override
	public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(POWERED, Boolean.valueOf(meta == 1));
    }
    @Override
	public int getMetaFromState(IBlockState state)
    {
        return state.getValue(POWERED).booleanValue() ? 1 : 0;
    }
    @Override
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {POWERED});
    }
    public static enum Sensitivity
    {
    	PLAYER,
        EVERYTHING,
        MOBS;
    }
}