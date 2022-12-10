
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.compressedgrass.potion.PotatoProtectionMobEffect;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CompressedGrassMod.MODID);
	public static final RegistryObject<MobEffect> POTATO_PROTECTION = REGISTRY.register("potato_protection", () -> new PotatoProtectionMobEffect());
}
