package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class PotatoProtectionContinueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setAirSupply(20);
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(20);
	}
}
