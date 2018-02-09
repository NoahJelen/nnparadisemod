package com.NetherNoah.ParadiseMod.items;

import com.NetherNoah.ParadiseMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ConcretePlateItem extends ItemBlock {

	public ConcretePlateItem(Block block) {
		super(ModBlocks.concretePlate);
        setUnlocalizedName("concrete_pressure_plate");
	}

}
