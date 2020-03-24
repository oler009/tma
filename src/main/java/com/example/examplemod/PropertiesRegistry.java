package com.example.examplemod;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class PropertiesRegistry {
	
	
	public void textstring(ItemTooltipEvent event, Item stick, String string) 
    {
	     if(event.itemStack.getItem() == stick)
	     {
	    	 event.toolTip.add( string);

	     }
    }
	float generator_float_shild;

	
    @SubscribeEvent
    public void itemTooltipEvent(ItemTooltipEvent event) {
    	
    	if((1200 - tmat.magic_shild_lvl) > 0) {
    		generator_float_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + (1200 - tmat.magic_shild_lvl);
    	}
    	else {
    		generator_float_shild = Minecraft.getMinecraft().theWorld.getWorldTime() + 20;
    	}
    	
     if (event.itemStack != null && event.itemStack.getItem() != null) {

     if(busEvent.magicsetitems == 4) 
	 {
    	 /*
    	 // фермер
    	 textstring(event,Items.bread,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 3—4 шт за Эмеральд");
    	 textstring(event,Items.melon_seeds,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 5—4 шт за 1 Эмеральд");
    	 textstring(event,Items.apple,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 5—8 шт за 1 Эмеральд");
    	 textstring(event,Items.cake,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 8—10 шт за 1 Эмеральд");
    	 textstring(event,Items.shears,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 1 шт за 3 Эмеральд");
    	 textstring(event,Items.flint_and_steel,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 1 шт за 3 Эмеральд");
    	 textstring(event,Items.cooked_chicken,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 7—8 шт за 1 Эмеральд");
    	 textstring(event,Items.arrow,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 9—12 шт за 1 Эмеральд");
    	 textstring(event,Items.flint,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traide.farmer") +" 4—5 шт за 10  гравия 1 Эмеральд");
    	 textstring(event,Items.wheat,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +StatCollector.translateToLocal("armor.bonus.set.traidep.farmer") +" 18—21	 шт за 1 Эмеральд");
    	 
    	 
    	 // библиотекарь
    	 textstring(event,Items.enchanted_book,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Библиотекарь 1 шт за 1 книга 5—7 Эмеральд");
    	 textstring(event,Items.compass,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Библиотекарь 1 шт за 10—11 Эмеральд");
    	 textstring(event,Items.clock,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Библиотекарь 1 шт за 10—11 Эмеральд");
    	 textstring(event,Items.paper,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Библиотекарь 24—35 шт за 1 Эмеральд");
    	 textstring(event,Items.book,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Библиотекарь 11—12 шт за 1 Эмеральд");
    	 textstring(event,Items.written_book,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Библиотекарь 1 шт за 1 Эмеральд");
    	 textstring(event,Items.gold_ingot,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Библиотекарь 8—9 шт за 1 Эмеральд");
    	 
    	 
    	 // Священник
    	 textstring(event,Items.experience_bottle,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Продаёт житель Священник 2—4 шт за  1 Эмеральд");
    	 textstring(event,Items.redstone,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Продаёт житель Священник 2—4 шт за 1 Эмеральд");
    	 textstring(event,Items.ender_eye,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Продаёт житель Священник 1 шт за 7—10 Эмеральд");
    	 textstring(event,Items.gold_ingot,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Продаёт житель Священник 1 шт за 8—9 Эмеральд");
    	 textstring(event,Items.iron_sword,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.iron_pickaxe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.iron_axe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.diamond_sword,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.diamond_axe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.diamond_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 textstring(event,Items.iron_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Зачерует и чинит житель Священник 1 шт за 2—4 Эмеральд");
    	 
    	 
    	 // Кузнец
    	 textstring(event,Items.iron_sword,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7—10 Эмеральд");
    	 textstring(event,Items.iron_pickaxe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7—8 Эмеральд");
    	 textstring(event,Items.iron_shovel,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 4—5 Эмеральд");
    	 textstring(event,Items.iron_axe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 6—7 Эмеральд");
    	 textstring(event,Items.iron_hoe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 4—5 Эмеральд");
    	 textstring(event,Items.diamond_sword,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 12—13 Эмеральд");
    	 textstring(event,Items.diamond_pickaxe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 10—11 Эмеральд");
    	 textstring(event,Items.diamond_shovel,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7 Эмеральд");
    	 textstring(event,Items.diamond_axe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 9—11 Эмеральд");
    	 textstring(event,Items.diamond_hoe,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7 Эмеральд");
    	 textstring(event,Items.iron_helmet,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 4—5 Эмеральд");
    	 textstring(event,Items.iron_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 10—13 Эмеральд");
    	 textstring(event,Items.iron_leggings,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 8—9 Эмеральд");
    	 textstring(event,Items.iron_boots,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 4—5 Эмеральд");
    	 textstring(event,Items.diamond_helmet,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7 Эмеральд");
    	 textstring(event,Items.diamond_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 8—18 Эмеральд");
    	 textstring(event,Items.diamond_leggings,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7—12 Эмеральд");
    	 textstring(event,Items.diamond_boots,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 7 Эмеральд");
    	 textstring(event,Items.chainmail_helmet,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 5—6 Эмеральд");
    	 textstring(event,Items.chainmail_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 6—11 Эмеральд");
    	 textstring(event,Items.chainmail_leggings,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 9—10 Эмеральд");
    	 textstring(event,Items.chainmail_boots,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Кузнец 1 шт за 5—6 Эмеральд");
    	 textstring(event,Items.coal,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Кузнец 16—23 шт за 1 Эмеральд");
    	 textstring(event,Items.iron_ingot,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Кузнец 8—9 шт за 1 Эмеральд");
    	 textstring(event,Items.gold_ingot,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Кузнец 8—9 шт за 1 Эмеральд");
    	 textstring(event,Items.diamond,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Кузнец 4—5 шт за 1 Эмеральд");
    	 
    	 
    	 // Мясник
    	 textstring(event,Items.leather_helmet,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 1 шт за 2—3 Эмеральд");
    	 textstring(event,Items.leather_chestplate,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 1 шт за 4 Эмеральд");
    	 textstring(event,Items.leather_leggings,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 1 шт за 2—3 Эмеральд");
    	 textstring(event,Items.leather_boots,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 1 шт за 2—3 Эмеральд");
    	 textstring(event,Items.cooked_beef,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 6—7 шт за 1 Эмеральд");
    	 textstring(event,Items.cooked_porkchop,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 6—7 шт за 1 Эмеральд");
    	 textstring(event,Items.saddle,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"продаёт житель Мясник 1 шт за 5—7 Эмеральд");
    	 textstring(event,Items.coal,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Мясник 16—23 шт за 1 Эмеральд");
    	 textstring(event,Items.beef,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Мясник 14—17 шт за 1 Эмеральд");
    	 textstring(event,Items.porkchop,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Мясник 14—17 шт за 1 Эмеральд");
    	 textstring(event,Items.gold_ingot,ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() +"Покупает житель Мясник 8—9 шт за 1 Эмеральд");
*/
	 }
     
     
     if(event.itemStack.getItem() == tmat.magichelmet)
     {
    	 
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description2"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description3"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description4"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description5"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description6"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description7"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description8"));
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magichelmet.description9"));
    	 event.toolTip.add(" ");
    	 if(busEvent.magicsetitems == 4) 
    	 {
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.01") +" "+ tmat.magic_shild +"/"+ (tmat.magic_shild_lvl *5) +" "+ StatCollector.translateToLocal("armor.bonus.set.02"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.10"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.20")+ tmat.magic_shild_regen + StatCollector.translateToLocal("armor.bonus.set.21")+ ((int) ( ( generator_float_shild -  Minecraft.getMinecraft().theWorld.getWorldTime() ) / 20)) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.30")+ tmat.magic_shild_lvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.40")+ tmat.magic_shild_expereans + "/" + tmat_skill.nedxptolvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.50")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.60")+ (1 + busEvent.repair_items) +StatCollector.translateToLocal("armor.bonus.set.61")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.70"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.80"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.90"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.100"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() +  StatCollector.translateToLocal("armor.bonus.set.110"));
    	 }
    	 else {
    		 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.set.description"));
    	 }
     }
    	 
     if(event.itemStack.getItem() == tmat.magicplate)
     {
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magicplate.description")); 
    	 event.toolTip.add(" ");
    	 if(busEvent.magicsetitems == 4) 
    	 {
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.01") +" "+ tmat.magic_shild +"/"+ (tmat.magic_shild_lvl *5) +" " + StatCollector.translateToLocal("armor.bonus.set.02"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.10"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.20")+ tmat.magic_shild_regen + StatCollector.translateToLocal("armor.bonus.set.21")+ ( (int) ( ( generator_float_shild -  Minecraft.getMinecraft().theWorld.getWorldTime() ) / 20)) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.30")+ tmat.magic_shild_lvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.40")+ tmat.magic_shild_expereans + "/" + tmat_skill.nedxptolvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.120")+ ((120000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.50") + ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.60")+ (1 + busEvent.repair_items) +StatCollector.translateToLocal("armor.bonus.set.61")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() +  StatCollector.translateToLocal("armor.bonus.set.130") + ( tmat.magic_shild_lvl / 100 ) + StatCollector.translateToLocal("armor.bonus.set.140")) ;
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.80"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.90"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.150")+tmat.magic_shild_lvl);
    	 }
    	 else {
    		 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.set.description"));
    	 }
     }
    	 
     if(event.itemStack.getItem() == tmat.magicpants)
	 {
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magicpants.description"));
    	 event.toolTip.add(" ");
    	 if(busEvent.magicsetitems == 4) 
    	 {
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.01") +" "+ tmat.magic_shild +"/"+ (tmat.magic_shild_lvl *5) +" "+ StatCollector.translateToLocal("armor.bonus.set.02"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.10"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.20")+ tmat.magic_shild_regen + StatCollector.translateToLocal("armor.bonus.set.21")+ ( (int)( ( generator_float_shild -  Minecraft.getMinecraft().theWorld.getWorldTime() ) / 20)) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.30")+ tmat.magic_shild_lvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.40")+ tmat.magic_shild_expereans + "/" + tmat_skill.nedxptolvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.50")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.60")+ (1 + busEvent.repair_items) +StatCollector.translateToLocal("armor.bonus.set.61")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.80"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.90"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.160") + (int) (tmat.magic_shild_lvl  / 5));
    	 }
    	 else {
    		 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.set.description"));
    	 }
	 }
     
     if(event.itemStack.getItem() == tmat.magicboots)
	 {
    	 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.magicboots.description"));
    	 event.toolTip.add(" ");
    	 if(busEvent.magicsetitems == 4) 
    	 {
    		 
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("armor.bonus.set"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.01") +" "+ tmat.magic_shild +"/"+ (tmat.magic_shild_lvl *5) +" "+ StatCollector.translateToLocal("armor.bonus.set.02"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.10"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.20")+ tmat.magic_shild_regen + StatCollector.translateToLocal("armor.bonus.set.21")+ ( (int)( ( generator_float_shild -  Minecraft.getMinecraft().theWorld.getWorldTime() ) / 20)) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.30")+ tmat.magic_shild_lvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.40")+ tmat.magic_shild_expereans + "/" + tmat_skill.nedxptolvl);
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.50")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.60")+ (1 + busEvent.repair_items) +StatCollector.translateToLocal("armor.bonus.set.61")+ ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.secund"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.80"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.90"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() +  StatCollector.translateToLocal("armor.bonus.set.170") + ((60000 - tmat.magic_shild_lvl) / 1000) + StatCollector.translateToLocal("armor.bonus.set.171"));
    		 event.toolTip.add(ChatFormatting.DARK_GREEN.toString() + ChatFormatting.DARK_GREEN.toString() + StatCollector.translateToLocal("armor.bonus.set.180"));
    	 }
    	 else {
    		 event.toolTip.add(ChatFormatting.DARK_GRAY.toString() + ChatFormatting.ITALIC.toString() + StatCollector.translateToLocal("item.set.description"));
    	 }
	 }
    	 

     
     //System.out.println("("+event.itemStack.getItem().getUnlocalizedName()+")");
         }
    }
    


    int secund;
    int e;
	@SubscribeEvent
	public void fishJoinEvent(PlaySoundAtEntityEvent  event )
	{
		Date date = new Date();
		int e= date.getSeconds();
		if(event.name == "random.pop" && secund !=e)
		{
		//tmat.testint++;
		secund = e;
		 //System.out.println("Получено опыта +" + tmat.testint);
		}
	} 
	
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			if (ExtendedPlayer.get((EntityPlayer) event.entity) == null)
				ExtendedPlayer.register((EntityPlayer) event.entity);
		}
	}
	
	private int e1; 

	
	/**/
	
	 
	 

	
	@SubscribeEvent
    public void onPlayerDamage(LivingHurtEvent event)
    {
		if(busEvent.magicsetitems ==4) {
        if (event.source.getSourceOfDamage() instanceof EntityPlayer)
        {
            EntityPlayer p = (EntityPlayer) event.source.getSourceOfDamage();
            if(( tmat.magic_shild_lvl / 100 ) > 0) 
            {
            	event.ammount = event.ammount * ( tmat.magic_shild_lvl / 100 );
            }
            
            //System.out.println("Damage: " + event.ammount); //Выводит правильно, но урона наносит столько же, сколько и предмет сам по себе(меч 6, палка 1, рука 1 и т.д.).
        }
        else {
        	//System.out.println(event.entityLiving.getCommandSenderName() + " "+event.entity.getCommandSenderName());
        	
        	//System.out.println("test = " + event.entity);
        	if(busEvent.magicsetitems == 4 && Minecraft.getMinecraft().thePlayer.getCommandSenderName() == event.entity.getCommandSenderName()) 
    		{
    			//System.out.println(event.entityLiving.setHealth(1););
    			
    			//System.out.println(event.source.getEntity().getCommandSenderName());
        		if(tmat.magic_shild >= event.ammount)
        		{
        			
        		
        		//	Minecraft.getMinecraft().thePlayer.playSound("tmat:shild"+new Random().nextInt(10), 1.5F, 1.5F);
             		 
           		 Minecraft.getMinecraft().thePlayer.playSound("tmat:shild"+new Random().nextInt(10), 1.5F, 1.5F);
           		 event.ammount = tmat_skill.shild_to_experians((long) event.ammount);
        		 //  }
        		}
        		//EntityEnderdra
        		
        	//	Entity esq = Entity;  
        		//
        		//System.out.println(event.source.getEntity().getCommandSenderName());
        		/*
        		if(Minecraft.getMinecraft().thePlayer.getCommandSenderName() == event.entity.getCommandSenderName())
        		{
        			
        		}
        		*/
        		
        		if(event.source.getEntity() == null)
        		{
        			
        		}
        		else if(StatCollector.translateToLocal("entity.EnderDragon.name") != event.source.getEntity().getCommandSenderName())
        		 {
        			 
        			 //	 event.source.getEntity()
        			// event.source.getEntity().
        			// event.source.getEntity().
        	  	 Random rnd = new Random();
            	 int i = rnd.nextInt(100);
            	 if(i <= (int) (tmat.magic_shild_lvl  / 5) && event.source.getEntity() != null ){
            		
            		 Minecraft.getMinecraft().thePlayer.playSound("tmat:test", 1.5F, 1.5F);
            		// event.source.getEntity().attackEntityFrom(DamageSource.causePlayerDamage(Minecraft.getMinecraft().thePlayer),  2147483647);
            		 event.source.getEntity().attackEntityFrom(DamageSource.causePlayerDamage(Minecraft.getMinecraft().thePlayer),  tmat.magic_shild_lvl);
             		// event.source.getEntity().
            		 //System.out.println(event.source.getEntity().getCommandSenderName());
            		// System.out.println(StatCollector.translateToLocal("entity.EnderDragon.name"));
             		
             		// Minecraft.getMinecraft().theWorld.loadedEntityList.
            		 //System.out.println(event.source.getEntity());
            		 //event.source.getEntity().setFire(10);
            		//DamageSource
            		 //DamageSource.cactus
            		
            		// event.source.getEntity().setDead();
             		// event.source.getEntity().setDead();

            	 }
            	 
    		}
        		 
    		}
        	
        }
		}
        
    }
    
    
    public static long respawn_coldawn;
    private int tpcount;
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent e){
		// бесмертие раз в минуту при полном комплекте сете
		if(busEvent.magicsetitems == 4)
		{
			Date date = new Date();
			if(respawn_coldawn < date.getTime()) 
			{
				respawn_coldawn = date.getTime() + (60000 - tmat.magic_shild_lvl);
				if(respawn_coldawn < 1) {respawn_coldawn = 1;}
		        if(e.entityLiving instanceof EntityPlayer){
		        	tpcount =0;
		            e.setCanceled(true);
		            e.entityLiving.setHealth(e.entityLiving.getMaxHealth());
		        }
		    }
			else {
				EntityPlayer player = Minecraft.getMinecraft().thePlayer;
				if(player.getDisplayName() == e.entityLiving.getCommandSenderName())
					{
					
					Minecraft.getMinecraft().thePlayer.playSound("tmat:telepotr", 1.5F, 1.5F);
					
					 if(tpcount > 1)
						{
						 e.setCanceled(true);
						 e.entityLiving.setHealth(e.entityLiving.getMaxHealth());
						 
						 double newX = e.entityLiving.posX + Minecraft.getMinecraft().theWorld.rand.nextInt(50 *tpcount) - Minecraft.getMinecraft().theWorld.rand.nextInt(50);
						 double newZ = e.entityLiving.posZ + Minecraft.getMinecraft().theWorld.rand.nextInt(50*tpcount) - Minecraft.getMinecraft().theWorld.rand.nextInt(50);
						 e.entityLiving.setPositionAndUpdate(newX, e.entityLiving.posY, newZ); 
					      
					 	}
					 else {
						e.setCanceled(true);
						e.entityLiving.setHealth(e.entityLiving.getMaxHealth());
						e.entityLiving.setPositionAndUpdate(player.getBedLocation().posX, player.getBedLocation().posY+1, player.getBedLocation().posZ);
					 }
					 tpcount++;
					 }
			}
		}
	}
	
	
    
}

