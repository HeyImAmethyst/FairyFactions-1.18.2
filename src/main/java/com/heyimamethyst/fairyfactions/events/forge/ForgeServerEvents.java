package com.heyimamethyst.fairyfactions.events.forge;

import com.heyimamethyst.fairyfactions.FairyFactions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@EventBusSubscriber(modid = FairyFactions.MOD_ID, bus = EventBusSubscriber.Bus.FORGE,value = Dist.DEDICATED_SERVER)
public class ForgeServerEvents
{
	public static Random random = new Random();
	
	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent c) 
	{
		
	}
}
