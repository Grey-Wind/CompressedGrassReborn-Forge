
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.mcreator.compressedgrass.world.features.ores.GrassOreOreFeature;
import net.mcreator.compressedgrass.CompressedGrassMod;

@Mod.EventBusSubscriber
public class CompressedGrassModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CompressedGrassMod.MODID);
	public static final RegistryObject<Feature<?>> GRASS_ORE_ORE = REGISTRY.register("grass_ore_ore", GrassOreOreFeature::new);
}
