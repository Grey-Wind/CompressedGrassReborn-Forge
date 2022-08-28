
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class SeptupleCompressedGrassToolsSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:septuple_compressed_grass_tools_sword")
	public static final Item block = null;

	public SeptupleCompressedGrassToolsSwordItem(CompressedGrassModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SeptupleCompressedGrassItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("septuple_compressed_grass_tools_sword"));
	}
}
