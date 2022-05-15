package net.mcreator.compressedgrass.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.ResourceLocation;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.FunctionObject;
import net.minecraft.command.CommandSource;

import net.mcreator.compressedgrass.CompressedGrassMod;

import java.util.Optional;
import java.util.Map;

public class GrassDimensionTitleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency world for procedure GrassDimensionTitle!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency x for procedure GrassDimensionTitle!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency y for procedure GrassDimensionTitle!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CompressedGrassMod.LOGGER.warn("Failed to load dependency z for procedure GrassDimensionTitle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof ServerWorld && ((ServerWorld) world).getServer() != null) {
			Optional<FunctionObject> _fopt = ((ServerWorld) world).getServer().getFunctionManager().get(new ResourceLocation("annijang_title"));
			if (_fopt.isPresent()) {
				FunctionObject _fobj = _fopt.get();
				((ServerWorld) world).getServer().getFunctionManager().execute(_fobj, new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
						Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((ServerWorld) world).getServer(), null));
			}
		}
	}
}
