
package net.mcreator.compressedgrass.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.compressedgrass.item.NonupleCompressedGrassItem;

@Mod.EventBusSubscriber
public class NonupleCompressedGrassFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == NonupleCompressedGrassItem.block)
			event.setBurnTime(7000);
	}
}
