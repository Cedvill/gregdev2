package com.gmail.dragondogpotatolol;

import com.gmail.dragondogpotatolol.registry.ModItems;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
//import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
//import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.LootTableSetter;
//import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
//import net.minecraft.loot.LootManager;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
//import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetCountLootFunction;
//import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

public class LootInject {
    private static final Identifier COAL_ORE_LOOT_TABLE_ID = new Identifier("minecraft","blocks/coal_ore");
    //private static final Identifier GREG_BLOCK_LOOT_TABLE_ID = new Identifier(Dev.MOD_ID,"blocks/greg_block");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, LootManager, id, supplier, setter) -> {
            //Checks for emerald ore loot table
            if(COAL_ORE_LOOT_TABLE_ID.equals(id)){
                
                //Add a single indiviual item
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(ItemEntry.builder(ModItems.GREG))
                    .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f, 4.0f)).build());

                supplier.withPool(poolBuilder.build());

                /* Add custom loot table
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .with(LootTableEntry.builder(GREG_BLOCK_LOOT_TABLE_ID));
                supplier.withPool(poolBuilder2.build());
                */
            }

            
        }));
    }

}

