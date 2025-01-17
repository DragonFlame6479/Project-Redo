package net.mcreator.projectredo.entity.model;

import software.bernie.geckolib.model.GeoModel;

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

}
