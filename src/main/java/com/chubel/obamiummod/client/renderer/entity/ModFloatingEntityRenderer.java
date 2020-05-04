package com.chubel.obamiummod.client.renderer.entity;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.client.model.entity.ModFloatingModel;
import com.chubel.obamiummod.entity.ModFloatingEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class ModFloatingEntityRenderer extends EntityRenderer<ModFloatingEntity> {

	private static final ResourceLocation MOD_F_ENTITY_TEXTURE = new ResourceLocation(ObamiumMod.MODID,
			"textures/entity/obamium_bullet.png");
	private final ModFloatingModel model = new ModFloatingModel();

	public ModFloatingEntityRenderer(EntityRendererManager manager) {
		super(manager);
	}

//	@Override
	public void render(ModFloatingEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer buffer, int packedLightIn) {
		
		stack.push();
		
		stack.scale(0.15F, 0.15F, 0.15F);
		
		RenderType renderType = this.model.getRenderType(this.getEntityTexture(entity));
		IVertexBuilder iVertexBuilder = ItemRenderer.getBuffer(buffer, renderType, false, false);
		this.model.render(stack, iVertexBuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F,
				1.0F);
		
		
		stack.pop();
		super.render(entity, entityYaw, partialTicks, stack, buffer, packedLightIn);
		
		
		
	}

	@Override
	public ResourceLocation getEntityTexture(ModFloatingEntity entity) {
		return MOD_F_ENTITY_TEXTURE;
		
	}

}
