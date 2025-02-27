
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.projectredo.item.WitchsWillItem;
import net.mcreator.projectredo.item.WitchCultDaggerItem;
import net.mcreator.projectredo.item.TheaterDItem;
import net.mcreator.projectredo.item.TamedPuckGlintstoneItem;
import net.mcreator.projectredo.item.TaktOfHeroesItem;
import net.mcreator.projectredo.item.StraightBetItem;
import net.mcreator.projectredo.item.RondoOfLoveAndDarknessItem;
import net.mcreator.projectredo.item.RequiemOfSilenceItem;
import net.mcreator.projectredo.item.RefinedmagicstoneItem;
import net.mcreator.projectredo.item.RabbitIconItem;
import net.mcreator.projectredo.item.PuckGlintstoneItem;
import net.mcreator.projectredo.item.MimiStaffItem;
import net.mcreator.projectredo.item.MagicStoneNuggetItem;
import net.mcreator.projectredo.item.MagicStoneItem;
import net.mcreator.projectredo.item.JustSomeItemItem;
import net.mcreator.projectredo.item.GospelItem;
import net.mcreator.projectredo.item.CoverAdv1Item;
import net.mcreator.projectredo.item.BORGERItem;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectRedoMod.MODID);
	public static final RegistryObject<Item> PUCK_GLINTSTONE = REGISTRY.register("puck_glintstone", () -> new PuckGlintstoneItem());
	public static final RegistryObject<Item> TAKT_OF_HEROES = REGISTRY.register("takt_of_heroes", () -> new TaktOfHeroesItem());
	public static final RegistryObject<Item> GREAT_RABBIT_ANIMATED_SPAWN_EGG = REGISTRY.register("great_rabbit_animated_spawn_egg", () -> new ForgeSpawnEggItem(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED, -1, -10092544, new Item.Properties()));
	public static final RegistryObject<Item> RABBIT_ICON = REGISTRY.register("rabbit_icon", () -> new RabbitIconItem());
	public static final RegistryObject<Item> COVER_ADV_1 = REGISTRY.register("cover_adv_1", () -> new CoverAdv1Item());
	public static final RegistryObject<Item> GOSPEL = REGISTRY.register("gospel", () -> new GospelItem());
	public static final RegistryObject<Item> RONDO_OF_LOVE_AND_DARKNESS = REGISTRY.register("rondo_of_love_and_darkness", () -> new RondoOfLoveAndDarknessItem());
	public static final RegistryObject<Item> REQUIEM_OF_SILENCE = REGISTRY.register("requiem_of_silence", () -> new RequiemOfSilenceItem());
	public static final RegistryObject<Item> WITCH_CULT_DAGGER = REGISTRY.register("witch_cult_dagger", () -> new WitchCultDaggerItem());
	public static final RegistryObject<Item> STRAIGHT_BET = REGISTRY.register("straight_bet", () -> new StraightBetItem());
	public static final RegistryObject<Item> THEATER_D = REGISTRY.register("theater_d", () -> new TheaterDItem());
	public static final RegistryObject<Item> PUCK_SPAWN_EGG = REGISTRY.register("puck_spawn_egg", () -> new ForgeSpawnEggItem(ProjectRedoModEntities.PUCK, -3355444, -1, new Item.Properties()));
	public static final RegistryObject<Item> WITCHS_WILL = REGISTRY.register("witchs_will", () -> new WitchsWillItem());
	public static final RegistryObject<Item> JUST_SOME_ITEM = REGISTRY.register("just_some_item", () -> new JustSomeItemItem());
	public static final RegistryObject<Item> BORGER = REGISTRY.register("borger", () -> new BORGERItem());
	public static final RegistryObject<Item> TAMED_PUCK_GLINTSTONE = REGISTRY.register("tamed_puck_glintstone", () -> new TamedPuckGlintstoneItem());
	public static final RegistryObject<Item> BEATRICE_SPAWN_EGG = REGISTRY.register("beatrice_spawn_egg", () -> new ForgeSpawnEggItem(ProjectRedoModEntities.BEATRICE, -3786391, -5150, new Item.Properties()));
	public static final RegistryObject<Item> MIMI_STAFF = REGISTRY.register("mimi_staff", () -> new MimiStaffItem());
	public static final RegistryObject<Item> MAGIC_STONE_ORE = block(ProjectRedoModBlocks.MAGIC_STONE_ORE);
	public static final RegistryObject<Item> NEUTRAL_MAGIC_STONE = REGISTRY.register("neutral_magic_stone", () -> new MagicStoneItem());
	public static final RegistryObject<Item> REFINEDMAGICSTONE = REGISTRY.register("refinedmagicstone", () -> new RefinedmagicstoneItem());
	public static final RegistryObject<Item> DIRT_MAGIC_STONE_ORE = block(ProjectRedoModBlocks.DIRT_MAGIC_STONE_ORE);
	public static final RegistryObject<Item> MAGIC_STONE_NUGGET = REGISTRY.register("magic_stone_nugget", () -> new MagicStoneNuggetItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
