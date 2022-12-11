
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public class EnchantedHoeItem extends HoeItem {
	public EnchantedHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5250;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 120;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.ENCHANTED_GRASS.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CompressedGrassModTabs.TAB_TOOLS));
	}
}
