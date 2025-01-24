
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ProjectRedoMod.MODID);
	public static final RegistryObject<PaintingVariant> BORGERPAINT = REGISTRY.register("borgerpaint", () -> new PaintingVariant(48, 64));
}
