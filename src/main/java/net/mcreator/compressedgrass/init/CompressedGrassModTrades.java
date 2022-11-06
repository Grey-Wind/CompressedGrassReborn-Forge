
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CompressedGrassModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModItems.GRASS_INGOT.get()),

					new ItemStack(CompressedGrassModItems.COMPRESSED_GRASS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModItems.GRASS_INGOT.get(), 10),

					new ItemStack(CompressedGrassModItems.DOUBLE_COMPRESSED_GRASS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModItems.GRASS_INGOT.get(), 64),

					new ItemStack(CompressedGrassModItems.TRIPLE_COMPRESSED_GRASS.get(), 64), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModBlocks.GRASS_BLOCK.get(), 10),

					new ItemStack(CompressedGrassModItems.QUADRUPLE_COMPRESSED_GRASS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModBlocks.GRASS_BLOCK.get(), 64),

					new ItemStack(CompressedGrassModItems.QUINTUPLE_COMPRESSED_GRASS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 16),

					new ItemStack(CompressedGrassModItems.SEXTUPLE_COMPRESSED_GRASS.get()), 5, 10, 0.3f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 64),

					new ItemStack(CompressedGrassModItems.SEPTUPLE_COMPRESSED_GRASS.get()), 20, 20, 0.5f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 64), new ItemStack(CompressedGrassModBlocks.GRASS_BLOCK.get(), 64),
							new ItemStack(CompressedGrassModItems.OCTUPLE_COMPRESSED_GRASS.get()), 10, 5, 0.7f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CompressedGrassModItems.SPAWN_AUTHOR.get()),
					new ItemStack(Blocks.NETHERITE_BLOCK), new ItemStack(CompressedGrassModItems.NONUPLE_COMPRESSED_GRASS.get()), 100, 30, 0.01f));
		}
	}
}
