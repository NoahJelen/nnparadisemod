package com.NetherNoah.ParadiseMod.blocks.trapdoors;

import javax.annotation.Nullable;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyTrapdoor extends BlockTrapDoor {
	public RubyTrapdoor() {
		super(Material.ROCK);
		setUnlocalizedName("RubyTrapdoor");
		setRegistryName("ruby_trapdoor");
		setHardness(5F);
		setResistance(10F);
		setSoundType(blockSoundType.METAL);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 2);
	}
	@Override
	protected void playSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos, boolean p_185731_4_)
    {
        if (p_185731_4_)
        {
            int i = this.blockMaterial == Material.ROCK ? 1037 : 1007;
            worldIn.playEvent(player, i, pos, 0);
        }
        else
        {
            int j = this.blockMaterial == Material.ROCK ? 1036 : 1013;
            worldIn.playEvent(player, j, pos, 0);
        }
    }
}