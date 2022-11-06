
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.compressedgrass.block.entity.GrassChestBlockEntity;
import net.mcreator.compressedgrass.block.entity.BigGrassChestPlusBlockEntity;
import net.mcreator.compressedgrass.block.entity.BigGrassChestBlockEntity;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			CompressedGrassMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GRASS_CHEST = register("grass_chest", CompressedGrassModBlocks.GRASS_CHEST,
			GrassChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIG_GRASS_CHEST = register("big_grass_chest", CompressedGrassModBlocks.BIG_GRASS_CHEST,
			BigGrassChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIG_GRASS_CHEST_PLUS = register("big_grass_chest_plus",
			CompressedGrassModBlocks.BIG_GRASS_CHEST_PLUS, BigGrassChestPlusBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
