
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class DoubleCompressedGrassToolsHoeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:double_compressed_grass_tools_hoe")
	public static final Item block = null;

	public DoubleCompressedGrassToolsHoeItem(CompressedGrassModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 122;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DoubleCompressedGrassItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("double_compressed_grass_tools_hoe"));
	}
}
