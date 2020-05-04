package com.chubel.obamiummod.init;

import com.chubel.obamiummod.ObamiumMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundsEvents {

	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, ObamiumMod.MODID);
	
	public static final RegistryObject<SoundEvent> OBAMA_AMBIENT = SOUNDS.register("obama_ambient", () -> new SoundEvent(new ResourceLocation(ObamiumMod.MODID, "obama_ambient")));
	public static final RegistryObject<SoundEvent> OBAMA_HURT = SOUNDS.register("obama_hurt", () -> new SoundEvent(new ResourceLocation(ObamiumMod.MODID, "obama_hurt")));
	public static final RegistryObject<SoundEvent> OBAMA_DEATH = SOUNDS.register("obama_death", () -> new SoundEvent(new ResourceLocation(ObamiumMod.MODID, "obama_death")));
	
}
