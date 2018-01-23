package com.NetherNoah.ParadiseMod.blocks.crystals;

import java.util.Random;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class redstoneCrystal extends BlockBush {
	public redstoneCrystal() {
		setUnlocalizedName("redstoneCrystal");
		setRegistryName("redstone_crystal");
		setHardness(.5F);
		setResistance(1F);
		setLightLevel(1F);
		setSoundType(blockSoundType.GLASS);
	}
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
		return state.getBlock() != Blocks.AIR;
    }
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(ModBlocks.redstoneCrystal);
    }
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	//this is a rs power block!
	@Override
	public int getWeakPower(IBlockState state, IBlockAccess worldIn, BlockPos pos,  EnumFacing side){
	    return 15;
	}
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;

	}
	//get item to drop
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.REDSTONE;
    }
    //get amount of items to drop
    public int quantityDropped(Random random)
    {
		Random rand = new Random();
		int giveItem = rand.nextInt(4) + 1;
        return giveItem;
    }
    //is the pick enchanted with fortune?
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
    //spawn the item in the world
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    //spawn xp orbs
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;
            i = MathHelper.getInt(rand, 0, 5);
            return i;
        }
        return 0;
    }
    //spawn the actual item
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Items.REDSTONE);
    }
}