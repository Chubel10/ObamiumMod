package com.chubel.obamiummod.food;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {
	public static final Food OBAMIUM_APPLE = (new Food.Builder()).hunger(4).saturation(1.2F)
			
			.effect(() -> new EffectInstance(Effects.REGENERATION, 12000, 5), 1.0F)
			.effect(() -> new EffectInstance(Effects.RESISTANCE, 12000, 0), 1.0F)
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 12000, 0), 1.0F)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 12000, 5), 1.0F)
			.effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 12000, 5), 1.0F)
			.effect(() -> new EffectInstance(Effects.STRENGTH,12000,5), 1.0F)
			.effect(() -> new EffectInstance(Effects.WATER_BREATHING,12000, 0), 1.0F)
			.setAlwaysEdible().build();
}
