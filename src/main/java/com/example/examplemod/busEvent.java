package com.example.examplemod;

import java.util.Date;
import java.util.Random;

import com.example.examplemod.guis.status_shild;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.StatCollector;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

public class busEvent {

	private int last_damage = -1;
	private int cooldown228 = 0;
	public static int magicsetitems = 0 ;
	
	 long armor_repair_head = 0;
	 long armor_repair_body = 0;
	 long armor_repair_legs = 0;
	 long armor_repair_feet = 0;
	 	 

	
	 public static long  generator_shild;
	 public static long  repair_items;
	 public static long  Foodtimer;
	 public static long randomteleport;
	 
	 public static long magic_shild;
	 
	 
	 //long shild_generator = 0;
	
	 public  EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
	

	   
	 @SubscribeEvent 
	 public void key(KeyInputEvent event)
	 {
		  if (tmat.tmatfly.isPressed()) 
		    {
			  tmat_skill.Speedfly(); 
		    }
		  
		  
		  if (tmat.itegrate_armor.isPressed()) 
		    {
			  tmat_skill.itegrate_armor(); 
		    }
		  
		  
		  if (tmat.tmajamp.isPressed()) 
		    {
			  Minecraft.getMinecraft().thePlayer.playSound("tmat:jamp", 1.5F, 1.5F);
			  ///tmat_skill.tmajamp(1);
			//  System.out.println("Teleport");
				tmat_skill.tmajamp(); 
		    }
		  if (tmat.tmatsetings.isPressed()) 
		    {
			//  Minecraft.getMinecraft().thePlayer.playSound("tmat:jamp", 1.5F, 1.5F);
			  ///tmat_skill.tmajamp(1);
			//  System.out.println("Teleport");
				Minecraft.getMinecraft().displayGuiScreen(new status_shild());
		    }
		  /*
		  if (tmat.Gun_prana.isPressed()) 
		    {
			  Minecraft.getMinecraft().thePlayer.playSound("tmat:jamp", 1.5F, 1.5F);
			  
			  MovingObjectPosition object = Minecraft.getMinecraft().objectMouseOver;
				
				if (object.typeOfHit == MovingObjectType.ENTITY)
				{
					System.out.println("typeOfHit = " + object.entityHit.getCommandSenderName());
					//object.entityHit.
					//object.entityHit.attackEntityFrom(DamageSource.causePlayerDamage(Minecraft.getMinecraft().thePlayer), 10);

					

					
				}
			  //tmat_skill.Gun_prana(1);
		    }
		  */
		  
		 
		  /*
		 if(tmat.tmaradio.isPressed()) 
		 {
			 System.out.println("�����");
			 tmat_skill.radio("http://air.radiorecord.ru:8101/rr_320.m3u");
			 
			// if(tmat_skill.radiostatus ==  false)tmat_skill.radiostop("http://air.radiorecord.ru:8101/rr_320");
			 
			
			 
			 //System.out.println( player.getHeldItem().getDisplayName());
			 //if(player.getLastActiveItems() != null){}
				// System.out.println( player.getItemInUse().getDisplayName());
				 //System.out.println( player.getLastActiveItems());
					/// if(player.getLastActiveItems()) {}
			//  tmat_skill.radio(String urlradio)
			 
		 }
		 */
		  
		if(tmat.tmaradio.isPressed()) 
		{
			Random rnd = new Random();
			Minecraft.getMinecraft().thePlayer.playSound("tmat:lvlup", 1.5F, 1.5F); 
			//Minecraft.getMinecraft().thePlayer.playSound("tmat:shild/shild"+rnd.nextInt(10), 1.5F, 1.5F); 
		//	soundManager.sndSystem.stop(soundName);
		}
		}
	 
	 

	 
	 /*
	 //@SideOnly(Side.CLIENT)
	 @SubscribeEvent()
	 public void onEvent(KeyInputEvent event)
	 {
		// ��������, ��������� ��� ������� ����� �������
		    System.out.println("Key Input Event");
		    
		    // ������ ������
		    KeyBinding[] keyBindings = tmat.keyBindings;//Main - ������� �����
		   
		    if (player.isSneaking()) {
			
		
				if(busEvent.magicsetitems ==4) {
					ItemStack legs = player.getCurrentArmor(1);
					Date date = new Date();
					if(legs != null) {
					if(tmat.magic_shild >  50 && legs.getUnlocalizedName().indexOf("magicpants",1) > 1)
					{
						if (player.isSneaking()) {
							System.out.println("2  = "+ Keyboard.KEY_SPACE	);	
							//System.out.println("2  = "+ OnKeyboard.KEY_SPACE	);	
					
						}
				    }}
					
					}
		    // ��������� �� ������ ������
		    if (keyBindings[0].isPressed()) 
		    {
		        // ������� ��������� ��� ������� ������� � ������ 0(����� ������ �� ��� ������)
		        System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
		        
		        
				if(BestArmor.onflyplayer == true && BestArmor.timeractivefly < date.getTime())
				{
					player.capabilities.allowFlying = false;
					BestArmor.onflyplayer = false;
					 player.capabilities.setFlySpeed(1);
					 BestArmor.timeractivefly =  date.getTime() + 2000;
					// System.out.println("0  = "+ player.capabilities.allowFlying);	
				}
				if(BestArmor.onflyplayer == false && BestArmor.timeractivefly < date.getTime()) {
					BestArmor.Speedfly = ((tmat.magic_shild_lvl) * 1)/100;
					player.capabilities.allowFlying = true;
					BestArmor.onflyplayer = true;
					 player.capabilities.setFlySpeed(Speedfly);
					 BestArmor.timeractivefly =  date.getTime() + 2000;
					// System.out.println("1  = "+ player.capabilities.allowFlying);
				}
				
		    }
		    if (keyBindings[1].isPressed()) 
		    {
		    	
		        // ������� ��������� ��� ������� ������� � ������ 1(����� ������ �� ��� ������)
		        System.out.println("Key binding ="+keyBindings[1].getKeyDescription()); 
		        
		    	double newX = player.posX + world.rand.nextInt(50) - world.rand.nextInt(50);
			    double newZ = player.posZ + world.rand.nextInt(50) - world.rand.nextInt(50);
		
		    	busEvent.randomteleport = date.getTime() +  (60000 - tmat.magic_shild_lvl);
		    	//System.out.println("Keyboard.KEY_T  = "+ Keyboard.KEY_T);	
		        player.setPosition(newX, player.posY, newZ);
		        tmat_skill.shild_to_experians(50);
		        
		    }
		    }
	 }
	 */

	 
	 
	@SubscribeEvent
	public void update228(TickEvent.PlayerTickEvent event) {
	if (event.side == Side.SERVER) {
	EntityPlayer player = event.player;
	if (player != null) {
	ItemStack head = player.getCurrentArmor(3);
	ItemStack body = player.getCurrentArmor(2);
	ItemStack legs = player.getCurrentArmor(1);
	ItemStack feet = player.getCurrentArmor(0);
	
	

	//String magichelmet = tmat.magichelmet.getUnlocalizedName();
	
	//-----------------------------------------

	//System.out.println("Test :" + head.getUnlocalizedName());
	//if (head != null) {}
	 magicsetitems = 0;
	 
	 if(tmat.tmat_armor_integrate == null) tmat.tmat_armor_integrate= false;
	 if(tmat.tmat_armor_integrate) {
		 magicsetitems = 4;
	 }
	 else {
		 
	 
	if (head != null) {
	if(head.getUnlocalizedName().indexOf("magichelmet",1) > 1)
	{
		//System.out.println("setcomplit magichelmet");
		//System.out.println( "getMaxDamage "+head.getMaxDamage() + " "+  "getItemDamage "+ head.getItemDamage());
		
		
		if(head.getItemDamage()!= 0)
		{
			Date date = new Date();	
				if(armor_repair_head < date.getTime()) 
				{
				//	System.out.println();
					long timer_repair = 60000 - tmat.magic_shild_lvl ;
					if(timer_repair < 1) {timer_repair = 1;}
					armor_repair_head = date.getTime() + timer_repair;
			       
					if(tmat.magic_shild >= 1 + repair_items)
					{
						tmat_skill.shild_to_experians(1 + (long) repair_items);
						head.setItemDamage(head.getItemDamage() - (1 + (int) repair_items));
					//	System.out.println("���������  "+ head.getMaxDamage()  + "/" + head.getItemDamage());	
					}
					
					
			    }
				//System.out.println( "  " + armor_repair_head + " - " + date.getTime()  + " - " + (date.getSeconds() - armor_repair_head ));


		}
		
		
		magicsetitems++;
	}
	}
	
	if (body != null) {
	if(body.getUnlocalizedName().indexOf("magicplate",1) > 1)
	{
		
		Date date = new Date();
		
		
		
		//System.out.println("getFoodStats  "+ player.getFoodStats().getFoodLevel());	
		
		
			if(Foodtimer < date.getTime() && player.getFoodStats().getFoodLevel() < 20) 
			{
				if(tmat.magic_shild >= 1 )
				{
					tmat_skill.shild_to_experians(1);
					Foodtimer =  120000 - tmat.magic_shild_lvl;
					player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel() +1);
					player.setHealth(player.getHealth() +1);
					player.getFoodStats().setFoodSaturationLevel(player.getFoodStats().getSaturationLevel() +1);
				}
			}
		
		//System.out.println("getFoodStats  "+ player.getAir());
		if(player.getAir() < 100) 
		{
			player.setAir(300);
			//System.out.println("getFoodStats  "+ player.getAir());
		}
		/**/
		if(body.getItemDamage() != 0) {
		if(armor_repair_body < date.getTime()) 
		{
			
			
			
			long timer_repair = 60000 - tmat.magic_shild_lvl;
			if(timer_repair < 1) {timer_repair = 1;}
			armor_repair_body = date.getTime() + timer_repair;
	       
			if(tmat.magic_shild >= 1 + (int) repair_items)
			{
				tmat_skill.shild_to_experians(1 + (long) repair_items);
				body.setItemDamage(body.getItemDamage() - (1 + (int) repair_items));
				//System.out.println("���������  "+ body.getMaxDamage()  + "/" + body.getItemDamage());	
			}
		}
			
	    }
		//System.out.println("setcomplit magicplate");
		magicsetitems++;
	}
	}
	
	if (legs != null) {
	if(legs.getUnlocalizedName().indexOf("magicpants",1) > 1)
	{
		if(legs.getItemDamage() != 0) 
		{
			Date date = new Date();
			if(armor_repair_legs < date.getTime()) 
			{
				long timer_repair = 60000 - tmat.magic_shild_lvl;
				if(timer_repair < 1) {timer_repair = 1;}
				armor_repair_legs = date.getTime() + timer_repair;
		       
				if(tmat.magic_shild >= 1 + (int) repair_items)
				{
					tmat_skill.shild_to_experians(1 + (long) repair_items);
					legs.setItemDamage(legs.getItemDamage() - (1 + (int) repair_items));
					//System.out.println("���������  "+ legs.getMaxDamage()  + "/" + legs.getItemDamage());	
				}
			}
	    }
		//System.out.println("setcomplit magicpants");
		magicsetitems++;
	}
	}
	
	
	if (feet != null) {
	if(feet.getUnlocalizedName().indexOf("magicboots",1) > 1)
	{
		if(feet.getItemDamage() != 0) {
		Date date = new Date();
		if(armor_repair_feet < date.getTime()) 
		{
			
			long timer_repair = 60000 - tmat.magic_shild_lvl;
			if(timer_repair < 1) {timer_repair = 1;}
			armor_repair_feet = date.getTime() + timer_repair;
	       
			if(tmat.magic_shild >= 1 + (int) repair_items)
			{
				tmat_skill.shild_to_experians(1 + (long) repair_items);
				feet.setItemDamage(feet.getItemDamage() - (1 + (int) repair_items));
				//System.out.println("���������  "+ feet.getMaxDamage()  + "/" + feet.getItemDamage());	
			}
			
		}
	    }
		
		

	    
		//System.out.println("setcomplit magicboots");
		magicsetitems++;
	}
	}
	 }
	//System.out.println("magic set items "+ magicsetitems);
	
	/**/
	
	//System.out.println("("+head.getUnlocalizedName() +")"+"("+ magichelmet2 +")");
	//System.out.println("("+head.getUnlocalizedName()+")"+"("+tmat.magichelmet.getUnlocalizedName()+")");
	
	//System.out.println(head.getUnlocalizedName());
	//System.out.println(tmat.magichelmet.getUnlocalizedName());
	/*
	if (legs != null) {
		last_damage = legs.getMaxDamage() - legs.getItemDamage();
	}
	*/
	int e = 0;
	
	if(magicsetitems == 4)
	{
		
//		 System.out.println("GuiScreenEvent");
		// event.gui.drawString(Minecraft.getMinecraft().fontRenderer, "Настройки", 13360, 105, 0x484040);
		// String magichelmet = tmat.magichelmet.getUnlocalizedName();
		// String name = StatCollector.translateToLocal("break_leg");
		// mc.fontRenderer.drawStringWithShadow(name, event.resolution.getScaledWidth() - mc.fontRenderer.getStringWidth(name) - 2, 20, 0xFFFFFF);
		
		final long time = Minecraft.getMinecraft().theWorld.getWorldTime() % 24000L;
		if (time < 12000L || time > 24000L) {

			if(Minecraft.getMinecraft().theWorld.getFullBlockLightValue((int) (Minecraft.getMinecraft().thePlayer.posX -1), (int) (Minecraft.getMinecraft().thePlayer.posY - 1) , (int) (Minecraft.getMinecraft().thePlayer.posZ -1)) < 11) 
			{
				Minecraft.getMinecraft().thePlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 240));
				// Minecraft.getMinecraft().fontRenderer.drawString("Настройки", 13360, 105, 0x484040);
				}
			else 
			{
				Minecraft.getMinecraft().thePlayer.removePotionEffect(Potion.nightVision.id);
			}
		}
		else {
			Minecraft.getMinecraft().thePlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 240));
		}
		

//System.out.println(Minecraft.getMinecraft().theWorld.getFullBlockLightValue((int) (Minecraft.getMinecraft().thePlayer.posX -1), (int) (Minecraft.getMinecraft().thePlayer.posY - 1) , (int) (Minecraft.getMinecraft().thePlayer.posZ -1)));

	//	System.out.println(Minecraft.getMinecraft().theWorld.getBlockLightValue((int) (Minecraft.getMinecraft().thePlayer.posX -1), (int) (Minecraft.getMinecraft().thePlayer.posY - 1) , (int) (Minecraft.getMinecraft().thePlayer.posZ -1)));
	//	System.out.println(Minecraft.getMinecraft().theWorld.getFullBlockLightValue((int) (Minecraft.getMinecraft().thePlayer.posX -1), (int) (Minecraft.getMinecraft().thePlayer.posY - 1) , (int) (Minecraft.getMinecraft().thePlayer.posZ -1)));
	//	System.out.println("X "+ (int) (Minecraft.getMinecraft().thePlayer.posX -1) + " Y "+ (int) (Minecraft.getMinecraft().thePlayer.posY - 2) + " Z " + (int) (Minecraft.getMinecraft().thePlayer.posZ -1));
		
		if(tmat.magic_shild_lvl == 0) {tmat.magic_shild_lvl = 1;}
		magic_shild = tmat.magic_shild_lvl * 5;

		tmat.magic_shild_regen = 1 * tmat.magic_shild_lvl;
		
		
		Date date = new Date();
		
		
		
		if(magic_shild > tmat.magic_shild && generator_shild < Minecraft.getMinecraft().theWorld.getWorldTime())
		{
			//System.out.println("Регенерация энергии");
			//generator_shild = (60000 - tmat.magic_shild_lvl) + date.getTime();
			if((1200 - tmat.magic_shild_lvl) > 0) {
				generator_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + (1200 - tmat.magic_shild_lvl);
			}
			else {
				generator_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + 20;
			}
			
			//System.out.println( generator_shild +"<"+ date.getTime());
			tmat.magic_shild += tmat.magic_shild_regen;
			if(magic_shild < tmat.magic_shild)tmat.magic_shild = magic_shild;

			
		}
		else {
			if(magic_shild == tmat.magic_shild  && generator_shild < Minecraft.getMinecraft().theWorld.getWorldTime()) {
				
				if((1200 - tmat.magic_shild_lvl) > 0) {
					generator_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + (1200 - tmat.magic_shild_lvl);
				}
				else {
					generator_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + 20;
				}
				
				tmat_skill.shild_to_experians(tmat.magic_shild_regen);
				tmat.magic_shild += tmat.magic_shild_regen;
				
			}
		}
		
		
		
		if(tmat_skill.tmajampbo) {
			
		
			  WorldClient world = Minecraft.getMinecraft().theWorld;
		 
			int radius_jamps =  (int) tmat_skill.radius_jamp;
	   	
		  if(busEvent.randomteleport < date.getTime() && tmat.magic_shild > radius_jamps)
		  {
			  double newX = player.posX + world.rand.nextInt(radius_jamps) - world.rand.nextInt(radius_jamps);
			  double newZ = player.posZ + world.rand.nextInt(radius_jamps) - world.rand.nextInt(radius_jamps);

		    busEvent.randomteleport = date.getTime() +  (60000 - tmat.magic_shild_lvl);
	       player.setPositionAndUpdate(newX, player.posY, newZ);
	       tmat_skill.shild_to_experians(radius_jamps);
		  }
		  else {
			  player.addChatMessage(new ChatComponentText( StatCollector.translateToLocal("tmat.message_name.coldawn") + " " + ((busEvent.randomteleport - date.getTime()) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund")));
		  }
		  tmat_skill.tmajampbo = false;
		}
		
		
	}
	
	}
	}
	
	
	}
}
