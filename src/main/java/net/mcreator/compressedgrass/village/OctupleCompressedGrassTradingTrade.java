
package net.mcreator.compressedgrass.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.block.Blocks;

import net.mcreator.compressedgrass.item.OctupleCompressedGrassItem;
import net.mcreator.compressedgrass.block.GrassBlockBlock;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OctupleCompressedGrassTradingTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FARMER) {
			trades.get(1).add(new BasicTrade(new ItemStack(Blocks.DIAMOND_BLOCK, (int) (64)), new ItemStack(GrassBlockBlock.block, (int) (64)),
					new ItemStack(OctupleCompressedGrassItem.block), 10, 5, 0.7f));
		}
	}
}
