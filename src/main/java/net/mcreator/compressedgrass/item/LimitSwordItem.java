
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.compressedgrass.itemgroup.ToolsItemGroup;
import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class LimitSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:limit_sword")
	public static final Item block = null;

	public LimitSwordItem(CompressedGrassModElements instance) {
		super(instance, 328);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 23f;
			}

			public float getAttackDamage() {
				return 33f;
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
		}, 3, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("limit_sword"));
	}
}
