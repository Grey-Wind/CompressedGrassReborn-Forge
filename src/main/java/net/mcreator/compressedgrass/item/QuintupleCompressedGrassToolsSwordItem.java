
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
public class QuintupleCompressedGrassToolsSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:quintuple_compressed_grass_tools_sword")
	public static final Item block = null;

	public QuintupleCompressedGrassToolsSwordItem(CompressedGrassModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("quintuple_compressed_grass_tools_sword"));
	}
}
