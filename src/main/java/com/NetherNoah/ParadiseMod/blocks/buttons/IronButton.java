package com.NetherNoah.ParadiseMod.blocks.buttons;

import javax.annotation.Nullable;

import com.NetherNoah.ParadiseMod.CustomBlockCode.buttonTicks.IronButtonTicks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IronButton extends IronButtonTicks {
	public IronButton() {
		super(true);
		setUnlocalizedName("IronButton");
		setRegistryName("iron_button");
		setHardness(0.5F);
		setSoundType(blockSoundType.METAL);
	}
	protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos) {
		worldIn.playSound(player, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
	}
	protected void playReleaseSound(World worldIn, BlockPos pos) {
		worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F,
				0.5F);
	}
}