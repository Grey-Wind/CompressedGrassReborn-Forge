
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
public class TripleCompressedGrassToolsSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:triple_compressed_grass_tools_sword")
	public static final Item block = null;

	public TripleCompressedGrassToolsSwordItem(CompressedGrassModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 183;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("triple_compressed_grass_tools_sword"));
	}
}
