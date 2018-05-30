//this class is based off of Xalcon's TorchMaster mod
//https://github.com/Xalcon/TorchMaster
package com.NetherNoah.ParadiseMod.tileentity.SaltLamp;

import java.util.ArrayList;
import java.util.List;

import com.NetherNoah.ParadiseMod.init.ModBlocks.Lamps;

import akka.japi.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SaltLampRegistry {
	
	private static SaltLampRegistry LampRegistry;
	private final String name;
	private Predicate<IBlockState> blockValidator;
	private final List<LampLocation> LampsL = new ArrayList<LampLocation>();
	private int LampRange=512;
	private int LampRangeSq=LampRange^2;
	
	public static SaltLampRegistry getLampRegistry() { return LampRegistry; }
	static {
		LampRegistry = new SaltLampRegistry("salt_lamp", s -> s.getBlock() == Lamps.getSaltLamp());
	}
	public SaltLampRegistry(String name, Predicate<IBlockState> blockValidator)
	{
		this.name = name;
		this.blockValidator = blockValidator;
	}
	
	public boolean isInRangeOfLamp(World world, BlockPos pos)
	{
		int dim = world.provider.getDimension();
		for(LampLocation Lamp : LampsL)
		{
			if(Lamp.DimensionId != dim) continue;
			double dx = Lamp.Position.getX() + 0.5 - pos.getX();
			double dy = Math.abs(Lamp.Position.getY() + 0.5 - pos.getY());
			double dz = Lamp.Position.getZ() + 0.5 - pos.getZ();
			/*/
			System.out.println(dx);
			System.out.println(dy);
			System.out.println(dz);
			System.out.println(" ");
			/*/
			if((dx * dx + dz * dz) <= (this.LampRangeSq) && dy <= this.LampRange)
				return true;
		}
		return false;
	}
	
	private class LampLocation
	{
		public int DimensionId;
		public BlockPos Position;

		public LampLocation(int dimensionId, BlockPos position)
		{
			DimensionId = dimensionId;
			Position = position;
		}

		public LampLocation(NBTTagCompound entry)
		{
			this.DimensionId = entry.getInteger("d");
			this.Position = new BlockPos(entry.getInteger("x"), entry.getInteger("y"), entry.getInteger("z"));
		}

		@Override
		public boolean equals(Object o)
		{
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			LampLocation that = (LampLocation) o;

			if (DimensionId != that.DimensionId) return false;
			return Position != null ? Position.equals(that.Position) : that.Position == null;
		}

		@Override
		public int hashCode()
		{
			int result = DimensionId;
			result = 31 * result + (Position != null ? Position.hashCode() : 0);
			return result;
		}

		public NBTTagCompound toNbt()
		{
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("d", this.DimensionId);
			nbt.setInteger("x", this.Position.getX());
			nbt.setInteger("y", this.Position.getY());
			nbt.setInteger("z", this.Position.getZ());
			return nbt;
		}

		@Override
		public String toString()
		{
			return String.format("DIM: %d - %s", this.DimensionId, this.Position);
		}
	}
}
