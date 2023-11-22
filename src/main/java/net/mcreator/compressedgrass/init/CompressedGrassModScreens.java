
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.mcreator.compressedgrass.client.gui.GrassFurnaceGuiScreen;
import net.mcreator.compressedgrass.client.gui.GrassChestGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CompressedGrassModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CompressedGrassModMenus.GRASS_CHEST_GUI.get(), GrassChestGuiScreen::new);
			MenuScreens.register(CompressedGrassModMenus.GRASS_FURNACE_GUI.get(), GrassFurnaceGuiScreen::new);
		});
	}
}
