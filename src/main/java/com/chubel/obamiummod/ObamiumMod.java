package com.chubel.obamiummod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.chubel.obamiummod.init.ModBlocks;
import com.chubel.obamiummod.init.ModEntities;
import com.chubel.obamiummod.init.ModItems;
import com.chubel.obamiummod.init.ModSoundsEvents;

@Mod(ObamiumMod.MODID)
public class ObamiumMod {
	public static final String MODID = "obamiummod";

	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public ObamiumMod() {
		LOGGER.info("Hello from Obamium Mod!");
		
		
		
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		
		
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModEntities.ENTITIES.register(modEventBus);
		ModSoundsEvents.SOUNDS.register(modEventBus);
		
	}

}
