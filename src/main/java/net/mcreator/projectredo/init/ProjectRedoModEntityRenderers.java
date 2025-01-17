
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.projectredo.client.renderer.PuckRenderer;
import net.mcreator.projectredo.client.renderer.GreatRabbitAnimatedRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectRedoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED.get(), GreatRabbitAnimatedRenderer::new);
		event.registerEntityRenderer(ProjectRedoModEntities.ICE_CRYSTAL_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ProjectRedoModEntities.PUCK.get(), PuckRenderer::new);
	}
}
