
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TertiaryCompressedGrassItem extends Item {
	public TertiaryCompressedGrassItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
