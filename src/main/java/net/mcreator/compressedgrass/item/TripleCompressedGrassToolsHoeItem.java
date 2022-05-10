
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
public class TripleCompressedGrassToolsHoeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:triple_compressed_grass_tools_hoe")
	public static final Item block = null;

	public TripleCompressedGrassToolsHoeItem(CompressedGrassModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 183;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TripleCompressedGrassItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("triple_compressed_grass_tools_hoe"));
	}
}
