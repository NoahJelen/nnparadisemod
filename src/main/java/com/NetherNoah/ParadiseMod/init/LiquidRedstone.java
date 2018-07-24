package com.NetherNoah.ParadiseMod.init;

import java.util.Random;

import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
public class LiquidRedstone {
	private static ModelResourceLocation lr_location = new ModelResourceLocation(Reference.MOD_ID + ":" + BlockLiquidRedstone.name, "fluid");
	public static void register() {
		FluidRegistry.registerFluid(FluidLiquidRedstone.instance);
		ForgeRegistries.BLOCKS.register(BlockLiquidRedstone.instance);
		ModelLoader.setCustomStateMapper(BlockLiquidRedstone.instance, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return lr_location;
			}
		});
	}
	public static final class FluidLiquidRedstone extends Fluid {
		public static final String name = "liquid_redstone";
		public static final FluidLiquidRedstone instance = new FluidLiquidRedstone();
		public FluidLiquidRedstone() {
			super(name, new ResourceLocation(Reference.MOD_ID + ":" + "blocks/" + name + "_still"),new ResourceLocation(Reference.MOD_ID + ":" + "blocks/" + name + "_flow"));
			setEmptySound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA);
			setFillSound(SoundEvents.ITEM_BUCKET_FILL_LAVA);
			setLuminosity(15);
			setDensity(3000);
			setTemperature(1300);
			setViscosity(6000);
		}
	}
	public static final class BlockLiquidRedstone extends BlockFluidClassic {
		public static final BlockLiquidRedstone instance = new BlockLiquidRedstone();
		public static final String name = "liquid_redstone";
		public BlockLiquidRedstone() {
			super(FluidLiquidRedstone.instance, Material.LAVA);
			setUnlocalizedName(name);
			setRegistryName(name);
			setLightLevel(1F);
			setResistance(500F);
		}
		@Override
		public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
			double d0 = pos.getX();
	        double d1 = pos.getY();
	        double d2 = pos.getZ();
            double d8 = d0 + rand.nextFloat();
            double d4 = d1 + stateIn.getBoundingBox(worldIn, pos).maxY;
            double d6 = d2 + rand.nextFloat();
			if(rand.nextInt(100) == 0) {
                worldIn.spawnParticle(EnumParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.playSound(d8, d4, d6, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
            }
            if (rand.nextInt(200) == 0)
                worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
		}
		
		// this is a rs power block!
		@Override
		public int getWeakPower(IBlockState state, IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
			return 15;
		}
		@Override
		public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
			return true;
		}
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}
		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn,BlockPos neighborPos) {
			super.neighborChanged(state, worldIn, pos, blockIn, neighborPos);
			checkForMixing(worldIn, pos, state);
		}
		public boolean checkForMixing(World worldIn, BlockPos pos, IBlockState state) {
			if (this.blockMaterial == Material.LAVA) {
				boolean flag = false;
				for (EnumFacing enumfacing : EnumFacing.values()) {
					if (enumfacing != EnumFacing.DOWN && worldIn.getBlockState(pos.offset(enumfacing)).getMaterial() == Material.WATER) {
						flag = true;
						break;
					}
				}
				if (flag) {
					Integer integer = state.getValue(LEVEL);
					if (integer.intValue() == 0) {
						worldIn.setBlockState(pos, Misc.glowingObsidian.getDefaultState());
						this.triggerMixEffects(worldIn, pos);
						return true;
					}
					if (integer.intValue() <= 4) {
						worldIn.setBlockState(pos, Blocks.REDSTONE_BLOCK.getDefaultState());
						this.triggerMixEffects(worldIn, pos);
						return true;
					}
				}
			}
			return false;
		}
		protected void triggerMixEffects(World worldIn, BlockPos pos) {
			double d0 = pos.getX();
			double d1 = pos.getY();
			double d2 = pos.getZ();
			worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 0.5F,
					2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
			for (int i = 0; i < 8; ++i) {
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(),0.0D, 0.0D, 0.0D, new int[0]);
			}
		}
	}
}