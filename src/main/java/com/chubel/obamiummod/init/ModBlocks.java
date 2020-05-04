package com.chubel.obamiummod.init;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.block.ModOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			ObamiumMod.MODID);

	public static final RegistryObject<Block> OBAMIUM_ORE = BLOCKS.register("obamium_ore", () -> new ModOreBlock(Block.Properties.create(Material.ROCK)
															.hardnessAndResistance(3.0F, 3.0F)
															.lightValue(15)
															.harvestTool(ToolType.PICKAXE)
															.harvestLevel(3)));
	

}
