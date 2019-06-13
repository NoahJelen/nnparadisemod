package com.NetherNoah.ParadiseMod.blocks.misc;

import java.util.Random;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.Reference;
import com.NetherNoah.ParadiseMod.init.ModBlocks.Misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
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
public class EnderAcid {
	public static void register() {
		FluidRegistry.registerFluid(FluidEnderAcid.instance);
		ForgeRegistries.BLOCKS.register(BlockEnderAcid.instance);
		ModelLoader.setCustomStateMapper(BlockEnderAcid.instance, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation(Reference.MOD_ID + ":" + BlockEnderAcid.name, "fluid");
			}
		});
	}
	public static final class FluidEnderAcid extends Fluid {
		public static final String name = "ender_acid";
		public static final FluidEnderAcid instance = new FluidEnderAcid();
		public FluidEnderAcid() {
			super(name, new ResourceLocation(Reference.MOD_ID + ":" + "blocks/" + name + "_still"),new ResourceLocation(Reference.MOD_ID + ":" + "blocks/" + name + "_flow"));
			setEmptySound(SoundEvents.ITEM_BUCKET_EMPTY);
			setFillSound(SoundEvents.ITEM_BUCKET_FILL);
			setLuminosity(15);
			setDensity(1000);
			setTemperature(300);
			setViscosity(1000);
		}
	}
	public static final class BlockEnderAcid extends BlockFluidClassic {
		public static final BlockEnderAcid instance = new BlockEnderAcid();
		public static final String name = "ender_acid";
		public BlockEnderAcid() {
			super(FluidEnderAcid.instance, Material.WATER);
			setUnlocalizedName(name);
			setRegistryName(name);
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
			if(rand.nextInt(100) == 0) 
                worldIn.playSound(d8, d4, d6, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
            if(rand.nextInt(25)==0)
                worldIn.spawnParticle(EnumParticleTypes.DRAGON_BREATH, d8, d4, d6, 0.0D, 0.0D, 0.0D, new int[0]);
		}
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}
		@Override
		public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {

			//is the entity an item?
			if (entityIn instanceof EntityItem) {
				entityIn.setDead();
				return;
			}
			
			//is the entity a creature?
			if (!(entityIn instanceof EntityLivingBase))
				return;

			EntityLivingBase creature= (EntityLivingBase) entityIn;
			creature.attackEntityFrom(DamageSource.CACTUS, 4F);
			
	    }
	}
}