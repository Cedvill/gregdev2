package com.gmail.dragondogpotatolol.base;

import com.gmail.dragondogpotatolol.Dev;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, -1, -2.2f, new Item.Settings().group(Dev.ITEM_GROUP));
    }
    
}
