
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.greywind.compressedgrass.block.GrassWoodWoodBlock;
import net.greywind.compressedgrass.block.GrassWoodStairsBlock;
import net.greywind.compressedgrass.block.GrassWoodSlabBlock;
import net.greywind.compressedgrass.block.GrassWoodPressurePlateBlock;
import net.greywind.compressedgrass.block.GrassWoodPlanksBlock;
import net.greywind.compressedgrass.block.GrassWoodLogBlock;
import net.greywind.compressedgrass.block.GrassWoodLeavesBlock;
import net.greywind.compressedgrass.block.GrassWoodFenceGateBlock;
import net.greywind.compressedgrass.block.GrassWoodFenceBlock;
import net.greywind.compressedgrass.block.GrassWoodButtonBlock;
import net.greywind.compressedgrass.block.GrassOreOreBlock;
import net.greywind.compressedgrass.block.GrassOreBlockBlock;
import net.greywind.compressedgrass.block.GrassFurnaceBlock;
import net.greywind.compressedgrass.block.GrassChestBlock;
import net.greywind.compressedgrass.CompressedGrassMod;

public class CompressedGrassModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedGrassMod.MODID);
	public static final RegistryObject<Block> GRASS_ORE_ORE = REGISTRY.register("grass_ore_ore", () -> new GrassOreOreBlock());
	public static final RegistryObject<Block> GRASS_ORE_BLOCK = REGISTRY.register("grass_ore_block", () -> new GrassOreBlockBlock());
	public static final RegistryObject<Block> GRASS_WOOD_WOOD = REGISTRY.register("grass_wood_wood", () -> new GrassWoodWoodBlock());
	public static final RegistryObject<Block> GRASS_WOOD_LOG = REGISTRY.register("grass_wood_log", () -> new GrassWoodLogBlock());
	public static final RegistryObject<Block> GRASS_WOOD_PLANKS = REGISTRY.register("grass_wood_planks", () -> new GrassWoodPlanksBlock());
	public static final RegistryObject<Block> GRASS_WOOD_LEAVES = REGISTRY.register("grass_wood_leaves", () -> new GrassWoodLeavesBlock());
	public static final RegistryObject<Block> GRASS_WOOD_STAIRS = REGISTRY.register("grass_wood_stairs", () -> new GrassWoodStairsBlock());
	public static final RegistryObject<Block> GRASS_WOOD_SLAB = REGISTRY.register("grass_wood_slab", () -> new GrassWoodSlabBlock());
	public static final RegistryObject<Block> GRASS_WOOD_FENCE = REGISTRY.register("grass_wood_fence", () -> new GrassWoodFenceBlock());
	public static final RegistryObject<Block> GRASS_WOOD_PRESSURE_PLATE = REGISTRY.register("grass_wood_pressure_plate", () -> new GrassWoodPressurePlateBlock());
	public static final RegistryObject<Block> GRASS_WOOD_BUTTON = REGISTRY.register("grass_wood_button", () -> new GrassWoodButtonBlock());
	public static final RegistryObject<Block> GRASS_WOOD_FENCE_GATE = REGISTRY.register("grass_wood_fence_gate", () -> new GrassWoodFenceGateBlock());
	public static final RegistryObject<Block> GRASS_CHEST = REGISTRY.register("grass_chest", () -> new GrassChestBlock());
	public static final RegistryObject<Block> GRASS_FURNACE = REGISTRY.register("grass_furnace", () -> new GrassFurnaceBlock());
}
