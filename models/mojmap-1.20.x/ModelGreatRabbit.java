// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGreatRabbit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "greatrabbit"), "main");
	private final ModelPart GREATRABBIT;
	private final ModelPart BODY;
	private final ModelPart TAIL;
	private final ModelPart MANE;
	private final ModelPart HEAD;
	private final ModelPart NOSE;
	private final ModelPart EARS;
	private final ModelPart L_EAR;
	private final ModelPart R_EAR;
	private final ModelPart F_LEGS;
	private final ModelPart R_LEG;
	private final ModelPart L_LEG;
	private final ModelPart B_LEGS;
	private final ModelPart L_LEG2;
	private final ModelPart R_LEG2;
	private final ModelPart FEET;
	private final ModelPart L_FOOT;
	private final ModelPart R_FOOT;

	public ModelGreatRabbit(ModelPart root) {
		this.GREATRABBIT = root.getChild("GREATRABBIT");
		this.BODY = this.GREATRABBIT.getChild("BODY");
		this.TAIL = this.BODY.getChild("TAIL");
		this.MANE = this.BODY.getChild("MANE");
		this.HEAD = this.GREATRABBIT.getChild("HEAD");
		this.NOSE = this.HEAD.getChild("NOSE");
		this.EARS = this.HEAD.getChild("EARS");
		this.L_EAR = this.EARS.getChild("L_EAR");
		this.R_EAR = this.EARS.getChild("R_EAR");
		this.F_LEGS = this.GREATRABBIT.getChild("F_LEGS");
		this.R_LEG = this.F_LEGS.getChild("R_LEG");
		this.L_LEG = this.F_LEGS.getChild("L_LEG");
		this.B_LEGS = this.GREATRABBIT.getChild("B_LEGS");
		this.L_LEG2 = this.B_LEGS.getChild("L_LEG2");
		this.R_LEG2 = this.B_LEGS.getChild("R_LEG2");
		this.FEET = this.GREATRABBIT.getChild("FEET");
		this.L_FOOT = this.FEET.getChild("L_FOOT");
		this.R_FOOT = this.FEET.getChild("R_FOOT");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition GREATRABBIT = partdefinition.addOrReplaceChild("GREATRABBIT", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition BODY = GREATRABBIT.addOrReplaceChild("BODY", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition cube_r1 = BODY.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.75F, -5.25F, 6.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, -0.75F, -0.2182F, 0.0F, 0.0F));

		PartDefinition TAIL = BODY.addOrReplaceChild("TAIL", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.0F));

		PartDefinition MANE = BODY.addOrReplaceChild("MANE",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-4.0F, -1.1667F, -1.1667F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 20)
						.addBox(-3.0F, -2.1667F, -1.1667F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.0F, -1.1667F, -2.1667F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8333F, -5.8333F, -0.0873F, 0.0F, 0.0F));

		PartDefinition HEAD = GREATRABBIT.addOrReplaceChild("HEAD", CubeListBuilder.create().texOffs(0, 20).addBox(
				-2.5F, -3.0F, -5.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -1.0F));

		PartDefinition cube_r2 = HEAD.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 32).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition NOSE = HEAD.addOrReplaceChild("NOSE", CubeListBuilder.create().texOffs(18, 32).addBox(-0.5F,
				-2.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -6.0F));

		PartDefinition EARS = HEAD.addOrReplaceChild("EARS", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, -3.0F));

		PartDefinition L_EAR = EARS.addOrReplaceChild("L_EAR", CubeListBuilder.create(),
				PartPose.offset(1.0F, 0.0F, 1.0F));

		PartDefinition cube_r3 = L_EAR.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 32).mirror()
						.addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(8, 29).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.4363F, 0.3491F));

		PartDefinition R_EAR = EARS.addOrReplaceChild("R_EAR", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 0.0F, 1.0F));

		PartDefinition cube_r4 = R_EAR.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 32)
						.addBox(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 29).mirror()
						.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, -0.4363F, -0.3491F));

		PartDefinition F_LEGS = GREATRABBIT.addOrReplaceChild("F_LEGS", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, -2.0F));

		PartDefinition R_LEG = F_LEGS.addOrReplaceChild("R_LEG", CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F,
				0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -1.0F, 0.0F));

		PartDefinition L_LEG = F_LEGS.addOrReplaceChild("L_LEG",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -1.0F, 0.0F));

		PartDefinition B_LEGS = GREATRABBIT.addOrReplaceChild("B_LEGS", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition L_LEG2 = B_LEGS.addOrReplaceChild("L_LEG2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.75F, -0.75F));

		PartDefinition cube_r5 = L_LEG2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(14, 29)
						.addBox(1.5F, -0.25F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 25)
						.addBox(1.5F, -1.25F, -0.25F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition R_LEG2 = B_LEGS.addOrReplaceChild("R_LEG2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.75F, -0.75F));

		PartDefinition cube_r6 = R_LEG2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(14, 29).mirror()
						.addBox(-3.5F, -0.25F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(21, 25).mirror()
						.addBox(-3.5F, -1.25F, -0.25F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FEET = GREATRABBIT.addOrReplaceChild("FEET", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition L_FOOT = FEET.addOrReplaceChild("L_FOOT", CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F,
				-0.5F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 3.5F, 2.0F));

		PartDefinition R_FOOT = FEET.addOrReplaceChild("R_FOOT",
				CubeListBuilder.create().texOffs(24, 12).mirror()
						.addBox(-1.0F, -0.5F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 3.5F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		GREATRABBIT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}