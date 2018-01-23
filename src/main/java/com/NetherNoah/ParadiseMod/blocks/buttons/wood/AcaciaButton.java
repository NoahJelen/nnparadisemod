package com.NetherNoah.ParadiseMod.blocks.buttons.wood;

import com.NetherNoah.ParadiseMod.Reference;

import net.minecraft.block.BlockButtonWood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AcaciaButton  extends BlockButtonWood  {
	public AcaciaButton() {
		setUnlocalizedName("AcaciaButton");
		setRegistryName("acacia_button");
		setHardness(0.5F);
		setSoundType(blockSoundType.WOOD);
	}
}