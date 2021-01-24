package com.gmail.dragondogpotatolol.registry;

import com.gmail.dragondogpotatolol.Dev;
import com.gmail.dragondogpotatolol.block.DiscombobulatorBlock;
import com.gmail.dragondogpotatolol.block.EnhardenerBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    

    public static final Block GREG_BLOCK = new Block(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .strength(5.0f, 30.0f)
        .sounds(BlockSoundGroup.ANVIL)
        .luminance(15)
        .slipperiness(50)
    );

    public static final Block JAMES_BLOCK = new Block(FabricBlockSettings
        .of(Material.CAKE)
        .breakByTool(FabricToolTags.HOES, 1)
        .strength(5.0f, 30.0f)
        .sounds(BlockSoundGroup.LILY_PAD)
        .jumpVelocityMultiplier(-2)
        .slipperiness(-1)
    );

    public static final Block NO_BLOCK = new Block(FabricBlockSettings
        .of(Material.EGG)
        .breakByTool(FabricToolTags.HOES, 1)
        .strength(5.0f, 10.0f)
        .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
        .collidable(false)
    );

    public static final DiscombobulatorBlock DISCOMBOBULATOR_BLOCK = new DiscombobulatorBlock(( FabricBlockSettings.of(Material.STONE)).hardness(4.0f).breakByTool(FabricToolTags.AXES, 2)
    );

    public static final EnhardenerBlock ENHARDENER_BLOCK = new EnhardenerBlock(( FabricBlockSettings.of(Material.GOURD)).breakByTool(FabricToolTags.PICKAXES, 2)
    );

    
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Dev.MOD_ID, "no_block"), NO_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Dev.MOD_ID, "greg_block"), GREG_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Dev.MOD_ID, "james_block"), JAMES_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Dev.MOD_ID, "discombobulator_block"), DISCOMBOBULATOR_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Dev.MOD_ID, "enhardener_block"), ENHARDENER_BLOCK);

    }
}
