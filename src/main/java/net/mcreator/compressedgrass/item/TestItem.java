
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestItem extends Item {
	public TestItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
