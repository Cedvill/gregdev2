package com.gmail.dragondogpotatolol.base;

import com.gmail.dragondogpotatolol.Dev;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class ArmorBase extends ArmorItem{
 
    public ArmorBase(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(Dev.ITEM_GROUP));
    }
}
