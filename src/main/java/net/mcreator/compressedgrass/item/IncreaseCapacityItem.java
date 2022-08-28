
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.compressedgrass.itemgroup.StorageItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class IncreaseCapacityItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:increase_capacity")
	public static final Item block = null;

	public IncreaseCapacityItem(CompressedGrassModElements instance) {
		super(instance, 300);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(StorageItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("increase_capacity");
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
