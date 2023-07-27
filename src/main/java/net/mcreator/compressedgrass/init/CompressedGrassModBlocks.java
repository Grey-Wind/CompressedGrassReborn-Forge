
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.compressedgrass.block.GrassOreOreBlock;
import net.mcreator.compressedgrass.block.GrassOreBlockBlock;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedGrassMod.MODID);
	public static final RegistryObject<Block> GRASS_ORE_BLOCK = REGISTRY.register("grass_ore_block", () -> new GrassOreBlockBlock());
	public static final RegistryObject<Block> GRASS_ORE_ORE = REGISTRY.register("grass_ore_ore", () -> new GrassOreOreBlock());
}
