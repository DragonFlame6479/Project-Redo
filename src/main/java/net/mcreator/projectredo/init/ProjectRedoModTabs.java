
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.projectredo.ProjectRedoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectRedoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectRedoMod.MODID);
	public static final RegistryObject<CreativeModeTab> PROJECT_REDO = REGISTRY.register("project_redo",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.project_redo.project_redo")).icon(() -> new ItemStack(ProjectRedoModItems.PUCK_GLINTSTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ProjectRedoModItems.GOSPEL.get());
				tabData.accept(ProjectRedoModItems.TAKT_OF_HEROES.get());
				tabData.accept(ProjectRedoModItems.RONDO_OF_LOVE_AND_DARKNESS.get());
				tabData.accept(ProjectRedoModItems.REQUIEM_OF_SILENCE.get());
				tabData.accept(ProjectRedoModItems.STRAIGHT_BET.get());
				tabData.accept(ProjectRedoModItems.THEATER_D.get());
				tabData.accept(ProjectRedoModItems.GREAT_RABBIT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(ProjectRedoModItems.WITCH_CULT_DAGGER.get());
				tabData.accept(ProjectRedoModItems.PUCK_GLINTSTONE.get());
				tabData.accept(ProjectRedoModItems.WITCHS_WILL.get());
				tabData.accept(ProjectRedoModItems.PUCK_SPAWN_EGG.get());
				tabData.accept(ProjectRedoModItems.BEATRICE_SPAWN_EGG.get());
				tabData.accept(ProjectRedoModItems.MIMI_STAFF.get());
				tabData.accept(ProjectRedoModBlocks.MAGIC_STONE_ORE.get().asItem());
				tabData.accept(ProjectRedoModItems.NEUTRAL_MAGIC_STONE.get());
				tabData.accept(ProjectRedoModItems.REFINEDMAGICSTONE.get());
				tabData.accept(ProjectRedoModItems.MAGIC_STONE_NUGGET.get());
				tabData.accept(ProjectRedoModBlocks.DIRT_MAGIC_STONE_ORE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ProjectRedoModItems.WITCH_CULT_DAGGER.get());
			tabData.accept(ProjectRedoModItems.MIMI_STAFF.get());

		}
	}
}
