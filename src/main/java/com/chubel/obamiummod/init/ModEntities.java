package com.chubel.obamiummod.init;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.entity.ModEntity;
import com.chubel.obamiummod.entity.ModFloatingEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;


//@ObjectHolder(ObamiumMod.MODID)
public class ModEntities {
	// public ModEntities(){

	// }
	public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
			ObamiumMod.MODID);
	
	
	public static final EntityType<ModEntity> TEMPORARY_OBAMA = EntityType.Builder.<ModEntity>create(ModEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F)
			.build(ObamiumMod.MODID + "obama");
	
//	public static final RegistryObject<EntityType<ModEntity>> OBAMA = ENTITIES.register("obama",
//			() -> EntityType.Builder.<ModEntity>create(ModEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F)
//					.build(ObamiumMod.MODID + "obama"));
	
	public static final RegistryObject<EntityType<ModEntity>> OBAMA = ENTITIES.register("obama",
			() -> TEMPORARY_OBAMA);
	
	
	
//	public static final EntityType<ModEntity> OBAMA = null;

	public static final RegistryObject<EntityType<ModFloatingEntity>> OBAMIUM_BULLET = ENTITIES
			.register("obamium_bullet",
					() -> EntityType.Builder
							.<ModFloatingEntity>create(ModFloatingEntity::new, EntityClassification.MISC)
							.size(0.1F, 0.1F).build(ObamiumMod.MODID + "obamium_bullet"));
	
//	public static final EntityType<ModFloatingEntity> OBAMIUM_BULLET = null;

}
