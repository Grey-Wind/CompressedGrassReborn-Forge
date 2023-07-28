
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompressedGrassModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(CompressedGrassModItems.GRASS_ORE_SWORD.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_HELMET.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_CHESTPLATE.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_LEGGINGS.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CompressedGrassModItems.GRASS_ORE_AXE.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_PICKAXE.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_SHOVEL.get());
			tabData.accept(CompressedGrassModItems.GRASS_ORE_HOE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("compressed_grass", "compressed_grass"),
				builder -> builder.title(Component.translatable("item_group.compressed_grass.compressed_grass")).icon(() -> new ItemStack(Blocks.GRASS)).displayItems((parameters, tabData) -> {
					tabData.accept(CompressedGrassModItems.PRIMARY_COMPRESSED_GRASS.get());
					tabData.accept(CompressedGrassModItems.SECONDARY_COMPRESSED_GRASS.get());
					tabData.accept(CompressedGrassModItems.TERTIARY_COMPRESSED_GRASS.get());
					tabData.accept(CompressedGrassModItems.QUATERNARY_COMPRESSED_GRASS.get());
					tabData.accept(CompressedGrassModItems.GRASS_ORE_INGOT.get());
					tabData.accept(CompressedGrassModBlocks.GRASS_ORE_ORE.get().asItem());
					tabData.accept(CompressedGrassModBlocks.GRASS_ORE_BLOCK.get().asItem());
				}).withSearchBar());
	}
}
