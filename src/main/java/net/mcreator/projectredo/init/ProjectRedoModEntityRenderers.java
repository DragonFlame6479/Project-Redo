
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.projectredo.client.renderer.PuckRenderer;
import net.mcreator.projectredo.client.renderer.IceProjectileRenderer;
import net.mcreator.projectredo.client.renderer.GreatRabbitAnimatedRenderer;
import net.mcreator.projectredo.client.renderer.BeatriceRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectRedoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED.get(), GreatRabbitAnimatedRenderer::new);
		event.registerEntityRenderer(ProjectRedoModEntities.PUCK.get(), PuckRenderer::new);
		event.registerEntityRenderer(ProjectRedoModEntities.ICE_PROJECTILE.get(), IceProjectileRenderer::new);
		event.registerEntityRenderer(ProjectRedoModEntities.BEATRICE.get(), BeatriceRenderer::new);
	}
}
