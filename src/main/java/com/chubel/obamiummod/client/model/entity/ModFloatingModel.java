package com.chubel.obamiummod.client.model.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModFloatingModel extends Model {
	private final ModelRenderer Sphere;
	private final ModelRenderer QuarterTop1;
	private final ModelRenderer Layer1;
	private final ModelRenderer Layer2;
	private final ModelRenderer Layer3;
	private final ModelRenderer Layer4;
	private final ModelRenderer Layer5;
	private final ModelRenderer Layer6;
	private final ModelRenderer Layer7;
	private final ModelRenderer Layer8;
	private final ModelRenderer Layer9;
	private final ModelRenderer Layer10;
	private final ModelRenderer QuarterTop2;
	private final ModelRenderer Layer11;
	private final ModelRenderer Layer12;
	private final ModelRenderer Layer13;
	private final ModelRenderer Layer14;
	private final ModelRenderer Layer15;
	private final ModelRenderer Layer16;
	private final ModelRenderer Layer17;
	private final ModelRenderer Layer18;
	private final ModelRenderer Layer19;
	private final ModelRenderer Layer20;
	private final ModelRenderer QuarterTop3;
	private final ModelRenderer Layer21;
	private final ModelRenderer Layer22;
	private final ModelRenderer Layer23;
	private final ModelRenderer Layer24;
	private final ModelRenderer Layer25;
	private final ModelRenderer Layer26;
	private final ModelRenderer Layer27;
	private final ModelRenderer Layer28;
	private final ModelRenderer Layer29;
	private final ModelRenderer Layer30;
	private final ModelRenderer QuarterTop4;
	private final ModelRenderer Layer31;
	private final ModelRenderer Layer32;
	private final ModelRenderer Layer33;
	private final ModelRenderer Layer34;
	private final ModelRenderer Layer35;
	private final ModelRenderer Layer36;
	private final ModelRenderer Layer37;
	private final ModelRenderer Layer38;
	private final ModelRenderer Layer39;
	private final ModelRenderer Layer40;
	private final ModelRenderer QuarterBot1;
	private final ModelRenderer Layer41;
	private final ModelRenderer Layer42;
	private final ModelRenderer Layer43;
	private final ModelRenderer Layer44;
	private final ModelRenderer Layer45;
	private final ModelRenderer Layer46;
	private final ModelRenderer Layer47;
	private final ModelRenderer Layer48;
	private final ModelRenderer Layer49;
	private final ModelRenderer Layer50;
	private final ModelRenderer QuarterBot2;
	private final ModelRenderer Layer51;
	private final ModelRenderer Layer52;
	private final ModelRenderer Layer53;
	private final ModelRenderer Layer54;
	private final ModelRenderer Layer55;
	private final ModelRenderer Layer56;
	private final ModelRenderer Layer57;
	private final ModelRenderer Layer58;
	private final ModelRenderer Layer59;
	private final ModelRenderer Layer60;
	private final ModelRenderer QuarterBot3;
	private final ModelRenderer Layer61;
	private final ModelRenderer Layer62;
	private final ModelRenderer Layer63;
	private final ModelRenderer Layer64;
	private final ModelRenderer Layer65;
	private final ModelRenderer Layer66;
	private final ModelRenderer Layer67;
	private final ModelRenderer Layer68;
	private final ModelRenderer Layer69;
	private final ModelRenderer Layer70;
	private final ModelRenderer QuarterBot4;
	private final ModelRenderer Layer71;
	private final ModelRenderer Layer72;
	private final ModelRenderer Layer73;
	private final ModelRenderer Layer74;
	private final ModelRenderer Layer75;
	private final ModelRenderer Layer76;
	private final ModelRenderer Layer77;
	private final ModelRenderer Layer78;
	private final ModelRenderer Layer79;
	private final ModelRenderer Layer80;
	private final ModelRenderer Core;
	private final ModelRenderer dots;
	private final ModelRenderer x;
	private final ModelRenderer side1;
	private final ModelRenderer side2;
	private final ModelRenderer side3;
	private final ModelRenderer side4;
	private final ModelRenderer y;
	private final ModelRenderer side5;
	private final ModelRenderer side6;
	private final ModelRenderer side7;
	private final ModelRenderer side8;
	private final ModelRenderer z;
	private final ModelRenderer side9;
	private final ModelRenderer side10;
	private final ModelRenderer side11;
	private final ModelRenderer side12;

	public ModFloatingModel() {
		super(RenderType::getEntitySolid);
		textureWidth = 128;
		textureHeight = 128;

		Sphere = new ModelRenderer(this);
		Sphere.setRotationPoint(0.0F, 12.0F, 0.0F);

		QuarterTop1 = new ModelRenderer(this);
		QuarterTop1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Sphere.addChild(QuarterTop1);

		Layer1 = new ModelRenderer(this);
		Layer1.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop1.addChild(Layer1);
		Layer1.setTextureOffset(21, 38).addBox(0.0F, -9.0F, -10.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer1.setTextureOffset(6, 80).addBox(0.0F, -11.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer1.setTextureOffset(63, 5).addBox(0.0F, -10.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer2 = new ModelRenderer(this);
		Layer2.setRotationPoint(-1.0F, -9.0F, -6.0F);
		QuarterTop1.addChild(Layer2);
		Layer2.setTextureOffset(37, 14).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer2.setTextureOffset(63, 3).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer2.setTextureOffset(8, 11).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer2.setTextureOffset(37, 7).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer3 = new ModelRenderer(this);
		Layer3.setRotationPoint(-2.0F, -7.0F, -7.0F);
		QuarterTop1.addChild(Layer3);
		Layer3.setTextureOffset(28, 37).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer3.setTextureOffset(63, 1).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer3.setTextureOffset(51, 63).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer3.setTextureOffset(8, 37).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer4 = new ModelRenderer(this);
		Layer4.setRotationPoint(-2.0F, -8.0F, -7.0F);
		QuarterTop1.addChild(Layer4);
		Layer4.setTextureOffset(0, 37).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer4.setTextureOffset(45, 63).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer4.setTextureOffset(28, 63).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer4.setTextureOffset(0, 80).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer4.setTextureOffset(10, 63).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer5 = new ModelRenderer(this);
		Layer5.setRotationPoint(-2.0F, -9.0F, -6.0F);
		QuarterTop1.addChild(Layer5);
		Layer5.setTextureOffset(36, 34).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer5.setTextureOffset(22, 63).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer5.setTextureOffset(62, 59).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer5.setTextureOffset(18, 3).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer5.setTextureOffset(70, 47).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer5.setTextureOffset(4, 63).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer6 = new ModelRenderer(this);
		Layer6.setRotationPoint(-2.0F, -7.0F, -7.0F);
		QuarterTop1.addChild(Layer6);
		Layer6.setTextureOffset(62, 51).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer6.setTextureOffset(62, 46).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer6.setTextureOffset(70, 29).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer6.setTextureOffset(62, 44).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer6.setTextureOffset(70, 24).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer6.setTextureOffset(70, 12).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer7 = new ModelRenderer(this);
		Layer7.setRotationPoint(-2.0F, -7.0F, -7.0F);
		QuarterTop1.addChild(Layer7);
		Layer7.setTextureOffset(79, 77).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer7.setTextureOffset(36, 32).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer7.setTextureOffset(79, 74).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer7.setTextureOffset(62, 34).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer7.setTextureOffset(70, 70).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer7.setTextureOffset(61, 62).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer8 = new ModelRenderer(this);
		Layer8.setRotationPoint(-2.0F, -7.0F, -7.0F);
		QuarterTop1.addChild(Layer8);
		Layer8.setTextureOffset(79, 72).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(79, 70).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(36, 30).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(61, 41).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(61, 39).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(79, 63).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(57, 62).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(79, 53).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer8.setTextureOffset(79, 51).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer9 = new ModelRenderer(this);
		Layer9.setRotationPoint(-2.0F, -8.0F, -7.0F);
		QuarterTop1.addChild(Layer9);
		Layer9.setTextureOffset(61, 37).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(79, 48).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(79, 45).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(79, 43).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(41, 62).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(66, 70).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer9.setTextureOffset(36, 20).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer10 = new ModelRenderer(this);
		Layer10.setRotationPoint(-2.0F, -8.0F, -7.0F);
		QuarterTop1.addChild(Layer10);
		Layer10.setTextureOffset(36, 16).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(61, 28).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(79, 36).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(79, 33).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(79, 21).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(41, 70).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer10.setTextureOffset(18, 62).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterTop2 = new ModelRenderer(this);
		QuarterTop2.setRotationPoint(-1.0F, -3.0F, 2.0F);
		Sphere.addChild(QuarterTop2);
		setRotationAngle(QuarterTop2, 0.0F, -1.5708F, 0.0F);

		Layer11 = new ModelRenderer(this);
		Layer11.setRotationPoint(-3.0F, -4.0F, -8.0F);
		QuarterTop2.addChild(Layer11);
		Layer11.setTextureOffset(36, 4).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer11.setTextureOffset(79, 19).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer11.setTextureOffset(61, 26).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer12 = new ModelRenderer(this);
		Layer12.setRotationPoint(-2.0F, -6.0F, -7.0F);
		QuarterTop2.addChild(Layer12);
		Layer12.setTextureOffset(36, 2).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer12.setTextureOffset(61, 23).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer12.setTextureOffset(0, 10).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer12.setTextureOffset(35, 36).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer13 = new ModelRenderer(this);
		Layer13.setRotationPoint(-3.0F, -4.0F, -8.0F);
		QuarterTop2.addChild(Layer13);
		Layer13.setTextureOffset(21, 36).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer13.setTextureOffset(61, 21).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer13.setTextureOffset(61, 14).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer13.setTextureOffset(15, 36).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer14 = new ModelRenderer(this);
		Layer14.setRotationPoint(-3.0F, -5.0F, -8.0F);
		QuarterTop2.addChild(Layer14);
		Layer14.setTextureOffset(35, 18).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer14.setTextureOffset(52, 61).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer14.setTextureOffset(46, 61).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer14.setTextureOffset(79, 17).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer14.setTextureOffset(14, 61).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer15 = new ModelRenderer(this);
		Layer15.setRotationPoint(-3.0F, -6.0F, -7.0F);
		QuarterTop2.addChild(Layer15);
		Layer15.setTextureOffset(35, 11).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer15.setTextureOffset(26, 61).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer15.setTextureOffset(60, 56).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer15.setTextureOffset(16, 3).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer15.setTextureOffset(18, 70).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer15.setTextureOffset(0, 61).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer16 = new ModelRenderer(this);
		Layer16.setRotationPoint(-3.0F, -4.0F, -8.0F);
		QuarterTop2.addChild(Layer16);
		Layer16.setTextureOffset(60, 54).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer16.setTextureOffset(60, 48).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer16.setTextureOffset(10, 70).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer16.setTextureOffset(60, 10).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer16.setTextureOffset(69, 50).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer16.setTextureOffset(69, 21).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer17 = new ModelRenderer(this);
		Layer17.setRotationPoint(-3.0F, -4.0F, -8.0F);
		QuarterTop2.addChild(Layer17);
		Layer17.setTextureOffset(79, 15).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer17.setTextureOffset(35, 9).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer17.setTextureOffset(79, 9).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer17.setTextureOffset(57, 60).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer17.setTextureOffset(69, 17).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer17.setTextureOffset(33, 60).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer18 = new ModelRenderer(this);
		Layer18.setRotationPoint(-3.0F, -4.0F, -8.0F);
		QuarterTop2.addChild(Layer18);
		Layer18.setTextureOffset(79, 4).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(79, 2).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(28, 35).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(59, 32).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(59, 30).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(79, 0).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(7, 60).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(78, 79).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer18.setTextureOffset(66, 79).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer19 = new ModelRenderer(this);
		Layer19.setRotationPoint(-3.0F, -5.0F, -8.0F);
		QuarterTop2.addChild(Layer19);
		Layer19.setTextureOffset(52, 59).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(62, 79).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(55, 79).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(49, 79).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(38, 59).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(69, 3).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer19.setTextureOffset(8, 35).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer20 = new ModelRenderer(this);
		Layer20.setRotationPoint(-3.0F, -5.0F, -8.0F);
		QuarterTop2.addChild(Layer20);
		Layer20.setTextureOffset(0, 35).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(28, 59).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(45, 79).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(41, 79).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(37, 79).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(69, 0).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer20.setTextureOffset(22, 59).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterTop3 = new ModelRenderer(this);
		QuarterTop3.setRotationPoint(-2.0F, 4.0F, 0.0F);
		Sphere.addChild(QuarterTop3);
		setRotationAngle(QuarterTop3, 0.0F, 3.1416F, 0.0F);

		Layer21 = new ModelRenderer(this);
		Layer21.setRotationPoint(-3.0F, -11.0F, -8.0F);
		QuarterTop3.addChild(Layer21);
		Layer21.setTextureOffset(34, 23).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer21.setTextureOffset(31, 79).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer21.setTextureOffset(58, 18).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer22 = new ModelRenderer(this);
		Layer22.setRotationPoint(-2.0F, -13.0F, -7.0F);
		QuarterTop3.addChild(Layer22);
		Layer22.setTextureOffset(15, 34).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer22.setTextureOffset(58, 16).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer22.setTextureOffset(8, 3).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer22.setTextureOffset(29, 33).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer23 = new ModelRenderer(this);
		Layer23.setRotationPoint(-3.0F, -11.0F, -8.0F);
		QuarterTop3.addChild(Layer23);
		Layer23.setTextureOffset(8, 33).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer23.setTextureOffset(58, 12).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer23.setTextureOffset(58, 8).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer23.setTextureOffset(23, 32).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer24 = new ModelRenderer(this);
		Layer24.setRotationPoint(-3.0F, -12.0F, -8.0F);
		QuarterTop3.addChild(Layer24);
		Layer24.setTextureOffset(0, 33).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer24.setTextureOffset(58, 6).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer24.setTextureOffset(58, 4).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer24.setTextureOffset(27, 79).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer24.setTextureOffset(43, 58).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer25 = new ModelRenderer(this);
		Layer25.setRotationPoint(-3.0F, -13.0F, -7.0F);
		QuarterTop3.addChild(Layer25);
		Layer25.setTextureOffset(32, 27).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer25.setTextureOffset(58, 2).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer25.setTextureOffset(58, 0).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer25.setTextureOffset(15, 10).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer25.setTextureOffset(57, 69).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer25.setTextureOffset(18, 58).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer26 = new ModelRenderer(this);
		Layer26.setRotationPoint(-3.0F, -11.0F, -8.0F);
		QuarterTop3.addChild(Layer26);
		Layer26.setTextureOffset(57, 58).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer26.setTextureOffset(33, 58).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer26.setTextureOffset(37, 69).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer26.setTextureOffset(57, 50).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer26.setTextureOffset(14, 69).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer26.setTextureOffset(6, 69).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer27 = new ModelRenderer(this);
		Layer27.setRotationPoint(-3.0F, -11.0F, -8.0F);
		QuarterTop3.addChild(Layer27);
		Layer27.setTextureOffset(23, 79).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer27.setTextureOffset(32, 25).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer27.setTextureOffset(19, 79).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer27.setTextureOffset(57, 45).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer27.setTextureOffset(0, 69).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer27.setTextureOffset(11, 58).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer28 = new ModelRenderer(this);
		Layer28.setRotationPoint(-3.0F, -11.0F, -8.0F);
		QuarterTop3.addChild(Layer28);
		Layer28.setTextureOffset(15, 79).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(9, 79).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(15, 32).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(57, 43).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(57, 35).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(3, 79).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(3, 58).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(78, 61).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer28.setTextureOffset(78, 59).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer29 = new ModelRenderer(this);
		Layer29.setRotationPoint(-3.0F, -12.0F, -8.0F);
		QuarterTop3.addChild(Layer29);
		Layer29.setTextureOffset(52, 57).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(78, 57).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(78, 41).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(78, 7).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(48, 57).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(68, 63).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer29.setTextureOffset(28, 31).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer30 = new ModelRenderer(this);
		Layer30.setRotationPoint(-3.0F, -12.0F, -8.0F);
		QuarterTop3.addChild(Layer30);
		Layer30.setTextureOffset(8, 31).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(38, 57).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(75, 78).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(71, 78).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(59, 78).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(68, 59).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer30.setTextureOffset(25, 56).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterTop4 = new ModelRenderer(this);
		QuarterTop4.setRotationPoint(-2.0F, -7.0F, -7.0F);
		Sphere.addChild(QuarterTop4);
		setRotationAngle(QuarterTop4, 0.0F, 1.5708F, 0.0F);

		Layer31 = new ModelRenderer(this);
		Layer31.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop4.addChild(Layer31);
		Layer31.setTextureOffset(0, 31).addBox(-7.0F, -2.0F, -9.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer31.setTextureOffset(52, 78).addBox(-7.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer31.setTextureOffset(56, 52).addBox(-7.0F, -3.0F, -9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer32 = new ModelRenderer(this);
		Layer32.setRotationPoint(1.0F, -2.0F, 1.0F);
		QuarterTop4.addChild(Layer32);
		Layer32.setTextureOffset(30, 13).addBox(-7.0F, -2.0F, -9.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer32.setTextureOffset(56, 40).addBox(-8.0F, -4.0F, -9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer32.setTextureOffset(8, 0).addBox(-6.0F, -1.0F, -9.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer32.setTextureOffset(30, 6).addBox(-8.0F, -3.0F, -9.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer33 = new ModelRenderer(this);
		Layer33.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop4.addChild(Layer33);
		Layer33.setTextureOffset(30, 0).addBox(-7.0F, -7.0F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer33.setTextureOffset(56, 38).addBox(-5.0F, -6.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer33.setTextureOffset(56, 27).addBox(-4.0F, -5.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer33.setTextureOffset(30, 2).addBox(-3.0F, -4.0F, -7.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer34 = new ModelRenderer(this);
		Layer34.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterTop4.addChild(Layer34);
		Layer34.setTextureOffset(15, 30).addBox(-7.0F, -7.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer34.setTextureOffset(56, 25).addBox(-4.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer34.setTextureOffset(56, 22).addBox(-3.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer34.setTextureOffset(34, 78).addBox(-2.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer34.setTextureOffset(7, 56).addBox(-1.0F, -3.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer35 = new ModelRenderer(this);
		Layer35.setRotationPoint(0.0F, -2.0F, 1.0F);
		QuarterTop4.addChild(Layer35);
		Layer35.setTextureOffset(29, 21).addBox(-7.0F, -7.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer35.setTextureOffset(56, 20).addBox(-4.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer35.setTextureOffset(43, 56).addBox(-3.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer35.setTextureOffset(4, 8).addBox(-1.0F, -4.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer35.setTextureOffset(68, 44).addBox(-1.0F, -4.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer35.setTextureOffset(30, 55).addBox(0.0F, -2.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer36 = new ModelRenderer(this);
		Layer36.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop4.addChild(Layer36);
		Layer36.setTextureOffset(55, 47).addBox(-7.0F, -10.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer36.setTextureOffset(55, 14).addBox(-3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer36.setTextureOffset(68, 32).addBox(-1.0F, -7.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer36.setTextureOffset(55, 55).addBox(-5.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer36.setTextureOffset(68, 9).addBox(0.0F, -5.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer36.setTextureOffset(68, 6).addBox(1.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer37 = new ModelRenderer(this);
		Layer37.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop4.addChild(Layer37);
		Layer37.setTextureOffset(12, 78).addBox(-1.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer37.setTextureOffset(29, 15).addBox(-7.0F, -10.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer37.setTextureOffset(6, 78).addBox(-2.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer37.setTextureOffset(49, 55).addBox(-4.0F, -9.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer37.setTextureOffset(63, 68).addBox(0.0F, -6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer37.setTextureOffset(21, 55).addBox(1.0F, -4.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer38 = new ModelRenderer(this);
		Layer38.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterTop4.addChild(Layer38);
		Layer38.setTextureOffset(0, 78).addBox(-7.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(77, 68).addBox(2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(29, 29).addBox(-6.0F, -10.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(54, 31).addBox(-3.0F, -9.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(54, 29).addBox(-3.0F, -9.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(77, 66).addBox(-1.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(15, 55).addBox(1.0F, -5.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(77, 39).addBox(0.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer38.setTextureOffset(77, 31).addBox(0.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer39 = new ModelRenderer(this);
		Layer39.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterTop4.addChild(Layer39);
		Layer39.setTextureOffset(54, 10).addBox(-7.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(77, 29).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(77, 26).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(77, 24).addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(0, 55).addBox(1.0F, -5.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(53, 68).addBox(2.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer39.setTextureOffset(8, 29).addBox(-5.0F, -9.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer40 = new ModelRenderer(this);
		Layer40.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterTop4.addChild(Layer40);
		Layer40.setTextureOffset(0, 29).addBox(-7.0F, -10.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(44, 54).addBox(-4.0F, -9.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(77, 13).addBox(-2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(77, 11).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(68, 77).addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(49, 68).addBox(1.0F, -5.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer40.setTextureOffset(35, 54).addBox(2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterBot1 = new ModelRenderer(this);
		QuarterBot1.setRotationPoint(-2.0F, -8.0F, 8.0F);
		Sphere.addChild(QuarterBot1);
		setRotationAngle(QuarterBot1, 3.1416F, 0.0F, 0.0F);

		Layer41 = new ModelRenderer(this);
		Layer41.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot1.addChild(Layer41);
		Layer41.setTextureOffset(28, 19).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer41.setTextureOffset(64, 77).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer41.setTextureOffset(25, 54).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer42 = new ModelRenderer(this);
		Layer42.setRotationPoint(1.0F, -2.0F, 1.0F);
		QuarterBot1.addChild(Layer42);
		Layer42.setTextureOffset(28, 17).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer42.setTextureOffset(53, 33).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer42.setTextureOffset(7, 8).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer42.setTextureOffset(28, 10).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer43 = new ModelRenderer(this);
		Layer43.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot1.addChild(Layer43);
		Layer43.setTextureOffset(28, 8).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer43.setTextureOffset(53, 17).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer43.setTextureOffset(53, 7).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer43.setTextureOffset(23, 28).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer44 = new ModelRenderer(this);
		Layer44.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot1.addChild(Layer44);
		Layer44.setTextureOffset(16, 27).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer44.setTextureOffset(53, 5).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer44.setTextureOffset(53, 3).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer44.setTextureOffset(56, 77).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer44.setTextureOffset(11, 54).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer45 = new ModelRenderer(this);
		Layer45.setRotationPoint(0.0F, -2.0F, 1.0F);
		QuarterBot1.addChild(Layer45);
		Layer45.setTextureOffset(8, 27).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer45.setTextureOffset(53, 1).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer45.setTextureOffset(51, 53).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer45.setTextureOffset(2, 8).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer45.setTextureOffset(45, 68).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer45.setTextureOffset(40, 53).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer46 = new ModelRenderer(this);
		Layer46.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot1.addChild(Layer46);
		Layer46.setTextureOffset(30, 53).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer46.setTextureOffset(52, 49).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer46.setTextureOffset(33, 68).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer46.setTextureOffset(52, 44).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer46.setTextureOffset(29, 68).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer46.setTextureOffset(25, 68).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer47 = new ModelRenderer(this);
		Layer47.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot1.addChild(Layer47);
		Layer47.setTextureOffset(49, 77).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer47.setTextureOffset(0, 27).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer47.setTextureOffset(45, 77).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer47.setTextureOffset(52, 42).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer47.setTextureOffset(21, 68).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer47.setTextureOffset(4, 53).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer48 = new ModelRenderer(this);
		Layer48.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot1.addChild(Layer48);
		Layer48.setTextureOffset(41, 77).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(37, 77).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(26, 23).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(52, 36).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(52, 12).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(31, 77).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(18, 52).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(27, 77).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer48.setTextureOffset(23, 77).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer49 = new ModelRenderer(this);
		Layer49.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot1.addChild(Layer49);
		Layer49.setTextureOffset(46, 52).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(19, 77).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(15, 77).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(9, 77).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(22, 51).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(67, 41).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer49.setTextureOffset(25, 26).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer50 = new ModelRenderer(this);
		Layer50.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot1.addChild(Layer50);
		Layer50.setTextureOffset(8, 25).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(12, 52).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(3, 77).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(76, 73).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(76, 71).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(67, 38).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer50.setTextureOffset(8, 51).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterBot2 = new ModelRenderer(this);
		QuarterBot2.setRotationPoint(-8.0F, -8.0F, -1.0F);
		Sphere.addChild(QuarterBot2);
		setRotationAngle(QuarterBot2, 3.1416F, -1.5708F, 0.0F);

		Layer51 = new ModelRenderer(this);
		Layer51.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot2.addChild(Layer51);
		Layer51.setTextureOffset(0, 25).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer51.setTextureOffset(76, 64).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer51.setTextureOffset(51, 39).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer52 = new ModelRenderer(this);
		Layer52.setRotationPoint(1.0F, -2.0F, 1.0F);
		QuarterBot2.addChild(Layer52);
		Layer52.setTextureOffset(23, 12).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer52.setTextureOffset(51, 26).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer52.setTextureOffset(0, 6).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer52.setTextureOffset(23, 5).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer53 = new ModelRenderer(this);
		Layer53.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot2.addChild(Layer53);
		Layer53.setTextureOffset(23, 1).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer53.setTextureOffset(51, 24).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer53.setTextureOffset(51, 21).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer53.setTextureOffset(20, 23).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer54 = new ModelRenderer(this);
		Layer54.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot2.addChild(Layer54);
		Layer54.setTextureOffset(12, 23).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer54.setTextureOffset(51, 19).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer54.setTextureOffset(51, 51).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer54.setTextureOffset(76, 55).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer54.setTextureOffset(0, 51).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer55 = new ModelRenderer(this);
		Layer55.setRotationPoint(0.0F, -2.0F, 1.0F);
		QuarterBot2.addChild(Layer55);
		Layer55.setTextureOffset(0, 23).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer55.setTextureOffset(41, 51).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer55.setTextureOffset(50, 46).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer55.setTextureOffset(0, 8).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer55.setTextureOffset(67, 35).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer55.setTextureOffset(37, 50).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer56 = new ModelRenderer(this);
		Layer56.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot2.addChild(Layer56);
		Layer56.setTextureOffset(50, 15).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer56.setTextureOffset(46, 50).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer56.setTextureOffset(67, 27).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer56.setTextureOffset(49, 30).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer56.setTextureOffset(67, 14).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer56.setTextureOffset(67, 67).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer57 = new ModelRenderer(this);
		Layer57.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot2.addChild(Layer57);
		Layer57.setTextureOffset(76, 52).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer57.setTextureOffset(22, 14).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer57.setTextureOffset(76, 50).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer57.setTextureOffset(49, 28).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer57.setTextureOffset(41, 67).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer57.setTextureOffset(27, 50).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer58 = new ModelRenderer(this);
		Layer58.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot2.addChild(Layer58);
		Layer58.setTextureOffset(76, 47).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(76, 44).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(22, 3).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(49, 9).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(41, 49).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(76, 37).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(33, 49).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(76, 35).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer58.setTextureOffset(76, 22).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer59 = new ModelRenderer(this);
		Layer59.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot2.addChild(Layer59);
		Layer59.setTextureOffset(48, 34).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(76, 20).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(76, 18).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(76, 16).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(4, 49).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(17, 67).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer59.setTextureOffset(21, 18).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer60 = new ModelRenderer(this);
		Layer60.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot2.addChild(Layer60);
		Layer60.setTextureOffset(21, 16).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(48, 32).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(76, 5).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(76, 1).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(76, 76).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(11, 67).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer60.setTextureOffset(48, 36).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterBot3 = new ModelRenderer(this);
		QuarterBot3.setRotationPoint(1.0F, -8.0F, -7.0F);
		Sphere.addChild(QuarterBot3);
		setRotationAngle(QuarterBot3, 3.1416F, 3.1416F, 0.0F);

		Layer61 = new ModelRenderer(this);
		Layer61.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot3.addChild(Layer61);
		Layer61.setTextureOffset(21, 9).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer61.setTextureOffset(72, 76).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer61.setTextureOffset(48, 6).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer62 = new ModelRenderer(this);
		Layer62.setRotationPoint(1.0F, -2.0F, 1.0F);
		QuarterBot3.addChild(Layer62);
		Layer62.setTextureOffset(21, 7).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer62.setTextureOffset(48, 4).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer62.setTextureOffset(0, 3).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer62.setTextureOffset(21, 21).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer63 = new ModelRenderer(this);
		Layer63.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot3.addChild(Layer63);
		Layer63.setTextureOffset(13, 21).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer63.setTextureOffset(48, 2).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer63.setTextureOffset(48, 0).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer63.setTextureOffset(7, 20).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer64 = new ModelRenderer(this);
		Layer64.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot3.addChild(Layer64);
		Layer64.setTextureOffset(14, 19).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer64.setTextureOffset(47, 48).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer64.setTextureOffset(36, 48).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer64.setTextureOffset(61, 76).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer64.setTextureOffset(19, 48).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer65 = new ModelRenderer(this);
		Layer65.setRotationPoint(0.0F, -2.0F, 1.0F);
		QuarterBot3.addChild(Layer65);
		Layer65.setTextureOffset(0, 19).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer65.setTextureOffset(28, 48).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer65.setTextureOffset(47, 43).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer65.setTextureOffset(7, 5).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer65.setTextureOffset(3, 67).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer65.setTextureOffset(15, 48).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer66 = new ModelRenderer(this);
		Layer66.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot3.addChild(Layer66);
		Layer66.setTextureOffset(47, 41).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer66.setTextureOffset(47, 17).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer66.setTextureOffset(66, 56).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer66.setTextureOffset(47, 13).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer66.setTextureOffset(66, 53).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer66.setTextureOffset(66, 48).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer67 = new ModelRenderer(this);
		Layer67.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot3.addChild(Layer67);
		Layer67.setTextureOffset(53, 76).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer67.setTextureOffset(7, 18).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer67.setTextureOffset(34, 76).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer67.setTextureOffset(47, 11).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer67.setTextureOffset(66, 24).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer67.setTextureOffset(11, 48).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer68 = new ModelRenderer(this);
		Layer68.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot3.addChild(Layer68);
		Layer68.setTextureOffset(12, 76).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(6, 76).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(14, 17).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(42, 47).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(46, 25).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(0, 76).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(24, 47).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(75, 62).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer68.setTextureOffset(75, 60).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer69 = new ModelRenderer(this);
		Layer69.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot3.addChild(Layer69);
		Layer69.setTextureOffset(46, 23).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(75, 58).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(75, 42).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(75, 33).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(0, 47).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(66, 19).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer69.setTextureOffset(0, 17).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer70 = new ModelRenderer(this);
		Layer70.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot3.addChild(Layer70);
		Layer70.setTextureOffset(16, 11).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(46, 20).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(75, 9).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(75, 3).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(69, 75).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(60, 66).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer70.setTextureOffset(7, 46).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		QuarterBot4 = new ModelRenderer(this);
		QuarterBot4.setRotationPoint(7.0F, -8.0F, 2.0F);
		Sphere.addChild(QuarterBot4);
		setRotationAngle(QuarterBot4, 3.1416F, 1.5708F, 0.0F);

		Layer71 = new ModelRenderer(this);
		Layer71.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot4.addChild(Layer71);
		Layer71.setTextureOffset(16, 0).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer71.setTextureOffset(65, 75).addBox(2.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer71.setTextureOffset(37, 46).addBox(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Layer72 = new ModelRenderer(this);
		Layer72.setRotationPoint(1.0F, -2.0F, 1.0F);
		QuarterBot4.addChild(Layer72);
		Layer72.setTextureOffset(7, 16).addBox(2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer72.setTextureOffset(19, 46).addBox(1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer72.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Layer72.setTextureOffset(15, 13).addBox(1.0F, -3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer73 = new ModelRenderer(this);
		Layer73.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot4.addChild(Layer73);
		Layer73.setTextureOffset(15, 5).addBox(2.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer73.setTextureOffset(45, 45).addBox(4.0F, -6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer73.setTextureOffset(44, 29).addBox(5.0F, -5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer73.setTextureOffset(15, 7).addBox(6.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Layer74 = new ModelRenderer(this);
		Layer74.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot4.addChild(Layer74);
		Layer74.setTextureOffset(15, 2).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer74.setTextureOffset(44, 27).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer74.setTextureOffset(44, 15).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer74.setTextureOffset(58, 75).addBox(7.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer74.setTextureOffset(33, 45).addBox(8.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer75 = new ModelRenderer(this);
		Layer75.setRotationPoint(0.0F, -2.0F, 1.0F);
		QuarterBot4.addChild(Layer75);
		Layer75.setTextureOffset(14, 15).addBox(2.0F, -7.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer75.setTextureOffset(44, 8).addBox(5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer75.setTextureOffset(40, 44).addBox(6.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer75.setTextureOffset(7, 2).addBox(8.0F, -4.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Layer75.setTextureOffset(56, 66).addBox(8.0F, -4.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer75.setTextureOffset(29, 44).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer76 = new ModelRenderer(this);
		Layer76.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot4.addChild(Layer76);
		Layer76.setTextureOffset(43, 39).addBox(2.0F, -10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer76.setTextureOffset(43, 35).addBox(6.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer76.setTextureOffset(37, 66).addBox(8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer76.setTextureOffset(43, 33).addBox(4.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer76.setTextureOffset(7, 66).addBox(9.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer76.setTextureOffset(65, 61).addBox(10.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Layer77 = new ModelRenderer(this);
		Layer77.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot4.addChild(Layer77);
		Layer77.setTextureOffset(50, 75).addBox(8.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer77.setTextureOffset(0, 15).addBox(2.0F, -10.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer77.setTextureOffset(46, 75).addBox(7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer77.setTextureOffset(43, 31).addBox(5.0F, -9.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer77.setTextureOffset(65, 30).addBox(9.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer77.setTextureOffset(15, 44).addBox(10.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Layer78 = new ModelRenderer(this);
		Layer78.setRotationPoint(0.0F, 0.0F, 0.0F);
		QuarterBot4.addChild(Layer78);
		Layer78.setTextureOffset(42, 75).addBox(2.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(38, 75).addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(7, 14).addBox(3.0F, -10.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(43, 5).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(43, 3).addBox(6.0F, -9.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(31, 75).addBox(8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(11, 44).addBox(10.0F, -5.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(27, 75).addBox(9.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer78.setTextureOffset(23, 75).addBox(9.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Layer79 = new ModelRenderer(this);
		Layer79.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot4.addChild(Layer79);
		Layer79.setTextureOffset(43, 1).addBox(2.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(19, 75).addBox(7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(15, 75).addBox(8.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(9, 75).addBox(9.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(43, 17).addBox(10.0F, -5.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(65, 11).addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer79.setTextureOffset(0, 13).addBox(4.0F, -9.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Layer80 = new ModelRenderer(this);
		Layer80.setRotationPoint(0.0F, -1.0F, 0.0F);
		QuarterBot4.addChild(Layer80);
		Layer80.setTextureOffset(8, 6).addBox(2.0F, -10.0F, 6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(42, 37).addBox(5.0F, -9.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(3, 75).addBox(7.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(74, 69).addBox(8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(74, 67).addBox(9.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(64, 65).addBox(10.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Layer80.setTextureOffset(25, 43).addBox(11.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Core = new ModelRenderer(this);
		Core.setRotationPoint(-2.0F, -14.0F, 1.0F);
		Sphere.addChild(Core);
		setRotationAngle(Core, -1.5708F, 0.0F, 0.0F);

		dots = new ModelRenderer(this);
		dots.setRotationPoint(0.0F, 0.0F, 0.0F);
		Core.addChild(dots);
		dots.setTextureOffset(74, 40).addBox(-9.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dots.setTextureOffset(74, 30).addBox(1.0F, 10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dots.setTextureOffset(74, 28).addBox(1.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dots.setTextureOffset(74, 25).addBox(11.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dots.setTextureOffset(74, 14).addBox(1.0F, 0.0F, 16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		dots.setTextureOffset(74, 12).addBox(1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		x = new ModelRenderer(this);
		x.setRotationPoint(0.0F, 0.0F, 0.0F);
		Core.addChild(x);

		side1 = new ModelRenderer(this);
		side1.setRotationPoint(0.0F, 0.0F, 0.0F);
		x.addChild(side1);
		side1.setTextureOffset(42, 12).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(74, 7).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(73, 74).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(62, 74).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(55, 74).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(35, 74).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(12, 74).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(52, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side1.setTextureOffset(4, 43).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side2 = new ModelRenderer(this);
		side2.setRotationPoint(2.0F, -1.0F, 0.0F);
		x.addChild(side2);
		setRotationAngle(side2, 0.0F, 0.0F, 1.5708F);
		side2.setTextureOffset(42, 10).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(6, 74).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(0, 74).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(73, 72).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(73, 65).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(73, 56).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(73, 54).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(48, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side2.setTextureOffset(0, 43).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side3 = new ModelRenderer(this);
		side3.setRotationPoint(3.0F, 1.0F, 0.0F);
		x.addChild(side3);
		setRotationAngle(side3, 0.0F, 0.0F, -3.1416F);
		side3.setTextureOffset(42, 42).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 51).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 49).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 46).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 38).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 36).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(73, 23).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(44, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side3.setTextureOffset(36, 42).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side4 = new ModelRenderer(this);
		side4.setRotationPoint(1.0F, 2.0F, 0.0F);
		x.addChild(side4);
		setRotationAngle(side4, 0.0F, 0.0F, -1.5708F);
		side4.setTextureOffset(41, 24).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(73, 21).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(73, 17).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(73, 0).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(70, 73).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(66, 73).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(59, 73).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(33, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side4.setTextureOffset(21, 42).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		y = new ModelRenderer(this);
		y.setRotationPoint(8.0F, 0.0F, 5.0F);
		Core.addChild(y);
		setRotationAngle(y, 0.0F, -1.5708F, 0.0F);

		side5 = new ModelRenderer(this);
		side5.setRotationPoint(0.0F, 0.0F, 0.0F);
		y.addChild(side5);
		side5.setTextureOffset(41, 22).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(52, 73).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(48, 73).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(44, 73).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(40, 73).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(32, 73).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(28, 73).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(29, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side5.setTextureOffset(32, 41).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side6 = new ModelRenderer(this);
		side6.setRotationPoint(2.0F, -1.0F, 0.0F);
		y.addChild(side6);
		setRotationAngle(side6, 0.0F, 0.0F, 1.5708F);
		side6.setTextureOffset(26, 41).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(24, 73).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(20, 73).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(16, 73).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(9, 73).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(3, 73).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(72, 63).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(25, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side6.setTextureOffset(8, 41).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side7 = new ModelRenderer(this);
		side7.setRotationPoint(3.0F, 1.0F, 0.0F);
		y.addChild(side7);
		setRotationAngle(side7, 0.0F, 0.0F, -3.1416F);
		side7.setTextureOffset(21, 40).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 59).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 44).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 32).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 19).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 10).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(72, 5).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(21, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side7.setTextureOffset(17, 40).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side8 = new ModelRenderer(this);
		side8.setRotationPoint(1.0F, 2.0F, 0.0F);
		y.addChild(side8);
		setRotationAngle(side8, 0.0F, 0.0F, -1.5708F);
		side8.setTextureOffset(39, 28).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(72, 2).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(63, 72).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(56, 72).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(37, 72).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(13, 72).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(6, 72).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(14, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side8.setTextureOffset(13, 40).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		z = new ModelRenderer(this);
		z.setRotationPoint(0.0F, -6.0F, 7.0F);
		Core.addChild(z);
		setRotationAngle(z, -1.5708F, 0.0F, 0.0F);

		side9 = new ModelRenderer(this);
		side9.setRotationPoint(0.0F, 0.0F, 0.0F);
		z.addChild(side9);
		side9.setTextureOffset(39, 26).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(0, 72).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(71, 68).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(71, 61).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(71, 42).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(71, 34).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(71, 27).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(0, 65).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side9.setTextureOffset(39, 39).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side10 = new ModelRenderer(this);
		side10.setRotationPoint(2.0F, -1.0F, 0.0F);
		z.addChild(side10);
		setRotationAngle(side10, 0.0F, 0.0F, 1.5708F);
		side10.setTextureOffset(28, 39).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(71, 15).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(71, 8).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(60, 71).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(53, 71).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(49, 71).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(45, 71).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(64, 15).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side10.setTextureOffset(4, 39).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side11 = new ModelRenderer(this);
		side11.setRotationPoint(3.0F, 1.0F, 0.0F);
		z.addChild(side11);
		setRotationAngle(side11, 0.0F, 0.0F, -3.1416F);
		side11.setTextureOffset(38, 0).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(34, 71).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(30, 71).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(26, 71).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(22, 71).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(3, 71).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(70, 66).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(64, 7).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side11.setTextureOffset(0, 39).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		side12 = new ModelRenderer(this);
		side12.setRotationPoint(1.0F, 2.0F, 0.0F);
		z.addChild(side12);
		setRotationAngle(side12, 0.0F, 0.0F, -1.5708F);
		side12.setTextureOffset(0, 21).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(70, 57).addBox(-2.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(70, 53).addBox(-3.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(70, 40).addBox(-4.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(70, 37).addBox(-5.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(69, 55).addBox(-6.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(16, 25).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(36, 63).addBox(-8.0F, -5.0F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		side12.setTextureOffset(35, 38).addBox(-9.0F, -3.0F, 6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

	}

	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}

//	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		this.Sphere.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

}
