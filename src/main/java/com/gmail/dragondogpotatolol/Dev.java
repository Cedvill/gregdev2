package com.gmail.dragondogpotatolol;

import com.gmail.dragondogpotatolol.registry.ModBlocks;
import com.gmail.dragondogpotatolol.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Dev implements ModInitializer {

    public static final String MOD_ID = "dev";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"),
        () -> new ItemStack(ModItems.GREG)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        LootInject.modifyLootTables();
    }

}
