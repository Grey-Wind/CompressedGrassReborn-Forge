
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class NonupleGrassShovelItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:nonuple_grass_shovel")
	public static final Item block = null;

	public NonupleGrassShovelItem(CompressedGrassModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4595;
			}

			public float getEfficiency() {
				return 21f;
			}

			public float getAttackDamage() {
				return 14f;
			}

			public int getHarvestLevel() {
				return 16;
			}

			public int getEnchantability() {
				return 112;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NonupleCompressedGrassItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("nonuple_grass_shovel"));
	}
}
