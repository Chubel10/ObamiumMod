package com.chubel.obamiummod.init;

import java.util.function.Supplier;

import com.chubel.obamiummod.ObamiumMod;

import net.minecraft.item.*;

public class ModItemGroups {
	
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(ObamiumMod.MODID, () -> new ItemStack(ModItems.OBAMIUM.get()));
	
	public static class ModItemGroup extends ItemGroup{
		
		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
			
	}
}
