
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
public class DoubleCompressedGrassToolsPickaxeItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:double_compressed_grass_tools_pickaxe")
	public static final Item block = null;

	public DoubleCompressedGrassToolsPickaxeItem(CompressedGrassModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 122;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DoubleCompressedGrassItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("double_compressed_grass_tools_pickaxe"));
	}
}
