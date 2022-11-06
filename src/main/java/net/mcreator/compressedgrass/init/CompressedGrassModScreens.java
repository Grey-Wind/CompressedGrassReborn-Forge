
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.compressedgrass.client.gui.GrassChestGUIScreen;
import net.mcreator.compressedgrass.client.gui.GrassBagGUIScreen;
import net.mcreator.compressedgrass.client.gui.BigGrassChestPlusGUIScreen;
import net.mcreator.compressedgrass.client.gui.BigGrassChestGUIScreen;
import net.mcreator.compressedgrass.client.gui.BigGrassBagPlusGUIScreen;
import net.mcreator.compressedgrass.client.gui.BigGrassBagGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CompressedGrassModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CompressedGrassModMenus.GRASS_CHEST_GUI, GrassChestGUIScreen::new);
			MenuScreens.register(CompressedGrassModMenus.GRASS_BAG_GUI, GrassBagGUIScreen::new);
			MenuScreens.register(CompressedGrassModMenus.BIG_GRASS_CHEST_GUI, BigGrassChestGUIScreen::new);
			MenuScreens.register(CompressedGrassModMenus.BIG_GRASS_BAG_GUI, BigGrassBagGUIScreen::new);
			MenuScreens.register(CompressedGrassModMenus.BIG_GRASS_CHEST_PLUS_GUI, BigGrassChestPlusGUIScreen::new);
			MenuScreens.register(CompressedGrassModMenus.BIG_GRASS_BAG_PLUS_GUI, BigGrassBagPlusGUIScreen::new);
		});
	}
}
