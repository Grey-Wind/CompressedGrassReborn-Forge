
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.compressedgrass.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.greywind.compressedgrass.client.gui.GrassFurnaceGuiScreen;
import net.greywind.compressedgrass.client.gui.GrassChestGuiScreen;

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
