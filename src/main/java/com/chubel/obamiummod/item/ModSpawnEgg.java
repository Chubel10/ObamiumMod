package com.chubel.obamiummod.item;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Nullable;

import com.google.common.base.Supplier;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class ModSpawnEgg extends SpawnEggItem{
	
	protected static ArrayList<ModSpawnEgg> eggsToAdd = new ArrayList<>();
//	private final Supplier<EntityType<?>> TYPE_SUPPLIER;
	private static final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "EGGS");
	
//	public ModSpawnEgg(RegistryObject<? extends EntityType<?>> ObjIn, int primaryColorIn, int secondaryColorIn, Item.Properties builder) {
	public ModSpawnEgg(EntityType<?> typeIn, int primaryColorIn, int secondaryColorIn, Item.Properties builder) {
//		super(null, primaryColorIn, secondaryColorIn, builder);
		super(typeIn, primaryColorIn, secondaryColorIn, builder);
//		this.TYPE_SUPPLIER = ObjIn::get;
		eggsToAdd.add(this);
	}

//	public static void registerEggs() {
//		DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior() {
//	         /**
//	          * Dispense the specified stack, play the dispense sound and spawn particles.
//	          */
//	         public ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
//	            Direction direction = source.getBlockState().get(DispenserBlock.FACING);
//	            EntityType<?> entitytype = ((SpawnEggItem)stack.getItem()).getType(null);
//	            entitytype.spawn(source.getWorld(), stack, (PlayerEntity)null, source.getBlockPos().offset(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
//	            stack.shrink(1);
//	            return stack;
//	         }
//	      };
//		
//		
//		eggsToAdd.forEach(	
//					(value) ->{EGGS.put(value.getType(null), value);
//					DispenserBlock.registerDispenseBehavior(value, defaultDispenseItemBehavior);
//					});
//		eggsToAdd.clear();
//		
//		
//	}
	
//	@Override
//	public EntityType<?> getType(@Nullable CompoundNBT compoundNBT){
//		
//		
//		
//		
////		return entityTypeSupplier.get();
//		return TYPE_SUPPLIER.get();
//	
//	    
//	   }
	
	

}
