
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;

public class IncreaseCapacityItem extends Item {
	public IncreaseCapacityItem() {
		super(new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
