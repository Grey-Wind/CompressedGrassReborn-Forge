
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuaternaryCompressedGrassItem extends Item {
	public QuaternaryCompressedGrassItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
