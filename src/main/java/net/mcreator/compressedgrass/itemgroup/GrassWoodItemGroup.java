
package net.mcreator.compressedgrass.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.compressedgrass.block.GrassWoodLogBlock;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class GrassWoodItemGroup extends CompressedGrassModElements.ModElement {
	public GrassWoodItemGroup(CompressedGrassModElements instance) {
		super(instance, 222);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgrass_wood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrassWoodLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
