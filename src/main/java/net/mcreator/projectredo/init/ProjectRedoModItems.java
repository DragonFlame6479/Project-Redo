
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.projectredo.item.WitchsWillItem;
import net.mcreator.projectredo.item.WitchCultDaggerItem;
import net.mcreator.projectredo.item.TheaterDItem;
import net.mcreator.projectredo.item.TaktOfHeroesItem;
import net.mcreator.projectredo.item.StraightBetItem;
import net.mcreator.projectredo.item.RondoOfLoveAndDarknessItem;
import net.mcreator.projectredo.item.RequiemOfSilenceItem;
import net.mcreator.projectredo.item.RabbitIconItem;
import net.mcreator.projectredo.item.PuckGlintstoneItem;
import net.mcreator.projectredo.item.JustSomeItemItem;
import net.mcreator.projectredo.item.IceCrystalItem;
import net.mcreator.projectredo.item.GospelItem;
import net.mcreator.projectredo.item.CoverAdv1Item;
import net.mcreator.projectredo.ProjectRedoMod;

public class ProjectRedoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectRedoMod.MODID);
	public static final RegistryObject<Item> PUCK_GLINTSTONE = REGISTRY.register("puck_glintstone", () -> new PuckGlintstoneItem());
	public static final RegistryObject<Item> TAKT_OF_HEROES = REGISTRY.register("takt_of_heroes", () -> new TaktOfHeroesItem());
	public static final RegistryObject<Item> GREAT_RABBIT_ANIMATED_SPAWN_EGG = REGISTRY.register("great_rabbit_animated_spawn_egg", () -> new ForgeSpawnEggItem(ProjectRedoModEntities.GREAT_RABBIT_ANIMATED, -1, -10092544, new Item.Properties()));
	public static final RegistryObject<Item> RABBIT_ICON = REGISTRY.register("rabbit_icon", () -> new RabbitIconItem());
	public static final RegistryObject<Item> COVER_ADV_1 = REGISTRY.register("cover_adv_1", () -> new CoverAdv1Item());
	public static final RegistryObject<Item> GOSPEL = REGISTRY.register("gospel", () -> new GospelItem());
	public static final RegistryObject<Item> ICE_CRYSTAL = REGISTRY.register("ice_crystal", () -> new IceCrystalItem());
	public static final RegistryObject<Item> RONDO_OF_LOVE_AND_DARKNESS = REGISTRY.register("rondo_of_love_and_darkness", () -> new RondoOfLoveAndDarknessItem());
	public static final RegistryObject<Item> REQUIEM_OF_SILENCE = REGISTRY.register("requiem_of_silence", () -> new RequiemOfSilenceItem());
	public static final RegistryObject<Item> WITCH_CULT_DAGGER = REGISTRY.register("witch_cult_dagger", () -> new WitchCultDaggerItem());
	public static final RegistryObject<Item> STRAIGHT_BET = REGISTRY.register("straight_bet", () -> new StraightBetItem());
	public static final RegistryObject<Item> THEATER_D = REGISTRY.register("theater_d", () -> new TheaterDItem());
	public static final RegistryObject<Item> PUCK_SPAWN_EGG = REGISTRY.register("puck_spawn_egg", () -> new ForgeSpawnEggItem(ProjectRedoModEntities.PUCK, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WITCHS_WILL = REGISTRY.register("witchs_will", () -> new WitchsWillItem());
	public static final RegistryObject<Item> JUST_SOME_ITEM = REGISTRY.register("just_some_item", () -> new JustSomeItemItem());
	// Start of user code block custom items
	// End of user code block custom items
}
