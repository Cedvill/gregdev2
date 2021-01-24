package com.gmail.dragondogpotatolol.registry;

import com.gmail.dragondogpotatolol.Dev;
import com.gmail.dragondogpotatolol.base.ArmorBase;
import com.gmail.dragondogpotatolol.base.PickaxeBase;
import com.gmail.dragondogpotatolol.material.NoArmorMaterial;
import com.gmail.dragondogpotatolol.material.ToolMaterialJames;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Blocks
    public static final BlockItem GREG_BLOCK = new BlockItem(ModBlocks.GREG_BLOCK,
            new Item.Settings().group(Dev.ITEM_GROUP));
    public static final BlockItem JAMES_BLOCK = new BlockItem(ModBlocks.JAMES_BLOCK,
            new Item.Settings().group(Dev.ITEM_GROUP));
    public static final BlockItem NO_BLOCK = new BlockItem(ModBlocks.NO_BLOCK,
            new Item.Settings().group(Dev.ITEM_GROUP));
    public static final BlockItem DISCOMBOBULATOR_BLOCK = new BlockItem(ModBlocks.DISCOMBOBULATOR_BLOCK,new Item.Settings().group(Dev.ITEM_GROUP));

    public static final BlockItem ENHARDENER_BLOCK = new BlockItem(ModBlocks.ENHARDENER_BLOCK,new Item.Settings().group(Dev.ITEM_GROUP));

    // Items
    public static final Item GREG = new Item(new Item.Settings().group(Dev.ITEM_GROUP));
    public static final Item JAMES = new Item(new Item.Settings().group(Dev.ITEM_GROUP));
    public static final Item NO = new Item(new Item.Settings().group(Dev.ITEM_GROUP)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).snack().alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 2), 0.5f).build()));

    // Tools
    public static final ArmorMaterial NO_ARMOR = new NoArmorMaterial(null, null, null);
    //public static final Item JAMES_PICKAXE = new Item(new Item.Settings().group(Dev.ITEM_GROUP));

    public static void registerItems() {

        //Materials
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "greg"), GREG);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "james"), JAMES);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no"), NO);

        //Blocks
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "greg_block"), GREG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "james_block"), JAMES_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no_block"), NO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "discombobulator_block"), DISCOMBOBULATOR_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "enhardener_block"), ENHARDENER_BLOCK);

        //Tools

        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no_helmet"), new ArmorBase(NO_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no_chestplate"), new ArmorBase(NO_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no_leggings"), new ArmorBase(NO_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "no_boots"), new ArmorBase(NO_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(Dev.MOD_ID, "james_pickaxe"), new PickaxeBase(new ToolMaterialJames(), 0, 0, null));
    }
}
