package com.chubel.obamiummod.init;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.food.ModFoods;
import com.chubel.obamiummod.item.ModSpawnEgg;
import com.chubel.obamiummod.item.ModToolItem;

import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ObamiumMod.MODID);

	public static final RegistryObject<Item> OBAMIUM = ITEMS.register("obamium",
			() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	public static final RegistryObject<Item> OBAMIUMITE = ITEMS.register("obamiumite",
			() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	

	public static final RegistryObject<Item> OBAMIUM_TOOL = ITEMS.register("obamium_tool",
			() -> new ModToolItem(ItemTier.DIAMOND, 0, -3.0F,
					(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));

	public static final RegistryObject<Item> OBAMAS_SKIN = ITEMS.register("obamas_skin",
			() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	public static final RegistryObject<Item> OBAMIUM_APPLE = ITEMS.register("obamium_apple",
			() -> new EnchantedGoldenAppleItem(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)
					.rarity(Rarity.EPIC).food(ModFoods.OBAMIUM_APPLE)));

//	public static final RegistryObject<Item> OBAMA_SPAWN_EGG = ITEMS.register("obama_spawn_egg",
//			() -> new ModSpawnEgg(ModEntities.OBAMA, 5390124, 3875841,
//					(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP))));
	
	
}
