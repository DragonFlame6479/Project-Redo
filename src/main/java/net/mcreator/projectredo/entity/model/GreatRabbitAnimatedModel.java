package net.mcreator.projectredo.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.projectredo.entity.GreatRabbitAnimatedEntity;

public class GreatRabbitAnimatedModel extends GeoModel<GreatRabbitAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreatRabbitAnimatedEntity entity) {
		return new ResourceLocation("project_redo", "animations/greatrabbit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatRabbitAnimatedEntity entity) {
		return new ResourceLocation("project_redo", "geo/greatrabbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatRabbitAnimatedEntity entity) {
		return new ResourceLocation("project_redo", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(GreatRabbitAnimatedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("HEAD");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
