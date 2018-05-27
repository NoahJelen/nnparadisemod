package com.NetherNoah.ParadiseMod.blocks.xmas;

import java.util.Random;

import com.NetherNoah.ParadiseMod.ParadiseMod;
import com.NetherNoah.ParadiseMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Present extends Block {
	public Present() {
		super(Material.CLOTH);
		setUnlocalizedName("Present");
		setRegistryName("present");
		setHardness(.01F);
		setResistance(.01F);
		setCreativeTab(ParadiseMod.xmas);
		setSoundType(blockSoundType.PLANT);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int chance = rand.nextInt(58);
		if (chance == 0) {
			return ModItems.emeraldPickaxe;
		}
		if (chance == 1) {
			return ModItems.obsidianPickaxe;
		}
		if (chance == 2) {
			return ModItems.redstonePickaxe;
		}
		if (chance == 3) {
			return ModItems.rubyPickaxe;
		}
		if (chance == 4) {
			return ModItems.emeraldAxe;
		}
		if (chance == 5) {
			return ModItems.obsidianAxe;
		}
		if (chance == 6) {
			return ModItems.redstoneAxe;
		}
		if (chance == 7) {
			return ModItems.rubyAxe;
		}
		if (chance == 8) {
			return ModItems.emeraldSword;
		}
		if (chance == 9) {
			return ModItems.obsidianSword;
		}
		if (chance == 10) {
			return ModItems.rubySword;
		}
		if (chance == 11) {
			return ModItems.emeraldSpade;
		}
		if (chance == 12) {
			return ModItems.obsidianSpade;
		}
		if (chance == 13) {
			return ModItems.redstoneSpade;
		}
		if (chance == 14) {
			return ModItems.rubySpade;
		}
		if (chance == 15) {
			return ModItems.emeraldHoe;
		}
		if (chance == 16) {
			return ModItems.obsidianHoe;
		}
		if (chance == 17) {
			return ModItems.redstoneHoe;
		}
		if (chance == 18) {
			return ModItems.rubyHoe;
		}
		if (chance == 19) {
			return Items.DIAMOND_AXE;
		}
		if (chance == 20) {
			return Items.DIAMOND_HOE;
		}
		if (chance == 21) {
			return Items.DIAMOND_SHOVEL;
		}
		if (chance == 22) {
			return Items.DIAMOND_PICKAXE;
		}
		if (chance == 23) {
			return Items.DIAMOND_SWORD;
		}
		if (chance == 24) {
			return Items.IRON_AXE;
		}
		if (chance == 25) {
			return Items.IRON_HOE;
		}
		if (chance == 26) {
			return Items.IRON_SHOVEL;
		}
		if (chance == 27) {
			return Items.IRON_PICKAXE;
		}
		if (chance == 28) {
			return Items.IRON_SWORD;
		}
		if (chance == 29) {
			return ModItems.emeraldHelmet;
		}
		if (chance == 30) {
			return ModItems.emeraldChestplate;
		}
		if (chance == 31) {
			return ModItems.emeraldLeggings;
		}
		if (chance == 32) {
			return ModItems.emeraldBoots;
		}
		if (chance == 33) {
			return ModItems.rubyHelmet;
		}
		if (chance == 34) {
			return ModItems.rubyChestplate;
		}
		if (chance == 35) {
			return ModItems.rubyLeggings;
		}
		if (chance == 36) {
			return ModItems.rubyBoots;
		}
		if (chance == 37) {
			return ModItems.obsidianHelmet;
		}
		if (chance == 38) {
			return ModItems.obsidianChestplate;
		}
		if (chance == 39) {
			return ModItems.obsidianLeggings;
		}
		if (chance == 40) {
			return ModItems.obsidianBoots;
		}
		if (chance == 41) {
			return ModItems.redstoneHelmet;
		}
		if (chance == 42) {
			return ModItems.redstoneChestplate;
		}
		if (chance == 43) {
			return ModItems.redstoneLeggings;
		}
		if (chance == 44) {
			return ModItems.redstoneBoots;
		}
		if (chance == 45) {
			return Items.IRON_HELMET;
		}
		if (chance == 46) {
			return Items.IRON_CHESTPLATE;
		}
		if (chance == 47) {
			return Items.IRON_LEGGINGS;
		}
		if (chance == 48) {
			return Items.IRON_BOOTS;
		}
		if (chance == 49) {
			return Items.DIAMOND_HELMET;
		}
		if (chance == 50) {
			return Items.DIAMOND_CHESTPLATE;
		}
		if (chance == 51) {
			return Items.DIAMOND_LEGGINGS;
		}
		if (chance == 52) {
			return Items.DIAMOND_BOOTS;
		}
		if (chance == 53) {
			return Items.DIAMOND;
		}
		if (chance == 54) {
			return Items.EMERALD;
		}
		if (chance == 55) {
			return Items.GOLD_INGOT;
		}
		if (chance == 56) {
			return Items.IRON_INGOT;
		}
		if (chance == 57) {
			return ModItems.Ruby;
		}
		return Items.REDSTONE;
	}
}