
//this class is based off of Xalcon's TorchMaster mod
//https://github.com/Xalcon/TorchMaster
package com.NetherNoah.ParadiseMod.handlers;

import com.NetherNoah.ParadiseMod.tileentity.SaltLamp.SaltLampFilter;
import com.NetherNoah.ParadiseMod.tileentity.SaltLamp.SaltLampRegistry;

import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
public class AntiMobLampHandler {
	@SubscribeEvent
	public void onEntityCheckSpawn(LivingSpawnEvent.CheckSpawn event)
	{
		//if(event.getResult() == Event.Result.ALLOW) return;

		if(SaltLampFilter.containsEntity(event.getEntity()))
		{
			if(SaltLampRegistry.getLampRegistry().isInRangeOfLamp(event.getWorld(), event.getEntity().getPosition()))
			{
				event.setResult(Event.Result.DENY);
			}
		}
	}
}