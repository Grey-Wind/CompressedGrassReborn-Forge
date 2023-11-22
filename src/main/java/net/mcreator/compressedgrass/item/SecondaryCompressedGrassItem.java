
package net.mcreator.compressedgrass.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SecondaryCompressedGrassItem extends Item {
	public SecondaryCompressedGrassItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}