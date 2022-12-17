package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.compressedgrass.init.CompressedGrassModEnchantments;

public class GazeOfGrassGodProcessProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GAZE_OF_GRASS_GOD.get(), itemstack) == 0) {
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CompressedGrassModEnchantments.GAZE_OF_GRASS_GOD.get(), itemstack) == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1));
		}
	}
}
