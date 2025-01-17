
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.projectredo.world.inventory.MagicMenu;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ProjectRedoMod.MODID);
	public static final RegistryObject<MenuType<MagicMenu>> MAGIC = REGISTRY.register("magic", () -> IForgeMenuType.create(MagicMenu::new));
}
