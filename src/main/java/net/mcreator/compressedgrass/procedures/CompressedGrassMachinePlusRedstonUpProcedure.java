package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.compressedgrass.item.SeptupleCompressedGrassItem;
import net.mcreator.compressedgrass.CompressedGrassMod;

import java.util.Map;

public class CompressedGrassMachinePlusRedstonUpProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency world for procedure CompressedGrassMachinePlusRedstonUp!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency x for procedure CompressedGrassMachinePlusRedstonUp!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency y for procedure CompressedGrassMachinePlusRedstonUp!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency z for procedure CompressedGrassMachinePlusRedstonUp!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(SeptupleCompressedGrassItem.block));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
