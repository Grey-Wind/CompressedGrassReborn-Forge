
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.compressedgrass.block.GrassWoodWoodBlock;
import net.mcreator.compressedgrass.block.GrassWoodStairsBlock;
import net.mcreator.compressedgrass.block.GrassWoodSlabBlock;
import net.mcreator.compressedgrass.block.GrassWoodPressurePlateBlock;
import net.mcreator.compressedgrass.block.GrassWoodPlanksBlock;
import net.mcreator.compressedgrass.block.GrassWoodLogBlock;
import net.mcreator.compressedgrass.block.GrassWoodLeavesBlock;
import net.mcreator.compressedgrass.block.GrassWoodFenceGateBlock;
import net.mcreator.compressedgrass.block.GrassWoodFenceBlock;
import net.mcreator.compressedgrass.block.GrassWoodButtonBlock;
import net.mcreator.compressedgrass.block.GrassOreBlock;
import net.mcreator.compressedgrass.block.GrassDimensionPortalBlock;
import net.mcreator.compressedgrass.block.GrassChestBlock;
import net.mcreator.compressedgrass.block.GrassBlockBlock;
import net.mcreator.compressedgrass.block.CompressedGrassMachinePlusBlock;
import net.mcreator.compressedgrass.block.CompressedGrassMachineBlock;
import net.mcreator.compressedgrass.block.BigGrassChestPlusBlock;
import net.mcreator.compressedgrass.block.BigGrassChestBlock;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedGrassMod.MODID);
	public static final RegistryObject<Block> COMPRESSED_GRASS_MACHINE = REGISTRY.register("compressed_grass_machine",
			() -> new CompressedGrassMachineBlock());
	public static final RegistryObject<Block> COMPRESSED_GRASS_MACHINE_PLUS = REGISTRY.register("compressed_grass_machine_plus",
			() -> new CompressedGrassMachinePlusBlock());
	public static final RegistryObject<Block> GRASS_CHEST = REGISTRY.register("grass_chest", () -> new GrassChestBlock());
	public static final RegistryObject<Block> BIG_GRASS_CHEST = REGISTRY.register("big_grass_chest", () -> new BigGrassChestBlock());
	public static final RegistryObject<Block> BIG_GRASS_CHEST_PLUS = REGISTRY.register("big_grass_chest_plus", () -> new BigGrassChestPlusBlock());
	public static final RegistryObject<Block> GRASS_WOOD_WOOD = REGISTRY.register("grass_wood_wood", () -> new GrassWoodWoodBlock());
	public static final RegistryObject<Block> GRASS_WOOD_LOG = REGISTRY.register("grass_wood_log", () -> new GrassWoodLogBlock());
	public static final RegistryObject<Block> GRASS_WOOD_PLANKS = REGISTRY.register("grass_wood_planks", () -> new GrassWoodPlanksBlock());
	public static final RegistryObject<Block> GRASS_WOOD_STAIRS = REGISTRY.register("grass_wood_stairs", () -> new GrassWoodStairsBlock());
	public static final RegistryObject<Block> GRASS_WOOD_SLAB = REGISTRY.register("grass_wood_slab", () -> new GrassWoodSlabBlock());
	public static final RegistryObject<Block> GRASS_WOOD_BUTTON = REGISTRY.register("grass_wood_button", () -> new GrassWoodButtonBlock());
	public static final RegistryObject<Block> GRASS_WOOD_LEAVES = REGISTRY.register("grass_wood_leaves", () -> new GrassWoodLeavesBlock());
	public static final RegistryObject<Block> GRASS_WOOD_FENCE = REGISTRY.register("grass_wood_fence", () -> new GrassWoodFenceBlock());
	public static final RegistryObject<Block> GRASS_WOOD_FENCE_GATE = REGISTRY.register("grass_wood_fence_gate", () -> new GrassWoodFenceGateBlock());
	public static final RegistryObject<Block> GRASS_WOOD_PRESSURE_PLATE = REGISTRY.register("grass_wood_pressure_plate",
			() -> new GrassWoodPressurePlateBlock());
	public static final RegistryObject<Block> GRASS_DIMENSION_PORTAL = REGISTRY.register("grass_dimension_portal",
			() -> new GrassDimensionPortalBlock());
	public static final RegistryObject<Block> GRASS_ORE = REGISTRY.register("grass_ore", () -> new GrassOreBlock());
	public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new GrassBlockBlock());
}
