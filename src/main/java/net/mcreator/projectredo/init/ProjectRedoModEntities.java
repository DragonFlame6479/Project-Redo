
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.projectredo.entity.PuckEntity;
import net.mcreator.projectredo.entity.IceProjectileEntity;
import net.mcreator.projectredo.entity.GreatRabbitAnimatedEntity;
import net.mcreator.projectredo.ProjectRedoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectRedoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProjectRedoMod.MODID);
	public static final RegistryObject<EntityType<GreatRabbitAnimatedEntity>> GREAT_RABBIT_ANIMATED = register("great_rabbit_animated",
			EntityType.Builder.<GreatRabbitAnimatedEntity>of(GreatRabbitAnimatedEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GreatRabbitAnimatedEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<PuckEntity>> PUCK = register("puck",
			EntityType.Builder.<PuckEntity>of(PuckEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuckEntity::new).fireImmune().sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<IceProjectileEntity>> ICE_PROJECTILE = register("ice_projectile",
			EntityType.Builder.<IceProjectileEntity>of(IceProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(IceProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GreatRabbitAnimatedEntity.init();
			PuckEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GREAT_RABBIT_ANIMATED.get(), GreatRabbitAnimatedEntity.createAttributes().build());
		event.put(PUCK.get(), PuckEntity.createAttributes().build());
	}
}
