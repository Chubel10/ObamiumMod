package com.chubel.obamiummod.entity;

import java.util.Random;
import java.util.UUID;

import javax.annotation.Nullable;
import com.chubel.obamiummod.init.ModSoundsEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class ModEntity extends ZombieEntity {
	private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID
			.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
	private static final AttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new AttributeModifier(
			ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, AttributeModifier.Operation.ADDITION))
					.setSaved(false);
	private int angerLevel;
	private UUID angerTargetUUID;

	public ModEntity(EntityType<? extends ModEntity> entity, World world) {
		super(entity, world);
		this.experienceValue = 50;
	}

	/**
	 * Hint to AI tasks that we were attacked by the passed EntityLivingBase and
	 * should retaliate. Is not guaranteed to change our actual active target (for
	 * example if we are currently busy attacking someone else)
	 */
	public void setRevengeTarget(@Nullable LivingEntity livingBase) {
		super.setRevengeTarget(livingBase);
		if (livingBase != null) {
			this.angerTargetUUID = livingBase.getUniqueID();
		}

	}

	protected void applyEntityAI() {
		this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
		this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.targetSelector.addGoal(1, new ModEntity.HurtByAggressorGoal(this));
		this.targetSelector.addGoal(2, new ModEntity.TargetAggressorGoal(this));
	}

	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SPAWN_REINFORCEMENTS_CHANCE).setBaseValue(1.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double) 0.45F);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);

		this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(1024.0D);
		this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK).setBaseValue(5.0D);
		this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

	protected boolean shouldDrown() {
		return true;
	}

	protected void updateAITasks() {
		IAttributeInstance iattributeinstance = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
		LivingEntity livingentity = this.getRevengeTarget();
		if (this.isAngry()) {
			if (!this.isChild() && !iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER)) {
				iattributeinstance.applyModifier(ATTACK_SPEED_BOOST_MODIFIER);
			}

			--this.angerLevel;
			LivingEntity livingentity1 = livingentity != null ? livingentity : this.getAttackTarget();
			if (!this.isAngry() && livingentity1 != null) {
				if (!this.canEntityBeSeen(livingentity1)) {
					this.setRevengeTarget((LivingEntity) null);
					this.setAttackTarget((LivingEntity) null);
				} else {
					this.angerLevel = this.anger();
				}
			}
		} else if (iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER)) {
			iattributeinstance.removeModifier(ATTACK_SPEED_BOOST_MODIFIER);
		}

		if (this.isAngry() && this.angerTargetUUID != null && livingentity == null) {
			PlayerEntity playerentity = this.world.getPlayerByUuid(this.angerTargetUUID);
			this.setRevengeTarget(playerentity);
			this.attackingPlayer = playerentity;
			this.recentlyHit = this.getRevengeTimer();
		}

		super.updateAITasks();
	}

	public static boolean func_223337_b(EntityType<ModEntity> entity, IWorld world, SpawnReason reason,
			BlockPos position, Random random) {
		Difficulty difficulty = world.getDifficulty();
		return difficulty != Difficulty.PEACEFUL && difficulty != Difficulty.EASY;
	}

	
	public boolean isNotColliding(IWorldReader worldIn) {
		return worldIn.func_226668_i_(this) && !worldIn.containsAnyLiquid(this.getBoundingBox());
	}

	public void writeAdditional(CompoundNBT compound) {
		super.writeAdditional(compound);
		compound.putShort("Anger", (short) this.angerLevel);
		if (this.angerTargetUUID != null) {
			compound.putString("HurtBy", this.angerTargetUUID.toString());
		} else {
			compound.putString("HurtBy", "");
		}

	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readAdditional(CompoundNBT compound) {
		super.readAdditional(compound);
		this.angerLevel = compound.getShort("Anger");
		String s = compound.getString("HurtBy");
		if (!s.isEmpty()) {
			this.angerTargetUUID = UUID.fromString(s);
			PlayerEntity playerentity = this.world.getPlayerByUuid(this.angerTargetUUID);
			this.setRevengeTarget(playerentity);
			if (playerentity != null) {
				this.attackingPlayer = playerentity;
				this.recentlyHit = this.getRevengeTimer();
			}
		}

	}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (this.isInvulnerableTo(source)) {
			return false;
		} else {
			Entity entity = source.getTrueSource();
			if (entity instanceof PlayerEntity && !((PlayerEntity) entity).isCreative()
					&& this.canEntityBeSeen(entity)) {
				this.angerToTarget((LivingEntity) entity);
			}

			return super.attackEntityFrom(source, amount);
		}
	}

	private boolean angerToTarget(LivingEntity entity) {
		this.angerLevel = this.anger();
		this.setRevengeTarget(entity);
		return true;
	}

	private int anger() {
		return 800;
	}

	public boolean isAngry() {
		return this.angerLevel > 0;
	}

	protected SoundEvent getAmbientSound() {
		return ModSoundsEvents.OBAMA_AMBIENT.get();
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSoundsEvents.OBAMA_HURT.get();
	}

	protected SoundEvent getDeathSound() {
		return ModSoundsEvents.OBAMA_DEATH.get();
	}

	/**
	 * Gives armor or weapon for entity based on given DifficultyInstance
	 */
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		
		this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.ENCHANTED_BOOK));
		
		this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.FEATHER));
	}

	protected ItemStack getSkullDrop() {
		return ItemStack.EMPTY;
	}

	public boolean isPreventingPlayerRest(PlayerEntity playerIn) {
		return this.isAngry();
	}

	static class HurtByAggressorGoal extends HurtByTargetGoal {
		public HurtByAggressorGoal(ModEntity entity) {
			super(entity);
			this.setCallsForHelp(new Class[] { ZombieEntity.class });
		}

		protected void setAttackTarget(MobEntity mobIn, LivingEntity targetIn) {
			if (mobIn instanceof ModEntity && this.goalOwner.canEntityBeSeen(targetIn)
					&& ((ModEntity) mobIn).angerToTarget(targetIn)) {
				mobIn.setAttackTarget(targetIn);
			}

		}
	}

	static class TargetAggressorGoal extends NearestAttackableTargetGoal<PlayerEntity> {
		public TargetAggressorGoal(ModEntity entity) {
			super(entity, PlayerEntity.class, true);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute() {
			return ((ModEntity) this.goalOwner).isAngry() && super.shouldExecute();
		}
	}

	@Override
	protected boolean shouldBurnInDay() {
		return false;
	}
}
