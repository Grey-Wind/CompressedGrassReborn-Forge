
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModFluids;

public class GrassWaterItem extends BucketItem {
	public GrassWaterItem() {
		super(CompressedGrassModFluids.GRASS_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CompressedGrassModTabs.TAB_GRASS));
	}
}
