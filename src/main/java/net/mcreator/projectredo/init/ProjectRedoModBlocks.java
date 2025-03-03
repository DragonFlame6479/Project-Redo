
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.projectredo.block.MagicStoneOreBlock;
import net.mcreator.projectredo.block.LifausOakWoodBlock;
import net.mcreator.projectredo.block.LifausOakStairsBlock;
import net.mcreator.projectredo.block.LifausOakSlabBlock;
import net.mcreator.projectredo.block.LifausOakPressurePlateBlock;
import net.mcreator.projectredo.block.LifausOakPlanksBlock;
import net.mcreator.projectredo.block.LifausOakLogBlock;
import net.mcreator.projectredo.block.LifausOakLeavesBlock;
import net.mcreator.projectredo.block.LifausOakFenceGateBlock;
import net.mcreator.projectredo.block.LifausOakFenceBlock;
import net.mcreator.projectredo.block.LifausOakButtonBlock;
import net.mcreator.projectredo.block.DirtMagicStoneOreBlock;
import net.mcreator.projectredo.block.BlockOfMagicStoneBlock;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectRedoMod.MODID);
	public static final RegistryObject<Block> MAGIC_STONE_ORE = REGISTRY.register("magic_stone_ore", () -> new MagicStoneOreBlock());
	public static final RegistryObject<Block> DIRT_MAGIC_STONE_ORE = REGISTRY.register("dirt_magic_stone_ore", () -> new DirtMagicStoneOreBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_WOOD = REGISTRY.register("lifaus_oak_wood", () -> new LifausOakWoodBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_LOG = REGISTRY.register("lifaus_oak_log", () -> new LifausOakLogBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_PLANKS = REGISTRY.register("lifaus_oak_planks", () -> new LifausOakPlanksBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_LEAVES = REGISTRY.register("lifaus_oak_leaves", () -> new LifausOakLeavesBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_STAIRS = REGISTRY.register("lifaus_oak_stairs", () -> new LifausOakStairsBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_SLAB = REGISTRY.register("lifaus_oak_slab", () -> new LifausOakSlabBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_FENCE = REGISTRY.register("lifaus_oak_fence", () -> new LifausOakFenceBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_FENCE_GATE = REGISTRY.register("lifaus_oak_fence_gate", () -> new LifausOakFenceGateBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_PRESSURE_PLATE = REGISTRY.register("lifaus_oak_pressure_plate", () -> new LifausOakPressurePlateBlock());
	public static final RegistryObject<Block> LIFAUS_OAK_BUTTON = REGISTRY.register("lifaus_oak_button", () -> new LifausOakButtonBlock());
	public static final RegistryObject<Block> BLOCK_OF_MAGIC_STONE = REGISTRY.register("block_of_magic_stone", () -> new BlockOfMagicStoneBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
