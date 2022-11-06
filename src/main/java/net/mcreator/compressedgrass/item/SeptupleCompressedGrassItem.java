
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;

public class SeptupleCompressedGrassItem extends Item {
	public SeptupleCompressedGrassItem() {
		super(new Item.Properties().tab(CompressedGrassModTabs.TAB_GRASS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
