package com.chubel.obamiummod.world;

import com.chubel.obamiummod.init.ModBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {

	public static void generateOres() {
		final Decoration decorStage = GenerationStage.Decoration.UNDERGROUND_ORES;
		final BlockState obamiumField = ModBlocks.OBAMIUM_ORE.get().getDefaultState();
		final BlockState stoneField = Blocks.STONE.getDefaultState();
		ForgeRegistries.BIOMES.getValues().stream()
		.filter(biome -> biome.getCategory() == Category.MUSHROOM)

		.forEach(biome -> {
			biome.addFeature(decorStage,
					Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(stoneField, obamiumField))
					.withPlacement(
							Placement.EMERALD_ORE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));

		});
	}

}
