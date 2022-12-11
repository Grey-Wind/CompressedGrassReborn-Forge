
package net.mcreator.compressedgrass.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.compressedgrass.procedures.GrassFlyPotionEffectStartProcedure;
import net.mcreator.compressedgrass.procedures.GrassFlyPotionEffectEndProcedure;

public class GrassFlyPotionEffectMobEffect extends MobEffect {
	public GrassFlyPotionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10027162);
	}

	@Override
	public String getDescriptionId() {
		return "effect.compressed_grass.grass_fly_potion_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GrassFlyPotionEffectStartProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GrassFlyPotionEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
