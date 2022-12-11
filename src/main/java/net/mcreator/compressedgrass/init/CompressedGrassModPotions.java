
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CompressedGrassMod.MODID);
	public static final RegistryObject<Potion> POTATO_PROTECTION_POTION = REGISTRY.register("potato_protection_potion",
			() -> new Potion(new MobEffectInstance(CompressedGrassModMobEffects.POTATO_PROTECTION.get(), 6000, 0, false, true)));
	public static final RegistryObject<Potion> GRASS_FLY_POTION = REGISTRY.register("grass_fly_potion",
			() -> new Potion(new MobEffectInstance(CompressedGrassModMobEffects.GRASS_FLY_POTION_EFFECT.get(), 6000, 0, false, true)));
}
