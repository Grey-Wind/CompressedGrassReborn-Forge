
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
public class OctupleGrassAxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:octuple_grass_axe")
	public static final Item block = null;

	public OctupleGrassAxeItem(CompressedGrassModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 14;
			}

			public int getEnchantability() {
				return 98;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OctupleCompressedGrassItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("octuple_grass_axe"));
	}
}
