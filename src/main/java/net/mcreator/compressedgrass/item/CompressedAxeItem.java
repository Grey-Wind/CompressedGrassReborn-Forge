
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.compressedgrass.itemgroup.ToolsItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class CompressedAxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:compressed_axe")
	public static final Item block = null;

	public CompressedAxeItem(CompressedGrassModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 95;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CompressedGrassItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("compressed_axe"));
	}
}
