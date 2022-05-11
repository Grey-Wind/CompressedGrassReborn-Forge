
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class QuadrupleCompressedGrassToolsAxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:quadruple_compressed_grass_tools_axe")
	public static final Item block = null;

	public QuadrupleCompressedGrassToolsAxeItem(CompressedGrassModElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 216;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(QuadrupleCompressedGrassItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("quadruple_compressed_grass_tools_axe"));
	}
}
