package net.mcreator.projectredo.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.projectredo.entity.PuckEntity;

public class PuckModel extends GeoModel<PuckEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuckEntity entity) {
		return new ResourceLocation("project_redo", "animations/puck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuckEntity entity) {
		return new ResourceLocation("project_redo", "geo/puck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuckEntity entity) {
		return new ResourceLocation("project_redo", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PuckEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
