
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.greywind.compressedgrass.CompressedGrassMod;

public class CompressedGrassModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompressedGrassMod.MODID);
	public static final RegistryObject<CreativeModeTab> COMPRESSED_GRASS = REGISTRY.register("compressed_grass",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.compressed_grass.compressed_grass")).icon(() -> new ItemStack(Blocks.GRASS)).displayItems((parameters, tabData) -> {
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS.get());
				tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS.get());
				tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS.get());
				tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_INGOT.get());
				tabData.accept(CompressedGrassModBlocks.GRASS_ORE_ORE.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_ORE_BLOCK.get().asItem());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_AXE.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_PICKAXE.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_SWORD.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_SHOVEL.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_HOE.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS_ARMOR_AXE.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS_ARMOR_PICKAXE.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS_ARMOR_SWORD.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS_ARMOR_SHOVEL.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS_ARMOR_HOE.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_HELMET.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_CHESTPLATE.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_LEGGINGS.get());
				tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_BOOTS.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_ARMOR_HELMET.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_ARMOR_CHESTPLATE.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_ARMOR_LEGGINGS.get());
				tabData.accept(CompressedGrassModItems.PRIMARY_ARMOR_BOOTS.get());
				tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET.get());
				tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET.get());
				tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_HELMET.get());
				tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_WOOD.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_LOG.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_PLANKS.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_LEAVES.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_STAIRS.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_SLAB.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_FENCE.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_BUTTON.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_WOOD_FENCE_GATE.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_CHEST.get().asItem());
				tabData.accept(CompressedGrassModBlocks.GRASS_FURNACE.get().asItem());
			}).withSearchBar().build());
}
