
package net.mcreator.compressedgrass.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.compressedgrass.block.GrassOreBlock;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class GrassOreTabItemGroup extends CompressedGrassModElements.ModElement {
	public GrassOreTabItemGroup(CompressedGrassModElements instance) {
		super(instance, 195);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgrass_ore_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrassOreBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
