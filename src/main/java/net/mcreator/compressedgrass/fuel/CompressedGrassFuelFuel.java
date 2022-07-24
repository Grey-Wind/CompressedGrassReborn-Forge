
package net.mcreator.compressedgrass.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.compressedgrass.item.CompressedGrassItem;

@Mod.EventBusSubscriber
public class CompressedGrassFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == CompressedGrassItem.block)
			event.setBurnTime(50);
	}
}
