
package net.mcreator.projectredo.entity;

import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.GeoEntity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.projectredo.procedures.GreatRabbitThisEntityKillsAnotherOneProcedure;
import net.mcreator.projectredo.init.ProjectRedoModEntities;

public class GreatRabbitAnimatedEntity extends Monster implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(GreatRabbitAnimatedEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(GreatRabbitAnimatedEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(GreatRabbitAnimatedEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public GreatRabbitAnimatedEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED.get(), world);
	}

	public GreatRabbitAnimatedEntity(EntityType<GreatRabbitAnimatedEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setMaxUpStep(0.6f);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SHOOT, false);
		this.entityData.define(ANIMATION, "undefined");
		this.entityData.define(TEXTURE, "greatrabbittexture32x");
	}

	public void setTexture(String texture) {
		this.entityData.set(TEXTURE, texture);
	}

	public String getTexture() {
		return this.entityData.get(TEXTURE);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers());
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Animal.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, AgeableMob.class, true, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, WaterAnimal.class, true, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, FlyingMob.class, true, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, AbstractGolem.class, true, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CaveSpider.class, true, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Spider.class, true, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, WitherSkeleton.class, true, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Skeleton.class, true, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Shulker.class, true, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Ravager.class, true, false));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, EnderMan.class, true, false));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Endermite.class, true, false));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Slime.class, true, false));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, SpellcasterIllager.class, true, false));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Silverfish.class, true, false));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, Witch.class, true, false));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, Warden.class, true, false));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, WitherBoss.class, true, false));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, EnderDragon.class, true, false));
		this.goalSelector.addGoal(26, new MeleeAttackGoal(this, 1.8, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(27, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(28, new FloatGoal(this));
		this.goalSelector.addGoal(29, new FollowMobGoal(this, 1, (float) 50, (float) 50));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.rabbit.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.FALL))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("Texture", this.getTexture());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Texture"))
			this.setTexture(compound.getString("Texture"));
	}

	@Override
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		GreatRabbitThisEntityKillsAnotherOneProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void baseTick() {
		super.baseTick();
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	public static void init() {
		SpawnPlacements.register(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
		DungeonHooks.addDungeonMob(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 7);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 8);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		return builder;
	}

	private PlayState movementPredicate(AnimationState event) {
		if (this.animationprocedure.equals("empty")) {
			if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F))

					&& !this.isSprinting()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("WalkCycle1"));
			}
			if (this.isSprinting()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("RunCycle1"));
			}
			return event.setAndContinue(RawAnimation.begin().thenLoop("Idle"));
		}
		return PlayState.STOP;
	}

	String prevAnim = "empty";

	private PlayState procedurePredicate(AnimationState event) {
		if (!animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED || (!this.animationprocedure.equals(prevAnim) && !this.animationprocedure.equals("empty"))) {
			if (!this.animationprocedure.equals(prevAnim))
				event.getController().forceAnimationReset();
			event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
			if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
				this.animationprocedure = "empty";
				event.getController().forceAnimationReset();
			}
		} else if (animationprocedure.equals("empty")) {
			prevAnim = "empty";
			return PlayState.STOP;
		}
		prevAnim = this.animationprocedure;
		return PlayState.CONTINUE;
	}

	@Override
	protected void tickDeath() {
		++this.deathTime;
		if (this.deathTime == 20) {
			this.remove(GreatRabbitAnimatedEntity.RemovalReason.KILLED);
			this.dropExperience();
		}
	}

	public String getSyncedAnimation() {
		return this.entityData.get(ANIMATION);
	}

	public void setAnimation(String animation) {
		this.entityData.set(ANIMATION, animation);
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar data) {
		data.add(new AnimationController<>(this, "movement", 0, this::movementPredicate));
		data.add(new AnimationController<>(this, "procedure", 0, this::procedurePredicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
