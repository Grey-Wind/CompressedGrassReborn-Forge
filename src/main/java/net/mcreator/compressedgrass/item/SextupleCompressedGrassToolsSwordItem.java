
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
public class SextupleCompressedGrassToolsSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:sextuple_compressed_grass_tools_sword")
	public static final Item block = null;

	public SextupleCompressedGrassToolsSwordItem(CompressedGrassModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SextupleCompressedGrassItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ToolsItemGroup.tab)) {
		}.setRegistryName("sextuple_compressed_grass_tools_sword"));
	}
}
