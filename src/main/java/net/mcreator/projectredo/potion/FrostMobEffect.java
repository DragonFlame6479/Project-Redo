
package net.mcreator.projectredo.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.projectredo.procedures.FrostOnEffectActiveTickProcedure;
import net.mcreator.projectredo.procedures.FrostEffectStartedappliedProcedure;

public class FrostMobEffect extends MobEffect {
	public FrostMobEffect() {
		super(MobEffectCategory.HARMFUL, -10027009);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FrostEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrostOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
