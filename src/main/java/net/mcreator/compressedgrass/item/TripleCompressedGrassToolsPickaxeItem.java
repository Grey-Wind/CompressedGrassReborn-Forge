
package net.mcreator.compressedgrass.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.compressedgrass.CompressedGrassModElements;

@CompressedGrassModElements.ModElement.Tag
public class TripleCompressedGrassToolsPickaxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:triple_compressed_grass_tools_pickaxe")
	public static final Item block = null;

	public TripleCompressedGrassToolsPickaxeItem(CompressedGrassModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 183;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("triple_compressed_grass_tools_pickaxe"));
	}
}
