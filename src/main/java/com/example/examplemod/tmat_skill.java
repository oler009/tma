package com.example.examplemod;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.StatCollector;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

public class tmat_skill {
 public static	long nedxptolvl; 
	public static void lvl_to_experians() 
	{
		
		if(tmat.magic_shild_expereans > nedxptolvl)
		{
			//float nedxptolvl = tmat.magic_shild_lvl * 1000 + ((tmat.magic_shild_lvl * 5) * 25)/100; 
			nedxptolvl = tmat.magic_shild_lvl * 20 + ((tmat.magic_shild_lvl * 5) * 25)/100; 
			tmat.magic_shild_lvl++;
			//nedxptolvl = tmat.magic_shild_expereans - nedxptolvl;
			//tmat.magic_shild_expereans = (long) (tmat.magic_shild_expereans -  nedxptolvl);
			tmat.magic_shild_expereans = 0;
			//System.out.println(tmat.magic_shild_expereans+" > "+ nedxptolvl);
			//System.out.println("����� �������");
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.msesage.lvlup")));
			
		}
	}
	
	public static long shild_to_experians(long ammount) 
	{
		if(tmat.magic_shild >= ammount)
		{
			tmat.magic_shild -= ammount;
			tmat.magic_shild_expereans += ammount;
			lvl_to_experians() ;
			//
			return 0;
		}
		else {
			return (int) ammount - tmat.magic_shild;
		}
		
		
	}
	   private long timeractivefly;
	   private static float Speedfly;
	public static void Speedfly() 
	{
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		 
		if(tmat.tmatflyBoolean == false) {
			  
			  Speedfly = ((tmat.magic_shild_lvl) * 1)/100;
			  player.capabilities.allowFlying = true;
			  player.capabilities.isFlying= true;
			  tmat.tmatflyBoolean = true;  
		  }
		  else 
		  {
			  player.capabilities.setFlySpeed(1);
			  player.capabilities.allowFlying = false;
			  player.capabilities.isFlying= false;
			  tmat.tmatflyBoolean = false;
		  }
	}
	

	private static double[] a;
	public static boolean tmajampbo = false;
	public static void tmajamp() 
	{
		tmajampbo = true;

	}
	
	public static boolean radiostatus = false;
	public static String urlradiopub;
	//public static boolean tmajampbo;

	
	public static void radio(String string) 
	{
		Minecraft.getMinecraft().thePlayer.playSound("tmat:test", 1.5F, 1.5F);
	}
	
	public static long radius_jamp;
	
	
	public static void radius_jamp(long getlong) 
	{
		//System.out.println("Что в функции "+ getlong);
		if(getlong > 0 && getlong < tmat.magic_shild_lvl) 
		{
			tmat_skill.radius_jamp = getlong;
			//System.out.println("поподает в ограничается "+ tmat_skill.radius_jamp);
		}
		else if(getlong > 0) 
		{
			tmat_skill.radius_jamp = 0;
		}
		else if(getlong < tmat.magic_shild_lvl) 
		{
			tmat_skill.radius_jamp = tmat.magic_shild_lvl;
		}
		
		//System.out.println("что присвоилось "+tmat_skill.radius_jamp + " - " + tmat.magic_shild_lvl);
		//Minecraft.getMinecraft().thePlayer.playSound("tmat:test", 1.5F, 1.5F);
		
	}

	
	public static void Gun_prana(int i) {
	}
	

	public static void itegrate_armor() {
		
		
			ItemStack head = Minecraft.getMinecraft().thePlayer.getCurrentArmor(3);
			ItemStack body = Minecraft.getMinecraft().thePlayer.getCurrentArmor(2);
			ItemStack legs = Minecraft.getMinecraft().thePlayer.getCurrentArmor(1);
			ItemStack feet = Minecraft.getMinecraft().thePlayer.getCurrentArmor(0);
			if(tmat.tmat_armor_integrate) {
				
				int armor= 0;
				
				
				if(head == null) 
				{
					armor++;
				}
				else {
					
				}
				
				if(body == null) 
				{
					armor++;
				}
				else {
					
				}


				if(feet == null) 
				{
					armor++;
				}
				else {
					
				}

				if(legs == null) 
				{
					armor++;
				}
				else {
					
				}

				
				
				if(armor == 4)
				{
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(39 , new ItemStack(tmat.magichelmet));
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(38 , new ItemStack(tmat.magicplate));
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(37 , new ItemStack(tmat.magicpants));
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(36 , new ItemStack(tmat.magicboots));
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.message_name.armor.outport")));
					tmat.tmat_armor_integrate = false; 																																																																																																																																																																																																		
				}
				else {
					//Minecraft.getMinecraft().player.sendMessage(new TextComponentString("< Player11 > Hello, %p!".replace("%p", Minecraft.getMinecraft().player.getName())));
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.message_name.armor.nothull")));
				}
				
			}
			else {
			if(head != null  && body != null && legs != null && feet != null)
			{
				if(head.getUnlocalizedName().indexOf("magichelmet",1) > 1 && body.getUnlocalizedName().indexOf("magicplate",1) > 1 && legs.getUnlocalizedName().indexOf("magicpants",1) > 1 && feet.getUnlocalizedName().indexOf("magicboots",1) > 1)
				{ 
					//Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(40,null);
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(39,null);
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(38,null);
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(37,null);
					Minecraft.getMinecraft().thePlayer.inventory.setInventorySlotContents(36,null);
					
					///Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.message_name.armor.outport")));
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.message_name.armor.import")));
					
					tmat.tmat_armor_integrate = true; 
					
				}
			}
			}
			
			
			
		
	}

	
}
