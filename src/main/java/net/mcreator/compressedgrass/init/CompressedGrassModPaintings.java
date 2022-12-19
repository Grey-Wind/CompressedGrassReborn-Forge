
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS,
			CompressedGrassMod.MODID);
	public static final RegistryObject<PaintingVariant> COMPRESSED_GRASS_PAINTING = REGISTRY.register("compressed_grass_painting",
			() -> new PaintingVariant(16, 16));
}
