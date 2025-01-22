package net.mcreator.projectredo.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.projectredo.entity.IceProjectileEntity;
import net.mcreator.projectredo.client.model.ModelIceProjectile1_Converted_Converted;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class IceProjectileRenderer extends EntityRenderer<IceProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("project_redo:textures/entities/icecrystal1.png");
	private final ModelIceProjectile1_Converted_Converted model;

	public IceProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelIceProjectile1_Converted_Converted(context.bakeLayer(ModelIceProjectile1_Converted_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(IceProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(IceProjectileEntity entity) {
		return texture;
	}
}
