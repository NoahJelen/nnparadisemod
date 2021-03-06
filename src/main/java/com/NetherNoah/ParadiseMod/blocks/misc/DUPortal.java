package com.NetherNoah.ParadiseMod.blocks.misc;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.NetherNoah.ParadiseMod.config.ModConfig;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Ores;
import com.NetherNoah.ParadiseMod.world.dimension.DimTeleporter;
import com.NetherNoah.ParadiseMod.world.dimension.DimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class DUPortal extends Block{
	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis> create("axis", EnumFacing.Axis.class, new EnumFacing.Axis[]{EnumFacing.Axis.X, EnumFacing.Axis.Z});
	protected static final AxisAlignedBB X = new AxisAlignedBB(0.0d, 0.0d, 0.375d, 1.0d, 1.0d, 0.625d);
	protected static final AxisAlignedBB Y = new AxisAlignedBB(0.375d, 0.0d, 0.0d, 0.625d, 1.0d, 1.0d);
	protected static final AxisAlignedBB Z = new AxisAlignedBB(0.375d, 0.0d, 0.375d, 0.625d, 1.0d, 0.625d);
	public DUPortal() {
		super(Material.PORTAL);
		setUnlocalizedName("DUPortal");
		setRegistryName("du_portal");
		setDefaultState(blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Z));
		setTickRandomly(true);
		setHardness(0.1F);
		setSoundType(SoundType.GLASS);
		setCreativeTab(CreativeTabs.DECORATIONS);
	}
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,EnumFacing side) {
		IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();        
			if (this == Misc.DUPortal)
	        {
	            if (blockState != iblockstate)
	            {
	                return true;
	            }
	            if (block == this)
	            {
	                return false;
	            }
	        }
			return true;
	}
	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, World world, BlockPos pos) {
		return NULL_AABB;
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	@Override
	@Nullable
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(Misc.DUPortal);
	}
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		
		return FULL_BLOCK_AABB;
	}
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		super.updateTick(worldIn, pos, state, rand);
		
		if(worldIn.provider.isSurfaceWorld() && worldIn.getGameRules().getBoolean("doMobSpawning") && rand.nextInt(2000) < worldIn.getDifficulty().getDifficultyId()) {
			int i = pos.getY();
			BlockPos blockpos;
			for(blockpos = pos; !worldIn.getBlockState(blockpos).isFullCube() && blockpos.getY() > 0; blockpos = blockpos.down()) {
				;
			}
		}
	}
	public static int getMetaForAxis(EnumFacing.Axis axis) {
		return axis == EnumFacing.Axis.X ? 1 : (axis == EnumFacing.Axis.Z ? 2 : 0);
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		return getMetaForAxis(state.getValue(AXIS));
	}
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(AXIS, (meta & 3) == 2 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
	}

	public boolean trySpawnPortal(World worldIn, BlockPos pos) {
		DUPortal.Size blockportal$size = new DUPortal.Size(worldIn, pos, EnumFacing.Axis.X);	
		if(blockportal$size.isValid() && blockportal$size.portalBlockCount == 0) {
			blockportal$size.placePortalBlocks();
			return true;
		}
		else {
			DUPortal.Size blockportal$size1 = new DUPortal.Size(worldIn, pos, EnumFacing.Axis.Z);
			if(blockportal$size1.isValid() && blockportal$size1.portalBlockCount == 0) {
				blockportal$size1.placePortalBlocks();
				return true;
			}
			else {
				return false;
			}
		}
	}
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean p_185477_7_)
    {
    }

	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		EnumFacing.Axis enumfacing$axis = state.getValue(AXIS);
		if(enumfacing$axis == EnumFacing.Axis.X) {
			DUPortal.Size blockportal$size = new DUPortal.Size(worldIn, pos, EnumFacing.Axis.X);
			if(!blockportal$size.isValid() || blockportal$size.portalBlockCount < blockportal$size.width * blockportal$size.height) {
				worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			}
		}
		else if (enumfacing$axis == EnumFacing.Axis.Z) {
			DUPortal.Size blockportal$size = new DUPortal.Size(worldIn, pos, EnumFacing.Axis.Z);
			if(!blockportal$size.isValid() || blockportal$size.portalBlockCount < blockportal$size.width * blockportal$size.height) {
				worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			}
		}
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if(!entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn.isNonBoss()&& entityIn instanceof EntityPlayerMP) {
			EntityPlayerMP thePlayer = (EntityPlayerMP)entityIn;
			
			if(thePlayer.timeUntilPortal > 0) {
				thePlayer.timeUntilPortal = 10;
			}
			else if (thePlayer.dimension != DimensionRegistry.DeepUnderground) {
				thePlayer.timeUntilPortal = 10;
				if (ModConfig.dimensions.DUEnabled)
					thePlayer.changeDimension(DimensionRegistry.DeepUnderground,new DimTeleporter(thePlayer.mcServer.getWorld(DimensionRegistry.DeepUnderground),true));
				else
					thePlayer.sendMessage(new TextComponentString("You disabled the dimension!"));
			}
			else {
				thePlayer.timeUntilPortal = 10;
				thePlayer.changeDimension(0,new DimTeleporter(thePlayer.mcServer.getWorld(0),true));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		
		if(rand.nextInt(100) == 0) {
			worldIn.playSound(pos.getX() + 0.5d, pos.getY() + 0.5d, pos.getZ() + 0.5d, SoundEvents.BLOCK_PORTAL_AMBIENT, SoundCategory.MASTER, 0.5f, rand.nextFloat() * 0.4f + 0.8f, false);
		}
		for(int i = 0; i < 4; ++i) {
			double d0 = pos.getX() + rand.nextFloat();
			double d1 = pos.getY() + rand.nextFloat();
			double d2 = pos.getZ() + rand.nextFloat();
			double d3 = (rand.nextFloat() - 0.5d) * 0.5d;
			double d4 = (rand.nextFloat() - 0.5d) * 0.5d;
			double d5 = (rand.nextFloat() - 0.5d) * 0.5d;
			int j = rand.nextInt(2) * 2 - 1;
			if(worldIn.getBlockState(pos.west()).getBlock() != this && worldIn.getBlockState(pos.east()).getBlock() != this) {
				d0 = pos.getX() + 0.5d + 0.25d * j;
				d3 = rand.nextFloat() * 2.0f * j;
			}
			else {
				d2 = pos.getZ() + 0.5d + 0.25d * j;
				d5 = rand.nextFloat() * 2.0f * j;
			}
			worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
		}
	}
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		switch(rot) {
		case COUNTERCLOCKWISE_90:
		case CLOCKWISE_90:		
			switch(state.getValue(AXIS)) {
			case X:
				return state.withProperty(AXIS, EnumFacing.Axis.Z);
			case Z:
				return state.withProperty(AXIS, EnumFacing.Axis.X);
			default:
				return state;
			}
		default:
			return state;
		}
	}
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {AXIS});
	}
	public static class Size
    {
        private final World world;
        private final EnumFacing.Axis axis;
        private final EnumFacing rightDir;
        private final EnumFacing leftDir;
        private int portalBlockCount;
        private BlockPos bottomLeft;
        private int height;
        private int width;
        public Size(World worldIn, BlockPos position, EnumFacing.Axis axisIn)
        {
            world = worldIn;
            axis = axisIn;
            if (axisIn == EnumFacing.Axis.X)
            {
                leftDir = EnumFacing.EAST;
                rightDir = EnumFacing.WEST;
            }
            else
            {
                leftDir = EnumFacing.NORTH;
                rightDir = EnumFacing.SOUTH;
            }
            for (BlockPos blockpos = position; position.getY() > blockpos.getY() - 21 && position.getY() > 0 && isEmptyBlock(worldIn.getBlockState(position.down()).getBlock()); position = position.down())
            {
                ;
            }
            int i = getDistanceUntilEdge(position, leftDir) - 1;
            if (i >= 0)
            {
                bottomLeft = position.offset(leftDir, i);
                width = getDistanceUntilEdge(bottomLeft, rightDir);
                if (width < 2 || width > 21)
                {
                    bottomLeft = null;
                    width = 0;
                }
            }
            if (bottomLeft != null)
            {
                height = calculatePortalHeight();
            }
        }
        protected int getDistanceUntilEdge(BlockPos position, EnumFacing p_180120_2_)
        {
            int i;

            for (i = 0; i < 22; ++i)
            {
                BlockPos blockpos = position.offset(p_180120_2_, i);

                if (!isEmptyBlock(world.getBlockState(blockpos).getBlock()) || world.getBlockState(blockpos.down()).getBlock() != Blocks.BOOKSHELF)
                {
                    break;
                }
            }
            Block block = world.getBlockState(position.offset(p_180120_2_, i)).getBlock();
            return block == Ores.blazeBlock ? i : 0;
        }
        public int getHeight()
        {
            return height;
        }

        public int getWidth()
        {
            return width;
        }
        protected int calculatePortalHeight()
        {
            label24:
            for (height = 0; height < 21; height++)
            {
                for (int i = 0; i < width; ++i)
                {
                    BlockPos blockpos = bottomLeft.offset(rightDir, i).up(height);
                    Block block = world.getBlockState(blockpos).getBlock();
                    if (!isEmptyBlock(block))
                    {
                        break label24;
                    }
                    if (block == Misc.DUPortal)
                    {
                        portalBlockCount++;
                    }
                    if (i == 0)
                    {
                        block = world.getBlockState(blockpos.offset(leftDir)).getBlock();
                        if (block != Ores.blazeBlock)
                        {
                            break label24;
                        }
                    }
                    else if (i == width - 1)
                    {
                        block = world.getBlockState(blockpos.offset(rightDir)).getBlock();
                        if (block != Ores.blazeBlock)
                        {
                            break label24;
                        }
                    }
                }
            }
            for (int j = 0; j < width; ++j)
            {
                if (world.getBlockState(bottomLeft.offset(rightDir, j).up(height)).getBlock() != Ores.blazeBlock)
                {
                    height = 0;
                    break;
                }
            }
            if (height <= 21 && height >= 3)
            {
                return height;
            }
            else
            {
                bottomLeft = null;
                width = 0;
                height = 0;
                return 0;
            }
        }
        protected boolean isEmptyBlock(Block blockIn)
        {
            return blockIn.getMaterial(blockIn.getDefaultState()) == Material.AIR || blockIn == Blocks.FIRE || blockIn == Misc.DVPortal;
        }
        public boolean isValid()
        {
            return bottomLeft != null && width >= 2 && width <= 21 && height >= 3 && height <= 21;
        }
        public void placePortalBlocks()
        {
            for (int i = 0; i < width; i++)
            {
                BlockPos blockpos = bottomLeft.offset(rightDir, i);
                for (int j = 0; j < height; j++)
                {
                    world.setBlockState(blockpos.up(j), Misc.DUPortal.getDefaultState().withProperty(BlockPortal.AXIS, axis), 2);
                }
            }
        }
    }	
}