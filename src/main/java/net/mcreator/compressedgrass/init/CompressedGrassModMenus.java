
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.compressedgrass.world.inventory.GrassChestGUIMenu;
import net.mcreator.compressedgrass.world.inventory.GrassBagGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassChestPlusGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassChestGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassBagPlusGUIMenu;
import net.mcreator.compressedgrass.world.inventory.BigGrassBagGUIMenu;
import net.mcreator.compressedgrass.CompressedGrassMod;

public class CompressedGrassModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CompressedGrassMod.MODID);
	public static final RegistryObject<MenuType<GrassChestGUIMenu>> GRASS_CHEST_GUI = REGISTRY.register("grass_chest_gui",
			() -> IForgeMenuType.create(GrassChestGUIMenu::new));
	public static final RegistryObject<MenuType<GrassBagGUIMenu>> GRASS_BAG_GUI = REGISTRY.register("grass_bag_gui",
			() -> IForgeMenuType.create(GrassBagGUIMenu::new));
	public static final RegistryObject<MenuType<BigGrassChestGUIMenu>> BIG_GRASS_CHEST_GUI = REGISTRY.register("big_grass_chest_gui",
			() -> IForgeMenuType.create(BigGrassChestGUIMenu::new));
	public static final RegistryObject<MenuType<BigGrassBagGUIMenu>> BIG_GRASS_BAG_GUI = REGISTRY.register("big_grass_bag_gui",
			() -> IForgeMenuType.create(BigGrassBagGUIMenu::new));
	public static final RegistryObject<MenuType<BigGrassChestPlusGUIMenu>> BIG_GRASS_CHEST_PLUS_GUI = REGISTRY.register("big_grass_chest_plus_gui",
			() -> IForgeMenuType.create(BigGrassChestPlusGUIMenu::new));
	public static final RegistryObject<MenuType<BigGrassBagPlusGUIMenu>> BIG_GRASS_BAG_PLUS_GUI = REGISTRY.register("big_grass_bag_plus_gui",
			() -> IForgeMenuType.create(BigGrassBagPlusGUIMenu::new));
}
