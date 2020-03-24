package com.example.examplemod.guis;

import java.awt.Color;
import java.io.IOException;

import org.lwjgl.opengl.GL11;

import com.example.examplemod.tmat;
import com.example.examplemod.tmat_skill;

import cpw.mods.fml.client.config.GuiButtonExt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;


public class status_shild extends GuiScreen{
	
	private GuiButtonExt Button1;
	private GuiTextField trxtfiend1;
	private GuiLabel GuiLabel1;
	
	
	
	@Override
	public void initGui() {
		Button1 = new GuiButtonExt(0, width/2 - 50, height/2 +80, 100, 20, StatCollector.translateToLocal("goi.tmat.setings.save"));
		buttonList.add(Button1);
		//trxtfiend1.setText(Long.toString(tmat_skill.radius_jamp));
		
		trxtfiend1 = new GuiTextField(fontRendererObj, width/2 -75, height/2 - 80, 150, 20);
	}
	
	
	
	@Override
	protected void keyTyped(char typeChar,int keyCode) {
		trxtfiend1.textboxKeyTyped(typeChar, keyCode);
		super.keyTyped(typeChar, keyCode);
	}
	
	@Override
	protected void mouseClicked(int mouseX,int mouseY , int mouseButton) {
		trxtfiend1.mouseClicked(mouseX, mouseY, mouseButton);
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
	
	@Override
	public void updateScreen() {
		trxtfiend1.updateCursorCounter();	
	} 
	
	boolean d = false;
	boolean se = true;
	 
	int guiWidth = 160;
	int guiHeight = 220;
	
	@Override
	public void drawScreen(int mouseX ,int mouseY , float partlalTicks) {
		int guiX = (width -guiWidth) /2;
		int guiY = (height -guiHeight) /2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(tmat.MODID, "textures/gui/tmatsetings.png" ));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		trxtfiend1.drawTextBox();
		//System.out.println("guiX "+guiX +60 + " guiY "+guiY +5 );
		fontRendererObj.drawString(StatCollector.translateToLocal("goi.tmat.setings.name"), guiX +60, guiY +5, 0x484040);
		fontRendererObj.drawString(StatCollector.translateToLocal("goi.tmat.setings.jampradius"), guiX +30, guiY +20, 0x484040);
		if(se) {
			//System.out.println(tmat_skill.radius_jamp);
			trxtfiend1.setText(Long.toString(tmat_skill.radius_jamp));
			se = false;
		}
		super.drawScreen(mouseX, mouseY, partlalTicks);
	} 
	
	@Override
	protected void actionPerformed(GuiButton button) {
		
		if(button == Button1) {
			//mc.displayGuiScreen(new status_shild());
			mc.displayGuiScreen(null);
			//System.out.println("до присваевания "+tmat_skill.radius_jamp);
			//System.out.println("что присваевается "+Long.parseLong(trxtfiend1.getText()));
			///tmat_skill.radius_jamp = Long.parseLong(trxtfiend1.getText());
			tmat_skill.radius_jamp(Long.parseLong(trxtfiend1.getText()));
			
			boolean se = false;
			//fontRendererObj.drawString("Настройки дальности Прышков", guiX +30, guiY +20, 0x484040);
			//System.out.println("что находится "+tmat_skill.radius_jamp);
			
			//System.out.println(trxtfiend1.getText());
			
			//tmat_skill.radius_jamp(Long.parseLong(trxtfiend1.getText()));
			//fontRendererObj.drawString(  "123", 13360, 105, 0x484040);
			//System.out.println("Button1");
			//Minecraft.getMinecraft().thePlayer.playSound("tmat:test", 1.5F, 1.5F);
			//Minecraft.getMinecraft().fontRenderer.drawString("[ 123 ]" , width / 2 + 5, height / 2 + 24, 0xFFFFFF);
			
		}
	}
	/*
	@Override
	public void */
}
