
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.compressedgrass.item.TertiaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.SecondaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.PrimaryCompressedGrassItem;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedGrassMod.MODID);
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS = REGISTRY.register("primary_compressed_grass", () -> new PrimaryCompressedGrassItem());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS = REGISTRY.register("secondary_compressed_grass", () -> new SecondaryCompressedGrassItem());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS = REGISTRY.register("tertiary_compressed_grass", () -> new TertiaryCompressedGrassItem());
}
