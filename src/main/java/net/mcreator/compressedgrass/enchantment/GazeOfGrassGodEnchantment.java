
package net.mcreator.compressedgrass.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class GazeOfGrassGodEnchantment extends Enchantment {
	public GazeOfGrassGodEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
