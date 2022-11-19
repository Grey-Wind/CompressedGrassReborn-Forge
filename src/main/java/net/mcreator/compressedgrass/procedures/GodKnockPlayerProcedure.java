package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class GodKnockPlayerProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("God").bypassArmor(), 5);
	}
}
