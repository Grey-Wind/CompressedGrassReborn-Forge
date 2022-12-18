
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.compressedgrass.enchantment.GrassEnchantmentEnchantment;
import net.mcreator.compressedgrass.enchantment.GazeOfGrassGodEnchantment;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CompressedGrassMod.MODID);
	public static final RegistryObject<Enchantment> GRASS_ENCHANTMENT = REGISTRY.register("grass_enchantment",
			() -> new GrassEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> GAZE_OF_GRASS_GOD = REGISTRY.register("gaze_of_grass_god", () -> new GazeOfGrassGodEnchantment());
}
