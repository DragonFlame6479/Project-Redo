
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.projectredo.client.particle.IceParticle1Particle;
import net.mcreator.projectredo.client.particle.EchidnaButterFly1Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectRedoModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ProjectRedoModParticleTypes.ICE_PARTICLE_1.get(), IceParticle1Particle::provider);
		event.registerSpriteSet(ProjectRedoModParticleTypes.ECHIDNA_BUTTER_FLY_1.get(), EchidnaButterFly1Particle::provider);
	}
}
