
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;

public class GrassStarItem extends Item {
	public GrassStarItem() {
		super(new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
