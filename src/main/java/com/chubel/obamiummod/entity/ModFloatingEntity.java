package com.chubel.obamiummod.entity;

import java.util.List;
import com.chubel.obamiummod.init.ModEntities;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.network.NetworkHooks;

public class ModFloatingEntity extends AbstractArrowEntity {

	private static final DataParameter<Byte> LOYALTY_LEVEL = EntityDataManager.createKey(ModFloatingEntity.class,
			DataSerializers.BYTE);
	private static final DataParameter<Boolean> key = EntityDataManager.createKey(ModFloatingEntity.class,
			DataSerializers.BOOLEAN);
	private ItemStack throwerStack;
	float explosionIntensity;
	float acceleration = 1.00F;
	private List<BlockPos> posses = Lists.newArrayList();
	private List<? extends Block> unallowedBlocks = Lists.newArrayList(Blocks.BARRIER, Blocks.BEDROCK,
			Blocks.CHAIN_COMMAND_BLOCK, Blocks.REPEATING_COMMAND_BLOCK, Blocks.COMMAND_BLOCK, Blocks.END_GATEWAY,
			Blocks.END_PORTAL, Blocks.END_PORTAL_FRAME, Blocks.JIGSAW, Blocks.STRUCTURE_BLOCK);
	private LivingEntity thrower;
	private int toolLifeLeft;
	// know when to stop exploding
	boolean continueExlpoding = true;

	/*
	 * Instead return the tool that throwed the entity
	 */
	protected ItemStack getArrowStack() {
		return this.throwerStack.copy();
	}

	public ModFloatingEntity(EntityType<? extends ModFloatingEntity> entity, World world) {
		super(entity, world);
	}

	public ModFloatingEntity(World world, LivingEntity entity, float intensityIn, ItemStack stackIn) {
		super(ModEntities.OBAMIUM_BULLET.get(), entity, world);
//		super(ModEntities.OBAMIUM_BULLET, entity, world);
		this.thrower = entity;
		this.throwerStack = stackIn;
		this.explosionIntensity = intensityIn;
		this.toolLifeLeft = stackIn.getMaxDamage() - stackIn.getDamage();
	}

	protected void registerData() {
		super.registerData();
		this.dataManager.register(LOYALTY_LEVEL, (byte) 0);
		this.dataManager.register(key, false);
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void tick() {
		if (!this.world.isRemote) {
			this.setFlag(6, this.isGlowing());
		}

		this.baseTick();
		boolean flag = this.getNoClip();
		Vec3d vec3d = this.getMotion();
		if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
			float f = MathHelper.sqrt(horizontalMag(vec3d));
			this.rotationYaw = (float) (MathHelper.atan2(vec3d.x, vec3d.z) * (double) (180F / (float) Math.PI));
			this.rotationPitch = (float) (MathHelper.atan2(vec3d.y, (double) f) * (double) (180F / (float) Math.PI));
			this.prevRotationYaw = this.rotationYaw;
			this.prevRotationPitch = this.rotationPitch;
		}

		BlockPos blockpos = new BlockPos(this);
		BlockState blockstate = this.world.getBlockState(blockpos);
		if (!blockstate.isAir(this.world, blockpos) && !flag) {
			VoxelShape voxelshape = blockstate.getCollisionShape(this.world, blockpos);
			if (!voxelshape.isEmpty()) {
				Vec3d vec3d1 = this.getPositionVec();

				for (AxisAlignedBB axisalignedbb : voxelshape.toBoundingBoxList()) {
					if (axisalignedbb.offset(blockpos).contains(vec3d1)) {
						this.inGround = true;
						break;
					}
				}
			}
		}

		if (this.arrowShake > 0) {
			--this.arrowShake;
		}

		if (this.isWet()) {
			this.extinguish();
		}

		this.timeInGround = 0;
		Vec3d vec3d2 = this.getPositionVec();
		Vec3d vec3d3 = vec3d2.add(vec3d);
		RayTraceResult raytraceresult = this.world.rayTraceBlocks(new RayTraceContext(vec3d2, vec3d3,
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
		if (raytraceresult.getType() != RayTraceResult.Type.MISS) {
			vec3d3 = raytraceresult.getHitVec();
		}

		while (this.isAlive()) {
			EntityRayTraceResult entityraytraceresult = this.rayTraceEntities(vec3d2, vec3d3);
			if (entityraytraceresult != null) {
				raytraceresult = entityraytraceresult;
			}

			if (raytraceresult != null && raytraceresult.getType() == RayTraceResult.Type.ENTITY) {
				Entity entity = ((EntityRayTraceResult) raytraceresult).getEntity();
				Entity entity1 = this.getShooter();
				if (entity instanceof PlayerEntity && entity1 instanceof PlayerEntity
						&& !((PlayerEntity) entity1).canAttackPlayer((PlayerEntity) entity)) {
					raytraceresult = null;
					entityraytraceresult = null;
				}
			}

			if (raytraceresult != null && raytraceresult.getType() != RayTraceResult.Type.MISS && !flag
					&& !ForgeEventFactory.onProjectileImpact(this, raytraceresult)) {
				this.onHit(raytraceresult);
				this.isAirBorne = true;
			}

			if (entityraytraceresult == null || this.getPierceLevel() <= 0) {
				break;
			}

			raytraceresult = null;
		}

		vec3d = this.getMotion();
		double d3 = vec3d.x;
		double d4 = vec3d.y;
		double d0 = vec3d.z;

		int i = 0;
		this.world.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getPosX() + d3 * (double) i / 4.0D,
				this.getPosY() + d4 * (double) i / 4.0D, this.getPosZ() + d0 * (double) i / 4.0D, -d3, -d4 + 0.2D, -d0);

		double d5 = this.getPosX() + d3;
		double d1 = this.getPosY() + d4;
		double d2 = this.getPosZ() + d0;
		float f1 = MathHelper.sqrt(horizontalMag(vec3d));
		if (flag) {
			this.rotationYaw = (float) (MathHelper.atan2(-d3, -d0) * (double) (180F / (float) Math.PI));
		} else {
			this.rotationYaw = (float) (MathHelper.atan2(d3, d0) * (double) (180F / (float) Math.PI));
		}

		for (this.rotationPitch = (float) (MathHelper.atan2(d4, (double) f1)
				* (double) (180F / (float) Math.PI)); this.rotationPitch
						- this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
			;
		}

		while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
			this.prevRotationPitch += 360.0F;
		}

		while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
			this.prevRotationYaw -= 360.0F;
		}

		while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
			this.prevRotationYaw += 360.0F;
		}

		this.rotationPitch = MathHelper.lerp(0.2F, this.prevRotationPitch, this.rotationPitch);
		this.rotationYaw = MathHelper.lerp(0.2F, this.prevRotationYaw, this.rotationYaw);

		this.setMotion(vec3d.scale((double) vec3d.length() > 4 ? 1 : this.acceleration));
		this.acceleration = (float) (this.acceleration * 1.005);
		if (!this.hasNoGravity() && !flag) {
			this.setMotion(vec3d.scale((double) 0.99));
			Vec3d vec3d4 = this.getMotion();
			this.setMotion(vec3d4.x, vec3d4.y - (double) 0.05F, vec3d4.z);
		}

		this.setPosition(d5, d1, d2);
		this.doBlockCollisions();
	}

	@OnlyIn(Dist.CLIENT)
	public boolean func_226572_w_() {
		return this.dataManager.get(key);
	}

	@Override
	protected void onHit(RayTraceResult raytraceResultIn) {
		RayTraceResult.Type raytraceresult$type = raytraceResultIn.getType();
		if (raytraceresult$type == RayTraceResult.Type.ENTITY) {
//	         this.onEntityHit((EntityRayTraceResult)raytraceResultIn);
		} else if (raytraceresult$type == RayTraceResult.Type.BLOCK) {
			BlockRayTraceResult blockRayTraceResult = (BlockRayTraceResult) raytraceResultIn;
			BlockPos pos = blockRayTraceResult.getPos();
			double x = (double) pos.getX();
			double y = (double) pos.getY();
			double z = (double) pos.getZ();

			if (!world.isRemote) {
				deflagrate(this.world, x, y, z, this.explosionIntensity);
			}

			if (!(this.throwerStack == null)) {

				this.throwerStack.damageItem((int) this.getDamage(), this.thrower,
						(player) -> player.sendBreakAnimation(this.thrower.getActiveHand()));

				this.remove();

			}

		}
	}

	private void deflagrate(World world, Double xIn, Double yIn, Double zIn, float intensity) {

		Direction dir = this.getHorizontalFacing();
		dir = dir == Direction.WEST ? Direction.EAST : dir == Direction.EAST ? Direction.WEST : dir;
		double f = (intensity < 1 ? 1 : Math.floor(intensity));
		Explosion.Mode mode = Explosion.Mode.BREAK;
		Direction dirLeft = dir.rotateYCCW();

//			Explosion explosion = null;
		BlockPos firstPos = new BlockPos(xIn, yIn, zIn);
		BlockPos newPos;
		/*
		 * rad for radius
		 */
		double rad = Math.ceil((f / 2));
		int indexer = 0;

		for (double i = 0; this.continueExlpoding; i++) {
			newPos = firstPos.offset(dirLeft, (int) i);

			if (i == rad - 1)
				i = -rad;
			if (i == -1)
				this.continueExlpoding = false;

			for (int j = 0; j < f; j++) {
				newPos = newPos.offset(dir, j > 0 ? 1 : j);

				this.addIfAllowed(posses, newPos);
				this.addIfAllowed(posses, newPos.up());
				this.addIfAllowed(posses, newPos.down());


				indexer = posses.size() - 1;
				BlockPos explosionPos = posses.size() > 0 ? posses.get(indexer) : firstPos;
				// s as in server world
				int sX = explosionPos.getX();
				int sY = explosionPos.getY();
				int sZ = explosionPos.getZ();

				world.createExplosion(null, sX, sY, sZ, f > 5 ? 6 : 1, Explosion.Mode.NONE);

			}

		}
		Explosion explosion = new Explosion(world, (Entity) null, xIn, yIn, zIn, (float) f, false, mode, posses);

		if (ForgeEventFactory.onExplosionStart(world, explosion))
			return;
		explosion.doExplosionB(true);
	}

	private void addIfAllowed(List<BlockPos> posses, BlockPos newPos) {
		BlockState stateAtPos = this.world.getBlockState(newPos);
		Block blockAtPos = stateAtPos.getBlock();
		if (!unallowedBlocks.contains(blockAtPos) && !blockAtPos.isAir(stateAtPos, null, null)
				&& this.toolLifeLeft > 0) {
			posses.add(newPos);
			this.toolLifeLeft--;
		}
	}

	/**
	 * Called by a player entity when they collide with an entity
	 */
	public void onCollideWithPlayer(PlayerEntity entityIn) {
		Entity entity = this.getShooter();
		if (entity == null || entity.getUniqueID() == entityIn.getUniqueID()) {
			super.onCollideWithPlayer(entityIn);
		}
	}

	public double getDamage() {
		return this.posses.size();
	}

	public void func_225516_i_() {
		int i = this.dataManager.get(LOYALTY_LEVEL);
		if (this.pickupStatus != AbstractArrowEntity.PickupStatus.ALLOWED || i <= 0) {
			super.func_225516_i_();
		}

	}


	public boolean isInRangeToRender3d(double x, double y, double z) {
		return true;
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

}
