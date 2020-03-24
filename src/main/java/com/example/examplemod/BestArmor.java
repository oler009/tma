package com.example.examplemod;

import java.awt.List;
import java.util.Date;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants.NBT;


public class BestArmor  extends ItemArmor{

	private String texturePath = tmat.MODID+":textures/model/armor/";


	public BestArmor(int id, int armorType) 
	{
		  super(tmat.TMAT, id, armorType);
		  this.setCreativeTab(CreativeTabs.tabCombat);
		  this.setMaxStackSize(1);
		  this.setTextureName();
		  
		  	
		  
		  //this.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
	}

	public void setTextureName ()
	{
	  if(armorType == 0){
	    this.texturePath += "MyBestArmor_" + 0 + ".png";
	  }
	  else if(armorType == 1){
		    this.texturePath += "MyBestArmor_" + 1 + ".png";
		  }
	  else if(armorType == 2){
		    this.texturePath += "MyBestArmor_" + 2 + ".png";
		  }
	  else if(armorType == 3){
		    this.texturePath += "MyBestArmor_" + 3 + ".png";
		  }
	  
	}
	/*
   private long timeractivefly;
   private float Speedfly;
   private boolean onflyplayer;
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(busEvent.magicsetitems ==4) {
		ItemStack legs = player.getCurrentArmor(1);
		Date date = new Date();
		if(legs != null) {
		if(tmat.magic_shild >  50 && legs.getUnlocalizedName().indexOf("magicpants",1) > 1)
		{
			if (player.isSneaking()) {
				System.out.println("2  = "+ Keyboard.KEY_SPACE	);	
				//System.out.println("2  = "+ OnKeyboard.KEY_SPACE	);	
			if (Keyboard.KEY_SPACE != 0) 
		    {
				 
				
				
					if(onflyplayer == true && timeractivefly < date.getTime())
					{
						player.capabilities.allowFlying = false;
						onflyplayer = false;
						 player.capabilities.setFlySpeed(1);
						 timeractivefly =  date.getTime() + 2000;
						// System.out.println("0  = "+ player.capabilities.allowFlying);	
					}
					if(onflyplayer == false && timeractivefly < date.getTime()) {
						 Speedfly = ((tmat.magic_shild_lvl) * 1)/100;
						player.capabilities.allowFlying = true;
						onflyplayer = true;
						 player.capabilities.setFlySpeed(Speedfly);
						 timeractivefly =  date.getTime() + 2000;
						// System.out.println("1  = "+ player.capabilities.allowFlying);
					}
					 
					//System.out.println("0  = "+ date.getTime());	
					//System.out.println("1  = "+ timeractivefly);
					
				
				
		    }
			else if (Keyboard.KEY_T > 0  && busEvent.randomteleport < date.getTime()) 
		    {
		    	double newX = player.posX + world.rand.nextInt(50) - world.rand.nextInt(50);
			    double newZ = player.posZ + world.rand.nextInt(50) - world.rand.nextInt(50);
		
		    	busEvent.randomteleport = date.getTime() +  (60000 - tmat.magic_shild_lvl);
		    	//System.out.println("Keyboard.KEY_T  = "+ Keyboard.KEY_T);	
		        player.setPosition(newX, player.posY, newZ);
		        tmat_skill.shild_to_experians(50);
		    }
			}
	    }}
		
		}
		if(busEvent.magicsetitems ==3)
		{
			 player.capabilities.allowFlying = false;
		}
	}
	//*/
    
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	{
		return this.texturePath;
	}
	
	
	
}
