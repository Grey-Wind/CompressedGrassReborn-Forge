
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.compressedgrass.itemgroup.GrassItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class GrassStarItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:grass_star")
	public static final Item block = null;

	public GrassStarItem(CompressedGrassModElements instance) {
		super(instance, 299);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GrassItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("grass_star");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
