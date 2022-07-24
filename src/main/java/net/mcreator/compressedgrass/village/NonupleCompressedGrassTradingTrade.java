
package net.mcreator.compressedgrass.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.block.Blocks;

import net.mcreator.compressedgrass.item.SpawnAuthorItem;
import net.mcreator.compressedgrass.item.NonupleCompressedGrassItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NonupleCompressedGrassTradingTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FARMER) {
			trades.get(1).add(new BasicTrade(new ItemStack(SpawnAuthorItem.block), new ItemStack(Blocks.NETHERITE_BLOCK),
					new ItemStack(NonupleCompressedGrassItem.block), 100, 30, 0.01f));
		}
	}
}
