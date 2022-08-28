
package net.mcreator.compressedgrass.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.compressedgrass.item.TechnobladeItem;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class TechnoItemGroup extends CompressedGrassModElements.ModElement {
	public TechnoItemGroup(CompressedGrassModElements instance) {
		super(instance, 302);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtechno") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TechnobladeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
