package net.mcreator.projectredo.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.projectredo.init.ProjectRedoModItems;
import net.mcreator.projectredo.entity.PuckEntity;
import net.mcreator.projectredo.ProjectRedoMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenRightClickPuckWithStoneProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			if (ProjectRedoModItems.PUCK_GLINTSTONE.get() == (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() && entity instanceof PuckEntity) {
				if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ProjectRedoModItems.TAMED_PUCK_GLINTSTONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		} else if (ProjectRedoModItems.PUCK_GLINTSTONE.get() == (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() && entity instanceof PuckEntity) {
			if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ProjectRedoModItems.TAMED_PUCK_GLINTSTONE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ProjectRedoModItems.PUCK_GLINTSTONE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			} else {
				ProjectRedoMod.queueServerWork(2, () -> {
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ProjectRedoModItems.PUCK_GLINTSTONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
		}
	}
}
