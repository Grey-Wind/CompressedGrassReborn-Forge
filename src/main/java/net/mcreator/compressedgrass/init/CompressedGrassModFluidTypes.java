
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.compressedgrass.fluid.types.GrassWaterFluidType;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CompressedGrassMod.MODID);
	public static final RegistryObject<FluidType> GRASS_WATER_TYPE = REGISTRY.register("grass_water", () -> new GrassWaterFluidType());
}
