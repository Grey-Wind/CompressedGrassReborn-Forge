
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.mcreator.compressedgrass.world.inventory.GrassFurnaceGuiMenu;
import net.mcreator.compressedgrass.world.inventory.GrassChestGuiMenu;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CompressedGrassMod.MODID);
	public static final RegistryObject<MenuType<GrassChestGuiMenu>> GRASS_CHEST_GUI = REGISTRY.register("grass_chest_gui", () -> IForgeMenuType.create(GrassChestGuiMenu::new));
	public static final RegistryObject<MenuType<GrassFurnaceGuiMenu>> GRASS_FURNACE_GUI = REGISTRY.register("grass_furnace_gui", () -> IForgeMenuType.create(GrassFurnaceGuiMenu::new));
}
