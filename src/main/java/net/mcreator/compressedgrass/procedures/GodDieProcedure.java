package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class GodDieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 7, Explosion.BlockInteraction.BREAK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 7, Explosion.BlockInteraction.DESTROY);
	}
}
