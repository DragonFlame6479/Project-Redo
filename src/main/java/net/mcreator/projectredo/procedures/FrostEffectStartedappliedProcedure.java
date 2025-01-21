package net.mcreator.projectredo.procedures;

import net.minecraft.world.entity.Entity;

public class FrostEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
		entity.stopRiding();
		entity.setSprinting(false);
	}
}
