
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
public class OctupleGrassSwordItem extends CompressedGrassModElements.ModElement {
	@ObjectHolder("compressed_grass:octuple_grass_sword")
	public static final Item block = null;

	public OctupleGrassSwordItem(CompressedGrassModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 18f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("octuple_grass_sword"));
	}
}
