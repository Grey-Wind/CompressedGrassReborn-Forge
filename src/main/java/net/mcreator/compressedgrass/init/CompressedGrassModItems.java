
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.compressedgrass.item.TertiaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.SecondaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.QuaternaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.PrimaryCompressedGrassItem;
import net.mcreator.compressedgrass.item.GrassOreIngotItem;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedGrassMod.MODID);
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS = REGISTRY.register("primary_compressed_grass", () -> new PrimaryCompressedGrassItem());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS = REGISTRY.register("secondary_compressed_grass", () -> new SecondaryCompressedGrassItem());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS = REGISTRY.register("tertiary_compressed_grass", () -> new TertiaryCompressedGrassItem());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS = REGISTRY.register("quaternary_compressed_grass", () -> new QuaternaryCompressedGrassItem());
	public static final RegistryObject<Item> GRASS_ORE_BLOCK = block(CompressedGrassModBlocks.GRASS_ORE_BLOCK);
	public static final RegistryObject<Item> GRASS_ORE_ORE = block(CompressedGrassModBlocks.GRASS_ORE_ORE);
	public static final RegistryObject<Item> GRASS_ORE_INGOT = REGISTRY.register("grass_ore_ingot", () -> new GrassOreIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
