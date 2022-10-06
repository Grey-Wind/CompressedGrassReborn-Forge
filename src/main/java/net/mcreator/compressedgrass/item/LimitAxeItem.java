
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
public class LimitAxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:limit_axe")
	public static final Item block = null;

	public LimitAxeItem(CompressedGrassModElements instance) {
		super(instance, 327);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 23f;
			}

			public float getAttackDamage() {
				return 38f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 115;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LimitCompressedGrassItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("limit_axe"));
	}
}
