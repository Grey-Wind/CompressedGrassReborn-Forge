
package net.mcreator.compressedgrass.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import java.util.List;

public class GrassEnchantmentEnchantment extends Enchantment {
	public GrassEnchantmentEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 2;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return !List.of(Enchantments.SHARPNESS).contains(ench);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
