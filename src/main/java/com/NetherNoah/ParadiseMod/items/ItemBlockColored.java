package com.NetherNoah.ParadiseMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemColored;
import net.minecraft.item.ItemStack;

public class ItemBlockColored extends ItemBlock{
	public ItemBlockColored(Block block) {
		super(block);
	}
	@Override
	public int getMetadata(int damage)
    {
        return damage;
    }
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
    {
			return super.getUnlocalizedName() + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
    }
}