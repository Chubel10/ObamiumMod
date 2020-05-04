package com.chubel.obamiummod.world;

import com.chubel.obamiummod.init.ModEntities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntitySpawn {

	public static void spawnMobs() {

		ForgeRegistries.BIOMES.getValues().stream()
		.filter(biome -> biome.getCategory() == Category.MUSHROOM)

		.forEach(biome -> {
			biome.getSpawns(EntityClassification.CREATURE)
			.add(new SpawnListEntry(ModEntities.OBAMA.get(), 1, 2, 2));
//			.add(new SpawnListEntry(ModEntities.OBAMA, 1, 2, 2));
		});

	}

}
