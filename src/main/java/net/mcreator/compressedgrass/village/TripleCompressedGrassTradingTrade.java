
package net.mcreator.compressedgrass.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.compressedgrass.item.TripleCompressedGrassItem;
import net.mcreator.compressedgrass.item.GrassIngotItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TripleCompressedGrassTradingTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FARMER) {
			trades.get(1).add(new BasicTrade(new ItemStack(GrassIngotItem.block, (int) (64)),
					new ItemStack(TripleCompressedGrassItem.block, (int) (64)), 10, 5, 0.05f));
		}
	}
}
