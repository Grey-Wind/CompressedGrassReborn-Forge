
package net.mcreator.compressedgrass.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.compressedgrass.item.TripleCompressedGrassItem;

@Mod.EventBusSubscriber
public class TripleCompressedGrassFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == TripleCompressedGrassItem.block)
			event.setBurnTime(500);
	}
}
