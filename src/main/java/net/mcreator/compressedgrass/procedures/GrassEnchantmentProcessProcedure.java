package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.compressedgrass.init.CompressedGrassModEnchantments;

public class GrassEnchantmentProcessProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 0) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 1) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 2) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 3) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 4) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GRASS_ENCHANTMENT.get(), itemstack) == 5) {
		}
	}
}
