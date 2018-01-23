package com.NetherNoah.ParadiseMod.blocks.buttons;

import javax.annotation.Nullable;

import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.QuickButton;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SilverButton extends QuickButton{
	public SilverButton() {
		super(false);
		setUnlocalizedName("SilverButton");
		setRegistryName("silver_button");
		setHardness(0.5F);
		setSoundType(blockSoundType.METAL);
	}
	@Override
	protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos) {
		worldIn.playSound(player, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
	}
	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {
		worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F,
				0.5F);
	}
}