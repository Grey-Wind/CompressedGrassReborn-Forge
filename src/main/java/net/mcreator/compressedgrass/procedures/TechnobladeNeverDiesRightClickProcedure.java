package net.mcreator.compressedgrass.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.compressedgrass.CompressedGrassMod;

import java.util.Map;

public class TechnobladeNeverDiesRightClickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency world for procedure TechnobladeNeverDiesRightClick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency x for procedure TechnobladeNeverDiesRightClick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency y for procedure TechnobladeNeverDiesRightClick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency z for procedure TechnobladeNeverDiesRightClick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency entity for procedure TechnobladeNeverDiesRightClick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof World && !world.isRemote()) {
			((World) world)
					.playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("compressed_grass:technoblade_never_dies")),
							SoundCategory.VOICE, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
							.getValue(new ResourceLocation("compressed_grass:technoblade_never_dies")),
					SoundCategory.VOICE, (float) 1, (float) 1, false);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 100, (int) 1));
	}
}