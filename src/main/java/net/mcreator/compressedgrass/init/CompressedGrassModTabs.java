
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CompressedGrassModTabs {
	public static CreativeModeTab TAB_GRASS;
	public static CreativeModeTab TAB_GRASS_ARMOR;
	public static CreativeModeTab TAB_TOOLS;
	public static CreativeModeTab TAB_GRASS_ORE_TAB;
	public static CreativeModeTab TAB_GRASS_WOOD;
	public static CreativeModeTab TAB_TECHNO;
	public static CreativeModeTab TAB_STORAGE;

	public static void load() {
		TAB_GRASS = new CreativeModeTab("tabgrass") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GRASS_ARMOR = new CreativeModeTab("tabgrass_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.COMPRESSED_GRASS_ARMOR_ARMOR_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLS = new CreativeModeTab("tabtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.COMPRESSED_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GRASS_ORE_TAB = new CreativeModeTab("tabgrass_ore_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModBlocks.GRASS_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GRASS_WOOD = new CreativeModeTab("tabgrass_wood") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModBlocks.GRASS_WOOD_LOG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TECHNO = new CreativeModeTab("tabtechno") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModItems.TECHNOBLADE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_STORAGE = new CreativeModeTab("tabstorage") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CompressedGrassModBlocks.GRASS_CHEST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
