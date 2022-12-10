
package net.mcreator.compressedgrass.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.compressedgrass.procedures.PotatoProtectionContinueProcedure;

public class PotatoProtectionMobEffect extends MobEffect {
	public PotatoProtectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355648);
	}

	@Override
	public String getDescriptionId() {
		return "effect.compressed_grass.potato_protection";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PotatoProtectionContinueProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
