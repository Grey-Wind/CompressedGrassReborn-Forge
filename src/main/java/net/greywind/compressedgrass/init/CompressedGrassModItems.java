
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.greywind.compressedgrass.item.TertiaryCompressedGrassItem;
import net.greywind.compressedgrass.item.TertiaryCompressedGrassArmorArmorItem;
import net.greywind.compressedgrass.item.SecondaryCompressedGrassItem;
import net.greywind.compressedgrass.item.SecondaryCompressedGrassArmorArmorItem;
import net.greywind.compressedgrass.item.QuaternaryCompressedGrassItem;
import net.greywind.compressedgrass.item.QuaternaryCompressedGrassArmorArmorItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassArmorSwordItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassArmorShovelItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassArmorPickaxeItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassArmorHoeItem;
import net.greywind.compressedgrass.item.PrimaryCompressedGrassArmorAxeItem;
import net.greywind.compressedgrass.item.PrimaryArmorItem;
import net.greywind.compressedgrass.item.GrassSwordItem;
import net.greywind.compressedgrass.item.GrassShovelItem;
import net.greywind.compressedgrass.item.GrassPickaxeItem;
import net.greywind.compressedgrass.item.GrassOreIngotItem;
import net.greywind.compressedgrass.item.GrassHoeItem;
import net.greywind.compressedgrass.item.GrassAxeItem;
import net.greywind.compressedgrass.item.GrassArmorItem;
import net.greywind.compressedgrass.CompressedGrassMod;

public class CompressedGrassModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedGrassMod.MODID);
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS = REGISTRY.register("primary_compressed_grass", () -> new PrimaryCompressedGrassItem());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS = REGISTRY.register("secondary_compressed_grass", () -> new SecondaryCompressedGrassItem());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS = REGISTRY.register("tertiary_compressed_grass", () -> new TertiaryCompressedGrassItem());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS = REGISTRY.register("quaternary_compressed_grass", () -> new QuaternaryCompressedGrassItem());
	public static final RegistryObject<Item> GRASS_ORE_INGOT = REGISTRY.register("grass_ore_ingot", () -> new GrassOreIngotItem());
	public static final RegistryObject<Item> GRASS_ORE_ORE = block(CompressedGrassModBlocks.GRASS_ORE_ORE);
	public static final RegistryObject<Item> GRASS_ORE_BLOCK = block(CompressedGrassModBlocks.GRASS_ORE_BLOCK);
	public static final RegistryObject<Item> GRASS_ORE_AXE = REGISTRY.register("grass_ore_axe", () -> new GrassAxeItem());
	public static final RegistryObject<Item> GRASS_ORE_PICKAXE = REGISTRY.register("grass_ore_pickaxe", () -> new GrassPickaxeItem());
	public static final RegistryObject<Item> GRASS_ORE_SWORD = REGISTRY.register("grass_ore_sword", () -> new GrassSwordItem());
	public static final RegistryObject<Item> GRASS_ORE_SHOVEL = REGISTRY.register("grass_ore_shovel", () -> new GrassShovelItem());
	public static final RegistryObject<Item> GRASS_ORE_HOE = REGISTRY.register("grass_ore_hoe", () -> new GrassHoeItem());
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS_ARMOR_AXE = REGISTRY.register("primary_compressed_grass_armor_axe", () -> new PrimaryCompressedGrassArmorAxeItem());
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS_ARMOR_PICKAXE = REGISTRY.register("primary_compressed_grass_armor_pickaxe", () -> new PrimaryCompressedGrassArmorPickaxeItem());
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS_ARMOR_SWORD = REGISTRY.register("primary_compressed_grass_armor_sword", () -> new PrimaryCompressedGrassArmorSwordItem());
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS_ARMOR_SHOVEL = REGISTRY.register("primary_compressed_grass_armor_shovel", () -> new PrimaryCompressedGrassArmorShovelItem());
	public static final RegistryObject<Item> PRIMARY_COMPRESSED_GRASS_ARMOR_HOE = REGISTRY.register("primary_compressed_grass_armor_hoe", () -> new PrimaryCompressedGrassArmorHoeItem());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_HELMET = REGISTRY.register("grass_ore_armor_helmet", () -> new GrassArmorItem.Helmet());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_CHESTPLATE = REGISTRY.register("grass_ore_armor_chestplate", () -> new GrassArmorItem.Chestplate());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_LEGGINGS = REGISTRY.register("grass_ore_armor_leggings", () -> new GrassArmorItem.Leggings());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_BOOTS = REGISTRY.register("grass_ore_armor_boots", () -> new GrassArmorItem.Boots());
	public static final RegistryObject<Item> PRIMARY_ARMOR_HELMET = REGISTRY.register("primary_armor_helmet", () -> new PrimaryArmorItem.Helmet());
	public static final RegistryObject<Item> PRIMARY_ARMOR_CHESTPLATE = REGISTRY.register("primary_armor_chestplate", () -> new PrimaryArmorItem.Chestplate());
	public static final RegistryObject<Item> PRIMARY_ARMOR_LEGGINGS = REGISTRY.register("primary_armor_leggings", () -> new PrimaryArmorItem.Leggings());
	public static final RegistryObject<Item> PRIMARY_ARMOR_BOOTS = REGISTRY.register("primary_armor_boots", () -> new PrimaryArmorItem.Boots());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET = REGISTRY.register("secondary_compressed_grass_armor_armor_helmet", () -> new SecondaryCompressedGrassArmorArmorItem.Helmet());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("secondary_compressed_grass_armor_armor_chestplate", () -> new SecondaryCompressedGrassArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("secondary_compressed_grass_armor_armor_leggings", () -> new SecondaryCompressedGrassArmorArmorItem.Leggings());
	public static final RegistryObject<Item> SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS = REGISTRY.register("secondary_compressed_grass_armor_armor_boots", () -> new SecondaryCompressedGrassArmorArmorItem.Boots());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET = REGISTRY.register("tertiary_compressed_grass_armor_armor_helmet", () -> new TertiaryCompressedGrassArmorArmorItem.Helmet());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("tertiary_compressed_grass_armor_armor_chestplate", () -> new TertiaryCompressedGrassArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("tertiary_compressed_grass_armor_armor_leggings", () -> new TertiaryCompressedGrassArmorArmorItem.Leggings());
	public static final RegistryObject<Item> TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS = REGISTRY.register("tertiary_compressed_grass_armor_armor_boots", () -> new TertiaryCompressedGrassArmorArmorItem.Boots());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET = REGISTRY.register("quaternary_compressed_grass_armor_armor_helmet", () -> new QuaternaryCompressedGrassArmorArmorItem.Helmet());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("quaternary_compressed_grass_armor_armor_chestplate", () -> new QuaternaryCompressedGrassArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("quaternary_compressed_grass_armor_armor_leggings", () -> new QuaternaryCompressedGrassArmorArmorItem.Leggings());
	public static final RegistryObject<Item> QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS = REGISTRY.register("quaternary_compressed_grass_armor_armor_boots", () -> new QuaternaryCompressedGrassArmorArmorItem.Boots());
	public static final RegistryObject<Item> GRASS_WOOD_WOOD = block(CompressedGrassModBlocks.GRASS_WOOD_WOOD);
	public static final RegistryObject<Item> GRASS_WOOD_LOG = block(CompressedGrassModBlocks.GRASS_WOOD_LOG);
	public static final RegistryObject<Item> GRASS_WOOD_PLANKS = block(CompressedGrassModBlocks.GRASS_WOOD_PLANKS);
	public static final RegistryObject<Item> GRASS_WOOD_LEAVES = block(CompressedGrassModBlocks.GRASS_WOOD_LEAVES);
	public static final RegistryObject<Item> GRASS_WOOD_STAIRS = block(CompressedGrassModBlocks.GRASS_WOOD_STAIRS);
	public static final RegistryObject<Item> GRASS_WOOD_SLAB = block(CompressedGrassModBlocks.GRASS_WOOD_SLAB);
	public static final RegistryObject<Item> GRASS_WOOD_FENCE = block(CompressedGrassModBlocks.GRASS_WOOD_FENCE);
	public static final RegistryObject<Item> GRASS_WOOD_PRESSURE_PLATE = block(CompressedGrassModBlocks.GRASS_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> GRASS_WOOD_BUTTON = block(CompressedGrassModBlocks.GRASS_WOOD_BUTTON);
	public static final RegistryObject<Item> GRASS_WOOD_FENCE_GATE = block(CompressedGrassModBlocks.GRASS_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> GRASS_CHEST = block(CompressedGrassModBlocks.GRASS_CHEST);
	public static final RegistryObject<Item> GRASS_FURNACE = block(CompressedGrassModBlocks.GRASS_FURNACE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
