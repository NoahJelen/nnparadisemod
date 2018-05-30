package com.NetherNoah.ParadiseMod.CustomBlockCode;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class planks extends Block
{
    public static final PropertyEnum<planks.EnumType> VARIANT = PropertyEnum.<planks.EnumType>create("variant", planks.EnumType.class);

    public planks()
    {
        super(Material.WOOD);
        setDefaultState(blockState.getBaseState().withProperty(VARIANT, planks.EnumType.CHRISTMAS));
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
    @Override
	public int damageDropped(IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list)
    {
        for (planks.EnumType blockplanks$enumtype : planks.EnumType.values())
        {
            list.add(new ItemStack(itemIn, 1, blockplanks$enumtype.getMetadata()));
        }
    }
    @Override
	public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(VARIANT, planks.EnumType.byMetadata(meta));
    }
    public MapColor getMapColor(IBlockState state)
    {
        return state.getValue(VARIANT).getMapColor();
    }
    @Override
	public int getMetaFromState(IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }
    @Override
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }
    public static enum EnumType implements IStringSerializable
    {
        CHRISTMAS(0, "christmas", MapColor.WOOD);
        private static final planks.EnumType[] META_LOOKUP = new planks.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;
        private final MapColor mapColor;
        private EnumType(int metaIn, String nameIn, MapColor mapColorIn)
        {
            this(metaIn, nameIn, nameIn, mapColorIn);
        }
        private EnumType(int metaIn, String nameIn, String unlocalizedNameIn, MapColor mapColorIn)
        {
            meta = metaIn;
            name = nameIn;
            unlocalizedName = unlocalizedNameIn;
            mapColor = mapColorIn;
        }
        public int getMetadata()
        {
            return meta;
        }
        public MapColor getMapColor()
        {
            return mapColor;
        }
        @Override
		public String toString()
        {
            return name;
        }
        public static planks.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }
            return META_LOOKUP[meta];
        }
        @Override
		public String getName()
        {
            return name;
        }
        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }
        static
        {
            for (planks.EnumType blockplanks$enumtype : values())
            {
                META_LOOKUP[blockplanks$enumtype.getMetadata()] = blockplanks$enumtype;
            }
        }
    }
}