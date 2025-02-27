
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.projectredo.block.MagicStoneOreBlock;
import net.mcreator.projectredo.block.DirtMagicStoneOreBlock;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectRedoMod.MODID);
	public static final RegistryObject<Block> MAGIC_STONE_ORE = REGISTRY.register("magic_stone_ore", () -> new MagicStoneOreBlock());
	public static final RegistryObject<Block> DIRT_MAGIC_STONE_ORE = REGISTRY.register("dirt_magic_stone_ore", () -> new DirtMagicStoneOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
