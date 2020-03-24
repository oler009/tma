package com.example.examplemod;

import org.lwjgl.input.Keyboard;


import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = tmat.MODID, version = tmat.VERSION)
public class tmat
{
	public static final String MODID = "tmat";
	//public static final String NAME = "techno-magic armor and tools";
    public static final String VERSION = "1.0";
    
   // public static KeyBinding[] keyBindings;
    
    // KeyBinding(��������, �������, �������/������)
   // public static KeyBinding[] keyBindings new KeyBinding("key.structure.desc", Keyboard.KEY_P, "key.magicbeans.category");

  
    public final static KeyBinding tmatfly = new KeyBinding("key.tmat.fly", Keyboard.KEY_SPACE, "key.tmat.name.setings");
    public final static KeyBinding tmajamp = new KeyBinding("key.tmat.teleport", Keyboard.KEY_G, "key.tmat.name.setings");
    public final static KeyBinding tmatsetings = new KeyBinding("key.tmat.tmatsetings", Keyboard.KEY_C, "key.tmat.name.setings");
  //  public final static KeyBinding Gun_prana = new KeyBinding("key.tmat.Gun_prana", Keyboard.KEY_C, "key.tmat.name.setings");
    public final static KeyBinding itegrate_armor = new KeyBinding("key.tmat.itegrate_armor", Keyboard.KEY_C, "key.tmat.name.setings");
    
    
    public final static KeyBinding tmaradio = new KeyBinding("key.tmat.radio", Keyboard.KEY_C, "key.tmat.name.setings");
    /*public final static KeyBinding tmaradiom = new KeyBinding("key.tmat.radiom", Keyboard.KEY_Z, "key.tmat.name.setings");
    public final static KeyBinding tmaradiop = new KeyBinding("key.tmat.radiop", Keyboard.KEY_X, "key.tmat.name.setings");
     */
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
  
    	//ClientRegistry.registerKeyBinding(Gun_prana);
    	
    	ClientRegistry.registerKeyBinding(tmatfly);
    	ClientRegistry.registerKeyBinding(tmajamp);
    	ClientRegistry.registerKeyBinding(tmatsetings);
    	ClientRegistry.registerKeyBinding(itegrate_armor);
    	
    	
    	
    	ClientRegistry.registerKeyBinding(tmaradio);
    	/*ClientRegistry.registerKeyBinding(tmaradiom);
    	ClientRegistry.registerKeyBinding(tmaradiop);*/
	}
    
    public static long magic_shild;
    public static long magic_shild_lvl = 1;
    public static long magic_shild_expereans;
    public static long magic_shild_regen;
    
    
    public static Boolean tmatflyBoolean = false;
    public static Boolean tmajampBoolean = false;
    public static Boolean tmat_armor_integrate;
    
    
    public static Item magichelmet;
    public static Item magicplate;
    public static Item magicpants;
    public static Item magicboots;
    public static ArmorMaterial TMAT = EnumHelper.addArmorMaterial("BESTMAT", 1000, new int[] {3, 8, 6, 3}, 30);

   
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
 
    	
    	
    	 magicpants = new BestArmor(0, 2).setUnlocalizedName(MODID+".magicpants").setTextureName(MODID+":BestArmorPants");
   	 	 magichelmet = new BestArmor(0, 0).setUnlocalizedName(MODID+".magichelmet").setTextureName(MODID+":BestArmorHelmet");
    	 magicplate = new BestArmor(0, 1).setUnlocalizedName(MODID+".magicplate").setTextureName(MODID+":BestArmorPlate");
    	 magicboots = new BestArmor(0, 3).setUnlocalizedName(MODID+".magicboots").setTextureName(MODID+":BestArmorBoots");
    	 
    	 GameRegistry.registerItem(magicpants, "magicpants");
    	 GameRegistry.registerItem(magichelmet, "magichelmet");
    	 GameRegistry.registerItem(magicplate, "magicplate");
    	 GameRegistry.registerItem(magicboots, "magicboots");
    	
        		 
        			 /**/
    	 			// ������
        			 GameRegistry.addRecipe(new ItemStack(tmat.magichelmet), 
                			 "XYX", 
                			 "XZX", 
                			 "XXX", 
                	 'X', Blocks.obsidian,'Z',Items.diamond,'Y',Items.gold_ingot);
        			 
        			 // �����
        			 GameRegistry.addRecipe(new ItemStack(tmat.magicboots), 
                			 "XYX", 
                			 "ZZZ", 
                			 "XAX", 
                			 'A', Blocks.gold_block,'X', Blocks.obsidian,'Z',Items.diamond,'Y',Blocks.wool);
        			
        			 // �����
        			 GameRegistry.addRecipe(new ItemStack(tmat.magicpants), 
                			 "XXX", 
                			 "XZX", 
                			 "XYX", 
                	 'X', Blocks.wool,'Z',Items.diamond,'Y',Items.gold_ingot);
        			 
        			 //�������
        			 GameRegistry.addRecipe(new ItemStack(tmat.magicplate), 
                			 "WZW", 
                			 "WGW", 
                			 "WUW", 
                	 'G', Blocks.obsidian,'W',Blocks.wool,'Z',Items.diamond,'U',Items.gold_ingot);
        			 
    	 
         FMLCommonHandler.instance().bus().register(new busEvent());

         MinecraftForge.EVENT_BUS.register(new PropertiesRegistry());
         
         
         
    }
    

    
    /*
    @SubscribeEvent
    public void onEntityConstructing(EntityConstructing event)
    {
    	if (event.entity instanceof EntityPlayer)
    	{
    		if (PlayerProps.get((EntityPlayer) event.entity) == null)
    			PlayerProps.register((EntityPlayer) event.entity);
    	}
    }*/
    

    

}
