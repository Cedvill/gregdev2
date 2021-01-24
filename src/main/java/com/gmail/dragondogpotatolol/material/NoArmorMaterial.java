package com.gmail.dragondogpotatolol.material;

import com.gmail.dragondogpotatolol.registry.ModItems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item.Settings;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class NoArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[] {2, 5, 6, 3};

    public NoArmorMaterial(ArmorMaterial material, EquipmentSlot slot, Settings group) {
	}

	@Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()]*20;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.MUSIC_DISC_PIGSTEP;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.NO);
    }

    @Override
    public String getName() {
        return "no";
    }

    @Override
    public float getToughness() {
        return 14;
    }

    @Override
    public float getKnockbackResistance() {
        return 9;
    }

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()]/10;
    }
    
}
