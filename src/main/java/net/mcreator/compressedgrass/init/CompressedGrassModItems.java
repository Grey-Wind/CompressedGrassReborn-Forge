
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
import net.mcreator.compressedgrass.item.GrassSwordItem;
import net.mcreator.compressedgrass.item.GrassShovelItem;
import net.mcreator.compressedgrass.item.GrassPickaxeItem;
import net.mcreator.compressedgrass.item.GrassOreIngotItem;
import net.mcreator.compressedgrass.item.GrassHoeItem;
import net.mcreator.compressedgrass.item.GrassAxeItem;
import net.mcreator.compressedgrass.item.GrassArmorItem;
import net.mcreator.compressedgrass.CompressedGrassMod;

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
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_HELMET = REGISTRY.register("grass_ore_armor_helmet", () -> new GrassArmorItem.Helmet());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_CHESTPLATE = REGISTRY.register("grass_ore_armor_chestplate", () -> new GrassArmorItem.Chestplate());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_LEGGINGS = REGISTRY.register("grass_ore_armor_leggings", () -> new GrassArmorItem.Leggings());
	public static final RegistryObject<Item> GRASS_ORE_ARMOR_BOOTS = REGISTRY.register("grass_ore_armor_boots", () -> new GrassArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
