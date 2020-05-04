package com.chubel.obamiummod;

import com.chubel.obamiummod.entity.ModEntity;
import com.chubel.obamiummod.entity.ModFloatingEntity;
import com.chubel.obamiummod.init.ModBlocks;
import com.chubel.obamiummod.init.ModItemGroups;
import com.chubel.obamiummod.item.ModSpawnEgg;
import com.chubel.obamiummod.world.ModEntitySpawn;
import com.chubel.obamiummod.world.OreGeneration;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@SuppressWarnings("deprecation")
@EventBusSubscriber(modid = ObamiumMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

//	public static EntityType<ModEntity> OBAMA;

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			registry.register(setup(new BlockItem(block, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),
					block.getRegistryName()));
		});

//		OBAMA = EntityType.Builder.<ModEntity>create(ModEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F)
//				.build(ObamiumMod.MODID + "obama");
		
		final EntityType<ModEntity> OBAMA = EntityType.Builder.<ModEntity>create(ModEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F)
				.build(ObamiumMod.MODID + "obama");

//		registry.register(setup(new ModSpawnEgg(ModEntities.OBAMA.get(), 5390124, 3875841,
		registry.register(setup(
				new ModSpawnEgg(OBAMA, 5390124, 3875841, (new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP))),
				"obama_spawn_egg"));

	}

//	@SubscribeEvent
//	public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
//		final IForgeRegistry<EntityType<?>> registry = event.getRegistry();
//
//		registry.registerAll(setup(OBAMA, "obama"),
//				setup(EntityType.Builder.<ModFloatingEntity>create(ModFloatingEntity::new, EntityClassification.MISC)
//						.size(0.1F, 0.1F).build(ObamiumMod.MODID + "obamium_bullet"), "obamium_bullet")
//
//		);

//		final EntityType<ModEntity> OBAMA = EntityType.Builder
//				.<ModEntity>create(ModEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F)
//				.build(ObamiumMod.MODID + "obama");
//
//	}

	@SubscribeEvent
	public static void onLoadSpawns(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> OreGeneration.generateOres()); // 2954647734739747932
		DeferredWorkQueue.runLater(() -> ModEntitySpawn.spawnMobs());
	}

	// @SubscribeEvent(priority = EventPriority.LOWEST)
	// public static void registerEggs(RegistryEvent.Register<EntityType<?>> event)
	// {
	// ModSpawnEgg.registerEggs();
	// }

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(ObamiumMod.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}

}
