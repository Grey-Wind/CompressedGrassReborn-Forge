
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CompressedGrassMod.MODID);
	public static final RegistryObject<SoundEvent> VOID = REGISTRY.register("void",
			() -> new SoundEvent(new ResourceLocation("compressed_grass", "void")));
	public static final RegistryObject<SoundEvent> TECHNOBLADE_NEVER_DIES = REGISTRY.register("technoblade_never_dies",
			() -> new SoundEvent(new ResourceLocation("compressed_grass", "technoblade_never_dies")));
}
