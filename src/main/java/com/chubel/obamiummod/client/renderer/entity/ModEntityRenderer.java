package com.chubel.obamiummod.client.renderer.entity;

import com.chubel.obamiummod.ObamiumMod;
import com.chubel.obamiummod.client.model.entity.ModModel;
import com.chubel.obamiummod.entity.ModEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.util.ResourceLocation;

public class ModEntityRenderer extends BipedRenderer<ModEntity, ModModel> {
	private static final ResourceLocation MOD_ENTITY_TEXTURE = new ResourceLocation(ObamiumMod.MODID,
			"textures/entity/obama.png");

	public ModEntityRenderer(EntityRendererManager renderManagerIn) {

		super(renderManagerIn, new ModModel(0.0F, false), 0.5F);
		this.addLayer(new BipedArmorLayer<>(this, new ModModel(0.5F, true), new ModModel(1.0F, true)));
	}

	public ResourceLocation getEntityTexture(ModEntity entity) {
		return MOD_ENTITY_TEXTURE;
	}
}