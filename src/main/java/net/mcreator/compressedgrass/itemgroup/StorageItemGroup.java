
package net.mcreator.compressedgrass.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.compressedgrass.block.GrassChestBlock;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class StorageItemGroup extends CompressedGrassModElements.ModElement {
	public StorageItemGroup(CompressedGrassModElements instance) {
		super(instance, 303);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabstorage") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrassChestBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
