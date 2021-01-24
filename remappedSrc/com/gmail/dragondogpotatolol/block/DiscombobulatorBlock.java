package com.gmail.dragondogpotatolol.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DiscombobulatorBlock extends Block {
    
    public DiscombobulatorBlock(Settings settings) {
        super(Settings.of(Material.METAL));
    }
 
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(new LiteralText("*slaps you back*"), false);
            player.damage(DamageSource.FLY_INTO_WALL, 1);
        }
 
        return ActionResult.SUCCESS;
    }

}
