package com.chubel.obamiummod.client.model.entity;

import com.chubel.obamiummod.entity.ModEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;

public class ModModel extends BipedModel<ModEntity> {
	public ModModel(float modelSize, boolean textureHeightIn) {
		this(modelSize, 0.0F, 64, textureHeightIn ? 32 : 64);
	}

	protected ModModel(float modelSize, float p_i48914_2_, int p_i48914_3_, int textureHeightIn) {
		super(modelSize, p_i48914_2_, p_i48914_3_, textureHeightIn);
	}

	public void setRotationAngles(ModEntity entity, float valueForCos, float rotateValue, float trigValue,
			float headRotate1, float headRotate2) {
		super.setRotationAngles(entity, valueForCos, rotateValue, trigValue, headRotate1, headRotate2);

		this.bipedHead.showModel = true;
		this.bipedBody.rotateAngleX = 0.0F;
		this.bipedRightLeg.rotateAngleX -= 0.0F;
		this.bipedLeftLeg.rotateAngleX -= 0.0F;
		this.bipedRightArm.rotateAngleX = (float) ((double) this.bipedRightArm.rotateAngleX * 0.5D);
		this.bipedLeftArm.rotateAngleX = (float) ((double) this.bipedLeftArm.rotateAngleX * 0.5D);
		this.bipedRightLeg.rotateAngleX = (float) ((double) this.bipedRightLeg.rotateAngleX * 0.5D);
		this.bipedLeftLeg.rotateAngleX = (float) ((double) this.bipedLeftLeg.rotateAngleX * 0.5D);
		if (this.bipedRightArm.rotateAngleX > 0.4F) {
			this.bipedRightArm.rotateAngleX = 0.4F;
		}

		if (this.bipedLeftArm.rotateAngleX > 0.4F) {
			this.bipedLeftArm.rotateAngleX = 0.4F;
		}

		if (this.bipedRightArm.rotateAngleX < -0.4F) {
			this.bipedRightArm.rotateAngleX = -0.4F;
		}

		if (this.bipedLeftArm.rotateAngleX < -0.4F) {
			this.bipedLeftArm.rotateAngleX = -0.4F;
		}

		if (this.bipedRightLeg.rotateAngleX > 0.4F) {
			this.bipedRightLeg.rotateAngleX = 0.4F;
		}

		if (this.bipedLeftLeg.rotateAngleX > 0.4F) {
			this.bipedLeftLeg.rotateAngleX = 0.4F;
		}

		if (this.bipedRightLeg.rotateAngleX < -0.4F) {
			this.bipedRightLeg.rotateAngleX = -0.4F;
		}

		if (this.bipedLeftLeg.rotateAngleX < -0.4F) {
			this.bipedLeftLeg.rotateAngleX = -0.4F;
		}
	}

	public boolean func_212850_a_(ModEntity entity) {
		return entity.isAggressive();
	}

}
