
package net.mcreator.compressedgrass.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.compressedgrass.item.QuadrupleCompressedGrassItem;

@Mod.EventBusSubscriber
public class QuadrupleCompressedGrassFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == QuadrupleCompressedGrassItem.block)
			event.setBurnTime(1500);
	}
}
