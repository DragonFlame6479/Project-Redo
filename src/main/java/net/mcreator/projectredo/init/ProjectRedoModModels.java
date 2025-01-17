
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.projectredo.client.model.ModelGreatRabbit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ProjectRedoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGreatRabbit.LAYER_LOCATION, ModelGreatRabbit::createBodyLayer);
	}
}
