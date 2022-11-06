
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			CompressedGrassMod.MODID);
	public static final RegistryObject<ParticleType<?>> GRASS_PARTICLES = REGISTRY.register("grass_particles", () -> new SimpleParticleType(false));
}
