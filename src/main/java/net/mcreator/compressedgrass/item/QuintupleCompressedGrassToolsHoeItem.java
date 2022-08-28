
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.compressedgrass.itemgroup.ToolsItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class QuintupleCompressedGrassToolsHoeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:quintuple_compressed_grass_tools_hoe")
	public static final Item block = null;

	public QuintupleCompressedGrassToolsHoeItem(CompressedGrassModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(QuintupleCompressedGrassItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("quintuple_compressed_grass_tools_hoe"));
	}
}
