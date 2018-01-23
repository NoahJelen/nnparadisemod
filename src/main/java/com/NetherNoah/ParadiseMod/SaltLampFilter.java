//this class is based off of Xalcon's TorchMaster mod
//https://github.com/Xalcon/TorchMaster
package com.NetherNoah.ParadiseMod;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.entity.Entity;

public class SaltLampFilter {

	private static Set<Class<?>> registry = new HashSet<>();
	
	public static boolean containsEntity(Entity entity)
	{
		return containsEntity(entity.getClass());
	}

	public static boolean containsEntity(Class<?> entityClass)
	{
		return registry.contains(entityClass);
	}

}
