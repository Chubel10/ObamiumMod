package com.chubel.obamiummod.client;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.client.renderer.entity.ModEntityRenderer;
import com.chubel.obamiummod.client.renderer.entity.ModFloatingEntityRenderer;
import com.chubel.obamiummod.init.ModEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ObamiumMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {

		// entity renderer
		RenderingRegistry.registerEntityRenderingHandler(ModEntities.OBAMA.get(), ModEntityRenderer::new);

//		RenderingRegistry.registerEntityRenderingHandler(ModEntities.OBAMA, ModEntityRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(ModEntities.OBAMIUM_BULLET.get(),
//		RenderingRegistry.registerEntityRenderingHandler(ModEntities.OBAMIUM_BULLET,
				ModFloatingEntityRenderer::new);

	}

}
