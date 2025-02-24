
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.projectredo.network.MagicGuiKeyMessage;
import net.mcreator.projectredo.ProjectRedoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ProjectRedoModKeyMappings {
	public static final KeyMapping MAGIC_GUI_KEY = new KeyMapping("key.project_redo.magic_gui_key", GLFW.GLFW_KEY_M, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ProjectRedoMod.PACKET_HANDLER.sendToServer(new MagicGuiKeyMessage(0, 0));
				MagicGuiKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MAGIC_USE_1_KEY = new KeyMapping("key.project_redo.magic_use_1_key", GLFW.GLFW_KEY_R, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MAGIC_GUI_KEY);
		event.register(MAGIC_USE_1_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MAGIC_GUI_KEY.consumeClick();
			}
		}
	}
}
