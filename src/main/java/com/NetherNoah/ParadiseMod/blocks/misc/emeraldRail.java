package com.NetherNoah.ParadiseMod.blocks.misc;

import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase.EnumRailDirection;
import net.minecraft.block.properties.IProperty;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class emeraldRail extends BlockRail {
	public emeraldRail() {
		setUnlocalizedName("emeraldRail");
		setRegistryName("emerald_rail");
		setSoundType(blockSoundType.METAL);
	}
	@Override
    public float getRailMaxSpeed(World world, EntityMinecart cart, BlockPos pos) {
        return super.getRailMaxSpeed(world, cart, pos) * 3;
    }
}