
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.compressedgrass.world.features.ores.GrassOreFeature;
import net.mcreator.compressedgrass.world.features.lakes.GrassWaterFeature;
import net.mcreator.compressedgrass.world.features.GrassRelicsFeature;
import net.mcreator.compressedgrass.CompressedGrassMod;

@Mod.EventBusSubscriber
public class CompressedGrassModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CompressedGrassMod.MODID);
	public static final RegistryObject<Feature<?>> GRASS_ORE = REGISTRY.register("grass_ore", GrassOreFeature::feature);
	public static final RegistryObject<Feature<?>> GRASS_WATER = REGISTRY.register("grass_water", GrassWaterFeature::feature);
	public static final RegistryObject<Feature<?>> GRASS_RELICS = REGISTRY.register("grass_relics", GrassRelicsFeature::feature);
}
