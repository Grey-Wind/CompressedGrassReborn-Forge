
package net.mcreator.compressedgrass.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.compressedgrass.init.CompressedGrassModTabs;
import net.mcreator.compressedgrass.init.CompressedGrassModItems;

public class LimitAxeItem extends AxeItem {
	public LimitAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 23f;
			}

			public float getAttackDamageBonus() {
				return 38f;
			}

			public int getLevel() {
				return 18;
			}

			public int getEnchantmentValue() {
				return 115;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CompressedGrassModItems.LIMIT_COMPRESSED_GRASS.get()));
			}
		}, 1, -3.1f, new Item.Properties().tab(CompressedGrassModTabs.TAB_TOOLS));
	}
}
