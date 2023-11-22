
package net.mcreator.compressedgrass.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class TertiaryCompressedGrassItem extends Item {
	public TertiaryCompressedGrassItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}