
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.projectredo.potion.FrostMobEffect;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ProjectRedoMod.MODID);
	public static final RegistryObject<MobEffect> FROST = REGISTRY.register("frost", () -> new FrostMobEffect());
}
