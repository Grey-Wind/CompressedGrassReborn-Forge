
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.compressedgrass.world.inventory.GrassChestGUIMenu;
import net.mcreator.compressedgrass.world.inventory.GrassBagGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassChestPlusGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassChestGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassBagPlusGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassBagGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompressedGrassModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<GrassChestGUIMenu> GRASS_CHEST_GUI = register("grass_chest_gui",
			(id, inv, extraData) -> new GrassChestGUIMenu(id, inv, extraData));
	public static final MenuType<GrassBagGUIMenu> GRASS_BAG_GUI = register("grass_bag_gui",
			(id, inv, extraData) -> new GrassBagGUIMenu(id, inv, extraData));
	public static final MenuType<BigGrassChestGUIMenu> BIG_GRASS_CHEST_GUI = register("big_grass_chest_gui",
			(id, inv, extraData) -> new BigGrassChestGUIMenu(id, inv, extraData));
	public static final MenuType<BigGrassBagGUIMenu> BIG_GRASS_BAG_GUI = register("big_grass_bag_gui",
			(id, inv, extraData) -> new BigGrassBagGUIMenu(id, inv, extraData));
	public static final MenuType<BigGrassChestPlusGUIMenu> BIG_GRASS_CHEST_PLUS_GUI = register("big_grass_chest_plus_gui",
			(id, inv, extraData) -> new BigGrassChestPlusGUIMenu(id, inv, extraData));
	public static final MenuType<BigGrassBagPlusGUIMenu> BIG_GRASS_BAG_PLUS_GUI = register("big_grass_bag_plus_gui",
			(id, inv, extraData) -> new BigGrassBagPlusGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
