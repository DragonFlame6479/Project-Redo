
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ProjectRedoMod.MODID);
	public static final RegistryObject<SimpleParticleType> ICE_PARTICLE_1 = REGISTRY.register("ice_particle_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ECHIDNA_BUTTER_FLY_1 = REGISTRY.register("echidna_butter_fly_1", () -> new SimpleParticleType(false));
}
