package com.example.examplemod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "tmat";

public ExtendedPlayer(EntityPlayer player) {}

public static final void register(EntityPlayer player)
{
	player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
}

public static final ExtendedPlayer get(EntityPlayer player)
{
	return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
}

@Override
public void saveNBTData(NBTTagCompound compound)
{

	NBTTagCompound properties = new NBTTagCompound();
	properties.setLong("magic_shild", tmat.magic_shild);
	properties.setLong("magic_shild_expereans", tmat.magic_shild_expereans);
	properties.setLong("magic_shild_lvl", tmat.magic_shild_lvl);
	properties.setLong("radius_jamp", tmat_skill.radius_jamp);
	properties.setBoolean("tmat_armor_integrate", tmat.tmat_armor_integrate);
	properties.setLong("tmat_time_mana_regen", busEvent.generator_shild);
	properties.setLong("tmat_nedxptolvl", tmat_skill.nedxptolvl);
	
	
	
	compound.setTag(EXT_PROP_NAME, properties);
	//System.out.println("SAVING");
}

@Override
public void loadNBTData(NBTTagCompound compound)
{
	NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
	tmat.magic_shild = properties.getInteger("magic_shild");
	tmat.magic_shild_expereans = properties.getInteger("magic_shild_expereans");
	tmat.magic_shild_lvl = properties.getInteger("magic_shild_lvl");
	tmat_skill.radius_jamp = properties.getInteger("radius_jamp");
	tmat.tmat_armor_integrate = properties.getBoolean("tmat_armor_integrate");
	busEvent.generator_shild = properties.getInteger("tmat_time_mana_regen");
	tmat_skill.nedxptolvl = properties.getInteger("tmat_nedxptolvl");
	if(tmat_skill.nedxptolvl == 0.0)tmat_skill.nedxptolvl = tmat.magic_shild_lvl * 20 + ((tmat.magic_shild_lvl * 5) * 25)/100; 
	//tmat_skill.nedxptolvl = 0;
	
	busEvent.repair_items = (long) (tmat.magic_shild_lvl / 100);
	//System.out.println("LOADING");
}


//public static final IAttribute WEIGHT_MULTIPLIER = (new RangedAttribute("player.weightMultiplier", 2.5D, 0.0D, Double.MAX_VALUE)).setDescription("Weight Modifier").setShouldWatch(true);
@Override
public void init(Entity entity, World world) {
	//  ((EntityPlayer) entity).getAttributeMap().registerAttribute(WEIGHT_MULTIPLIER);
}


}