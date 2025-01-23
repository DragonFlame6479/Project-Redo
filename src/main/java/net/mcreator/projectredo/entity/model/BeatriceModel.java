package net.mcreator.projectredo.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.projectredo.entity.BeatriceEntity;

public class BeatriceModel extends GeoModel<BeatriceEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeatriceEntity entity) {
		return new ResourceLocation("project_redo", "animations/beatrice_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeatriceEntity entity) {
		return new ResourceLocation("project_redo", "geo/beatrice_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeatriceEntity entity) {
		return new ResourceLocation("project_redo", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BeatriceEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
