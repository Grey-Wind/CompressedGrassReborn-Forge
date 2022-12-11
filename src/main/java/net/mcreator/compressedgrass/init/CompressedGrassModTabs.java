
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CompressedGrassModTabs {
	public static CreativeModeTab TAB_GRASS;
	public static CreativeModeTab TAB_GRASS_ARMOR;
	public static CreativeModeTab TAB_TOOLS;
	public static CreativeModeTab TAB_TECHNO;

	public static void load() {
		TAB_GRASS = new CreativeModeTab("tabgrass") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GRASS_ARMOR = new CreativeModeTab("tabgrass_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLS = new CreativeModeTab("tabtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.COMPRESSED_PICKAXE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TECHNO = new CreativeModeTab("tabtechno") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.TECHNOBLADE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
