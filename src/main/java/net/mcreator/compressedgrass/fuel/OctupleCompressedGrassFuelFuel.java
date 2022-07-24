
package net.mcreator.compressedgrass.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.compressedgrass.item.OctupleCompressedGrassItem;

@Mod.EventBusSubscriber
public class OctupleCompressedGrassFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == OctupleCompressedGrassItem.block)
			event.setBurnTime(5000);
	}
}
