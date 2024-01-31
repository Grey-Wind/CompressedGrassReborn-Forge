
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.greywind.compressedgrass.block.entity.GrassFurnaceBlockEntity;
import net.greywind.compressedgrass.block.entity.GrassChestBlockEntity;
import net.greywind.compressedgrass.CompressedGrassMod;

public class CompressedGrassModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CompressedGrassMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GRASS_CHEST = register("grass_chest", CompressedGrassModBlocks.GRASS_CHEST, GrassChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRASS_FURNACE = register("grass_furnace", CompressedGrassModBlocks.GRASS_FURNACE, GrassFurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
